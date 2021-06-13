// Generated from /home/dimonium-239/Study/6Sem/TKiK/MatJv1/MatJv1.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MatJv1Parser}.
 */
public interface MatJv1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MatJv1Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MatJv1Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatJv1Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MatJv1Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatJv1Parser#constructions}.
	 * @param ctx the parse tree
	 */
	void enterConstructions(MatJv1Parser.ConstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatJv1Parser#constructions}.
	 * @param ctx the parse tree
	 */
	void exitConstructions(MatJv1Parser.ConstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatJv1Parser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(MatJv1Parser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatJv1Parser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(MatJv1Parser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatJv1Parser#numerical_exp}.
	 * @param ctx the parse tree
	 */
	void enterNumerical_exp(MatJv1Parser.Numerical_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatJv1Parser#numerical_exp}.
	 * @param ctx the parse tree
	 */
	void exitNumerical_exp(MatJv1Parser.Numerical_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatJv1Parser#boolean_exp}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_exp(MatJv1Parser.Boolean_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatJv1Parser#boolean_exp}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_exp(MatJv1Parser.Boolean_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatJv1Parser#arithmetic_statement}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_statement(MatJv1Parser.Arithmetic_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatJv1Parser#arithmetic_statement}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_statement(MatJv1Parser.Arithmetic_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatJv1Parser#comparison_statement}.
	 * @param ctx the parse tree
	 */
	void enterComparison_statement(MatJv1Parser.Comparison_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatJv1Parser#comparison_statement}.
	 * @param ctx the parse tree
	 */
	void exitComparison_statement(MatJv1Parser.Comparison_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatJv1Parser#logical_statement}.
	 * @param ctx the parse tree
	 */
	void enterLogical_statement(MatJv1Parser.Logical_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatJv1Parser#logical_statement}.
	 * @param ctx the parse tree
	 */
	void exitLogical_statement(MatJv1Parser.Logical_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatJv1Parser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(MatJv1Parser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatJv1Parser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(MatJv1Parser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatJv1Parser#def_func}.
	 * @param ctx the parse tree
	 */
	void enterDef_func(MatJv1Parser.Def_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatJv1Parser#def_func}.
	 * @param ctx the parse tree
	 */
	void exitDef_func(MatJv1Parser.Def_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatJv1Parser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(MatJv1Parser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatJv1Parser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(MatJv1Parser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatJv1Parser#if_construction}.
	 * @param ctx the parse tree
	 */
	void enterIf_construction(MatJv1Parser.If_constructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatJv1Parser#if_construction}.
	 * @param ctx the parse tree
	 */
	void exitIf_construction(MatJv1Parser.If_constructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatJv1Parser#else_construction}.
	 * @param ctx the parse tree
	 */
	void enterElse_construction(MatJv1Parser.Else_constructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatJv1Parser#else_construction}.
	 * @param ctx the parse tree
	 */
	void exitElse_construction(MatJv1Parser.Else_constructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatJv1Parser#for_construction}.
	 * @param ctx the parse tree
	 */
	void enterFor_construction(MatJv1Parser.For_constructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatJv1Parser#for_construction}.
	 * @param ctx the parse tree
	 */
	void exitFor_construction(MatJv1Parser.For_constructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatJv1Parser#while_construction}.
	 * @param ctx the parse tree
	 */
	void enterWhile_construction(MatJv1Parser.While_constructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatJv1Parser#while_construction}.
	 * @param ctx the parse tree
	 */
	void exitWhile_construction(MatJv1Parser.While_constructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatJv1Parser#function_params}.
	 * @param ctx the parse tree
	 */
	void enterFunction_params(MatJv1Parser.Function_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatJv1Parser#function_params}.
	 * @param ctx the parse tree
	 */
	void exitFunction_params(MatJv1Parser.Function_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatJv1Parser#function_returns}.
	 * @param ctx the parse tree
	 */
	void enterFunction_returns(MatJv1Parser.Function_returnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatJv1Parser#function_returns}.
	 * @param ctx the parse tree
	 */
	void exitFunction_returns(MatJv1Parser.Function_returnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatJv1Parser#matrix_func}.
	 * @param ctx the parse tree
	 */
	void enterMatrix_func(MatJv1Parser.Matrix_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatJv1Parser#matrix_func}.
	 * @param ctx the parse tree
	 */
	void exitMatrix_func(MatJv1Parser.Matrix_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatJv1Parser#range_construction}.
	 * @param ctx the parse tree
	 */
	void enterRange_construction(MatJv1Parser.Range_constructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatJv1Parser#range_construction}.
	 * @param ctx the parse tree
	 */
	void exitRange_construction(MatJv1Parser.Range_constructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatJv1Parser#show_construction}.
	 * @param ctx the parse tree
	 */
	void enterShow_construction(MatJv1Parser.Show_constructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatJv1Parser#show_construction}.
	 * @param ctx the parse tree
	 */
	void exitShow_construction(MatJv1Parser.Show_constructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatJv1Parser#ones_statement}.
	 * @param ctx the parse tree
	 */
	void enterOnes_statement(MatJv1Parser.Ones_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatJv1Parser#ones_statement}.
	 * @param ctx the parse tree
	 */
	void exitOnes_statement(MatJv1Parser.Ones_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatJv1Parser#zeros_statement}.
	 * @param ctx the parse tree
	 */
	void enterZeros_statement(MatJv1Parser.Zeros_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatJv1Parser#zeros_statement}.
	 * @param ctx the parse tree
	 */
	void exitZeros_statement(MatJv1Parser.Zeros_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatJv1Parser#eye_statement}.
	 * @param ctx the parse tree
	 */
	void enterEye_statement(MatJv1Parser.Eye_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatJv1Parser#eye_statement}.
	 * @param ctx the parse tree
	 */
	void exitEye_statement(MatJv1Parser.Eye_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatJv1Parser#matrix}.
	 * @param ctx the parse tree
	 */
	void enterMatrix(MatJv1Parser.MatrixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatJv1Parser#matrix}.
	 * @param ctx the parse tree
	 */
	void exitMatrix(MatJv1Parser.MatrixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatJv1Parser#matrix_index}.
	 * @param ctx the parse tree
	 */
	void enterMatrix_index(MatJv1Parser.Matrix_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatJv1Parser#matrix_index}.
	 * @param ctx the parse tree
	 */
	void exitMatrix_index(MatJv1Parser.Matrix_indexContext ctx);
}