package stringhunt.letter;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JPanel;

import stringhunt.states.GameState;

public class LetterPanel implements ActionListener{
    
    private JPanel letterPanel;
    public String[] letterButtonCharacter;
    private BoardGenerator bg;
    public boolean[] alreadyPressed;
    
    private JButton btn0;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    
    private JButton btn10;
    private JButton btn11;
    private JButton btn12;
    private JButton btn13;
    private JButton btn14;
    private JButton btn15;
    private JButton btn16;
    private JButton btn17;
    private JButton btn18;
    private JButton btn19;
    
    private JButton btn20;
    private JButton btn21;
    private JButton btn22;
    private JButton btn23;
    private JButton btn24;
    private JButton btn25;
    private JButton btn26;
    private JButton btn27;
    private JButton btn28;
    private JButton btn29;
    
    public LetterPanel() {
	
	letterPanel = new JPanel(new GridLayout(3, 10, 10, 10));
	letterPanel.setBackground(Color.decode("#ACFFFF"));
	bg = new BoardGenerator();
	letterButtonCharacter = new String[30];
	alreadyPressed = new boolean[30];
		
	updateBoard(GameState.currentLevel);
		
    }
    
    public void updateBoard(int currentLevel) {
	
	letterPanel.removeAll();
	letterPanel.revalidate();
	letterButtonCharacter = bg.getNextBoard(currentLevel);
		
	btn0 = new JButton(letterButtonCharacter[0]);
	btn1 = new JButton(letterButtonCharacter[1]);
	btn2 = new JButton(letterButtonCharacter[2]);
	btn3 = new JButton(letterButtonCharacter[3]);
	btn4 = new JButton(letterButtonCharacter[4]);
	btn5 = new JButton(letterButtonCharacter[5]);
	btn6 = new JButton(letterButtonCharacter[6]);
	btn7 = new JButton(letterButtonCharacter[7]);
	btn8 = new JButton(letterButtonCharacter[8]);
	btn9 = new JButton(letterButtonCharacter[9]);
		    
	btn10 = new JButton(letterButtonCharacter[10]);
	btn11 = new JButton(letterButtonCharacter[11]);
	btn12 = new JButton(letterButtonCharacter[12]);
	btn13 = new JButton(letterButtonCharacter[13]);
	btn14 = new JButton(letterButtonCharacter[14]);
	btn15 = new JButton(letterButtonCharacter[15]);
	btn16 = new JButton(letterButtonCharacter[16]);
	btn17 = new JButton(letterButtonCharacter[17]);
	btn18 = new JButton(letterButtonCharacter[18]);
	btn19 = new JButton(letterButtonCharacter[19]);       
		
	btn20 = new JButton(letterButtonCharacter[20]);
	btn21 = new JButton(letterButtonCharacter[21]);
	btn22 = new JButton(letterButtonCharacter[22]);
	btn23 = new JButton(letterButtonCharacter[23]);
	btn24 = new JButton(letterButtonCharacter[24]);
	btn25 = new JButton(letterButtonCharacter[25]);
	btn26 = new JButton(letterButtonCharacter[26]);
	btn27 = new JButton(letterButtonCharacter[27]);
	btn28 = new JButton(letterButtonCharacter[28]);
	btn29 = new JButton(letterButtonCharacter[29]);
		
	//color
	
	btn0.setBackground(Color.decode("#3D85C6"));
	btn1.setBackground(Color.decode("#3D85C6"));
	btn2.setBackground(Color.decode("#3D85C6"));
	btn3.setBackground(Color.decode("#3D85C6"));
	btn4.setBackground(Color.decode("#3D85C6"));
	btn5.setBackground(Color.decode("#3D85C6"));
	btn6.setBackground(Color.decode("#3D85C6"));
	btn7.setBackground(Color.decode("#3D85C6"));
	btn8.setBackground(Color.decode("#3D85C6"));
	btn9.setBackground(Color.decode("#3D85C6"));
	
	btn10.setBackground(Color.decode("#3D85C6"));
	btn11.setBackground(Color.decode("#3D85C6"));
	btn12.setBackground(Color.decode("#3D85C6"));
	btn13.setBackground(Color.decode("#3D85C6"));
	btn14.setBackground(Color.decode("#3D85C6"));
	btn15.setBackground(Color.decode("#3D85C6"));
	btn16.setBackground(Color.decode("#3D85C6"));
	btn17.setBackground(Color.decode("#3D85C6"));
	btn18.setBackground(Color.decode("#3D85C6"));
	btn19.setBackground(Color.decode("#3D85C6"));
	
	btn20.setBackground(Color.decode("#3D85C6"));
	btn21.setBackground(Color.decode("#3D85C6"));
	btn22.setBackground(Color.decode("#3D85C6"));
	btn23.setBackground(Color.decode("#3D85C6"));
	btn24.setBackground(Color.decode("#3D85C6"));
	btn25.setBackground(Color.decode("#3D85C6"));
	btn26.setBackground(Color.decode("#3D85C6"));
	btn27.setBackground(Color.decode("#3D85C6"));
	btn28.setBackground(Color.decode("#3D85C6"));
	btn29.setBackground(Color.decode("#3D85C6"));
	
	//foreground
	
	btn0.setForeground(Color.WHITE);
	btn1.setForeground(Color.WHITE);
	btn2.setForeground(Color.WHITE);
	btn3.setForeground(Color.WHITE);
	btn4.setForeground(Color.WHITE);
	btn5.setForeground(Color.WHITE);
	btn6.setForeground(Color.WHITE);
	btn7.setForeground(Color.WHITE);
	btn8.setForeground(Color.WHITE);
	btn9.setForeground(Color.WHITE);
	
	btn10.setForeground(Color.WHITE);
	btn11.setForeground(Color.WHITE);
	btn12.setForeground(Color.WHITE);
	btn13.setForeground(Color.WHITE);
	btn14.setForeground(Color.WHITE);
	btn15.setForeground(Color.WHITE);
	btn16.setForeground(Color.WHITE);
	btn17.setForeground(Color.WHITE);
	btn18.setForeground(Color.WHITE);
	btn19.setForeground(Color.WHITE);
	
	btn20.setForeground(Color.WHITE);
	btn21.setForeground(Color.WHITE);
	btn22.setForeground(Color.WHITE);
	btn23.setForeground(Color.WHITE);
	btn24.setForeground(Color.WHITE);
	btn25.setForeground(Color.WHITE);
	btn26.setForeground(Color.WHITE);
	btn27.setForeground(Color.WHITE);
	btn28.setForeground(Color.WHITE);
	btn29.setForeground(Color.WHITE);
			
	//font
	
	btn0.setFont(new Font("Arial", Font.BOLD, 18));
	btn1.setFont(new Font("Arial", Font.BOLD, 18));
	btn2.setFont(new Font("Arial", Font.BOLD, 18));
	btn3.setFont(new Font("Arial", Font.BOLD, 18));
	btn4.setFont(new Font("Arial", Font.BOLD, 18));
	btn5.setFont(new Font("Arial", Font.BOLD, 18));
	btn6.setFont(new Font("Arial", Font.BOLD, 18));
	btn7.setFont(new Font("Arial", Font.BOLD, 18));
	btn8.setFont(new Font("Arial", Font.BOLD, 18));
	btn9.setFont(new Font("Arial", Font.BOLD, 18));
	
	btn10.setFont(new Font("Arial", Font.BOLD, 18));
	btn11.setFont(new Font("Arial", Font.BOLD, 18));
	btn12.setFont(new Font("Arial", Font.BOLD, 18));
	btn13.setFont(new Font("Arial", Font.BOLD, 18));
	btn14.setFont(new Font("Arial", Font.BOLD, 18));
	btn15.setFont(new Font("Arial", Font.BOLD, 18));
	btn16.setFont(new Font("Arial", Font.BOLD, 18));
	btn17.setFont(new Font("Arial", Font.BOLD, 18));
	btn18.setFont(new Font("Arial", Font.BOLD, 18));
	btn19.setFont(new Font("Arial", Font.BOLD, 18));
	
	btn20.setFont(new Font("Arial", Font.BOLD, 18));
	btn21.setFont(new Font("Arial", Font.BOLD, 18));
	btn22.setFont(new Font("Arial", Font.BOLD, 18));
	btn23.setFont(new Font("Arial", Font.BOLD, 18));
	btn24.setFont(new Font("Arial", Font.BOLD, 18));
	btn25.setFont(new Font("Arial", Font.BOLD, 18));
	btn26.setFont(new Font("Arial", Font.BOLD, 18));
	btn27.setFont(new Font("Arial", Font.BOLD, 18));
	btn28.setFont(new Font("Arial", Font.BOLD, 18));
	btn29.setFont(new Font("Arial", Font.BOLD, 18));
	
	//action listener
	btn0.addActionListener(this);
	btn1.addActionListener(this);
	btn2.addActionListener(this);
	btn3.addActionListener(this);
	btn4.addActionListener(this);
	btn5.addActionListener(this);
	btn6.addActionListener(this);
	btn7.addActionListener(this);
	btn8.addActionListener(this);
	btn9.addActionListener(this);
	
	btn10.addActionListener(this);
	btn11.addActionListener(this);
	btn12.addActionListener(this);
	btn13.addActionListener(this);
	btn14.addActionListener(this);
	btn15.addActionListener(this);
	btn16.addActionListener(this);
	btn17.addActionListener(this);
	btn18.addActionListener(this);
	btn19.addActionListener(this);		
	
	btn20.addActionListener(this);
	btn21.addActionListener(this);
	btn22.addActionListener(this);
	btn23.addActionListener(this);
	btn24.addActionListener(this);
	btn25.addActionListener(this);
	btn26.addActionListener(this);
	btn27.addActionListener(this);
	btn28.addActionListener(this);
	btn29.addActionListener(this);
	
	//add to letter panel
	
	letterPanel.add(btn0);
	letterPanel.add(btn1);
	letterPanel.add(btn2);
	letterPanel.add(btn3);
	letterPanel.add(btn4);
	letterPanel.add(btn5);
	letterPanel.add(btn6);
	letterPanel.add(btn7);
	letterPanel.add(btn8);
	letterPanel.add(btn9);
	
	letterPanel.add(btn10);
	letterPanel.add(btn11);
	letterPanel.add(btn12);
	letterPanel.add(btn13);
	letterPanel.add(btn14);
	letterPanel.add(btn15);
	letterPanel.add(btn16);
	letterPanel.add(btn17);
	letterPanel.add(btn18);
	letterPanel.add(btn19);
	
	letterPanel.add(btn20);
	letterPanel.add(btn21);
	letterPanel.add(btn22);
	letterPanel.add(btn23);
	letterPanel.add(btn24);
	letterPanel.add(btn25);
	letterPanel.add(btn26);
	letterPanel.add(btn27);
	letterPanel.add(btn28);
	letterPanel.add(btn29);		

    }
    
