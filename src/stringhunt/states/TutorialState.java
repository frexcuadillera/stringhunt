package stringhunt.states;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import stringhunt.StringHunt;
import stringhunt.gfx.Assets;

public class TutorialState implements ActionListener {

    private JPanel tutorialPanel;
    
    private JButton backButton;
    private final int BACK_X = 20;
    private final int BACK_Y = 350;
    private final int BACK_WIDTH = 200;
    private final int BACK_HEIGHT = 50;

    public TutorialState() {
	
	tutorialPanel = new JPanel();
	tutorialPanel.setLayout(null);
	tutorialPanel.setBounds(0 , 0, 800, 450);
	
	backButton = new JButton();		
	backButton.setBounds(BACK_X, BACK_Y, BACK_WIDTH, BACK_HEIGHT);
	backButton.setPreferredSize(new Dimension(200, 50));
	backButton.setIcon(new ImageIcon(Assets.btn_back[0]));
	backButton.setPressedIcon(new ImageIcon(Assets.btn_back[1]));
	
	tutorialPanel.add(backButton);
	backButton.addActionListener(this);
    }
    
    public JPanel getTutorialPanel() {
        return tutorialPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	
	if(e.getSource() == backButton) {
	    StringHunt.state = "menu";
	}
    }
    
}
