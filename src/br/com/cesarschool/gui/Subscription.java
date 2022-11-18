package br.com.cesarschool.gui;

import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Subscription extends Login{

	JFrame frame;
	private String alreadyParticipated;
	private String withCar;

	public Subscription() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(222, 228, 230));
		frame.setBackground(new Color(222, 228, 230));
		frame.setBounds(100, 100, 400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
	    frame.setLocation(x, y);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Subscription.class.getResource("/br/com/cesarschool/images/concluir.png")));
		btnNewButton.setOpaque(false);
		btnNewButton.setSelectedIcon(new ImageIcon(Subscription.class.getResource("/br/com/cesarschool/images/concluir.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = "";
				msg = "Presença confirmada!\n";
				
				msg+= "Primeira vez: " + alreadyParticipated + "\n";
				msg += "Carro: "+ withCar + "\n";
				
				JOptionPane.showMessageDialog(frame, msg);
				frame.dispose();
				
				MainMenu menu = new MainMenu();
				menu.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(70, 383, 249, 91);
		frame.getContentPane().add(btnNewButton);
		
	    String options[]={" ", "Sim", "Nao"};
		JComboBox comboBox = new JComboBox(options);
		comboBox.setEditable(true);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alreadyParticipated = "" + comboBox.getItemAt(comboBox.getSelectedIndex());
			}
		});
		comboBox.setBounds(150, 333, 89, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox(options);
		comboBox_1.setEditable(true);
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				withCar = "" + comboBox_1.getItemAt(comboBox_1.getSelectedIndex());
			}
		});
		comboBox_1.setBounds(150, 203, 89, 22);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_1 = new JLabel("Mobilidade");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(213, 198, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(123, 155, 139, 37);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("<");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
				MainMenu menu = new MainMenu();
				menu.frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(39, 73, 49, 37);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Subscription.class.getResource("/br/com/cesarschool/images/onsocialwhitelogo.png")));
		lblNewLabel_2.setBounds(186, 0, 198, 47);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(128, 0, 255));
		lblNewLabel_3.setBackground(new Color(140, 100, 255));
		lblNewLabel_3.setBounds(0, 0, 384, 47);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Inscrição");
		lblNewLabel_4.setFont(new Font("Candara", Font.BOLD, 25));
		lblNewLabel_4.setBounds(98, 62, 190, 61);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Olá Fulano, seja bem vindo!");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(64, 121, 198, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_1_1 = new JLabel("Primeira vez");
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1.setBackground(new Color(213, 198, 255));
		lblNewLabel_1_1.setBounds(123, 285, 139, 37);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(70, 146, 247, 102);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setBackground(Color.WHITE);
		lblNewLabel_6.setBounds(70, 270, 247, 102);
		frame.getContentPane().add(lblNewLabel_6);
		setIcon(frame);
	}
}
