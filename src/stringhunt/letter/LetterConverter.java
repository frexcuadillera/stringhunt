package stringhunt.letter;

public class LetterConverter {
    
    public int getLetterIndex(String letterInput) {
		int letterIndex = -1;
		
		String[] letterArray = {
		"A", "B", "C", "D", "E", 
		"F", "G", "H", "I", "J", 
		"K", "L", "M", "N", "O", 
		"P", "Q", "R", "S", "T", 
		"U", "V", "W", "X", "Y", 
		"Z"
		};
	    
		for(int i = 0; i < 26; i++) {
		    if(letterInput == letterArray[i]) {
				letterIndex = i;
		    }
		}
		
		return letterIndex;		
    }
    
    public String getLetter(int index) {
		String letter = null;
		
		String[] letterArray = {
		"A", "B", "C", "D", "E", 
		"F", "G", "H", "I", "J", 
		"K", "L", "M", "N", "O", 
		"P", "Q", "R", "S", "T", 
		"U", "V", "W", "X", "Y", 
		"Z"
		};
		
		letter = letterArray[index];
		
		return letter;
	
    }

}
