// Generated from compiler2.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compiler2Parser}.
 */
public interface compiler2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compiler2Parser#compUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompUnit(compiler2Parser.CompUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler2Parser#compUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompUnit(compiler2Parser.CompUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler2Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(compiler2Parser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler2Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(compiler2Parser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler2Parser#funcType}.
	 * @param ctx the parse tree
	 */
	void enterFuncType(compiler2Parser.FuncTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler2Parser#funcType}.
	 * @param ctx the parse tree
	 */
	void exitFuncType(compiler2Parser.FuncTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler2Parser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(compiler2Parser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler2Parser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(compiler2Parser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler2Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(compiler2Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler2Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(compiler2Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(compiler2Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(compiler2Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(compiler2Parser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(compiler2Parser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler2Parser#addExp}.
	 * @param ctx the parse tree
	 */
	void enterAddExp(compiler2Parser.AddExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler2Parser#addExp}.
	 * @param ctx the parse tree
	 */
	void exitAddExp(compiler2Parser.AddExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler2Parser#addSub}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(compiler2Parser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler2Parser#addSub}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(compiler2Parser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler2Parser#mulExp}.
	 * @param ctx the parse tree
	 */
	void enterMulExp(compiler2Parser.MulExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler2Parser#mulExp}.
	 * @param ctx the parse tree
	 */
	void exitMulExp(compiler2Parser.MulExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler2Parser#mulDiv}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(compiler2Parser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler2Parser#mulDiv}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(compiler2Parser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler2Parser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExp(compiler2Parser.UnaryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler2Parser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExp(compiler2Parser.UnaryExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler2Parser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExp(compiler2Parser.PrimaryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler2Parser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExp(compiler2Parser.PrimaryExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler2Parser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOp(compiler2Parser.UnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler2Parser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOp(compiler2Parser.UnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler2Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(compiler2Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler2Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(compiler2Parser.NumberContext ctx);
}