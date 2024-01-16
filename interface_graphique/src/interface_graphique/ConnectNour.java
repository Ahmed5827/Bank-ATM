package interface_graphique;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class ConnectNour {

	private JFrame frmAproposnour;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConnectNour window = new ConnectNour();
					window.frmAproposnour.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConnectNour() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAproposnour = new JFrame();
		frmAproposnour.setTitle("AproposNour");
		frmAproposnour.setBounds(100, 100, 500, 500);
		frmAproposnour.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setAutoscrolls(true);
		frmAproposnour.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ConnectNour.class.getResource("/interface_graphique/mee.png")));
		lblNewLabel.setBounds(10, 145, 180, 235);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(234, 257, 35, -12);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nour Elhouda Salem");
		lblNewLabel_2.setForeground(new Color(4, 109, 181));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setIcon(new ImageIcon(ConnectNour.class.getResource("/interface_graphique/linkedin.png")));
		lblNewLabel_2.setBounds(222, 170, 187, 45);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Noursalem25");
		lblNewLabel_3.setForeground(new Color(4, 109, 181));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setIcon(new ImageIcon(ConnectNour.class.getResource("/interface_graphique/github.png")));
		lblNewLabel_3.setBounds(222, 250, 177, 39);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("noursalem20002@gmail.com");
		lblNewLabel_4.setForeground(new Color(4, 109, 181));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setIcon(new ImageIcon(ConnectNour.class.getResource("/interface_graphique/gmail.png")));
		lblNewLabel_4.setBounds(222, 325, 215, 31);
		panel.add(lblNewLabel_4);
		
		JButton Gobackapropos = new JButton(" Go Back");
		Gobackapropos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Gobackapropos.setIcon(new ImageIcon(ConnectNour.class.getResource("/interface_graphique/reply.png")));
		Gobackapropos.setBounds(192, 418, 117, 21);
		panel.add(Gobackapropos);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(ConnectNour.class.getResource("/interface_graphique/Cash.jpg")));
		lblNewLabel_5.setBounds(-24, -27, 500, 500);
		panel.add(lblNewLabel_5);
	}
}
