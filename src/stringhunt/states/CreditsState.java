package stringhunt.states;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import stringhunt.StringHunt;
import stringhunt.gfx.Assets;

public class CreditsState implements ActionListener{

    private JPanel creditsPanel;
    private JButton backButton;    
    private final int BACK_X = 20;
    private final int BACK_Y = 350;
    private final int BACK_WIDTH = 200;
    private final int BACK_HEIGHT = 50;

    public CreditsState() {
	
	creditsPanel = new JPanel();
	creditsPanel.setLayout(null);
	creditsPanel.setBounds(0, 0, 800, 450);
	backButton = new JButton();
	
	backButton.setBounds(BACK_X, BACK_Y, BACK_WIDTH, BACK_HEIGHT);
	backButton.setPreferredSize(new Dimension(200, 50));
	backButton.setIcon(new ImageIcon(Assets.btn_back[0]));
	backButton.setPressedIcon(new ImageIcon(Assets.btn_back[1]));

	creditsPanel.add(backButton);
	backButton.addActionListener(this);
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
