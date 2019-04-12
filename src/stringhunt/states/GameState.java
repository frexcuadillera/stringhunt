package stringhunt.states;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import stringhunt.StringHunt;
import stringhunt.gfx.Assets;
import stringhunt.letter.LetterDamageCalculator;
import stringhunt.letter.LetterPanel;

public class GameState implements ActionListener {
   
    private JPanel gamePanel;   
    private JPanel letterPanelObject;   
    private JPanel scenePanel;
    
    private JLabel playerHealthLabel;
    private JLabel enemyHealthLabel;
    
    public static JTextField textField;
    
    private JButton resetButton;
    private JButton attackButton;
    private JButton menuButton;
    
    private LetterPanel letterPanelConstructor;
    private LetterDamageCalculator ldc;
    
    private final int X = 300;
    private final int Y = 500;
    private final int WIDTH = 200;
    private final int HEIGHT = 50;
    
    private final int LETTER_PANEL_OBJECT_X = 100;
    private final int LETTER_PANEL_OBJECT_Y = 280;
    private final int LETTER_PANEL_WIDTH = 600;
    private final int LETTER_PANEL_HEIGHT = 170;
    
    private final int SCENE_PANEL_OBJECT_X = 100;
    private final int SCENE_PANEL_OBJECT_Y = 50;
    private final int SCENE_PANEL_WIDTH = 600;
    private final int SCENE_PANEL_HEIGHT = 150;
    
    private final int TEXT_FIELD_COLUMNS = 20;
    private final int TEXT_FIELD_X = 300;
    private final int TEXT_FIELD_Y = 220;
    private final int TEXT_FIELD_WIDTH = 200;
    private final int TEXT_FIELD_HEIGHT = 30;
    
    private final int HEALTH_WIDTH = 50;
    private final int HEALTH_HEIGHT = 10;
    
    private final int PLAYER_HEALTH_X = 50;
    private final int PLAYER_HEALTH_Y = 10;
    
    private final int ENEMY_HEALTH_X = 500;
    private final int ENEMY_HEALTH_Y = 10;
    
    private int currentPlayerHealth = 10;
    private int currentEnemyHealth = 10;
    
    private int currentEnemy = 1;
    private int currentLevel = 1;
       
    public GameState() {
	gamePanel = new JPanel();
	gamePanel.setLayout(null);
	gamePanel.setBounds(0, 0, StringHunt.FRAME_WIDTH, StringHunt.FRAME_HEIGHT);
	
	//letter panel
	letterPanelConstructor = new LetterPanel();
	letterPanelObject = letterPanelConstructor.getLetterPanel();	
	letterPanelObject.setBounds(
		LETTER_PANEL_OBJECT_X, 
		LETTER_PANEL_OBJECT_Y, 
		LETTER_PANEL_WIDTH, 
		LETTER_PANEL_HEIGHT
	);
	
	//scene panel
	scenePanel = new JPanel();
	scenePanel.setLayout(null);
	scenePanel.setBounds(
		SCENE_PANEL_OBJECT_X, 
		SCENE_PANEL_OBJECT_Y, 
		SCENE_PANEL_WIDTH, 
		SCENE_PANEL_HEIGHT
	);	
	scenePanel.setBackground(new Color(0,255,0));
	
	//player health
	playerHealthLabel = new JLabel(String.valueOf(currentPlayerHealth)+"/10 HP");
	playerHealthLabel.setBounds(
		PLAYER_HEALTH_X, 
		PLAYER_HEALTH_Y, 
		HEALTH_WIDTH, 
		HEALTH_HEIGHT
	);
	scenePanel.add(playerHealthLabel);
	
	//enemy health
	enemyHealthLabel = new JLabel(
		String.valueOf(currentEnemyHealth) +
		"/" +
		(10 + ((currentEnemy - 1) * 5)) +
		" HP"
	);
	enemyHealthLabel.setBounds(
		ENEMY_HEALTH_X, 
		ENEMY_HEALTH_Y,
		HEALTH_WIDTH, 
		HEALTH_HEIGHT
	);
	scenePanel.add(enemyHealthLabel);
	
	//text field
	textField = new JTextField(TEXT_FIELD_COLUMNS);
	textField.setBounds(
		TEXT_FIELD_X,
		TEXT_FIELD_Y,
		TEXT_FIELD_WIDTH,
		TEXT_FIELD_HEIGHT
	);
	textField.setEditable(false);
	textField.addActionListener(this);
	textField.setText(null);
	
	//letter damage calculator
	ldc = new LetterDamageCalculator();
	
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
	
	//menu button
	menuButton = new JButton();
	menuButton.addActionListener(this);
	menuButton.setBounds(X + 250, Y, WIDTH, HEIGHT);
	menuButton.setIcon(new ImageIcon(Assets.btn_menu[0]));
	menuButton.setPressedIcon(new ImageIcon(Assets.btn_menu[1]));

	//add to game panel
	gamePanel.add(scenePanel);
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
	    
	    //do nothing if text field is empty
	    if(textField.getText().isEmpty()) {
		return;
	    }
	    
	   //do validate entry here
	    if(ldc.validateWord(textField.getText())) {
		currentEnemyHealth -= ldc.calculateDamageDealt(textField.getText());
		System.out.println("word is valid, dealt " +ldc.calculateDamageDealt(textField.getText())+ " damage");
	    } else {
		currentPlayerHealth -= ldc.calculateDamageTaken(textField.getText());
		System.out.println("word is invalid, received "+ldc.calculateDamageTaken(textField.getText())+ " damage");
	    }
	    
	    //update health here
	    playerHealthLabel.setText(String.valueOf(currentPlayerHealth)+"/10 HP");
	    enemyHealthLabel.setText(		
		    String.valueOf(currentEnemyHealth) +
		    "/" +
		    (10 + ((currentEnemy - 1) * 5)) +
		    " HP"
	    );
	    
	    //update board here
	    textField.setText(null);
	    Arrays.fill(letterPanelConstructor.alreadyPressed, false);
	    letterPanelConstructor.updateBoard(currentLevel);
	    
	    if(currentPlayerHealth <= 0) {
		//do game over event here
		playerHealthLabel.setText("0/10 HP");
		System.out.println("game over player health 0");
	    }
	    
	    if(currentEnemyHealth <= 0) {
		
		currentEnemy++;
		
		if(currentEnemy > 5) {
		    currentLevel++;
		    currentEnemy = 1;
		}
		
		if(currentLevel > 5) {
		    //game over, you win!
		    System.out.println("graduate");
		}
		
		enemyHealthLabel.setText("0/10 HP");
		System.out.println("enemy defeated");
	    }
	}
	
	if(e.getSource() == menuButton) {
	    StringHunt.state = "menu"; // temp goto menu
	    //do pause event here
	    
	}
	
    }

}
