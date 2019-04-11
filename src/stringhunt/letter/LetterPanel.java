package stringhunt.letter;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JToggleButton;

import stringhunt.states.GameState;

public class LetterPanel implements ActionListener{
    
    private JPanel letterPanel;
    private LetterConverter lc;
    public String[] letterButtonCharacter;
    private BoardGenerator bg;
    public boolean[] alreadyPressed;
    
    private JToggleButton btn0;
    private JToggleButton btn1;
    private JToggleButton btn2;
    private JToggleButton btn3;
    private JToggleButton btn4;
    private JToggleButton btn5;
    private JToggleButton btn6;
    private JToggleButton btn7;
    private JToggleButton btn8;
    private JToggleButton btn9;
    
    private JToggleButton btn10;
    private JToggleButton btn11;
    private JToggleButton btn12;
    private JToggleButton btn13;
    private JToggleButton btn14;
    private JToggleButton btn15;
    private JToggleButton btn16;
    private JToggleButton btn17;
    private JToggleButton btn18;
    private JToggleButton btn19;
    
    private JToggleButton btn20;
    private JToggleButton btn21;
    private JToggleButton btn22;
    private JToggleButton btn23;
    private JToggleButton btn24;
    private JToggleButton btn25;
    private JToggleButton btn26;
    private JToggleButton btn27;
    private JToggleButton btn28;
    private JToggleButton btn29;
    
    public LetterPanel() {
	
	letterPanel = new JPanel(new GridLayout(3, 10, 10, 10));
	lc = new LetterConverter();	
	bg = new BoardGenerator();
	letterButtonCharacter = new String[30];
	alreadyPressed = new boolean[30];
	
	updateBoard(1);
		
    }
    
    public void updateBoard(int currentLevel) {
	
	letterPanel.removeAll();
	letterPanel.revalidate();
	letterButtonCharacter = bg.getNextBoard(currentLevel);
	
	btn0 = new JToggleButton(letterButtonCharacter[0]);
	btn1 = new JToggleButton(letterButtonCharacter[1]);
	btn2 = new JToggleButton(letterButtonCharacter[2]);
	btn3 = new JToggleButton(letterButtonCharacter[3]);
	btn4 = new JToggleButton(letterButtonCharacter[4]);
	btn5 = new JToggleButton(letterButtonCharacter[5]);
	btn6 = new JToggleButton(letterButtonCharacter[6]);
	btn7 = new JToggleButton(letterButtonCharacter[7]);
	btn8 = new JToggleButton(letterButtonCharacter[8]);
	btn9 = new JToggleButton(letterButtonCharacter[9]);
	
	btn10 = new JToggleButton(letterButtonCharacter[10]);
	btn11 = new JToggleButton(letterButtonCharacter[11]);
	btn12 = new JToggleButton(letterButtonCharacter[12]);
	btn13 = new JToggleButton(letterButtonCharacter[13]);
	btn14 = new JToggleButton(letterButtonCharacter[14]);
	btn15 = new JToggleButton(letterButtonCharacter[15]);
	btn16 = new JToggleButton(letterButtonCharacter[16]);
	btn17 = new JToggleButton(letterButtonCharacter[17]);
	btn18 = new JToggleButton(letterButtonCharacter[18]);
	btn19 = new JToggleButton(letterButtonCharacter[19]);		
	
	btn20 = new JToggleButton(letterButtonCharacter[20]);
	btn21 = new JToggleButton(letterButtonCharacter[21]);
	btn22 = new JToggleButton(letterButtonCharacter[22]);
	btn23 = new JToggleButton(letterButtonCharacter[23]);
	btn24 = new JToggleButton(letterButtonCharacter[24]);
	btn25 = new JToggleButton(letterButtonCharacter[25]);
	btn26 = new JToggleButton(letterButtonCharacter[26]);
	btn27 = new JToggleButton(letterButtonCharacter[27]);
	btn28 = new JToggleButton(letterButtonCharacter[28]);
	btn29 = new JToggleButton(letterButtonCharacter[29]);
	
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
    
    public void tick() {
		

    }
    
    public JPanel getLetterPanel() {
	return letterPanel;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
	
	if(btn0.isSelected() && !alreadyPressed[0]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[0]));
	    alreadyPressed[0] = true;
	}

