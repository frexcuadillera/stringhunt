package stringhunt.states;

import javax.swing.*;

import stringhunt.StringHunt;
import stringhunt.gfx.Assets;

import java.awt.*;
import java.awt.event.*;

public class DescriptionState implements ActionListener{

    private JPanel descriptionPanel;
    
    private JButton backButton;
    private final int BACK_X = 20;
    private final int BACK_Y = 350;
    private final int BACK_WIDTH = 200;
    private final int BACK_HEIGHT = 50;

    public DescriptionState() {
	
	descriptionPanel = new JPanel();
	descriptionPanel.setLayout(null);
	descriptionPanel.setBounds(0 , 0, 800, 350);
	
	backButton = new JButton();		
	backButton.setBounds(BACK_X, BACK_Y, BACK_WIDTH, BACK_HEIGHT);
	backButton.setPreferredSize(new Dimension(200, 50));
	backButton.setIcon(new ImageIcon(Assets.btn_back[0]));
	backButton.setPressedIcon(new ImageIcon(Assets.btn_back[1]));
	
	descriptionPanel.add(backButton);
	backButton.addActionListener(this);
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
