package stringhunt.states;

import javax.swing.*;
import java.awt.*;

public class GameState {
    
    private JPanel gamePanel;
    private JLabel testlabel;
    
    public GameState() {
	gamePanel = new JPanel();
	
	testlabel = new JLabel("game frame");
	
	gamePanel.setBounds(0, 0, 800, 450);
	
	testlabel.setLocation(10, 10);
	gamePanel.add(testlabel);
	System.out.println("entered game frame");
    }
    
    public JPanel getGamePanel() {
        return gamePanel;
    }

}
