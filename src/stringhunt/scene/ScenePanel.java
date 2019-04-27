package stringhunt.scene;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import stringhunt.gfx.Assets;
import stringhunt.states.GameState;

public class ScenePanel extends JPanel {
    
    private static final long serialVersionUID = 1386380301719271413L;
    
    @Override
    protected void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.drawImage(Assets.scene_panel_bg, 0, 0, null);
		
	g.fillRect(50, 50, 25, 25);
    }
}
