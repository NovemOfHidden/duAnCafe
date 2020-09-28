package duAnCafe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.JTextField;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JButton;



import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loGinAdimin extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtPass;
	private JButton btnNewButton;
	private JLabel lblTn;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loGinAdimin frame = new loGinAdimin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public loGinAdimin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\duAnCafe_dekstop\\logoCafe.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(10, 32, 199, 199);
		try {
			BufferedImage image = ImageIO.read(new File("D:\\duAnCafe_dekstop\\logoCafe2.jpg"));
			ImageIcon icon = new ImageIcon(image.getScaledInstance(199, 199, image.SCALE_SMOOTH));
			lblLogo.setIcon(icon);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		txtName = new JTextField("Name");
		txtName.setText("");
			
		
		txtName.setBounds(280, 57, 131, 28);
		contentPane.add(txtName);
		txtName.setColumns(10);
		contentPane.add(lblLogo);
		
		txtPass = new JTextField();
		txtPass.setBounds(280, 139, 131, 28);
		contentPane.add(txtPass);
		txtPass.setColumns(10);
		
		btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
		    		Connection conn = baitest.main();
		    		if(e.getActionCommand()=="Login"){
		    			Statement st =conn.createStatement();
		        		ResultSet rs =st.executeQuery("select * from login where Name='" +txtName.getText()+ "' and  Password='"+txtPass.getText()+"'");
		        		if(rs.isBeforeFirst()==false){
		        			JOptionPane.showMessageDialog(null, "Không tìm thấy tài khoản. Vui lòng tạo tài khoản để tiếp tục",
		        	                  "Title", JOptionPane.WARNING_MESSAGE);
		        		}
		        		else{JOptionPane.showMessageDialog(null, "hoản. Vui lòng tạo tài khoản để tiếp tục",
	        	                  "Title", JOptionPane.WARNING_MESSAGE);}
		        		
		    		}
				}catch(SQLException ex){
		    		ex.printStackTrace();
		    	}
		}});
		btnNewButton.setBounds(283, 208, 128, 23);
		contentPane.add(btnNewButton);
		
		lblTn = new JLabel("Name");
		lblTn.setBounds(281, 32, 46, 14);
		contentPane.add(lblTn);
		
		lblNewLabel = new JLabel("Password");
		lblNewLabel.setBounds(281, 114, 46, 14);
		contentPane.add(lblNewLabel);
	}
}
