package entity;

import java.awt.image.BufferedImage;

public class RobotHead {
	private int x;
	private int y;
	private int vX;
	private Player player;
	private BufferedImage headImg;
	private double angle;
	public RobotHead(Player player) {
		this.player = player;
		this.headImg = player.getHeadImg();
		this.x = player.getX();
		this.y = player.getY();
		this.vX = 20;
		this.angle = 0;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getvX() {
		return vX;
	}
	public void setvX(int vX) {
		this.vX = vX;
	}
	public BufferedImage getHeadImg() {
		return this.headImg;
	}
	public double getAngle() {
		return this.angle;
	}
	public void update() {
		if (player.getHeadlessTime()>0) {
			this.x+=vX;
			angle += Math.toRadians (20);
		} else {
			angle = 0;
			this.y = player.getY();
			this.x = player.getX();
		}	
	}
}
