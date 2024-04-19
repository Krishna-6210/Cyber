package student;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import javax.swing.JPanel;
import javax.swing.JToolBar;
public class student {

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
					student window = new student();
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
	public student() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 102, 0));
		frame.setBounds(100, 100, 450, 323);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTRATION FORM");
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 18));
		lblNewLabel.setBounds(92, 11, 275, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ROLL NO.");
		lblNewLabel_1.setFont(new Font("Sitka Heading", Font.BOLD, 14));
		lblNewLabel_1.setBounds(51, 45, 98, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(175, 48, 113, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setFont(new Font("Sitka Heading", Font.BOLD, 14));
		lblNewLabel_2.setBounds(51, 82, 98, 26);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb2 = new JTextField();
		tb2.setBounds(175, 86, 113, 23);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("BRANCH");
		lblNewLabel_3.setFont(new Font("Sitka Heading", Font.BOLD, 14));
		lblNewLabel_3.setBounds(51, 120, 98, 26);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb1 = new JComboBox();
		cb1.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "EEE", "ECE", "MECH", "CIVIL", "CSE", "IT"}));
		cb1.setBounds(175, 120, 113, 26);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_4 = new JLabel("GENDER");
		lblNewLabel_4.setFont(new Font("Sitka Heading", Font.BOLD, 14));
		lblNewLabel_4.setBounds(51, 157, 98, 20);
		frame.getContentPane().add(lblNewLabel_4);
		
		JRadioButton r1 = new JRadioButton("MALE");
		r1.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		r1.setBackground(new Color(51, 204, 0));
		r1.setForeground(new Color(0, 0, 0));
		r1.setBounds(175, 154, 66, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("FEMALE");
		r2.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		r2.setBackground(new Color(255, 204, 51));
		r2.setBounds(259, 153, 66, 23);
		frame.getContentPane().add(r2);
		
		JLabel lblNewLabel_5 = new JLabel("PROG LANG");
		lblNewLabel_5.setFont(new Font("Sitka Heading", Font.BOLD, 14));
		lblNewLabel_5.setBounds(51, 188, 98, 26);
		frame.getContentPane().add(lblNewLabel_5);
		
		JCheckBox c1 = new JCheckBox("C");
		c1.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		c1.setBackground(new Color(51, 204, 255));
		c1.setBounds(175, 190, 51, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("JAVA");
		c2.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		c2.setBackground(new Color(102, 153, 153));
		c2.setBounds(243, 190, 66, 23);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("PYTHON");
		c3.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		c3.setBackground(new Color(204, 153, 204));
		c3.setBounds(321, 190, 76, 23);
		frame.getContentPane().add(c3);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setForeground(new Color(0, 102, 0));
		btnNewButton.setBackground(new Color(255, 0, 102));
		btnNewButton.setFont(new Font("Malgun Gothic", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String roll=tb1.getText();
				String name=tb2.getText();
				String branch=(String) cb1.getSelectedItem();
				String gender=" ";
				String langs=" ";
				if(r1.isSelected())
				{
					gender="male";
				}
				if(r2.isSelected())
				{
					gender="female";
				}
				if(c1.isSelected()) 
				{
					langs=langs+" C, ";
				}
				if(c2.isSelected()) 
				{
					langs=langs+" JAVA, ";
				}
				if(c3.isSelected()) 
				{
					langs=langs+" PYTHON, ";
				}
			JOptionPane.showMessageDialog(btnNewButton, "ROLL NO :" +roll+"\n NAME :" +name+"\n BRANCH :"+branch+ "\n GENDER :"+gender+"\n PROG LANGS :"+langs);
			}
		});
		btnNewButton.setBounds(175, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
