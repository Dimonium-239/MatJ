import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.Serializable;
import java.util.*;

public class MatJProductionVisitor extends MatJv1BaseVisitor<Object> {

    private enum LoopOperations{
        BREAK,
        CONTINUE;
    }

    HashMap<String, Object> variables = new HashMap<>();


    @Override
    public Object visitProg(MatJv1Parser.ProgContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitConstructions(MatJv1Parser.ConstructionsContext ctx) {
        if(ctx.show_construction() != null) return visitShow_construction(ctx.show_construction());
        else if(ctx.def_func() != null) return null;
        else if(ctx.assignation() != null){
            if(ctx.assignation().matrix_index() != null)  return assignToMatrix(ctx.assignation().matrix_index(), ctx.assignation().statements());
            else return visitAssignation(ctx.assignation());
        }
        else if(ctx.if_construction() != null) return visitIf_construction(ctx.if_construction());
        else if(ctx.for_construction() != null) return visitFor_construction(ctx.for_construction());
        else if(ctx.while_construction() != null) return visitWhile_construction(ctx.while_construction());
        else if(ctx.BREAK() != null) return LoopOperations.BREAK;
        else if(ctx.CONTINUE() != null) return LoopOperations.CONTINUE;
        return "";
    }

    @Override
    public Object visitStatements(MatJv1Parser.StatementsContext ctx) {
        if(ctx.logical_statement() != null){
            if(ctx.logical_statement().NOT()!=null)
                return !Boolean.parseBoolean(String.valueOf(visitLogical_statement(ctx.logical_statement())));
            else return Boolean.parseBoolean(String.valueOf(visitLogical_statement(ctx.logical_statement())));
        }
        else if(ctx.arithmetic_statement() != null) return visitArithmetic_statement(ctx.arithmetic_statement());
        else if(ctx.comparison_statement() != null) return visitComparison_statement(ctx.comparison_statement());
        else if(ctx.matrix() != null) return visitMatrix(ctx.matrix());
        else if(ctx.matrix_index() != null) return visitMatrix_index(ctx.matrix_index());
        else if(ctx.matrix_func() != null) return visitMatrix_func(ctx.matrix_func());
        else if(ctx.STRING_VAL() != null) return ctx.STRING_VAL().getText()
                .replace("'","")
                .replace("\"", "");
        return "";
    }

    @Override
    public Object visitDef_func(MatJv1Parser.Def_funcContext ctx) {

        return visitChildren(ctx);
    }


    @Override
    public Object visitFor_construction(MatJv1Parser.For_constructionContext ctx) {
        int start = Integer.parseInt(ctx.range_construction().INT_VAL(0).getText());
        int end = Integer.parseInt(ctx.range_construction().INT_VAL(1).getText());
        variables.put(ctx.VAR_NAME().getText(), start);
        for (int i = start; i < end; i++) {
            Object res = "";
            variables.replace(ctx.VAR_NAME().getText(), i);
            for (int j = 0; j < ctx.constructions().size(); j++) {
                res = visitConstructions(ctx.constructions(j));
                if(res == LoopOperations.BREAK || res == LoopOperations.CONTINUE) break;
            }
            if(res == LoopOperations.CONTINUE) continue;
            if(res == LoopOperations.BREAK) break;
        }
        return "";
    }

    @Override
    public Object visitWhile_construction(MatJv1Parser.While_constructionContext ctx) {
        boolean condition =  Boolean.parseBoolean(String.valueOf(visitLogical_statement(ctx.logical_statement())));
        while(condition){
            visitChildren(ctx);
            condition =  Boolean.parseBoolean(String.valueOf(visitLogical_statement(ctx.logical_statement())));
        }
        return "";
    }



    public Object visitShow_construction(MatJv1Parser.Show_constructionContext ctx) {
        if(ctx.statements() != null){
            StringBuilder output = new StringBuilder();
            for (int i = 0; i < ctx.statements().size(); i++)
                output.append(visitStatements(ctx.statements(i))).append(" ");
            System.out.println(output.toString()
                    .replace("\\n", "\n")
                    .replace("\\t", "\t")
                    .replace("\\r", "\r")
            );
        }
        return "";
    }

    @Override
    public Object visitAssignation(MatJv1Parser.AssignationContext ctx) {
        String id = ctx.VAR_NAME(0).getText();
        Object val = null;
        if(ctx.INT_VAL() != null) val = Integer.parseInt(ctx.INT_VAL().getText());
        else if(ctx.FLOAT_VAL() != null) val = Float.parseFloat(ctx.FLOAT_VAL().getText());
        else if(ctx.statements() != null) val = visitStatements(ctx.statements());
        variables.put(id, val);
        return "";
    }

    public Object visitIf_construction(MatJv1Parser.If_constructionContext ctx) {
        boolean condition =  Boolean.parseBoolean(String.valueOf(visitLogical_statement(ctx.logical_statement())));
        if(condition) {
            for (int i = 0; i < ctx.constructions().size(); i++) {
                Object res = visitConstructions(ctx.constructions(i));
                if(res == LoopOperations.BREAK) return LoopOperations.BREAK;
                if(res == LoopOperations.CONTINUE) return LoopOperations.CONTINUE;
            }
        }
        else if(ctx.else_construction() != null) visitElse_construction(ctx.else_construction());
        return "";
    }

    @Override
    public Object visitElse_construction(MatJv1Parser.Else_constructionContext ctx) {
        for (int i = 0; i < ctx.constructions().size(); i++) {
            Object res = visitConstructions(ctx.constructions(i));
            if(res == LoopOperations.BREAK) return LoopOperations.BREAK;
            if(res == LoopOperations.CONTINUE) return LoopOperations.CONTINUE;
        }
        return "";
    }

    @Override
    public Object visitBoolean_exp(MatJv1Parser.Boolean_expContext ctx) {
        boolean isNegated = ctx.NOT()!=null;
        if(ctx.VAR_NAME() != null){
            String varName = ctx.VAR_NAME().getText();
            if(variables.containsKey(varName)){
                if(isNegated) return !(Boolean) variables.get(ctx.VAR_NAME().getText());
                else return variables.get(ctx.VAR_NAME().getText());
            }
            else{
                System.err.println("Variable is not initialized: " + varName);
                return "";
            }
        }
        else if(ctx.BOOL_VAL() != null){
            if(isNegated) return !Boolean.parseBoolean(ctx.BOOL_VAL().getText());
            else return Boolean.parseBoolean(ctx.BOOL_VAL().getText());
        }
        else if(ctx.comparison_statement() != null)
            return visitComparison_statement(ctx.comparison_statement());
        return visitChildren(ctx);
    }

    private boolean isNumeric(String str){
        try{
            Double.parseDouble(str);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Object visitNumerical_exp(MatJv1Parser.Numerical_expContext ctx) {
        if(ctx.VAR_NAME() != null){
            String varName = ctx.VAR_NAME().getText();
            if(variables.containsKey(varName)){
                String val = variables.get(ctx.VAR_NAME().getText()).toString();
                if(isNumeric(val)) return Double.parseDouble(val);
                else return val;
            }
            else{
                System.err.println("Variable is not initialized: " + varName);
                return "";
            }
        }
        else if(ctx.INT_VAL() != null) return Integer.parseInt(ctx.INT_VAL().getText());
        else if(ctx.FLOAT_VAL() != null) return Double.parseDouble(ctx.FLOAT_VAL().getText());
        else if(ctx.arithmetic_statement() != null) return visitArithmetic_statement(ctx.arithmetic_statement());
        return visitChildren(ctx);
    }

    @Override
    public Object visitMatrix(MatJv1Parser.MatrixContext ctx) {
        if(ctx.SEMI_COLON().isEmpty()) {
            ArrayList<Double> l = new ArrayList<>();
            for (MatJv1Parser.Numerical_expContext val : ctx.numerical_exp())
                try {
                    l.add(Double.parseDouble(String.valueOf(visitNumerical_exp(val))));
                }catch (NumberFormatException e){
                    System.err.println("List must contain only numbers or strings");
                    return "";
                }
            return l;
        }
        else{
            ArrayList<ArrayList<Double>> l = new ArrayList<>();
            ArrayList<Double> r = new ArrayList<>();
            for(Object val : ctx.children){
                if(val instanceof MatJv1Parser.Numerical_expContext)
                    try {
                        r.add(Double.parseDouble(String.valueOf(visitNumerical_exp((MatJv1Parser.Numerical_expContext) val))));
                    }catch (NumberFormatException e){
                        System.err.println("List must contain only numbers or strings");
                        return "";
                    }
                if(val.toString().equals(";")){
                    l.add(r);
                    r = new ArrayList<>();
                }
            }
            l.add(r);
            return l;
        }
    }


    @Override
    public Object visitMatrix_index(MatJv1Parser.Matrix_indexContext ctx) {
        String name = ctx.VAR_NAME(0).getText();
        ArrayList<Object> matrix = (ArrayList<Object>) variables.get(name);
        List<Integer> indexes = new ArrayList<>();

        for (int i = 1; i < ctx.children.size(); i++) {
            if(!(ctx.children.get(i).getText().equals("[") || ctx.children.get(i).getText().equals("]"))){
                if(variables.containsKey(ctx.children.get(i).getText())) {
                    Double val = Double.parseDouble(String.valueOf(variables.get(ctx.children.get(i).getText())));
                    indexes.add(val.intValue());
                }
                else{
                    Double val = Double.parseDouble(String.valueOf(ctx.children.get(i).getText()));
                    indexes.add(val.intValue());
                }
            }
        }

        Object res;
        if(indexes.size() == 2)
            try {
                res = ((ArrayList<Object>) (matrix.get(indexes.get(0)))).get(indexes.get(1));
            }catch (ClassCastException e){
                System.err.println("Wrong matrix dimension");
                return "";
            }
        else res = matrix.get(indexes.get(0));
        return res;
    }

    private boolean assignToMatrix(MatJv1Parser.Matrix_indexContext mi, MatJv1Parser.StatementsContext sc){
        String name = mi.VAR_NAME(0).getText();
        ArrayList<Object> matrix = (ArrayList<Object>) variables.get(name);
        List<Integer> indexes = new ArrayList<>();

        for (int i = 1; i < mi.children.size(); i++) {
            if(!(mi.children.get(i).getText().equals("[") || mi.children.get(i).getText().equals("]"))){
                if(variables.containsKey(mi.children.get(i).getText())) {
                    Double val = Double.parseDouble(String.valueOf(variables.get(mi.children.get(i).getText())));
                    indexes.add(val.intValue());
                }
                else{
                    Double val = Double.parseDouble(String.valueOf(mi.children.get(i).getText()));
                    indexes.add(val.intValue());
                }
            }
        }

        if(indexes.size() == 2)
            try {
                ((ArrayList<Object>)matrix.get(indexes.get(0))).set(indexes.get(1), visitStatements(sc));
                variables.replace(name, matrix);
            }catch (ClassCastException e){
                System.err.println("Wrong matrix dimension");
                return false;
            }
        else matrix.set(indexes.get(0), visitStatements(sc));
        return true;
    }

    @Override
    public Object visitOnes_statement(MatJv1Parser.Ones_statementContext ctx) {
        int n = Integer.parseInt(ctx.INT_VAL(0).getText());
        int m = Integer.parseInt(ctx.INT_VAL(1).getText());
        return matrixFiller(n, m, 1);
    }

    @Override
    public Object visitZeros_statement(MatJv1Parser.Zeros_statementContext ctx) {
        int n = Integer.parseInt(ctx.INT_VAL(0).getText());
        int m = Integer.parseInt(ctx.INT_VAL(1).getText());
        return matrixFiller(n, m, 0);
    }

    private List<? extends Serializable> matrixFiller(int n, int m, double val){
        if(n > 1) {
            ArrayList<ArrayList<Double>> matrix = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                ArrayList<Double> row = new ArrayList<>();
                for (int j = 0; j < m; j++) {
                    row.add(val);
                }
                matrix.add(row);
            }
            return matrix;
        }
        else {
            ArrayList<Double> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(val);
            }
            return row;
        }
    }

    @Override
    public Object visitEye_statement(MatJv1Parser.Eye_statementContext ctx) {
        int n = Integer.parseInt(ctx.INT_VAL(0).getText());
        int m = Integer.parseInt(ctx.INT_VAL(1).getText());
        ArrayList<ArrayList<Double>> matrix = new ArrayList<>();
        int one = 0;
        for (int i = 0; i < n; i++) {
            ArrayList<Double> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                if(j == one) row.add(1.0);
                else row.add(0.0);
            }
            one++;
            matrix.add(row);
        }
        return matrix;
    }


