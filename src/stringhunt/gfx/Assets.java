package stringhunt.gfx;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;

public class Assets {
    
    public static BufferedImage background;
    public static BufferedImage[] btn_start;
    public static BufferedImage[] btn_tutorial;
    public static BufferedImage[] btn_description;
    public static BufferedImage[] btn_credits;
    public static BufferedImage[] btn_quit;
    public static BufferedImage[] btn_back;
    
    //game assets
    public static BufferedImage[] btn_attack;
    public static BufferedImage[] btn_menu;
    public static BufferedImage[] btn_reset; //test
    
    //
    public static BufferedImage[] btn_letters;
    public static BufferedImage[] btn_letters_active;
       
    public static BufferedImage player;
    
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
	btn_menu = new BufferedImage[2];
	
	
	//Spreadsheets
	//enemy_sheet = new SpriteSheet(ImageLoader.loadImage("/test/test_sprite.png"));
	
	
	//load image here
	//testImage = ImageLoader.loadImage("/textures/test.jpg");
	
	
	// main menu assets
	background = ImageLoader.loadImage("/ui/background.jpg");
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
	btn_menu[0] = ImageLoader.loadImage("/ui/button_menu_0.png");
	btn_menu[1] = ImageLoader.loadImage("/ui/button_menu_1.png");

	//player assets
	
	
	//load spritesheet heres
	//load image first to convert as spritesheet
	
	//SpriteSheet ui_sheet = new SpriteSheet(ImageLoader.loadImage("/sheets/blueSheet.png"));	
	//btn_start[0] = ui_sheet.crop(0, 0, 190, 49);
	//btn_start[1] = ui_sheet.crop(0, 50, 190, 49);
    }

}
