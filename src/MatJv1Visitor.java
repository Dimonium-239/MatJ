// Generated from /home/dimonium-239/Study/6Sem/TKiK/MatJv1/MatJv1.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MatJv1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MatJv1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MatJv1Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(MatJv1Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatJv1Parser#constructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructions(MatJv1Parser.ConstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatJv1Parser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(MatJv1Parser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatJv1Parser#numerical_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumerical_exp(MatJv1Parser.Numerical_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatJv1Parser#boolean_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_exp(MatJv1Parser.Boolean_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatJv1Parser#arithmetic_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_statement(MatJv1Parser.Arithmetic_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatJv1Parser#comparison_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_statement(MatJv1Parser.Comparison_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatJv1Parser#logical_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_statement(MatJv1Parser.Logical_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatJv1Parser#assignation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignation(MatJv1Parser.AssignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatJv1Parser#def_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_func(MatJv1Parser.Def_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatJv1Parser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(MatJv1Parser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatJv1Parser#if_construction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_construction(MatJv1Parser.If_constructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatJv1Parser#else_construction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_construction(MatJv1Parser.Else_constructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatJv1Parser#for_construction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_construction(MatJv1Parser.For_constructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatJv1Parser#while_construction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_construction(MatJv1Parser.While_constructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatJv1Parser#function_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_params(MatJv1Parser.Function_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatJv1Parser#function_returns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_returns(MatJv1Parser.Function_returnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatJv1Parser#matrix_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrix_func(MatJv1Parser.Matrix_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatJv1Parser#range_construction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_construction(MatJv1Parser.Range_constructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatJv1Parser#show_construction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_construction(MatJv1Parser.Show_constructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatJv1Parser#ones_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnes_statement(MatJv1Parser.Ones_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatJv1Parser#zeros_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeros_statement(MatJv1Parser.Zeros_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatJv1Parser#eye_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEye_statement(MatJv1Parser.Eye_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatJv1Parser#matrix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrix(MatJv1Parser.MatrixContext ctx);
	/**
	 * Visit a parse tree produced by {@link MatJv1Parser#matrix_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrix_index(MatJv1Parser.Matrix_indexContext ctx);
}