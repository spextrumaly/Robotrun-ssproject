package game;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Window extends JFrame implements Observer{
	private int width = 600;
	private int height = 480;
	private int viewOffset = 50;
	
	private JPanel drawPanel;
	private Game game;
	
	public Window() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
		addKeyListener(new Controller());
		game = new Game();
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
		g.drawImage(game.getPlayerImg(),viewOffset + game.getPlayerX(), height - (game.getPlayerY()+game.getPlayerHeight()),this);
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
			} else if (e.getKeyCode() == KeyEvent.VK_UP) {
				game.launchHeadPressed();
			}
		}

	}

	
	@Override
	public void update(Observable arg0, Object arg1) {
		repaint();
	}
}
