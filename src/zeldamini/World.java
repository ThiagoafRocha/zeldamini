package zeldamini;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class World {
	private static int QUANTIDADE_DE_BLOCOS_HORIZONTAL = 15;
	private static int QUANTIDADE_DE_BLOCOS_VERTICAL = 15;
	public static List<Block> blocks = new ArrayList<Block>();

	public World() {
		for(int xx = 0; xx < QUANTIDADE_DE_BLOCOS_HORIZONTAL; xx++) {
			blocks.add(new Block(xx*32,0));
		}
		
		for(int xx = 0; xx < QUANTIDADE_DE_BLOCOS_HORIZONTAL; xx++) {
			blocks.add(new Block(xx*32,480-32));
		}
		
		for(int yy = 0; yy < QUANTIDADE_DE_BLOCOS_VERTICAL; yy++) {
			blocks.add(new Block(0,yy*32));
		}
		
		for(int yy = 0; yy < QUANTIDADE_DE_BLOCOS_VERTICAL; yy++) {
			blocks.add(new Block(480-32,yy*32));
		}
	}
	
	public static boolean isFree(int x, int y) {
		for(int i = 0; i < blocks.size(); i++) {
			Block actualBlock = blocks.get(i);
			if(actualBlock.intersects(new Rectangle(x,y,32,32))) {
				return false;
			}
		}
		
		return true;
	}
	
	public void render(Graphics g) {
		for(int i = 0; i < blocks.size(); i++) {
			blocks.get(i).render(g);
		}
	}
}
