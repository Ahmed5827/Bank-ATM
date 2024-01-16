package interface_graphique;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Apropos {

	private JFrame frmAPropos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apropos window = new Apropos();
					window.frmAPropos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Apropos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAPropos = new JFrame();
		frmAPropos.setTitle("A Propos");
		frmAPropos.setResizable(false);
		frmAPropos.setBounds(100, 100, 500, 500);
		frmAPropos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAPropos.getContentPane().setLayout(null);
		
		JLabel realisepar = new JLabel("Realisé par:");
		realisepar.setForeground(new Color(0, 168, 222));
		realisepar.setFont(new Font("Tahoma", Font.BOLD, 13));
		realisepar.setBounds(10, 151, 125, 13);
		frmAPropos.getContentPane().add(realisepar);
		
		JLabel lblNewLabel = new JLabel("Ahmed Chebbi");
		lblNewLabel.setForeground(new Color(4, 109, 181));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(46, 188, 125, 20);
		frmAPropos.getContentPane().add(lblNewLabel);
		
		JButton contactahmed = new JButton("contact");
		contactahmed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contactahmed.setForeground(new Color(4, 109, 181));
		contactahmed.setBounds(56, 218, 94, 32);
		frmAPropos.getContentPane().add(contactahmed);
		
		JLabel lblNourElhoudaSalem = new JLabel("Nour Elhouda Salem");
		lblNourElhoudaSalem.setForeground(new Color(4, 109, 181));
		lblNourElhoudaSalem.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNourElhoudaSalem.setBounds(242, 188, 176, 20);
		frmAPropos.getContentPane().add(lblNourElhoudaSalem);
		
		JButton contactnour = new JButton("contact");
		contactnour.setForeground(new Color(4, 109, 181));
		contactnour.setBounds(276, 215, 85, 35);
		frmAPropos.getContentPane().add(contactnour);
		
		JLabel lblProposPar = new JLabel("Proposé par:");
		lblProposPar.setForeground(new Color(0, 168, 222));
		lblProposPar.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblProposPar.setBounds(10, 260, 125, 13);
		frmAPropos.getContentPane().add(lblProposPar);
		
		JLabel lblAhmedChebbi = new JLabel("Mr Ramzi Mahmoudi");
		lblAhmedChebbi.setForeground(new Color(4, 109, 181));
		lblAhmedChebbi.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAhmedChebbi.setBounds(75, 286, 166, 20);
		frmAPropos.getContentPane().add(lblAhmedChebbi);
		
		JLabel lblLesCoulisses = new JLabel("Les Coulisses:");
		lblLesCoulisses.setForeground(new Color(0, 168, 222));
		lblLesCoulisses.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblLesCoulisses.setBounds(10, 316, 125, 13);
		frmAPropos.getContentPane().add(lblLesCoulisses);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Apropos.class.getResource("/interface_graphique/nouss.png")));
		lblNewLabel_1.setBounds(56, 339, 150, 114);
		frmAPropos.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Apropos.class.getResource("/interface_graphique/pcss.png")));
		lblNewLabel_2.setBounds(284, 339, 150, 114);
		frmAPropos.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Apropos.class.getResource("/interface_graphique/CashewBank1.png")));
		lblNewLabel_3.setBounds(0, -25, 500, 500);
		frmAPropos.getContentPane().add(lblNewLabel_3);
	}
}
