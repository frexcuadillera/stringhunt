package stringhunt.letter;

import java.util.Random;

public class WordGenerator {
    
    Random rn;
    LetterConverter lc;
    
    public WordGenerator() {
	rn = new Random();
	lc = new LetterConverter();
    }
    
    public String[] getNextBoard() {
	String[] generatedBoard = null;
	
	//generate a random letters for testing
	for(int i = 0; i < 30; i++) {
	    generatedBoard[i] = lc.getLetter(rn.nextInt(26));
	}
		
	return generatedBoard;
    }

}
