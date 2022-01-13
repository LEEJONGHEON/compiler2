// Generated from compiler2.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link compiler2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface compiler2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link compiler2Parser#compUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompUnit(compiler2Parser.CompUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler2Parser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(compiler2Parser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler2Parser#funcType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncType(compiler2Parser.FuncTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler2Parser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(compiler2Parser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler2Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(compiler2Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler2Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(compiler2Parser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(compiler2Parser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler2Parser#addExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExp(compiler2Parser.AddExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler2Parser#addSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(compiler2Parser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler2Parser#mulExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExp(compiler2Parser.MulExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler2Parser#mulDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(compiler2Parser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler2Parser#unaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExp(compiler2Parser.UnaryExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler2Parser#primaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExp(compiler2Parser.PrimaryExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler2Parser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(compiler2Parser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler2Parser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(compiler2Parser.NumberContext ctx);
}