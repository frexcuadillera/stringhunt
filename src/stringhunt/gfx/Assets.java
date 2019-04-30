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
    public static BufferedImage icon;
    public static BufferedImage title;
    
    //game assets
    public static BufferedImage[] btn_attack;
    public static BufferedImage[] btn_pause;
    public static BufferedImage[] btn_reset;
    
    public static BufferedImage btn_refresh;
    public static BufferedImage btn_refresh_pressed;
    public static BufferedImage scene_panel_bg;
    
    //player
    public static BufferedImage[] player;
    
    //enemies
    public static BufferedImage[] enemy_11;
    public static BufferedImage[] enemy_12;
    public static BufferedImage[] enemy_13;
    public static BufferedImage[] enemy_14;
    public static BufferedImage[] enemy_15;
    
    public static BufferedImage[] enemy_21;
    public static BufferedImage[] enemy_22;
    public static BufferedImage[] enemy_23;
    public static BufferedImage[] enemy_24;
    public static BufferedImage[] enemy_25;
    
    public static BufferedImage[] enemy_31;
    public static BufferedImage[] enemy_32;
    public static BufferedImage[] enemy_33;
    public static BufferedImage[] enemy_34;
    public static BufferedImage[] enemy_35;
    
    public static BufferedImage[] enemy_41;
    public static BufferedImage[] enemy_42;
    public static BufferedImage[] enemy_43;
    public static BufferedImage[] enemy_44;
    public static BufferedImage[] enemy_45;
    
    public static BufferedImage[] enemy_51;
    public static BufferedImage[] enemy_52;
    public static BufferedImage[] enemy_53;
    public static BufferedImage[] enemy_54;
    public static BufferedImage[] enemy_55;
    
    //letters
    public static BufferedImage[] btn_letters;
    public static BufferedImage[] btn_letters_active;
    
    //credits
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
	
	//player
	player = new BufferedImage[2];
	
	//enemy array
	enemy_11 = new BufferedImage[2];
	enemy_12 = new BufferedImage[2];
	enemy_13 = new BufferedImage[2];
	enemy_14 = new BufferedImage[2];
	enemy_15 = new BufferedImage[1];
	
	enemy_21 = new BufferedImage[3];
	enemy_22 = new BufferedImage[1];
	enemy_23 = new BufferedImage[1];
	enemy_24 = new BufferedImage[2];
	enemy_25 = new BufferedImage[1];
	
	enemy_31 = new BufferedImage[2];
	enemy_32 = new BufferedImage[1];
	enemy_33 = new BufferedImage[1];
	enemy_34 = new BufferedImage[1];
	enemy_35 = new BufferedImage[1];
	
	enemy_41 = new BufferedImage[1];
	enemy_42 = new BufferedImage[1];
	enemy_43 = new BufferedImage[1];
	enemy_44 = new BufferedImage[1];
	enemy_45 = new BufferedImage[1];
	
	enemy_51 = new BufferedImage[1];
	enemy_52 = new BufferedImage[1];
	enemy_53 = new BufferedImage[1];
	enemy_54 = new BufferedImage[1];
	enemy_55 = new BufferedImage[1];
	
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
	icon = ImageLoader.loadImage("/ui/icon.png");
	title = ImageLoader.loadImage("/ui/title.png");
	
	//game assets
	btn_reset[0] = ImageLoader.loadImage("/ui/button_reset_0.png");
	btn_reset[1] = ImageLoader.loadImage("/ui/button_reset_1.png");
	btn_attack[0] = ImageLoader.loadImage("/ui/button_attack_0.png");
	btn_attack[1] = ImageLoader.loadImage("/ui/button_attack_1.png");
	btn_pause[0] = ImageLoader.loadImage("/ui/button_pause_0.png");
	btn_pause[1] = ImageLoader.loadImage("/ui/button_pause_1.png");
	btn_refresh = ImageLoader.loadImage("/ui/btn_refresh.png");
	btn_refresh_pressed = ImageLoader.loadImage("/ui/btn_refresh_pressed.png");
	scene_panel_bg = ImageLoader.loadImage("/ui/scene.jpg");
	
	//player
	player[0] = ImageLoader.loadImage("/characters/player_0.png");
	player[1] = ImageLoader.loadImage("/characters/player_1.png");
	
	//enemy animations
	//lvl1
	enemy_11[0] = ImageLoader.loadImage("/characters/11_0.png");
	enemy_11[1] = ImageLoader.loadImage("/characters/11_1.png");
	
	enemy_12[0] = ImageLoader.loadImage("/characters/12_0.png");
	enemy_12[1] = ImageLoader.loadImage("/characters/12_1.png");
	
	enemy_13[0] = ImageLoader.loadImage("/characters/13_0.png");
	enemy_13[1] = ImageLoader.loadImage("/characters/13_1.png");
	
	enemy_14[0] = ImageLoader.loadImage("/characters/14_0.png");
	enemy_14[1] = ImageLoader.loadImage("/characters/14_1.png");
	
	enemy_15[0] = ImageLoader.loadImage("/characters/15.png");
	
	//lvl2
	enemy_21[0] = ImageLoader.loadImage("/characters/21_0.png");
	enemy_21[1] = ImageLoader.loadImage("/characters/21_1.png");
	enemy_21[2]= ImageLoader.loadImage("/characters/21_2.png");
	
	enemy_22[0]= ImageLoader.loadImage("/characters/22.png");
	
	enemy_23[0]= ImageLoader.loadImage("/characters/23.png");
	
	enemy_24[0] = ImageLoader.loadImage("/characters/12_0.png");
	enemy_24[1] = ImageLoader.loadImage("/characters/12_1.png");
	
	enemy_25[0] = ImageLoader.loadImage("/characters/25.png");
	
	//lvl3
	enemy_31[0] = ImageLoader.loadImage("/characters/12_0.png");
	enemy_31[1] = ImageLoader.loadImage("/characters/12_1.png");
	
	enemy_32[0] = ImageLoader.loadImage("/characters/32.png");
	
	enemy_33[0] = ImageLoader.loadImage("/characters/33.png");
	
	enemy_34[0] = ImageLoader.loadImage("/characters/34.png");
	
	enemy_35[0] = ImageLoader.loadImage("/characters/35.png");
	
	//lvl4
	enemy_41[0] = ImageLoader.loadImage("/characters/41.png");
	
	enemy_42[0] = ImageLoader.loadImage("/characters/42.png");
	
	enemy_43[0] = ImageLoader.loadImage("/characters/43.png");
	
	enemy_44[0] = ImageLoader.loadImage("/characters/44.png");
	
	enemy_45[0] = ImageLoader.loadImage("/characters/45.png");
	
	//lvl5
	enemy_51[0] = ImageLoader.loadImage("/characters/15.png");
	
	enemy_52[0] = ImageLoader.loadImage("/characters/25.png");
	
	enemy_53[0] = ImageLoader.loadImage("/characters/35.png");
	
	enemy_54[0] = ImageLoader.loadImage("/characters/45.png");
	
	enemy_55[0] = ImageLoader.loadImage("/characters/55.png");

	//credits assets
	credits_background = ImageLoader.loadImage("/ui/credits.jpg");
	
    }

}
