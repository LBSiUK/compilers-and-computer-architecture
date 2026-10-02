import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class Week1Visitor extends AbstractParseTreeVisitor<String> implements CharactersVisitor<String> {
    @Override public String visitCharstring(CharactersParser.CharstringContext ctx)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.somechar().size(); ++i) {
            sb.append(visit(ctx.somechar(i)));
        }
        return sb.toString();
    }
    @Override public String visitUppercaseChar(CharactersParser.UppercaseCharContext ctx)
    {
        return "\""+ctx.getText()+"\" : uppercase\n";
    }
    @Override public String visitLowercaseChar(CharactersParser.LowercaseCharContext ctx)
    {
        return "\""+ctx.getText()+"\" : lowercase\n";
    }
    @Override public String visitNumericalChar(CharactersParser.NumericalCharContext ctx)
    {
        return "\""+ctx.getText()+"\" : numeric\n";
    }
}
