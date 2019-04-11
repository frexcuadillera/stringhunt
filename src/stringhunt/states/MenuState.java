package stringhunt.states;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import stringhunt.StringHunt;
import stringhunt.gfx.Assets;

public class MenuState implements ActionListener {
    
    private JPanel menuPanel;
    
    private JButton startButton;
    private JButton tutorialButton;
    private JButton descriptionButton;
    private JButton creditsButton;
    
    private final int X_POSITION = 300;
    private final int Y_POSITION = 150;
    private final int Y_OFFSET = 60;
    private final int BUTTON_WIDTH = 200;
    private final int BUTTON_HEIGHT = 50;
    
    public MenuState() {
	
	menuPanel = new JPanel();
	menuPanel.setLayout(null);
	menuPanel.setBounds(0, 0, 800, 450);
		
	//buttons
	startButton = new JButton();
	tutorialButton = new JButton();
	descriptionButton = new JButton();
	creditsButton = new JButton();
	
	startButton.setBounds(X_POSITION, Y_POSITION, BUTTON_WIDTH, BUTTON_HEIGHT);
	tutorialButton.setBounds(X_POSITION, Y_POSITION + Y_OFFSET, BUTTON_WIDTH, BUTTON_HEIGHT);
	descriptionButton.setBounds(X_POSITION, Y_POSITION + Y_OFFSET * 2, BUTTON_WIDTH, BUTTON_HEIGHT);
	creditsButton.setBounds(X_POSITION, Y_POSITION + Y_OFFSET * 3, BUTTON_WIDTH, BUTTON_HEIGHT);
	
	startButton.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
	tutorialButton.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
	descriptionButton.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
	creditsButton.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
	
	startButton.setIcon(new ImageIcon(Assets.btn_start[0]));
	tutorialButton.setIcon(new ImageIcon(Assets.btn_tutorial[0]));
	descriptionButton.setIcon(new ImageIcon(Assets.btn_description[0]));
	creditsButton.setIcon(new ImageIcon(Assets.btn_credits[0]));
	
	startButton.setPressedIcon(new ImageIcon(Assets.btn_start[1]));
	tutorialButton.setPressedIcon(new ImageIcon(Assets.btn_tutorial[1]));
	descriptionButton.setPressedIcon(new ImageIcon(Assets.btn_description[1]));
	creditsButton.setPressedIcon(new ImageIcon(Assets.btn_credits[1]));	
	
	menuPanel.add(startButton);
	menuPanel.add(tutorialButton);
	menuPanel.add(descriptionButton);
	menuPanel.add(creditsButton);
	
	startButton.addActionListener(this);
	tutorialButton.addActionListener(this);
	descriptionButton.addActionListener(this);
	creditsButton.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
	
	if(e.getSource() == startButton) {
	    StringHunt.state = "game";
	    System.out.println("start presssed");
	}
	
	if(e.getSource() == tutorialButton) {
	    StringHunt.state = "tutorial";
	    System.out.println(StringHunt.state);
	}
	
	if(e.getSource() == descriptionButton) {
	    StringHunt.state = "description";
	}
	
	if(e.getSource() == creditsButton) {
	    StringHunt.state = "credits";
	}
    }
    
    public JPanel getMenuPanel() {
	return  menuPanel;
    }

}
