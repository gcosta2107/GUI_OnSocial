package br.com.cesarschool.gui;

import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class MainMenu extends Login {

	JFrame frame;
	private JLabel lblNewLabel;

	public MainMenu() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(222, 228, 230));
		frame.setBounds(100, 100, 400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
	    frame.setLocation(x, y);
		
		JButton btnNewButton = new JButton("Inscrição");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Candara", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(140, 100, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
				Subscription presenca = new Subscription();
				presenca.frame.setVisible(true);
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(MainMenu.class.getResource("/br/com/cesarschool/images/onsocialwhitelogo.png")));
		lblNewLabel_2.setBounds(186, 0, 198, 47);
		frame.getContentPane().add(lblNewLabel_2);
		btnNewButton.setBounds(198, 315, 124, 98);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Tarefas");
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setFont(new Font("Candara", Font.BOLD, 25));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(140, 100, 255));
		btnNewButton_1.setBounds(53, 315, 124, 98);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Rotas");
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setFont(new Font("Candara", Font.BOLD, 25));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(140, 100, 255));
		btnNewButton_2.setBounds(53, 193, 124, 98);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Checklist");
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Candara", Font.BOLD, 20));
		btnNewButton_3.setBackground(new Color(140, 100, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
				Checklist checklist = new Checklist();
				checklist.frame.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(198, 193, 124, 98);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("Bem vindo ao");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setFont(new Font("Candara", Font.BOLD, 25));
		lblNewLabel_1.setBounds(53, 87, 198, 40);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("OnSocial!");
		lblNewLabel_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1.setFont(new Font("Candara", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(51, 112, 160, 47);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(128, 0, 255));
		lblNewLabel.setBackground(new Color(140, 100, 255));
		lblNewLabel.setBounds(0, 0, 384, 47);
		frame.getContentPane().add(lblNewLabel);
		setIcon(frame);
	}
}
