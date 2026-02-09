package zeldamini;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spritesheet {

	public static BufferedImage spritesheet;
	public static BufferedImage[] player_front;
	public static BufferedImage tileWall;
	
	public static BufferedImage[] enemy_front;
	
	public Spritesheet() {
		try {
			spritesheet = ImageIO.read(getClass().getResource("/spritesheet.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		player_front = new BufferedImage[2];
		enemy_front = new BufferedImage[1];
		
		player_front[0] = getSprite(0, 11, 16, 16);
		player_front[1] = getSprite(16, 11, 16, 16);
		
		enemy_front[0] = getSprite(35, 232, 16,16);
//		enemy_front[1] = getSprite(35, 232, 16,16);
		
		tileWall = getSprite(271, 219, 16, 16);
	}
	
	public static BufferedImage getSprite(int x, int y, int widtth, int height) {
		return spritesheet.getSubimage(x, y, widtth, height);
	}
}