    @Override
    public Object visitMatrix_func(MatJv1Parser.Matrix_funcContext ctx) {
        if(ctx.ones_statement() != null) return visitOnes_statement(ctx.ones_statement());
        if(ctx.zeros_statement() != null) return visitZeros_statement(ctx.zeros_statement());
        if(ctx.eye_statement() != null) return visitEye_statement(ctx.eye_statement());
        if(ctx.TRANSPOSE() != null) return visitMatrixChanger(ctx, ctx.TRANSPOSE());
        if(ctx.ROTATE() != null) return visitMatrixChanger(ctx, ctx.ROTATE());
        return visitChildren(ctx);
    }

    private List<List<Object>> rotateClockwise2D(List<List<Object>> arr){
        List<List<Object>> rotated;
        Collections.reverse(arr);
        rotated = transpose2D(arr);
        return rotated;
    }

    private List<List<Object>> transpose2D(List<List<Object>> arr) {
        List<List<Object>> matrixOut = new ArrayList<>();
        if (!arr.isEmpty()) {
            int noOfElementsInList = arr.get(0).size();
            for (int i = 0; i < noOfElementsInList; i++) {
                List<Object> col = new ArrayList<>();
                for (List<Object> row : arr)
                    col.add(row.get(i));
                matrixOut.add(col);
            }
        }
        return matrixOut;
    }

