import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Visitor extends compiler2BaseVisitor<Void> {
    public PrintStream ps = new PrintStream(new FileOutputStream(Main.out));
    public static String exp = "";

    public Visitor() throws FileNotFoundException {
        System.setOut(ps);
    }

    @Override
    public Void visitCompUnit(compiler2Parser.CompUnitContext ctx) {
        return super.visitCompUnit(ctx);
    }

    @Override
    public Void visitFuncDef(compiler2Parser.FuncDefContext ctx) {
        System.out.print("define dso_local ");
        return super.visitFuncDef(ctx);
    }

    @Override
    public Void visitFuncType(compiler2Parser.FuncTypeContext ctx) {
        System.out.print("i32 ");
        return null;
    }

    @Override
    public Void visitIdent(compiler2Parser.IdentContext ctx) {
        System.out.print("@main() ");
        return null;
    }

    @Override
    public Void visitBlock(compiler2Parser.BlockContext ctx) {
        System.out.println("{");
        visit(ctx.stmt());
        System.out.println("}");
        return null;
    }

    @Override
    public Void visitStmt(compiler2Parser.StmtContext ctx) {
        visit(ctx.exp());
        new Expression().function(exp);
        return null;
    }

    @Override
    public Void visitExp(compiler2Parser.ExpContext ctx) {
        return super.visitExp(ctx);
    }

    @Override
    public Void visitAddExp(compiler2Parser.AddExpContext ctx) {
        return super.visitAddExp(ctx);
    }

    @Override
    public Void visitAddSub(compiler2Parser.AddSubContext ctx) {
        exp += ctx.getText();
        return super.visitAddSub(ctx);
    }

    @Override
    public Void visitMulExp(compiler2Parser.MulExpContext ctx) {
        return super.visitMulExp(ctx);
    }

    @Override
    public Void visitMulDiv(compiler2Parser.MulDivContext ctx) {
        exp += ctx.getText();
        return super.visitMulDiv(ctx);
    }

    @Override
    public Void visitUnaryExp(compiler2Parser.UnaryExpContext ctx) {
        return super.visitUnaryExp(ctx);
    }

    @Override
    public Void visitPrimaryExp(compiler2Parser.PrimaryExpContext ctx) {
        if (ctx.number() != null) {
            visit(ctx.number());
        } else {
            exp += "(";
            visit(ctx.exp());
            exp += ")";
        }
        return null;
    }

    @Override
    public Void visitUnaryOp(compiler2Parser.UnaryOpContext ctx) {
        exp += ctx.getText();
        return super.visitUnaryOp(ctx);
    }

    @Override
    public Void visitNumber(compiler2Parser.NumberContext ctx) {
        if (ctx.DecimalConst() != null) {
            exp += ctx.DecimalConst().getText();
        } else if (ctx.OctalConst() != null) {
            String s = ctx.OctalConst().getText().substring(1);
            exp += String.valueOf(Integer.parseInt(s, 8));
        } else {
            String s = ctx.HexadecimalConst().getText().substring(2);
            exp += String.valueOf(Integer.parseInt(s, 16));
        }
        return null;
    }
}