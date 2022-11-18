package br.com.cesarschool.gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Checklist extends Login {

	JFrame frame;
	private String route;

	public Checklist() {
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
		
		String options[]={"", "Rota Madalena", "Rota Caxanga"};
		JComboBox comboBox = new JComboBox(options);
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setEditable(true);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				route = "" + comboBox.getItemAt(comboBox.getSelectedIndex());
			}
		});
		comboBox.setBounds(66, 113, 154, 22);
		frame.getContentPane().add(comboBox);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Bolos");
		chckbxNewCheckBox.setFont(new Font("Candara", Font.BOLD, 15));
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBounds(60, 148, 260, 47);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxSanduches = new JCheckBox("Sanduiches");
		chckbxSanduches.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxSanduches.setFont(new Font("Candara", Font.BOLD, 15));
		chckbxSanduches.setBackground(Color.WHITE);
		chckbxSanduches.setBounds(60, 213, 260, 47);
		frame.getContentPane().add(chckbxSanduches);
		
		JCheckBox chckbxCopos = new JCheckBox("Copos");
		chckbxCopos.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxCopos.setFont(new Font("Candara", Font.BOLD, 15));
		chckbxCopos.setBackground(Color.WHITE);
		chckbxCopos.setBounds(60, 279, 260, 47);
		frame.getContentPane().add(chckbxCopos);
		
		JCheckBox chckbxguas = new JCheckBox("Aguas");
		chckbxguas.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxguas.setFont(new Font("Candara", Font.BOLD, 15));
		chckbxguas.setBackground(Color.WHITE);
		chckbxguas.setBounds(60, 346, 260, 47);
		frame.getContentPane().add(chckbxguas);
		
		JCheckBox chckbxTalheres = new JCheckBox("Talheres");
		chckbxTalheres.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxTalheres.setFont(new Font("Candara", Font.BOLD, 15));
		chckbxTalheres.setBackground(Color.WHITE);
		chckbxTalheres.setBounds(60, 412, 260, 47);
		frame.getContentPane().add(chckbxTalheres);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon(Checklist.class.getResource("/br/com/cesarschool/images/Salvar.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
		        String msg= "";
		        
		        if(route.equals("")) {
		        	JOptionPane.showMessageDialog(frame, "Rota não selecionada");
		        }
		        else {
		        	msg = route+"\n";
			        if(chckbxNewCheckBox.isSelected()){    
			            msg+="Bolos\n";  
			        }  
			        if(chckbxCopos.isSelected()){   
			            msg+="Copos\n";  
			        }  
			        if(chckbxguas.isSelected()){   
			            msg+="Aguas\n";  
			        }
			        if(chckbxTalheres.isSelected()){   
			            msg+="Talheres\n";  
			        }
			        msg+="-----------------\n";  
			        JOptionPane.showMessageDialog(frame, msg);
		        }
		        
		        
		        frame.dispose();
				
				MainMenu menu = new MainMenu();
				menu.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(75, 478, 223, 72);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
				MainMenu menu = new MainMenu();
				menu.frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(28, 69, 45, 33);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Checklist.class.getResource("/br/com/cesarschool/images/onsocialwhitelogo.png")));
		lblNewLabel_2.setBounds(186, 0, 198, 47);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(128, 0, 255));
		lblNewLabel.setBackground(new Color(140, 100, 255));
		lblNewLabel.setBounds(0, 0, 384, 47);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Checklist");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Candara", Font.BOLD, 25));
		lblNewLabel_1.setBounds(80, 69, 137, 40);
		frame.getContentPane().add(lblNewLabel_1);
		

		setIcon(frame);
	}
}