    public JPanel getLetterPanel() {
	return letterPanel;
    }
    
    public void resetBoard() {
	bg.getCurrentBoard();
	
	Arrays.fill(alreadyPressed, false);
	
	btn0.setVisible(true);
	btn1.setVisible(true);
	btn2.setVisible(true);
	btn3.setVisible(true);
	btn4.setVisible(true);
	btn5.setVisible(true);
	btn6.setVisible(true);
	btn7.setVisible(true);
	btn8.setVisible(true);
	btn9.setVisible(true);
	
	btn10.setVisible(true);
	btn11.setVisible(true);
	btn12.setVisible(true);
	btn13.setVisible(true);
	btn14.setVisible(true);
	btn15.setVisible(true);
	btn16.setVisible(true);
	btn17.setVisible(true);
	btn18.setVisible(true);
	btn19.setVisible(true);
	
	btn20.setVisible(true);
	btn21.setVisible(true);
	btn22.setVisible(true);
	btn23.setVisible(true);
	btn24.setVisible(true);
	btn25.setVisible(true);
	btn26.setVisible(true);
	btn27.setVisible(true);
	btn28.setVisible(true);
	btn29.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
	
	if(e.getSource() == btn0 && !alreadyPressed[0]) {
	    GameState.textField.setText(
		    GameState.textField.getText().concat(letterButtonCharacter[0]));
	    alreadyPressed[0] = true;
	    btn0.setVisible(false);
	}

	if(e.getSource() == btn1 && !alreadyPressed[1]) {
	    GameState.textField.setText(
		    GameState.textField.getText().concat(letterButtonCharacter[1]));
	    alreadyPressed[1] = true;
	    btn1.setVisible(false);
	}
	
	if(e.getSource() == btn2 && !alreadyPressed[2]) {
	    GameState.textField.setText(
		 GameState.textField.getText().concat(letterButtonCharacter[2]));
	    alreadyPressed[2] = true;
	    btn2.setVisible(false);
	}
	
	if(e.getSource() == btn3 && !alreadyPressed[3]) {
	    GameState.textField.setText(
		    GameState.textField.getText().concat(letterButtonCharacter[3]));
	    alreadyPressed[3] = true;
	    btn3.setVisible(false);
	}
	
	if(e.getSource() == btn4 && !alreadyPressed[4]) {
	    GameState.textField.setText(
		GameState.textField.getText().concat(letterButtonCharacter[4]));  
	    alreadyPressed[4] = true;
	    btn4.setVisible(false);
	}
	
	if(e.getSource() == btn5 && !alreadyPressed[5]) {
	    GameState.textField.setText(
		    GameState.textField.getText().concat(letterButtonCharacter[5]));  
	    alreadyPressed[5] = true;
	    btn5.setVisible(false);
	}
	
	if(e.getSource() == btn6 && !alreadyPressed[6]) {
	    GameState.textField.setText(
		    GameState.textField.getText().concat(letterButtonCharacter[6]));  
	    alreadyPressed[6] = true;
	    btn6.setVisible(false);
	}
	
	if(e.getSource() == btn7 && !alreadyPressed[7]) {
	    GameState.textField.setText(
		    GameState.textField.getText().concat(letterButtonCharacter[7])); 
	    alreadyPressed[7] = true;
	    btn7.setVisible(false);
	}
	
	if(e.getSource() == btn8 && !alreadyPressed[8]) {
	    GameState.textField.setText(
		    GameState.textField.getText().concat(letterButtonCharacter[8])); 
	    alreadyPressed[8] = true;
	    btn8.setVisible(false);
	}
	
	if(e.getSource() == btn9 && !alreadyPressed[9]) {
	    GameState.textField.setText(
		   GameState.textField.getText().concat(letterButtonCharacter[9]));  
	    alreadyPressed[9] = true;
	    btn9.setVisible(false);
	}
	
	//10
	
	if(e.getSource() == btn10 && !alreadyPressed[10]) {
	    GameState.textField.setText(
		GameState.textField.getText().concat(letterButtonCharacter[10]));  
	    alreadyPressed[10] = true;
	    btn10.setVisible(false);
	}
	
	if(e.getSource() == btn11 && !alreadyPressed[11]) {
	    GameState.textField.setText(
		GameState.textField.getText().concat(letterButtonCharacter[11])); 
	    alreadyPressed[11] = true;
	    btn11.setVisible(false);
	}
	
	if(e.getSource() == btn12 && !alreadyPressed[12]) {
	    GameState.textField.setText(
		GameState.textField.getText().concat(letterButtonCharacter[12])); 
	    alreadyPressed[12] = true;
	    btn12.setVisible(false);
	}
	
	if(e.getSource() == btn13 && !alreadyPressed[13]) {
	    GameState.textField.setText(
		GameState.textField.getText().concat(letterButtonCharacter[13]));
	    alreadyPressed[13] = true;
	    btn13.setVisible(false);
	}
	
	if(e.getSource() == btn14 && !alreadyPressed[14]) {
	    GameState.textField.setText(
		GameState.textField.getText().concat(letterButtonCharacter[14]));   
	    alreadyPressed[14] = true;
	    btn14.setVisible(false);
	}
	
	if(e.getSource() == btn15 && !alreadyPressed[15]) {
	    GameState.textField.setText(
		    GameState.textField.getText().concat(letterButtonCharacter[15]));
	    alreadyPressed[15] = true;
	    btn15.setVisible(false);
	}
	
	if(e.getSource() == btn16 && !alreadyPressed[16]) {
	    GameState.textField.setText(
		GameState.textField.getText().concat(letterButtonCharacter[16])); 
	    alreadyPressed[16] = true;
	    btn16.setVisible(false);
	}
	
	if(e.getSource() == btn17 && !alreadyPressed[17]) {
	    GameState.textField.setText(
		GameState.textField.getText().concat(letterButtonCharacter[17]));
	    alreadyPressed[17] = true;
	    btn17.setVisible(false);
	}
	
	if(e.getSource() == btn18 && !alreadyPressed[18]) {
	    GameState.textField.setText(
		    GameState.textField.getText().concat(letterButtonCharacter[18]));
	    alreadyPressed[18] = true;
	    btn18.setVisible(false);
	}
	
	if(e.getSource() == btn19 && !alreadyPressed[19]) {
	    GameState.textField.setText(
		GameState.textField.getText().concat(letterButtonCharacter[19])); 
	    alreadyPressed[19] = true;
	    btn19.setVisible(false);
	}
	
	//20
	
	if(e.getSource() == btn20 && !alreadyPressed[20]) {
	    GameState.textField.setText(
		GameState.textField.getText().concat(letterButtonCharacter[20]));
	    alreadyPressed[20] = true;
	    btn20.setVisible(false);
	}
	
	if(e.getSource() == btn21 && !alreadyPressed[21]) {
	    GameState.textField.setText(
		GameState.textField.getText().concat(letterButtonCharacter[21])); 
	    alreadyPressed[21] = true;
	    btn21.setVisible(false);
	}
	
	if(e.getSource() == btn22 && !alreadyPressed[22]) {
	    GameState.textField.setText(
		GameState.textField.getText().concat(letterButtonCharacter[22]));
	    alreadyPressed[22] = true;
	    btn22.setVisible(false);
	}
	
	if(e.getSource() == btn23 && !alreadyPressed[23]) {
	    GameState.textField.setText(
		GameState.textField.getText().concat(letterButtonCharacter[23])); 
	    alreadyPressed[23] = true;
	    btn23.setVisible(false);
	}
	
	if(e.getSource() == btn24 && !alreadyPressed[24]) {
	    GameState.textField.setText(
		GameState.textField.getText().concat(letterButtonCharacter[24])); 
	    alreadyPressed[24] = true;
	    btn24.setVisible(false);
	}
	
	if(e.getSource() == btn25 && !alreadyPressed[25]) {
	    GameState.textField.setText(
		GameState.textField.getText().concat(letterButtonCharacter[25])); 
	    alreadyPressed[25] = true;
	    btn25.setVisible(false);
	}
	
	if(e.getSource() == btn26 && !alreadyPressed[26]) {
	    GameState.textField.setText(
		    GameState.textField.getText().concat(letterButtonCharacter[26]));
	    alreadyPressed[26] = true;
	    btn26.setVisible(false);
	}
	
	if(e.getSource() == btn27 && !alreadyPressed[27]) {
	    GameState.textField.setText(
		GameState.textField.getText().concat(letterButtonCharacter[27]));  
	    alreadyPressed[27] = true;
	    btn27.setVisible(false);
	}
	
	if(e.getSource() == btn28 && !alreadyPressed[28]) {
	    GameState.textField.setText(
		GameState.textField.getText().concat(letterButtonCharacter[28])); 
	    alreadyPressed[28] = true;
	    btn28.setVisible(false);
	}
	
	if(e.getSource() == btn29 && !alreadyPressed[29]) {
	    GameState.textField.setText(
		    GameState.textField.getText().concat(letterButtonCharacter[29]));
	    alreadyPressed[29] = true;
	    btn29.setVisible(false);
	}
		
    }
    
}