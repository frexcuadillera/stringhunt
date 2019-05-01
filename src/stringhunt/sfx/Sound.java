package stringhunt.sfx;

import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException; 

public class Sound {
    private Clip clip; 
    
    private AudioInputStream audioInputStream; 
    private String path; 
  
    public Sound(String path) {
    	this.path = path;
    } 
    
    public void open() 
    	throws LineUnavailableException, 
    	IOException, 
    	UnsupportedAudioFileException {
    	audioInputStream = AudioSystem.getAudioInputStream(
    		Sound.class.getResource(path)
    	); 
    	clip = AudioSystem.getClip(); 
    	clip.open(audioInputStream);
    }
    
    //play the audio 
    public void play() { 
        clip.start(); 
    }  
    
    // Method to stop the audio 
    public void stop() 
    		throws UnsupportedAudioFileException, 
    		IOException, LineUnavailableException { 
        clip.stop(); 
        clip.close(); 
    } 
    
    //loop audio stream 
    public void loop() {
        clip.loop(Clip.LOOP_CONTINUOUSLY); 
    } 
}