    private Object visitMatrixChanger(MatJv1Parser.Matrix_funcContext ctx, TerminalNode func){
        List<Object> matrix1D;
        List<List<Object>> matrix2D = new ArrayList<>();
        if(ctx.VAR_NAME() != null){
            String varName = ctx.VAR_NAME().getText();
            if (variables.containsKey(varName)) {
                matrix1D = (List<Object>) variables.get(varName);
                if (!isNumeric(matrix1D.get(0).toString()))
                    matrix2D = (List<List<Object>>) variables.get(varName);
                else
                    matrix2D = Arrays.asList(matrix1D);
            }
            if(ctx.TRANSPOSE() != null)
                matrix2D = transpose2D(matrix2D);
            if(ctx.ROTATE() != null)
                matrix2D = rotateClockwise2D(matrix2D);
            if(matrix2D.size() == 1){
                variables.replace(varName, matrix2D.get(0));
                return matrix2D.get(0);
            }
            variables.replace(varName, matrix2D);
            return matrix2D;
        }
        if(ctx.matrix() != null){
            matrix1D = (List<Object>) visitMatrix(ctx.matrix());
            if (!isNumeric(matrix1D.get(0).toString()))
                matrix2D = (List<List<Object>>) visitMatrix(ctx.matrix());
            else
                matrix2D = Arrays.asList(matrix1D);

            List<List<Object>> matrixRes = new ArrayList<>();
            if(ctx.TRANSPOSE() != null) matrixRes = transpose2D(matrix2D);
            if(ctx.ROTATE() != null) matrixRes = rotateClockwise2D(matrix2D);

            if(matrixRes.size() == 1) return matrixRes.get(0);
            else return matrixRes;
        }
        return "";
    }



