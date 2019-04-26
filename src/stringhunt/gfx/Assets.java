package stringhunt.gfx;

import java.awt.image.BufferedImage;

public class Assets {
        
    //menu assets
    public static BufferedImage[] btn_start;
    public static BufferedImage[] btn_tutorial;
    public static BufferedImage[] btn_description;
    public static BufferedImage[] btn_credits;
    public static BufferedImage[] btn_quit;
    public static BufferedImage[] btn_back;

    //game assets
    public static BufferedImage[] btn_attack;
    public static BufferedImage[] btn_pause;
    public static BufferedImage[] btn_reset;
    
    public static BufferedImage btn_refresh;
    public static BufferedImage btn_refresh_pressed;
    
    //letters
    public static BufferedImage[] btn_letters;
    public static BufferedImage[] btn_letters_active;
       
    public static BufferedImage credits_background;
    
    public static void init() {
	
	//buffered image array
	
	//menu assets
	btn_start = new BufferedImage[2];
	btn_tutorial = new BufferedImage[2];
	btn_description = new BufferedImage[2];
	btn_credits = new BufferedImage[2];
	btn_quit = new BufferedImage[2];
	btn_back = new BufferedImage[2];
	
	//game assets
	btn_reset = new BufferedImage[2]; //test
	btn_attack = new BufferedImage[2];
	btn_pause = new BufferedImage[2];
	
	btn_refresh = ImageLoader.loadImage("/ui/btn_refresh.png");
	btn_refresh_pressed = ImageLoader.loadImage("/ui/btn_refresh_pressed.png");

	
	
	//load image here
	//testImage = ImageLoader.loadImage("/textures/test.jpg");
	
	
	// main menu assets
	btn_start[0] = ImageLoader.loadImage("/ui/button_start_0.png");
	btn_start[1] = ImageLoader.loadImage("/ui/button_start_1.png");
	btn_tutorial[0] = ImageLoader.loadImage("/ui/button_tutorial_0.png");
	btn_tutorial[1] = ImageLoader.loadImage("/ui/button_tutorial_1.png");
	btn_description[0] = ImageLoader.loadImage("/ui/button_description_0.png");
	btn_description[1] = ImageLoader.loadImage("/ui/button_description_1.png");
	btn_credits[0] = ImageLoader.loadImage("/ui/button_credits_0.png");
	btn_credits[1] = ImageLoader.loadImage("/ui/button_credits_1.png");
	btn_quit[0] = ImageLoader.loadImage("/ui/button_quit_0.png");
	btn_quit[1] = ImageLoader.loadImage("/ui/button_quit_1.png");
	btn_back[0] = ImageLoader.loadImage("/ui/button_back_0.png");
	btn_back[1] = ImageLoader.loadImage("/ui/button_back_1.png");
	
	//game assets
	btn_reset[0] = ImageLoader.loadImage("/ui/button_reset_0.png");
	btn_reset[1] = ImageLoader.loadImage("/ui/button_reset_1.png");
	btn_attack[0] = ImageLoader.loadImage("/ui/button_attack_0.png");
	btn_attack[1] = ImageLoader.loadImage("/ui/button_attack_1.png");
	btn_pause[0] = ImageLoader.loadImage("/ui/button_pause_0.png");
	btn_pause[1] = ImageLoader.loadImage("/ui/button_pause_1.png");

	//credits assets
	credits_background = ImageLoader.loadImage("/ui/credits.jpg");
	
    }

}
