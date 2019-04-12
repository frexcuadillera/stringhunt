package stringhunt.states;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import stringhunt.StringHunt;
import stringhunt.gfx.Assets;
import stringhunt.letter.LetterPanel;

public class GameState implements ActionListener {
   
    private JPanel gamePanel;
    private LetterPanel letterPanelConstructor;
    private JPanel letterPanelObject;
    public static JTextField textField;
    
    private JButton resetButton;
    private JButton attackButton;
    private JButton menuButton;
    
    private final int X = 300;
    private final int Y = 500;
    private final int WIDTH = 200;
    private final int HEIGHT = 50;
    
    private final int LETTER_PANEL_OBJECT_X = 105;
    private final int LETTER_PANEL_OBJECT_Y = 280;
    
    private final int TEXT_FIELD_COLUMNS = 20;
    private final int TEXT_FIELD_X = 300;
    private final int TEXT_FIELD_Y = 220;
    private final int TEXT_FIELD_WIDTH = 200;
    private final int TEXT_FIELD_HEIGHT = 30;
    
    private int currentLevel = 1;
       
    public GameState() {
	gamePanel = new JPanel();
	gamePanel.setLayout(null);
	gamePanel.setBounds(0, 0, StringHunt.FRAME_WIDTH, StringHunt.FRAME_HEIGHT);
	
	//letter panel
	letterPanelConstructor = new LetterPanel();
	letterPanelObject = letterPanelConstructor.getLetterPanel();	
	letterPanelObject.setBounds(LETTER_PANEL_OBJECT_X, LETTER_PANEL_OBJECT_Y, 590, 170);
	
	//text field
	textField = new JTextField(TEXT_FIELD_COLUMNS);
	textField.setBounds(TEXT_FIELD_X,TEXT_FIELD_Y,TEXT_FIELD_WIDTH,TEXT_FIELD_HEIGHT);
	textField.setEditable(false);
	
	//reset button
	resetButton = new JButton();
	resetButton.addActionListener(this);
	resetButton.setBounds(X - 250, Y, WIDTH, HEIGHT);
	resetButton.setIcon(new ImageIcon(Assets.btn_reset[0]));
	resetButton.setPressedIcon(new ImageIcon(Assets.btn_reset[1]));
	
	//attack button
	attackButton = new JButton();
	attackButton.addActionListener(this);
	attackButton.setBounds(X, Y, WIDTH, HEIGHT);
	attackButton.setIcon(new ImageIcon(Assets.btn_attack[0]));
	attackButton.setPressedIcon(new ImageIcon(Assets.btn_attack[1]));
	
	//menubutton
	menuButton = new JButton();
	menuButton.addActionListener(this);
	menuButton.setBounds(X + 250, Y, WIDTH, HEIGHT);
	menuButton.setIcon(new ImageIcon(Assets.btn_menu[0]));
	menuButton.setPressedIcon(new ImageIcon(Assets.btn_menu[1]));

	//add to game panel
	gamePanel.add(letterPanelObject);
	gamePanel.add(textField);
	gamePanel.add(resetButton);
	gamePanel.add(attackButton);
	gamePanel.add(menuButton);
    }
    
    public void tick() {
	letterPanelConstructor.tick();
    }
        
    public JPanel getGamePanel() {
        return gamePanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	
	if(e.getSource() == resetButton) {
	    System.out.println("reset pressed");
	    textField.setText(null);
	    letterPanelConstructor.resetBoard();
	}
	
	if(e.getSource() == attackButton) {
	    System.out.println("attack pressed");
	    //attack event
	    
	    Arrays.fill(letterPanelConstructor.alreadyPressed, false);
	    
	    //update board
	    //do validate entry here
	    textField.setText(null);
	    letterPanelConstructor.updateBoard(currentLevel);
	}
	
	if(e.getSource() == menuButton) {
	    StringHunt.state = "menu"; // temp goto menu
	    //do pause event here
	    
	}
	
    }

}
