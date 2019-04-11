package stringhunt.letter;

import java.util.Random;

public class BoardGenerator {
    
    Random rn;
    LetterConverter lc;
    
    public BoardGenerator() {
	rn = new Random();
	lc = new LetterConverter();
    }
    
    public String[] getNextBoard(int currentLevel) {
	
	//use current level parameter to generate board difficulty
	
	String[] generatedBoard = null;
	generatedBoard = new String[30];
	
	//generate a random letters for testing
	for(int i = 0; i < 30; i++) {
	    generatedBoard[i] = lc.getLetter(rn.nextInt(26));
	}
		
	return generatedBoard;
    }

}
