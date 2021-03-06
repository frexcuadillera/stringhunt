package stringhunt.states;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import stringhunt.StringHunt;
import stringhunt.gfx.Assets;

public class TutorialState implements ActionListener {

    private JPanel tutorialPanel;
    private JLabel tutorialLabel;
    
    private JButton backButton;
    private final int BACK_X = 20;
    private final int BACK_Y = 500;
    private final int BACK_WIDTH = 200;
    private final int BACK_HEIGHT = 50;

    public TutorialState() {
	
	tutorialPanel = new JPanel();
	tutorialPanel.setLayout(null);
	tutorialPanel.setBounds(
		0, 
		0, 
		StringHunt.FRAME_WIDTH, 
		StringHunt.FRAME_HEIGHT
	);
	tutorialPanel.setBackground(Color.decode("#ACFFFF"));
		
	backButton = new JButton();		
	backButton.setBounds(BACK_X, BACK_Y, BACK_WIDTH, BACK_HEIGHT);
	backButton.setIcon(new ImageIcon(Assets.btn_back[0]));
	backButton.setPressedIcon(new ImageIcon(Assets.btn_back[1]));
		
	tutorialPanel.add(backButton);
	backButton.addActionListener(this);
		
	tutorialLabel = new JLabel(
		new ImageIcon(Assets.tutorial_background)
	);
	tutorialLabel.setBounds(0, 0, 800, 600);
	tutorialPanel.add(tutorialLabel);
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
