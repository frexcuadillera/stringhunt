package stringhunt.states;

import javax.swing.*;

import stringhunt.gfx.Assets;
import stringhunt.letter.LetterPanel;

import java.awt.event.*;
import java.awt.*;

public class GameState implements ActionListener {
    
    private JPanel gamePanel;
    private LetterPanel letterPanel;
    
    private JButton attackButton;
    
    private final int X = 300;
    private final int Y = 350;
    private final int WIDTH = 200;
    private final int HEIGHT = 50;
    
    private final int LETTER_PANEL_X = 10;
    private final int LETTER_PANEL_Y = 10;
    
    
    public GameState() {
	gamePanel = new JPanel();
	gamePanel.setLayout(null);
	gamePanel.setBounds(0, 0, 800, 450);
		
	letterPanel = new LetterPanel(LETTER_PANEL_X, LETTER_PANEL_Y);
	
	attackButton = new JButton();
	attackButton.addActionListener(this);
	attackButton.setBounds(X, Y, WIDTH, HEIGHT);
	attackButton.setIcon(new ImageIcon(Assets.btn_attack[0]));

	gamePanel.add(attackButton);
	System.out.println("entered game frame");
    }
    
    public void tick() {
	System.out.println("game state ticking");
    }
    
    public JPanel getGamePanel() {
        return gamePanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	
	if(e.getSource() == attackButton) {
	    System.out.println("attack pressed");
	    //attack event
	    
	    //update board
	    
	}
	
    }

}
