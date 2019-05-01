package stringhunt;

import java.awt.Canvas;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
import javax.swing.JPanel;

import stringhunt.gfx.Assets;
import stringhunt.states.CreditsState;
import stringhunt.states.DescriptionState;
import stringhunt.states.GameState;
import stringhunt.states.MenuState;
import stringhunt.states.TutorialState;

public class StringHunt implements Runnable {
    
    private JFrame frame;
    private Canvas canvas;
    
    //panels
    private JPanel menuPanel;
    private JPanel gamePanel;
    private JPanel descriptionPanel;
    private JPanel tutorialPanel;
    private JPanel creditsPanel;
    
    //rendering
    private BufferStrategy bs;
    private Graphics g;
    
    private MenuState menu;
    private GameState game;
    private TutorialState tutorial;
    private DescriptionState description;
    private CreditsState credits;
    
    //threading
    private Thread thread;
    private boolean running = false;
    
    public static final int FRAME_WIDTH = 800;
    public static final int FRAME_HEIGHT = 600;
    public static String state = "menu";
    
    //testing
    private CardLayout cardLayout = new CardLayout();
    private JPanel cardPanel;
    
    public StringHunt() {

	Assets.init();
		
	frame = new JFrame("String Hunt");
		
	//canvas
	canvas = new Canvas();
	canvas.setPreferredSize(new Dimension(FRAME_WIDTH,  FRAME_HEIGHT));
	canvas.setMaximumSize(new Dimension(FRAME_WIDTH,  FRAME_HEIGHT));
	canvas.setMinimumSize(new Dimension(FRAME_WIDTH,  FRAME_HEIGHT));
	canvas.setFocusable(false);
		
	//states
	menu = new MenuState();
	game = new GameState();
	tutorial = new TutorialState();
	description = new DescriptionState();
	credits = new CreditsState();
		
	//panels
	menuPanel = menu.getMenuPanel();
	gamePanel = game.getGamePanel();
	tutorialPanel = tutorial.getTutorialPanel();
	descriptionPanel = description.getDescriptionPanel();
	creditsPanel = credits.getCreditsPanel();
		
	//frame mode
	frame.setLayout(null);
	frame.setIconImage(Assets.icon);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	frame.setResizable(false);
		
	//card layout testing
	cardPanel = new JPanel();
	cardPanel.setLayout(cardLayout);
	cardPanel.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
		
	cardPanel.add(gamePanel, "game");
	cardPanel.add(menuPanel, "menu");
	cardPanel.add(tutorialPanel, "tutorial");
	cardPanel.add(descriptionPanel, "description");
	cardPanel.add(creditsPanel, "credits");
		
	frame.add(cardPanel);
	frame.add(canvas);
		
	frame.setVisible(true);	
			
    }
        
    public void run() {
	int fps = 60;
	double timePerTick = 1000000000 / fps;
	double delta = 0;
	long now;
	long lastTime = System.nanoTime();
	long timer = 0;
		
	while(running) {
	    
	    now = System.nanoTime();
	    delta += (now - lastTime) / timePerTick;
	    timer += now - lastTime;
	    lastTime = now;
		    
	    if (delta >= 1) {
		tick();
		render();
		delta--;
	    }
		    
	    if(timer >= 1000000000) {
		timer = 0;
	    }
		    
	}
		
	stop();
 	
    }
    
    private void tick() {
		
	Assets.bg.loop();
	
	if(state == "game") {
	    cardLayout.show(cardPanel, "game");
	    game.tick();
	}
		
	if(state == "menu") {
	    cardLayout.show(cardPanel, "menu");
	}
		
	if(state == "tutorial") {
	    cardLayout.show(cardPanel, "tutorial");
	}
		
	if(state == "description") {
	    cardLayout.show(cardPanel, "description");
	}
		
	if(state == "credits") {
	    menuPanel.setVisible(false);
	    cardLayout.show(cardPanel, "credits");
	}
	
    }

    private void render() {

	bs = canvas.getBufferStrategy();
		
	if(bs == null) {
	    canvas.createBufferStrategy(3);
	    return;
	}
		
	g = bs.getDrawGraphics();
		
	g.clearRect(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
				
	bs.show();
	g.dispose();
	
    }

    public synchronized void start() {
	
	if(running) {
	    return;
	}	   
			
	running = true;
	thread = new Thread(this);
	thread.start();
    }
		    
    public synchronized void stop() {

	if(!running) {
	    return;
	}	   
			
	running = false;
			
	try {
	    thread.join();
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }
}