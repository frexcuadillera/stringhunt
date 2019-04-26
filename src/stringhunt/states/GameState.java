package stringhunt.states;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
    private JLabel levelPanel;
    private JLabel timer;
    
    public static JTextField textField;
    
    private JButton resetButton;
    private JButton attackButton;
    private JButton pauseButton;
    private JButton refreshButton;
    
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
    
    private final int REFRESH_BUTTON_X = 230;
    private final int REFRESH_BUTTON_Y = 210;
    private final int REFRESH_BUTTON_WIDTH = 50;
    private final int REFRESH_BUTTON_HEIGHT = 50;
    
    private final int HEALTH_WIDTH = 50;
    private final int HEALTH_HEIGHT = 10;
    
    private final int PLAYER_HEALTH_X = 50;
    private final int PLAYER_HEALTH_Y = 10;
    
    private final int ENEMY_HEALTH_X = 500;
    private final int ENEMY_HEALTH_Y = 10;
    
    private final int TIMER_X = 290;
    private final int TIMER_Y = 10;
    private final int TIMER_WIDTH = 50;
    private final int TIMER_HEIGHT = 20;
    
    private int LEVEL_X = 355;
    private int LEVEL_Y = 8;
    private int LEVEL_WIDTH = 150;
    private int LEVEL_HEIGHT = 20;
    
    private int pauseValue;
    private int gameOverValue;
    
    private int currentPlayerHealth = 10; //10
    private int currentEnemyHealth = 10;
    
    private int currentEnemy = 1; //1
    public static int currentLevel = 1; //1
    
    private int currentTime = 300; //300
    private int timeElapsed = 0;
    
    public static boolean isPaused = false;
    private boolean isGameOver = false;
    
    private Thread gameOverThread;

    public GameState() {
	init();
    }
    
    public void init(){
	gamePanel = new JPanel();
	gamePanel.setLayout(null);
	gamePanel.setBounds(0, 0, StringHunt.FRAME_WIDTH, StringHunt.FRAME_HEIGHT);
	gamePanel.setBackground(Color.decode("#ACFFFF"));
	
	//game over thread
	gameOverThread = new Thread() {
	    public void run() {
	        gameOver();
	    }  
	};

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
	scenePanel.setBackground(Color.decode("#00ff00"));
	
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
	
	//timer
	timer = new JLabel(String.valueOf(currentTime/60)+":"+String.valueOf(currentTime%60));
	timer.setBounds(TIMER_X, TIMER_Y, TIMER_WIDTH, TIMER_HEIGHT);
	timer.setFont(new Font("Arial", Font.BOLD, 18));
	scenePanel.add(timer);
	
	//level panel
	levelPanel = new JLabel();
	levelPanel.setBounds(
		LEVEL_X,
		LEVEL_Y,
		LEVEL_WIDTH,
		LEVEL_HEIGHT
	);
	gamePanel.add(levelPanel);
		
	//text field
	textField = new JTextField(TEXT_FIELD_COLUMNS);
	textField.setBounds(
		TEXT_FIELD_X,
		TEXT_FIELD_Y,
		TEXT_FIELD_WIDTH,
		TEXT_FIELD_HEIGHT
	);
	textField.setFont(new Font("Arial", Font.BOLD, 18));
	textField.setEditable(false);
	textField.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
	textField.addActionListener(this);
	textField.setText(null);
	
	//refresh button
	refreshButton = new JButton();
	refreshButton.addActionListener(this);
	refreshButton.setBounds(
		REFRESH_BUTTON_X,
		REFRESH_BUTTON_Y,
		REFRESH_BUTTON_WIDTH,
		REFRESH_BUTTON_HEIGHT
	);
	refreshButton.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
	refreshButton.setIcon(new ImageIcon(Assets.btn_refresh));
	refreshButton.setPressedIcon(new ImageIcon(Assets.btn_refresh_pressed));
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
	pauseButton = new JButton();
	pauseButton.addActionListener(this);
	pauseButton.setBounds(X + 250, Y, WIDTH, HEIGHT);
	pauseButton.setIcon(new ImageIcon(Assets.btn_pause[0]));
	pauseButton.setPressedIcon(new ImageIcon(Assets.btn_pause[1]));

	//add to game panel
	gamePanel.add(scenePanel);
	gamePanel.add(letterPanelObject);
	gamePanel.add(textField);
	gamePanel.add(refreshButton);
	gamePanel.add(resetButton);
	gamePanel.add(attackButton);
	gamePanel.add(pauseButton);	
    }
            
    public void tick() {
		timeElapsed++;
		
		if(timeElapsed%60 == 0 && !isPaused) {
		    currentTime--;	    
		}
		
		if(currentTime >= 0) {
		    timer.setText(String.valueOf(currentTime/60)+":"+String.valueOf(currentTime%60)); 
		}
		
		//System.out.println(currentTime);
		
		if(currentTime <= 0 && !isGameOver) {
		    gameOverThread.start();
		    isGameOver = true;
		}
		
		if(currentLevel == 1) {
		    levelPanel.setText("1st Year");
		} else if (currentLevel == 2) {
		    levelPanel.setText("2nd Year");
		} else if (currentLevel == 3) {
		    levelPanel.setText("3rd Year");
		} else if (currentLevel == 4) {
		    levelPanel.setText("4th Year");
		} else if (currentLevel == 5) {
		    levelPanel.setText("5th Year");
		}
		
		if(currentEnemy == 1) {
		    levelPanel.setText(levelPanel.getText().concat(": Enemy 1"));
		} else if (currentEnemy == 2) {
		    levelPanel.setText(levelPanel.getText().concat(": Enemy 2"));
		} else if (currentEnemy == 3) {
		    levelPanel.setText(levelPanel.getText().concat(": Enemy 3"));
		} else if (currentEnemy == 4) {
		    levelPanel.setText(levelPanel.getText().concat(": Enemy 4"));
		} else if (currentEnemy == 5) {
		    levelPanel.setText(levelPanel.getText().concat(": BOSS"));
		}
    }
        
    public JPanel getGamePanel() {
        return gamePanel;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() == resetButton) {
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

				currentEnemyHealth -= ldc.calculateDamageDealt(
					textField.getText()
				);

		    } else {
				currentPlayerHealth -= ldc.calculateDamageTaken(textField.getText());
		    }
		    
		    //update health here.
		    updatePlayerHealthLabel();
		    updateEnemyHealthLabel();
		    
		    //update board here
		    textField.setText(null);
		    Arrays.fill(letterPanelConstructor.alreadyPressed, false);
		    letterPanelConstructor.updateBoard(currentLevel);
		    
		    if(currentPlayerHealth <= 0) {
				//do game over event here
				playerHealthLabel.setText("0/10 HP");
				//add delay
				
				gameOver();
				
				//scenePanel.setVisible(false);
				//textField.setVisible(false);
				//letterPanelObject.setVisible(false);
			
		    }
		    
		    if(currentEnemyHealth <= 0) {
			
				currentEnemy++;
				
				if(currentEnemy > 5) {
				    //restore player health to full
				    currentPlayerHealth = 10;		    
				    currentLevel++;
				    currentEnemy = 1;
				}
				
				if(currentLevel > 5) {
				    //game over, you win!
				    //do win event here
				    playerHealthLabel.setVisible(false);
				    enemyHealthLabel.setVisible(false);
				    System.out.println("graduate");
				}
				
				//enemyHealthLabel.setText("0/10 HP");
				//do enemy die event here
				//add delay
				//reset timer
				currentTime = 300 + ( 180 * (currentLevel - 1));
				timer.setText(String.valueOf(currentTime/60)+":"+String.valueOf(currentTime%60));
				//move to the next enemy
				//reset enemy health
				
				currentEnemyHealth = 10 + (currentEnemy - 1) * 5;
				
				updatePlayerHealthLabel();
				updateEnemyHealthLabel();
		    }
		}
		
		if(e.getSource() == pauseButton) {
		    isPaused = true;
		    pause();
		}
		
		if(e.getSource() == refreshButton) {
		    textField.setText(null);
		    letterPanelConstructor.resetBoard();
		    letterPanelConstructor.updateBoard(currentLevel);
		}
	
    }
    
    public void updatePlayerHealthLabel() {
		playerHealthLabel.setText(String.valueOf(currentPlayerHealth)+"/10 HP");
    }
    
    public void updateEnemyHealthLabel() {
		enemyHealthLabel.setText(
			String.valueOf(currentEnemyHealth) +
			"/" +
			(10 + ((currentEnemy - 1) * 5)) +
			" HP"
		);
    }
    
    public void pause() {
		Object[] pauseOption = {
			"RESUME",
			"QUIT"
		};
		
		pauseValue = JOptionPane.showOptionDialog(
			null,
			"PAUSED",
			"String Hunt",
	        JOptionPane.YES_NO_OPTION, 
	        JOptionPane.PLAIN_MESSAGE,
	        null, 
	        pauseOption, 
	        null
	    );
		
		if(pauseValue == JOptionPane.YES_OPTION) {
		    isPaused = false;
		} else if (pauseValue == JOptionPane.NO_OPTION) {
		    StringHunt.state = "menu";
		    isPaused = true;
		    restartGame();
		} else {
		    StringHunt.state = "menu";
		    isPaused = true;
		    restartGame();
		}

    }
    
    public void restartGame() {
	currentLevel = 1;
	currentEnemy = 1;
	currentTime = 300;
	currentPlayerHealth = 10;
	currentEnemyHealth = 10;
	updatePlayerHealthLabel();
	updateEnemyHealthLabel();
    }
    
    public void gameOver() {
		
		Object[] gameOverOption = {
			"RETRY",
			"QUIT"
		};
	
		gameOverValue = JOptionPane.showOptionDialog(
			null,
			"GAME OVER",
			"String Hunt",
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.PLAIN_MESSAGE,
            null, 
            gameOverOption, 
            null
	    );
		
		if(gameOverValue == JOptionPane.YES_OPTION) {
		    
		    //do game over event here
		    restartGame();
		    
		} else if (gameOverValue == JOptionPane.NO_OPTION) {
		    StringHunt.state = "menu";
		    isGameOver = false;
		    restartGame();
		} else {
		    StringHunt.state = "menu";
		    isGameOver = false;
		    restartGame();
		}
	
    }

}
