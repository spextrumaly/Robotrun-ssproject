package Entity;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import State.*;

public class Player {

	public static final int JUMP_SPEED = 10;
	public static final int WIDTH = 30;
	public static final int NORMAL_HEIGHT = 60;
	public static final int CRAWL_HEIGHT = 30;

	private int x;
	private int y;
	private int vY;
	private int width;
	private int height;
	
	private State state;
	
	public BufferedImage img;
	
	public Image headlessImg;

	public Player(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = WIDTH;
		this.height = NORMAL_HEIGHT;
		this.vY = 0;
		state = new StateRun(this);
		try {
			 img = ImageIO.read(new File("C:/Users/ood/Desktop/spices/117.png"));
			 headlessImg = ImageIO.read(new File("C:/Users/ood/Desktop/spices/117.png"));
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	public void setState(State state) {
		this.state = state;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getvY() {
		return vY;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setvY(int vY) {
		this.vY = vY;
	}
	public void setHeight(int height) {
		this.height = height;
		
	}

	public void jumpPressed() {
		state.jump();
	}

	public void shootPressed() {
		state.launchHead();
	}

	public void update() {
		vY--;
		y += vY;
		if (y<=0) {
			y =0;
			this.setState(new StateRun(this));
		}
	}
	public Image getImg() {
		return state.getImg();
	}


}