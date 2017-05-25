package game;

import java.awt.Image;
import java.util.Observable;


import entity.Player;
import entity.RobotHead;

public class Game extends Observable {

	public static final int FPS = 60;
	public static final float GRAVITY = -600;
	
	private Player player;
	private RobotHead robotHead;
	private boolean running;
	private Thread gameThread;
	
	public Game() {
		player = new Player(0, 0);
		robotHead = new RobotHead(player);
	}
	public Game(Player player) {
		this.player = player;
		robotHead = new RobotHead(player);
	}
	public void start() {
		running = true;
		gameThread = new Thread() {
			@Override
			public void run() {
				super.run();
				while(running) {
					singleFrame();
					try {
						Thread.sleep(1000 / FPS);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}	
				}
			}
		};
		gameThread.start();
	}
	
	private void singleFrame() {
		player.update();
		robotHead.update();
		setChanged();
		notifyObservers();
	}
	
	public int getPlayerX() {
		return player.getX();
	}
	
	public int getPlayerY() {
		return player.getY();
	}
	
	public int getPlayerWidth() {
		return player.getWidth();
	}
	
	public int getPlayerHeight() {
		return player.getHeight();
	}
	
	public void jumpPressed() {
		player.jumpPressed();
	}
	
	public void launchHeadPressed() {
		player.launchHeadPressed();
	}
	public Player getPlayer() {
		return this.player;
	}
	public RobotHead getRobotHead() {
		return this.robotHead;
	}
	public Image getHeadImg() {
		return this.player.getHeadImg();
	}
	public Image getBodyImg() {
		return this.player.getBodyImg();
	}
	public Image getWheelImg() {
		return this.player.getWheelImg();
	}

}
