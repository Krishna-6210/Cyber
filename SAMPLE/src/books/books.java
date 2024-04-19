package books;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class books {
	int items = 0;
	int total = 0;

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					books window = new books();
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
	public books() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 568, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BOOKS STORE");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 18));
		lblNewLabel.setBounds(136, 11, 168, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				total=total+450;
				tb1.setText(" "+items);
				tb2.setText(" "+total);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\online\\Documents\\images (2).jpg"));
		btnNewButton_1.setBounds(188, 96, 168, 222);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				total=total+570;
				tb1.setText(" "+items);
				tb2.setText(" "+total);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\online\\Downloads\\images (1.jpg"));
		btnNewButton_2.setBounds(366, 96, 168, 222);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				total=total+600;
				tb1.setText(" "+items);
				tb2.setText(" "+total);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\online\\Documents\\images (4).jpg"));
		btnNewButton.setBounds(10, 96, 168, 222);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("ITEMS");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(314, 29, 72, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TOTAL");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(314, 52, 76, 28);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setFont(new Font("Tahoma", Font.BOLD, 14));
		tb1.setBounds(396, 33, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setFont(new Font("Tahoma", Font.BOLD, 15));
		tb2.setBounds(396, 56, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("RS : 600");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3.setBounds(55, 338, 97, 28);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("RS : 450");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_4.setBounds(259, 338, 97, 28);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("RS : 570");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_5.setBounds(418, 338, 97, 28);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton_3 = new JButton("REMOVE");
		btnNewButton_3.setForeground(new Color(0, 0, 0));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items-1;
				total=total-600;
				tb1.setText(" "+items);
				tb2.setText(" "+total);
			}
		});
		btnNewButton_3.setBounds(43, 377, 109, 27);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("REMOVE");
		btnNewButton_4.setForeground(new Color(0, 0, 0));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items-1;
				total=total-450;
				tb1.setText(" "+items);
				tb2.setText(" "+total);
			}
		});
		btnNewButton_4.setBounds(236, 377, 109, 27);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("REMOVE");
		btnNewButton_5.setForeground(new Color(0, 0, 0));
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_5.setBackground(new Color(255, 255, 255));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items-1;
				total=total-570;
				tb1.setText(" "+items);
				tb2.setText(" "+total);
			}
		});
		btnNewButton_5.setBounds(396, 377, 109, 27);
		frame.getContentPane().add(btnNewButton_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\online\\Documents\\A package to download free Springer books during Covid-19 quarantine.jpeg"));
		lblNewLabel_6.setBounds(0, 0, 552, 415);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
