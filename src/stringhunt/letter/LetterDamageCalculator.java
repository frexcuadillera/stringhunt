package stringhunt.letter;

public class LetterDamageCalculator {
    
    public boolean validateWord(String word) {
	
	//test a
	if(word.equals("A")) {
	    return true;
	} else {
	    return false;
	}
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
