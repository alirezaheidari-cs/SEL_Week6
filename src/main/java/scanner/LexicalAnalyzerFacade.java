package scanner;

import scanner.token.Token;
import java.util.Scanner;

public class LexicalAnalyzerFacade {
    private lexicalAnalyzer lexicalAnalyzer;

    public LexicalAnalyzerFacade(Scanner sc) {
        lexicalAnalyzer = new lexicalAnalyzer(sc);
    }

    public Token getNextToken() {
        return lexicalAnalyzer.getNextToken();
    }
}