    @Override
    public Object visitComparison_statement(MatJv1Parser.Comparison_statementContext ctx) {
        Double left = Double.parseDouble(String.valueOf(visitArithmetic_statement(ctx.arithmetic_statement(0))));
        Double right = Double.parseDouble(String.valueOf(visitArithmetic_statement(ctx.arithmetic_statement(1))));
        String op = ctx.op.getText();
        return switch (op) {
            case ">" -> left > right;
            case ">=" -> left >= right;
            case "<" -> left < right;
            case "<=" -> left <= right;
            case "==" -> left.equals(right);
            case "~=" -> !left.equals(right);
            default -> "";
        };
    }


    @Override
    public Object visitLogical_statement(MatJv1Parser.Logical_statementContext ctx) {
        if(ctx == null) return "";
        boolean left, right;

        if(ctx.left != null) {
            if(ctx.left.boolean_exp() == null)
                left = Boolean.parseBoolean(String.valueOf(visitLogical_statement(ctx.left)));
            else{
                left = Boolean.parseBoolean(visitBoolean_exp(ctx.left.boolean_exp()).toString());
                if(ctx.left.NOT() != null) left = !left;
            }
        } else return visitBoolean_exp(ctx.boolean_exp());

        if(ctx.right != null){
            if(ctx.right.boolean_exp() == null)
                right = Boolean.parseBoolean(String.valueOf(visitLogical_statement(ctx.right)));
            else right = Boolean.parseBoolean(visitBoolean_exp(ctx.right.boolean_exp()).toString());
            if(ctx.right.boolean_exp().NOT() != null) right = !right;
        } else return visitBoolean_exp(ctx.boolean_exp());

        String op = "";
        if(ctx.op != null) op = ctx.op.getText();

        return switch (op) {
            case "&&" -> left && right;
            case "||" -> left || right;
            default -> throw new IllegalArgumentException("Unknown operator " + op);
        };
    }

