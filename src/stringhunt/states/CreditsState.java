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

public class CreditsState implements ActionListener{

    private JPanel creditsPanel;
    private JLabel creditsLabel;
    
    private JButton backButton;    
    private final int BACK_X = 20;
    private final int BACK_Y = 500;
    private final int BACK_WIDTH = 200;
    private final int BACK_HEIGHT = 50;
       
    public CreditsState() {
	
	creditsPanel = new JPanel();
	creditsPanel.setLayout(null);
	creditsPanel.setBounds(
		0, 
		0, 
		StringHunt.FRAME_WIDTH, 
		StringHunt.FRAME_HEIGHT
	);
	creditsPanel.setBackground(Color.decode("#ACFFFF"));
			
	backButton = new JButton();	
	backButton.setBounds(BACK_X, BACK_Y, BACK_WIDTH, BACK_HEIGHT);
	backButton.setIcon(new ImageIcon(Assets.btn_back[0]));
	backButton.setPressedIcon(new ImageIcon(Assets.btn_back[1]));
	creditsPanel.add(backButton);
	backButton.addActionListener(this);
		
	creditsLabel = new JLabel(new ImageIcon(Assets.credits_background));
	creditsLabel.setBounds(0,0,800,600);
	creditsPanel.add(creditsLabel);
	
    }
    
    public JPanel getCreditsPanel() {
        return creditsPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	
	if(e.getSource() == backButton) {
	    StringHunt.state = "menu";
	}
	
    }
    
}
