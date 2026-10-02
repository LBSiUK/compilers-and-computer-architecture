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
    @Override public String visitWhitespace(CharactersParser.WhitespaceContext ctx)
    {
        return "\""+ctx.getText()+"\" : whitespace\n";
    }
    @Override public String visitPunctuation(CharactersParser.PunctuationContext ctx)
    {
        return "\""+ctx.getText()+"\" : punctuation\n";
    }
    @Override public String visitExtended(CharactersParser.ExtendedContext ctx)
    {
        return "\""+ctx.getText()+"\" : extended character\n";
    }
    @Override public String visitUnprintable(CharactersParser.UnprintableContext ctx)
    {
        return "\""+ctx.getText()+"\" : unprintable\n";
    }
}
