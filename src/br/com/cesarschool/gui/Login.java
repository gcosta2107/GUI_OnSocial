package br.com.cesarschool.gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Label;

public class Login {

	JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	
	public Login() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(222, 228, 230));
		frame.setBounds(100, 100, 400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
	    frame.setLocation(x, y);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setForeground(new Color(222, 228, 230));
		btnNewButton.setBackground(new Color(222, 228, 230));
		btnNewButton.setIcon(new ImageIcon(Login.class.getResource("/br/com/cesarschool/images/Login.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				
				if (("admin@peregrinos.com").equals(textField.getText()) && ("admin123").equals(new String(passwordField.getPassword()))) {
					frame.dispose();
					
					MainMenu menu = new MainMenu();
					menu.frame.setVisible(true);
				}
				else
					JOptionPane.showMessageDialog(null, "Nome ou Senha incorretos ");
			}
		});
		btnNewButton.setBounds(47, 319, 244, 78);
		frame.getContentPane().add(btnNewButton);
		
		
		textField = new JTextField();
		textField.setBackground(new Color(222, 228, 230));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBounds(90, 221, 200, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(20);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(222, 228, 230));
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		passwordField.setBounds(91, 279, 200, 34);
		frame.getContentPane().add(passwordField);
		passwordField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/br/com/cesarschool/images/OnSocialLogo.png")));
		lblNewLabel.setBounds(50, 90, 286, 73);
		frame.getContentPane().add(lblNewLabel);
		
		Label label = new Label("Email");
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		label.setBounds(89, 197, 62, 22);
		frame.getContentPane().add(label);
		Label label_1 = new Label("Senha");
		label_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		label_1.setBounds(90, 257, 62, 22);
		frame.getContentPane().add(label_1);
		setIcon(frame);
	}
	
	protected void setIcon(JFrame frame) {
		
		try {
		    frame.setIconImage(ImageIO.read(getClass().getResourceAsStream("/br/com/cesarschool/images/icon.png")));
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
}


