package stringhunt.letter;

public class LetterDamageCalculator {
        
    public boolean validateWord(String input)  {

		boolean isValid = false;
			
		for(int i = 0; i < Words.wordArray.length; i++) {

		    if(input.equals(Words.wordArray[i])){
				isValid = true;
				break;
		    } else {
				isValid = false;
		    }	    
		}
		
		return isValid;
    }
    
    public int calculateDamageDealt(String word) {
    	
		int damageDealt = 0;
		
		if(word.length() > 2) {
		    damageDealt = word.length() - 2;
		}
		
		return damageDealt;
    }
    
    public int calculateDamageTaken(String word) {

		int damageTaken = 1;
		
		if(word.length() > 2) {
		    damageTaken = word.length() - 2;
		}
		
		return damageTaken;
    }
}
