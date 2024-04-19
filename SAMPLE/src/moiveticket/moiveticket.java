package moiveticket;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class moiveticket {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					moiveticket window = new moiveticket();
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
	public moiveticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame =  new JFrame();
		frame.getContentPane().setBackground(new Color(51, 102, 255));
		frame.setBounds(100, 100, 622, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MOVIE TICKET BOOKING");
		lblNewLabel.setFont(new Font("Sitka Heading", Font.BOLD, 17));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(224, 11, 203, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Sitka Small", Font.BOLD, 14));
		lblNewLabel_1.setBounds(302, 59, 108, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setFont(new Font("Nirmala UI", Font.BOLD, 12));
		tb1.setBounds(463, 57, 133, 26);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIE NAME");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Sitka Small", Font.BOLD, 14));
		lblNewLabel_2.setBounds(289, 110, 108, 26);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setFont(new Font("Nirmala UI", Font.BOLD, 12));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KGF", "RRR", "SALAR", "PREMALU"}));
		cb1.setBounds(463, 110, 133, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_3 = new JLabel("NUMBER OF TICKETS");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Sitka Small", Font.BOLD, 14));
		lblNewLabel_3.setBounds(274, 157, 179, 26);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb2 = new JComboBox();
		cb2.setFont(new Font("Nirmala UI", Font.BOLD, 12));
		cb2.setBackground(new Color(255, 255, 255));
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cb2.setBounds(463, 157, 133, 22);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("BOOK MOVIE");
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int bill=0;
				String name=tb1.getText();
				String movie=(String) cb1.getSelectedItem();
				String tickets=(String) cb2.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				if(movie == "KGF")
				{
					bill=bill+nt*250;
				}
				if(movie == "RRR")
				{
					bill=bill+nt*200;
				}
				if(movie == "SALAR")
				{
					bill=bill+nt*270;
				}
				if(movie == "PREMALU")
				{
					bill=bill+nt*150;
				}
				JOptionPane.showMessageDialog(btnNewButton, "Name :"+name+ "\n Movie Name :"+movie+ "\n Number of Tickets :"+nt+ "\n Amount :"+bill);
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(153, 204, 255));
		btnNewButton.setBounds(374, 214, 115, 26);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\online\\Documents\\moive4.png"));
		lblNewLabel_4.setBounds(0, 0, 350, 301);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
