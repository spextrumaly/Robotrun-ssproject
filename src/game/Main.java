package game;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Player;

public class Main {
	public static void main(String[] args) {
		Window w = new Window(createPlayer());
		w.setVisible(true);
		w.start();
	}
	public static Player createPlayer() {
		Player player = new Player(0,0);
		try {
			player.setHeadImg(ImageIO.read(new File("C:/Users/ood/Desktop/assets/head1.png")));
			player.setBodyImg(ImageIO.read(new File("C:/Users/ood/Desktop/assets/body1.png")));
			player.setWheelImg(ImageIO.read(new File("C:/Users/ood/Desktop/assets/wheel1.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return player;
	}
}