    @Override
    public Object visitArithmetic_statement(MatJv1Parser.Arithmetic_statementContext ctx) {
        if(ctx == null) return "";
        double left, right;

        if(ctx.INCREMET() != null){
            if(ctx.numerical_exp().VAR_NAME() != null){
                variables.replace(ctx.numerical_exp().VAR_NAME().getText(),
                        Double.parseDouble(visitNumerical_exp(ctx.numerical_exp()).toString())+1);
            }else return Double.parseDouble(visitNumerical_exp(ctx.numerical_exp()).toString())+1;
        }
        if(ctx.DECREMENT() != null){
            if(ctx.numerical_exp().VAR_NAME() != null){
                variables.replace(ctx.numerical_exp().VAR_NAME().getText(),
                        Double.parseDouble(visitNumerical_exp(ctx.numerical_exp()).toString())-1);
            }else return Double.parseDouble(visitNumerical_exp(ctx.numerical_exp()).toString())-1;
        }

        if(ctx.left != null) {
            if(ctx.left.numerical_exp() == null)
                left = Double.parseDouble(String.valueOf(visitArithmetic_statement(ctx.left)));
            else{
                left = Double.parseDouble(visitNumerical_exp(ctx.left.numerical_exp()).toString());
                if(ctx.left.numerical_exp().MINUS() != null)
                    left = -left;
            }
        } else{
            Object res = visitNumerical_exp(ctx.numerical_exp());
            if(isNumeric(res.toString())) {
                int sign = (ctx.numerical_exp().MINUS() != null ? -1 : 1);
                return sign * Double.parseDouble(res.toString());
            }
            else return res;
        }

        if(ctx.right != null){
            if(ctx.right.numerical_exp() == null)
                right = Double.parseDouble(String.valueOf(visitArithmetic_statement(ctx.right)));
            else{
                right = Double.parseDouble(visitNumerical_exp(ctx.right.numerical_exp()).toString());
                if(ctx.right.numerical_exp().MINUS() != null) right = -right;
            }
        } else {
            Object res = visitNumerical_exp(ctx.numerical_exp());
            if(isNumeric(res.toString())) {
                int sign = (ctx.numerical_exp().MINUS() != null ? -1 : 1);
                return sign * Double.parseDouble(res.toString());
            }
            else return res;
        }

        String op = "";
        if (ctx.op != null) op = ctx.op.getText();

        return switch (op.charAt(0)) {
            case '*' -> left * right;
            case '/' -> left / right;
            case '+' -> left + right;
            case '-' -> left - right;
            case '%' -> left % right;
            case '^' -> Math.pow(left, right);
            default -> throw new IllegalArgumentException("Unknown operator " + op);
        };
    }

}
