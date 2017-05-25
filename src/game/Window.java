package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import entity.Player;

public class Window extends JFrame implements Observer {
	private int width = 640;
	private int height = 480;
	private int viewOffset = 50;

	private JPanel drawPanel;
	private Game game;

	public Window(Player player) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
		addKeyListener(new Controller());
		game = new Game(player);
		game.addObserver(this);
		pack();
	}

	private void initComponents() {
		drawPanel = new JPanel() {
			{
				setPreferredSize(new Dimension(width, height));
			}

			@Override
			public void paint(Graphics g) {
				super.paint(g);
				g.setColor(Color.white);
				g.fillRect(0, 0, width, height);
				drawCharacter(g);
			}

		};
		add(drawPanel);

	}

	private void drawCharacter(Graphics g) {
		g.drawImage(game.getHeadImg(), viewOffset + game.getPlayerX(),
				height - (game.getPlayerY() + game.getPlayerHeight()+90), this);
		g.drawImage(game.getBodyImg(), viewOffset + game.getPlayerX(),
				height - (game.getPlayerY() + game.getPlayerHeight()+40), this);
		g.drawImage(game.getWheelImg(), viewOffset + game.getPlayerX(),
				height - (game.getPlayerY() + game.getPlayerHeight()), this);
	}

	public void start() {
		game.start();
	}

	class Controller extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			super.keyPressed(e);
			if (e.getKeyCode() == KeyEvent.VK_SPACE) {
				game.jumpPressed();
			} else if (e.getKeyCode() == KeyEvent.VK_CONTROL) {
				game.launchHeadPressed();
			}
		}

	}

	@Override
	public void update(Observable arg0, Object arg1) {
		repaint();
	}
}
