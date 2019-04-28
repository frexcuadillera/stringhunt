package stringhunt.letter;

import java.util.Random;

public class BoardGenerator {
    
    private Random rn;
    private LetterConverter lc;
    private String[] currentBoard;
    private int wordCount;
    
    public BoardGenerator() {
	
		rn = new Random();
		lc = new LetterConverter();
		currentBoard = new String[30];
		wordCount = Words.wordArray.length;

    }
    
    public String[] getNextBoard(int currentLevel) {
	
		String[] generatedBoard = new String[30];
		
		if(currentLevel <= 3) {
		    
		    String word31 = Words.wordArray[rn.nextInt(wordCount)];
		    String word32 = Words.wordArray[rn.nextInt(wordCount)];
		    String word33 = Words.wordArray[rn.nextInt(wordCount)];
		    
		    System.out.println(word31);
		    System.out.println(word32);
		    System.out.println(word33);
		    
		    System.out.println(word31.length()+word32.length()+word33.length());
		    
		    while(word31.length()+word32.length()+word33.length() > 30) {
				word31 = Words.wordArray[rn.nextInt(wordCount)];
				word32 = Words.wordArray[rn.nextInt(wordCount)];
				word33 = Words.wordArray[rn.nextInt(wordCount)];		
		    }
		    
		    for(int i = 0; i < word31.length(); i++) {
				generatedBoard[i] = word31.substring(i, i+1);
		    }
		    
		    for(int i = 0; i < word32.length(); i++) {
				generatedBoard[i + word31.length()] = word32.substring(i, i+1);
		    }
		    
		    for(int i = 0; i < word33.length(); i++) {
				generatedBoard[i + word31.length() + word32.length()] = word33.substring(i, i+1);
		    }
		    
		    for(int i = word31.length()+word32.length()+word33.length(); i < 30; i++) {
				generatedBoard[i] = lc.getLetter(rn.nextInt(26));
		    }
		}	
		
		if(currentLevel == 4) {
		    
		    String word41 = Words.wordArray[rn.nextInt(wordCount)];
		    String word42 = Words.wordArray[rn.nextInt(wordCount)];
		    
		    System.out.println(word41);
		    System.out.println(word42);
		    
		    for(int i = 0; i < word41.length(); i++) {
				generatedBoard[i] = word41.substring(i, i+1);
		    }
		    
		    for(int i = 0; i < word42.length(); i++) {
				generatedBoard[i + word41.length()] = word42.substring(i, i+1);
		    }
		    
		    for(int i = word41.length() + word42.length(); i < 30; i++) {
				generatedBoard[i] = lc.getLetter(rn.nextInt(26));
		    }
		    
		}
		
		if(currentLevel == 5) {
		    
		    String word51 = Words.wordArray[rn.nextInt(wordCount)];
		    
		    System.out.println(word51);
		    
		    for(int i = 0; i < word51.length(); i++) {
				generatedBoard[i] = word51.substring(i, i+1);
		    }
		    
		    for(int i = word51.length(); i < 30; i++) {
				generatedBoard[i] = lc.getLetter(rn.nextInt(26));
		    }
		    
		}
		
		randomizeInPlace(generatedBoard);

		currentBoard = generatedBoard;
		return generatedBoard;
    }
    
    public void randomizeInPlace(String[] arr) {
	
		Random rgen = new Random();

		for (int i = 0; i < arr.length; i++) {
		    int randPos = rgen.nextInt(arr.length);
		    String tmp = arr[i];
		    arr[i] = arr[randPos];
		    arr[randPos] = tmp;
		}
	
    }
    
    public String[] getCurrentBoard() {
		return currentBoard;
    }
    
}
