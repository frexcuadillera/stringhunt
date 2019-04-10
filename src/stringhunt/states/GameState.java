package stringhunt.states;

import javax.swing.*;

import stringhunt.StringHunt;
import stringhunt.gfx.Assets;
import stringhunt.letter.LetterPanel;

import java.awt.event.*;
import java.awt.*;

public class GameState implements ActionListener {
    
    private JPanel gamePanel;
    private LetterPanel letterPanelConstructor;
    private JPanel letterPanelObject;
    
    private JButton attackButton;
    private JButton menuButton;
    
    private final int X = 300;
    private final int Y = 350;
    private final int WIDTH = 200;
    private final int HEIGHT = 50;
    
    private final int LETTER_PANEL_OBJECT_X = 105;
    private final int LETTER_PANEL_OBJECT_Y = 140;
    
    
    public GameState() {
	gamePanel = new JPanel();
	gamePanel.setLayout(null);
	gamePanel.setBounds(0, 0, 800, 450);
	
	letterPanelConstructor = new LetterPanel();
	letterPanelObject = letterPanelConstructor.getLetterPanel();	
	letterPanelObject.setBounds(LETTER_PANEL_OBJECT_X, LETTER_PANEL_OBJECT_Y, 590, 170);
	
	//buttons
	attackButton = new JButton();
	attackButton.addActionListener(this);
	attackButton.setBounds(X, Y, WIDTH, HEIGHT);
	attackButton.setIcon(new ImageIcon(Assets.btn_attack[0]));
	attackButton.setPressedIcon(new ImageIcon(Assets.btn_attack[1]));
	
	menuButton = new JButton();
	menuButton.addActionListener(this);
	menuButton.setBounds(X + 250, Y, WIDTH, HEIGHT);
	menuButton.setIcon(new ImageIcon(Assets.btn_menu[0]));
	menuButton.setPressedIcon(new ImageIcon(Assets.btn_menu[1]));

	//add to game panel
	gamePanel.add(letterPanelObject);
	gamePanel.add(attackButton);
	gamePanel.add(menuButton);
	System.out.println("entered game frame");
    }
    
    public void tick() {
	letterPanelConstructor.tick();
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
	    letterPanelConstructor.updateBoard();
	}
	
	if(e.getSource() == menuButton) {
	    StringHunt.state = "menu"; // temp. goto menu
	    //do pause event here
	    
	}
	
    }

}
