package stringhunt.letter;

import java.util.Random;

public class BoardGenerator {
    
    private Random rn;
    private LetterConverter lc;
    private String[] currentBoard;
    
    public BoardGenerator() {
	rn = new Random();
	lc = new LetterConverter();
	currentBoard = new String[30];
    }
    
    public String[] getNextBoard(int currentLevel) {
	
	//use current level parameter to generate board difficulty
	
	String[] generatedBoard = null;
	generatedBoard = new String[30];
	
	//generate a random letters for testing
	for(int i = 0; i < 30; i++) {
	    generatedBoard[i] = lc.getLetter(rn.nextInt(26));
	}
	
	currentBoard = generatedBoard;
	return generatedBoard;
    }
    
    public String[] getCurrentBoard() {
	return currentBoard;
    }

}
