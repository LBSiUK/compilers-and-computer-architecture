import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Week1 {

    public static void main(String[] args) throws IOException {
        // create a CharStream that reads from standard input
        CharStream input = CharStreams.fromStream(System.in);

        // create a lexer that feeds off of input CharStream
        CharactersLexer lexer = new CharactersLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        CharactersParser parser = new CharactersParser(tokens);
        CharactersParser.CharstringContext tree = parser.charstring(); // begin parsing at charstring rule

        Week1Visitor week1_visitor = new Week1Visitor();
        System.out.println(week1_visitor.visit(tree));
    }
}
