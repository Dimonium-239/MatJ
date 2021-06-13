import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Compiler {
    public static void main(String[] args) {
        compile(args);
    }

    private static void compile(String[] args){
        try {
            String fileName = args[0];
            CharStream charStream = fromFileName(fileName);
            MatJv1Lexer lexer = new MatJv1Lexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MatJv1Parser parser = new MatJv1Parser(tokens);
            ParseTree tree = parser.prog();
            if(parser.getNumberOfSyntaxErrors() == 0) {
                MatJv1BaseVisitor visitor = new MatJProductionVisitor();
                visitor.visit(tree);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
