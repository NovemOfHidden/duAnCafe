package duAnCafe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loGin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loGin frame = new loGin("Đăng nhập");
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
	public loGin(String s) {
		setBackground(new Color(255, 69, 0));
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\duAnCafe_dekstop\\logoCafe.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 351);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdmin.setBounds(342, 32, 124, 47);
		contentPane.add(btnAdmin);
		
		JButton btnKeToan = new JButton("K\u1EBF to\u00E1n");
		btnKeToan.setBounds(342, 109, 124, 47);
		contentPane.add(btnKeToan);
		
		JButton btnNhanVien = new JButton("Nh\u00E2n Vi\u00EAn");
		btnNhanVien.setBounds(342, 184, 124, 47);
		contentPane.add(btnNhanVien);
		
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
		contentPane.add(lblLogo);
	}
}
