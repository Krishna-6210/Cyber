package Sample;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

public class login {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 255, 153));
		frame.getContentPane().setBackground(new Color(51, 102, 204));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USERNAME ");
		lblNewLabel.setForeground(new Color(204, 0, 0));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblNewLabel.setBounds(51, 58, 89, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tb1 = new JTextField();
		tb1.setForeground(new Color(51, 0, 102));
		tb1.setBounds(167, 55, 123, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN PAGE");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBackground(SystemColor.activeCaption);
		lblNewLabel_1.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
		lblNewLabel_1.setBounds(128, 11, 162, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setForeground(new Color(204, 0, 0));
		lblNewLabel_2.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblNewLabel_2.setBackground(new Color(255, 0, 0));
		lblNewLabel_2.setBounds(51, 118, 89, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setToolTipText("");
		btnNewButton.setForeground(new Color(255, 102, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String pwd=p1.getText();
				if(name.equals("ravi")  && pwd.equals("123456"))
				{
					JOptionPane.showMessageDialog(btnNewButton, "valid"
							+ " user");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "invalid user");
				}
			}
		});
		btnNewButton.setBackground(SystemColor.info);
		btnNewButton.setFont(new Font("Sitka Text", Font.BOLD, 14));
		btnNewButton.setBounds(177, 175, 98, 23);
		frame.getContentPane().add(btnNewButton);
		
		p1 = new JPasswordField();
		p1.setBackground(new Color(255, 255, 255));
		p1.setBounds(167, 118, 123, 20);
		frame.getContentPane().add(p1);
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel, tb1, lblNewLabel_1, lblNewLabel_2, btnNewButton, p1}));
	}
}