	if(btn1.isSelected() && !alreadyPressed[1]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[1]));
	    alreadyPressed[1] = true;
	}
	
	if(btn2.isSelected() && !alreadyPressed[2]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[2]));
	    alreadyPressed[2] = true;
	}
	
	if(btn3.isSelected() && !alreadyPressed[3]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[3]));
	    alreadyPressed[3] = true;
	}
	
	if(btn4.isSelected() && !alreadyPressed[4]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[4]));  
	    alreadyPressed[4] = true;
	}
	
	if(btn5.isSelected() && !alreadyPressed[5]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[5]));  
	    alreadyPressed[5] = true;
	}
	
	if(btn6.isSelected() && !alreadyPressed[6]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[6]));  
	    alreadyPressed[6] = true;
	}
	
	if(btn7.isSelected() && !alreadyPressed[7]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[7])); 
	    alreadyPressed[7] = true;
	}
	
	if(btn8.isSelected() && !alreadyPressed[8]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[8])); 
	    alreadyPressed[8] = true;
	}
	
	if(btn9.isSelected() && !alreadyPressed[9]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[9]));  
	    alreadyPressed[9] = true;
	}
	
	//10
	
	if(btn10.isSelected() && !alreadyPressed[10]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[10]));  
	    alreadyPressed[10] = true;
	}
	
	if(btn11.isSelected() && !alreadyPressed[11]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[11])); 
	    alreadyPressed[11] = true;
	}
	
	if(btn12.isSelected() && !alreadyPressed[12]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[12])); 
	    alreadyPressed[12] = true;
	}
	
	if(btn13.isSelected() && !alreadyPressed[13]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[13]));
	    alreadyPressed[13] = true;
	}
	
	if(btn14.isSelected() && !alreadyPressed[14]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[14]));   
	    alreadyPressed[14] = true;
	}
	
	if(btn15.isSelected() && !alreadyPressed[15]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[15]));
	    alreadyPressed[15] = true;
	}
	
	if(btn16.isSelected() && !alreadyPressed[16]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[16])); 
	    alreadyPressed[16] = true;
	}
	
	if(btn17.isSelected() && !alreadyPressed[17]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[17]));
	    alreadyPressed[17] = true;
	}
	
	if(btn18.isSelected() && !alreadyPressed[18]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[18]));
	    alreadyPressed[18] = true;
	}
	
	if(btn19.isSelected() && !alreadyPressed[19]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[19])); 
	    alreadyPressed[19] = true;
	}
	
	//20
	
	if(btn20.isSelected() && !alreadyPressed[20]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[20]));
	    alreadyPressed[20] = true;
	}
	
	if(btn21.isSelected() && !alreadyPressed[21]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[21])); 
	    alreadyPressed[21] = true;
	}
	
	if(btn22.isSelected() && !alreadyPressed[22]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[22]));
	    alreadyPressed[22] = true;
	}
	
	if(btn23.isSelected() && !alreadyPressed[23]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[23])); 
	    alreadyPressed[23] = true;
	}
	
	if(btn24.isSelected() && !alreadyPressed[24]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[24])); 
	    alreadyPressed[24] = true;
	}
	
	if(btn25.isSelected() && !alreadyPressed[25]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[25])); 
	    alreadyPressed[25] = true;
	}
	
	if(btn26.isSelected() && !alreadyPressed[26]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[26]));
	    alreadyPressed[26] = true;
	}
	
	if(btn27.isSelected() && !alreadyPressed[27]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[27]));  
	    alreadyPressed[27] = true;
	}
	
	if(btn28.isSelected() && !alreadyPressed[28]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[28])); 
	    alreadyPressed[28] = true;
	}
	
	if(btn29.isSelected() && !alreadyPressed[29]) {
	    GameState.textField.setText(GameState.textField.getText().concat(letterButtonCharacter[29]));
	    alreadyPressed[29] = true;
	}
	
    }
    
    
}
