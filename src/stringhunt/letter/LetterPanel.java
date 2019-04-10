package stringhunt.letter;

import javax.swing.*;

import stringhunt.gfx.Assets;

import java.awt.*;
import java.awt.event.*;

public class LetterPanel implements ActionListener{
    
    private JPanel letterPanel;
    private LetterConverter lc;
    public String[] letterButtonCharacter;
    private WordGenerator wg;
    
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
	wg = new WordGenerator();
	letterButtonCharacter = new String[30];
	
	updateBoard();
		
    }
    
    public void updateBoard() {
	
	letterPanel.removeAll();
	letterPanel.revalidate();
	letterButtonCharacter = wg.getNextBoard();
	
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
	
	if(btn0.isSelected()) {
	    System.out.println(letterButtonCharacter[0]);
	}

	if(btn1.isSelected()) {
	
	}
	
	if(btn2.isSelected()) {
	    
	}
	
	if(btn3.isSelected()) {
	    
	}
	
	if(btn4.isSelected()) {
	    
	}
	
	if(btn5.isSelected()) {
	    
	}
	
	if(btn6.isSelected()) {
	    
	}
	
	if(btn7.isSelected()) {
	    
	}
	
	if(btn8.isSelected()) {
	    
	}
	
	if(btn9.isSelected()) {
	    
	}
	
	//10
	
	if(btn10.isSelected()) {
	    
	}
	
	if(btn11.isSelected()) {
	    
	}
	
	if(btn12.isSelected()) {
	    
	}
	
	if(btn13.isSelected()) {
	    
	}
	
	if(btn14.isSelected()) {
	    
	}
	
	if(btn15.isSelected()) {
	    
	}
	
	if(btn16.isSelected()) {
	    
	}
	
	if(btn17.isSelected()) {
	    
	}
	
	if(btn18.isSelected()) {
	    
	}
	
	if(btn19.isSelected()) {
	    
	}
	
	//20
	
	if(btn20.isSelected()) {
	    
	}
	
	if(btn21.isSelected()) {
	    
	}
	
	if(btn22.isSelected()) {
	    
	}
	
	if(btn23.isSelected()) {
	    
	}
	
	if(btn24.isSelected()) {
	    
	}
	
	if(btn25.isSelected()) {
	    
	}
	
	if(btn26.isSelected()) {
	    
	}
	
	if(btn27.isSelected()) {
	    
	}
	
	if(btn28.isSelected()) {
	    
	}
	
	if(btn29.isSelected()) {
	    
	}
	
    }
    
    
}
