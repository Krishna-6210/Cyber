package metro;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class metro {

	protected static final int YES_OPTION = 0;
	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metro window = new metro();
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
	public metro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 153, 153));
		frame.setBounds(100, 100, 593, 326);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("METRO TICKET BOOKING");
		lblNewLabel.setFont(new Font("Sitka Heading", Font.BOLD, 16));
		lblNewLabel.setBounds(194, 11, 216, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Sitka Small", Font.BOLD, 12));
		lblNewLabel_1.setBounds(294, 63, 102, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SOURCE");
		lblNewLabel_2.setFont(new Font("Sitka Small", Font.BOLD, 12));
		lblNewLabel_2.setBounds(294, 110, 102, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DESTINATION");
		lblNewLabel_3.setFont(new Font("Sitka Small", Font.BOLD, 12));
		lblNewLabel_3.setBounds(294, 160, 102, 22);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("NUMBER OF TICKETS");
		lblNewLabel_4.setFont(new Font("Sitka Small", Font.BOLD, 12));
		lblNewLabel_4.setBounds(294, 203, 139, 22);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setForeground(new Color(204, 153, 102));
		tb1.setFont(new Font("Sitka Small", Font.BOLD, 12));
		tb1.setBounds(461, 62, 106, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setForeground(new Color(255, 102, 51));
		cb1.setFont(new Font("Sitka Small", Font.BOLD, 12));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "SR NAGAR", "AMEERPET", "JNTU", "KPHB"}));
		cb1.setBounds(461, 110, 106, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setForeground(new Color(153, 153, 102));
		cb2.setFont(new Font("Sitka Small", Font.BOLD, 12));
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "SR NAGAR", "AMEERPET", "JNTU", "KPHB"}));
		cb2.setBounds(461, 160, 106, 22);
		frame.getContentPane().add(cb2);
		
		JComboBox cb3 = new JComboBox();
		cb3.setForeground(new Color(51, 153, 153));
		cb3.setFont(new Font("Sitka Small", Font.BOLD, 12));
		cb3.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5", "6"}));
		cb3.setBounds(461, 203, 106, 22);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("BOOK TICKETS");
		btnNewButton.setForeground(new Color(153, 51, 153));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String source=(String) cb1.getSelectedItem();
				String destination=(String) cb2.getSelectedItem();
				String tickets=(String) cb3.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				if(source.equals(destination))
				{
					JOptionPane.showMessageDialog(btnNewButton, "Please check the stations");
				}
				else
				{
					int bill=0;
					bill=bill+nt*55;
					int res=0;
					res=JOptionPane.showConfirmDialog(btnNewButton, "Name :" +name+ "\n SOURCE :" +source+ "\n DESTINATION :" +destination+ 
							"\n NUMBER OF TICKETS :" +tickets+ "\n AMOUNT :" +bill);
					if(res == YES_OPTION)
					{
						JOptionPane.showMessageDialog(btnNewButton, "Booking Confirmed");
					}
					else
					{
						JOptionPane.showMessageDialog(btnNewButton, "Booking cancelled");
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Sitka Heading", Font.BOLD, 12));
		btnNewButton.setBounds(346, 253, 113, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\online\\Documents\\images.jpg"));
		lblNewLabel_5.setBounds(10, 0, 278, 287);
		frame.getContentPane().add(lblNewLabel_5);
	}

}
