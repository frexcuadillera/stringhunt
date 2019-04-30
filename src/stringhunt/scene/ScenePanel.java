package stringhunt.scene;

import java.awt.Graphics;

import javax.swing.JPanel;

import stringhunt.gfx.Assets;
import stringhunt.states.GameState;

public class ScenePanel extends JPanel {
    
    private static final long serialVersionUID = 1386380301719271413L;
    
    private final int PLAYER_X = 30;
    private final int PLAYER_Y = 30;
    
    private final int ENEMY_X = 480;
    private final int ENEMY_Y = 30;
    
    private Animation player;
    
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
	
	player = new Animation(500, Assets.player);
	
	a11 = new Animation(500, Assets.enemy_11);
	a12 = new Animation(500, Assets.enemy_12);
	a13 = new Animation(500, Assets.enemy_13);
	a14 = new Animation(500, Assets.enemy_14);
	a15 = new Animation(500, Assets.enemy_15);
	
	a21 = new Animation(300, Assets.enemy_21);
	a22 = new Animation(300, Assets.enemy_22);
	a23 = new Animation(300, Assets.enemy_23);
	a24 = new Animation(300, Assets.enemy_24);
	a25 = new Animation(500, Assets.enemy_25);
	
	a31 = new Animation(500, Assets.enemy_31);
	a32 = new Animation(500, Assets.enemy_32);
	a33 = new Animation(500, Assets.enemy_33);
	a34 = new Animation(500, Assets.enemy_34);
	a35 = new Animation(500, Assets.enemy_35);
	
	a41 = new Animation(500, Assets.enemy_41);
	a42 = new Animation(500, Assets.enemy_42);
	a43 = new Animation(500, Assets.enemy_43);
	a44 = new Animation(500, Assets.enemy_44);
	a45 = new Animation(500, Assets.enemy_45);
	
	a51 = new Animation(500, Assets.enemy_51);
	a52 = new Animation(500, Assets.enemy_52);
	a53 = new Animation(500, Assets.enemy_53);
	a54 = new Animation(500, Assets.enemy_54);
	a55 = new Animation(500, Assets.enemy_55);
	
    }
    
    @Override
    protected void paintComponent(Graphics g) {
	
	super.paintComponent(g);
	g.drawImage(Assets.scene_panel_bg, 0, 0, null);
	
	g.drawImage(player.getCurrentFrame(), PLAYER_X, PLAYER_Y, null);
	player.tick();
		
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
		g.drawImage(a14.getCurrentFrame(), ENEMY_X, ENEMY_Y, null);
		a14.tick();
	    }
		    
	    if(GameState.currentEnemy == 5) {
		g.drawImage(a15.getCurrentFrame(), ENEMY_X, ENEMY_Y, null);
		a15.tick();
	    }

	}
		
	if(GameState.currentLevel == 2) {
		    
	    if(GameState.currentEnemy == 1) {
		g.drawImage(a21.getCurrentFrame(), ENEMY_X, ENEMY_Y, null);
		a21.tick();
	    }
		    
	    if(GameState.currentEnemy == 2) {
		g.drawImage(a22.getCurrentFrame(), ENEMY_X, ENEMY_Y, null);
		a22.tick();
	    }
		    
	    if(GameState.currentEnemy == 3) {
		g.drawImage(a23.getCurrentFrame(), ENEMY_X, ENEMY_Y, null);
		a23.tick();
	    }
		    
	    if(GameState.currentEnemy == 4) {
		g.drawImage(a24.getCurrentFrame(), ENEMY_X, ENEMY_Y, null);
		a24.tick();
	    }
		    
	    if(GameState.currentEnemy == 5) {
		g.drawImage(a25.getCurrentFrame(), ENEMY_X, ENEMY_Y, null);
		a25.tick();
	    }
		    
	}
		
	if(GameState.currentLevel == 3) {
		    
	    if(GameState.currentEnemy == 1) {
		g.drawImage(a31.getCurrentFrame(), ENEMY_X, ENEMY_Y, null);
		a31.tick();
	    }
		    
	    if(GameState.currentEnemy == 2) {
		g.drawImage(a32.getCurrentFrame(), ENEMY_X, ENEMY_Y, null);
		a32.tick();
	    }
		    
	    if(GameState.currentEnemy == 3) {
		g.drawImage(a33.getCurrentFrame(), ENEMY_X, ENEMY_Y, null);
		a33.tick();
	    }
		    
	    if(GameState.currentEnemy == 4) {
		g.drawImage(a34.getCurrentFrame(), ENEMY_X, ENEMY_Y, null);
		a34.tick();
	    }
		    
	    if(GameState.currentEnemy == 5) {
		g.drawImage(a35.getCurrentFrame(), ENEMY_X, ENEMY_Y, null);
		a35.tick();
	    }
		    
	}
		
	if(GameState.currentLevel == 4) {
	    
	    if(GameState.currentEnemy == 1) {
		g.drawImage(a41.getCurrentFrame(), ENEMY_X, ENEMY_Y, null);
		a41.tick();
	    }
		    
	    if(GameState.currentEnemy == 2) {
		g.drawImage(a42.getCurrentFrame(), ENEMY_X, ENEMY_Y, null);
		a42.tick();
	    }
		    
	    if(GameState.currentEnemy == 3) {
		g.drawImage(a43.getCurrentFrame(), ENEMY_X, ENEMY_Y, null);
		a43.tick();
	    }
		    
	    if(GameState.currentEnemy == 4) {
		g.drawImage(a44.getCurrentFrame(), ENEMY_X, ENEMY_Y, null);
		a44.tick();
	    }
		    
	    if(GameState.currentEnemy == 5) {
		g.drawImage(a45.getCurrentFrame(), ENEMY_X, ENEMY_Y, null);
		a45.tick();
	    }
		    
	}
		
	if(GameState.currentLevel == 5) {
	    
	    if(GameState.currentEnemy == 1) {
		g.drawImage(a51.getCurrentFrame(), ENEMY_X, ENEMY_Y, null);
		a51.tick();
	    }
		    
	    if(GameState.currentEnemy == 2) {
		g.drawImage(a52.getCurrentFrame(), ENEMY_X, ENEMY_Y, null);
		a52.tick();
	    }
		    
	    if(GameState.currentEnemy == 3) {
		g.drawImage(a53.getCurrentFrame(), ENEMY_X, ENEMY_Y, null);
		a53.tick();
	    }
		    
	    if(GameState.currentEnemy == 4) {
		g.drawImage(a54.getCurrentFrame(), ENEMY_X, ENEMY_Y, null);
		a54.tick();
	    }
		    
	    if(GameState.currentEnemy == 5) {
		g.drawImage(a55.getCurrentFrame(), ENEMY_X, ENEMY_Y, null);
		a55.tick();
	    }
		    
	}
		
    }
    
}
