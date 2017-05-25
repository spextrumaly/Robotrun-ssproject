package game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseCharacterWindow {

	private JFrame frame;
	private JTextField textField;
	ChooseCharacterController controller;
	
	JLabel bodyNameLabel;
	JLabel legNameLabel;
	JLabel headNameLabel;
	
	JLabel headLabel = new JLabel(""), bodyLabel = new JLabel(""), legLabel = new JLabel(""); 
	
	
	JPanel headPanel;
	JPanel bodyPanel;
	JPanel legPanel;
	
	
	JButton prevHeadButton , nextHeadButton , prevLegButton , nextLegButton , prevBodyButton , nextBodyButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChooseCharacterWindow window = new ChooseCharacterWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ChooseCharacterWindow() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 240, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(6, 225, 228, 47);
		frame.getContentPane().add(btnNewButton);
		
		headPanel = new JPanel();
		headPanel.setBounds(32, 98, 50, 50);
		frame.getContentPane().add(headPanel);
		headPanel.add(headLabel);
		
		bodyPanel = new JPanel();
		bodyPanel.setBounds(6, 151, 100, 40);
		frame.getContentPane().add(bodyPanel);
		bodyPanel.add(bodyLabel);
		
		legPanel = new JPanel();
		legPanel.setBounds(32, 193, 50, 20);
		frame.getContentPane().add(legPanel);
		legPanel.add(legLabel);
		
		prevHeadButton = new JButton("<aadksaf");
		prevHeadButton.setBounds(114, 127, 20, 20);
		frame.getContentPane().add(prevHeadButton);
		prevHeadButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				controller.prevHead();
			}
			
		});
		
		nextHeadButton = new JButton(">");
		nextHeadButton.setBounds(214, 127, 20, 20);
		frame.getContentPane().add(nextHeadButton);
		nextHeadButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controller.nextHead();
			}
			
		});
		
		prevBodyButton = new JButton("<");
		prevBodyButton.setBounds(114, 160, 20, 20);
		frame.getContentPane().add(prevBodyButton);
		prevBodyButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controller.prevBody();
			}
			
		});
		
		nextBodyButton = new JButton(">");
		nextBodyButton.setBounds(214, 160, 20, 20);
		frame.getContentPane().add(nextBodyButton);
		nextBodyButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controller.nextBody();
			}
			
		});
		
		prevLegButton = new JButton("<");
		prevLegButton.setBounds(114, 193, 20, 20);
		frame.getContentPane().add(prevLegButton);
		prevLegButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controller.prevLeg();
			}
			
		});
		
		nextLegButton = new JButton(">");
		nextLegButton.setBounds(214, 193, 20, 20);
		frame.getContentPane().add(nextLegButton);
		nextLegButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controller.nextLeg();
			}
			
		});
		
		headNameLabel = new JLabel("head");
		headNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		headNameLabel.setBounds(136, 128, 77, 20);
		frame.getContentPane().add(headNameLabel);
		
		bodyNameLabel = new JLabel("body");
		bodyNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		bodyNameLabel.setBounds(136, 161, 77, 20);
		frame.getContentPane().add(bodyNameLabel);
		
		legNameLabel = new JLabel("leg");
		legNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		legNameLabel.setBounds(136, 193, 77, 20);
		frame.getContentPane().add(legNameLabel);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setBounds(48, 53, 186, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Customize Your Robot");
		lblNewLabel_1.setFont(new Font("Roboto", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(16, 7, 207, 40);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblName = new JLabel("Name");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setFont(new Font("Roboto", Font.PLAIN, 13));
		lblName.setBounds(6, 59, 41, 16);
		frame.getContentPane().add(lblName);
		
		
		controller = new ChooseCharacterController(this);
	}
}
