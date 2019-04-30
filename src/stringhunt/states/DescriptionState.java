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

public class DescriptionState implements ActionListener{

    private JPanel descriptionPanel;
    private JLabel descriptionLabel;
	    
    private JButton backButton;
    private final int BACK_X = 20;
    private final int BACK_Y = 500;
    private final int BACK_WIDTH = 200;
    private final int BACK_HEIGHT = 50;

    public DescriptionState() {
		
	descriptionPanel = new JPanel();
	descriptionPanel.setLayout(null);
	descriptionPanel.setBounds(
		0, 
		0, 
		StringHunt.FRAME_WIDTH, 
		StringHunt.FRAME_HEIGHT
	);
	descriptionPanel.setBackground(Color.decode("#ACFFFF"));
		
	backButton = new JButton();		
	backButton.setBounds(BACK_X, BACK_Y, BACK_WIDTH, BACK_HEIGHT);
	backButton.setIcon(new ImageIcon(Assets.btn_back[0]));
	backButton.setPressedIcon(new ImageIcon(Assets.btn_back[1]));
		
	descriptionPanel.add(backButton);
	backButton.addActionListener(this);
		
	descriptionLabel = new JLabel(
		new ImageIcon(Assets.description_background)
	);
	descriptionLabel.setBounds(0, 0, 800, 600);
	descriptionPanel.add(descriptionLabel);
		
    }
    
    public JPanel getDescriptionPanel() {
        return descriptionPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	
	if(e.getSource() == backButton) {
	    StringHunt.state = "menu";
	}
	
    }
    
}
