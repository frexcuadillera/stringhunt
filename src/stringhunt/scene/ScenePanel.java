package stringhunt.scene;

import java.awt.Graphics;

import javax.swing.JPanel;

import stringhunt.gfx.Assets;
import stringhunt.states.GameState;

public class ScenePanel extends JPanel {
    
    private static final long serialVersionUID = 1386380301719271413L;
    
    private final int ENEMY_X = 480;
    private final int ENEMY_Y = 30;
    
    private Animation a11;
    private Animation a12;
    private Animation a13;
    private Animation a14;
    private Animation a15;
    
    private Animation a21;
    private Animation a22;
    private Animation a23;
    private Animation a24;
    private Animation a25;
    
    private Animation a31;
    private Animation a32;
    private Animation a33;
    private Animation a34;
    private Animation a35;
    
    private Animation a41;
    private Animation a42;
    private Animation a43;
    private Animation a44;
    private Animation a45;
    
    private Animation a51;
    private Animation a52;
    private Animation a53;
    private Animation a54;
    private Animation a55;
    
    public ScenePanel() {
	
		a11 = new Animation(500, Assets.enemy_11);
		a12 = new Animation(500, Assets.enemy_12);
		a13 = new Animation(500, Assets.enemy_13);
	
    }
    
    @Override
    protected void paintComponent(Graphics g) {
	
		super.paintComponent(g);
		g.drawImage(Assets.scene_panel_bg, 0, 0, null);	
		
		if(GameState.currentLevel == 1) {
		    
		    if(GameState.currentEnemy == 1) {
				g.drawImage(a11.getCurrentFrame(), ENEMY_X, ENEMY_Y, null);
				a11.tick();
		    }
		    
		    if(GameState.currentEnemy == 2) {
				g.drawImage(a12.getCurrentFrame(), ENEMY_X, ENEMY_Y, null);
				a12.tick();
		    }
		    
		    if(GameState.currentEnemy == 3) {
				g.drawImage(a13.getCurrentFrame(), ENEMY_X, ENEMY_Y, null);
				a13.tick();
		    }
		    
		    if(GameState.currentEnemy == 4) {
			a14.tick();
		    }
		    
		    if(GameState.currentEnemy == 5) {
			a15.tick();
		    }

		}
		
		if(GameState.currentLevel == 2) {
		    
		    if(GameState.currentEnemy == 1) {
			a21.tick();
		    }
		    
		    if(GameState.currentEnemy == 2) {
			a22.tick();
		    }
		    
		    if(GameState.currentEnemy == 3) {
			a23.tick();
		    }
		    
		    if(GameState.currentEnemy == 4) {
			a24.tick();
		    }
		    
		    if(GameState.currentEnemy == 5) {
			a25.tick();
		    }
		    
		}
		
		if(GameState.currentLevel == 3) {
		    
		    if(GameState.currentEnemy == 1) {
			a31.tick();
		    }
		    
		    if(GameState.currentEnemy == 2) {
			a32.tick();
		    }
		    
		    if(GameState.currentEnemy == 3) {
			a33.tick();
		    }
		    
		    if(GameState.currentEnemy == 4) {
			a34.tick();
		    }
		    
		    if(GameState.currentEnemy == 5) {
			a35.tick();
		    }
		    
		}
		
		if(GameState.currentLevel == 4) {
		    if(GameState.currentEnemy == 1) {
			a41.tick();
		    }
		    
		    if(GameState.currentEnemy == 2) {
			a42.tick();
		    }
		    
		    if(GameState.currentEnemy == 3) {
			a43.tick();
		    }
		    
		    if(GameState.currentEnemy == 4) {
			a44.tick();
		    }
		    
		    if(GameState.currentEnemy == 5) {
			a45.tick();
		    }
		    
		}
		
		if(GameState.currentLevel == 5) {
		    if(GameState.currentEnemy == 1) {
			a51.tick();
		    }
		    
		    if(GameState.currentEnemy == 2) {
			a52.tick();
		    }
		    
		    if(GameState.currentEnemy == 3) {
			a53.tick();
		    }
		    
		    if(GameState.currentEnemy == 4) {
			a54.tick();
		    }
		    
		    if(GameState.currentEnemy == 5) {
			a55.tick();
		    }
		    
		}
		
    }
    
}
