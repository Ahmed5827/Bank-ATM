package interface_graphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

import com.sun.javacard.apduio.Apdu;
import com.sun.javacard.apduio.CadTransportException;

public class MAIN implements ActionListener{
	

	/*ATM*/
	public JFrame frmCashewBank;
	JButton retry ,exit,Retrive_insuff_Back,retry_max_reached_fixed,retry_eneter_amount ,goback;
	JButton contactahmed ,contactnour, Gobackapropos;
	JButton Exit_Code_PIN,Enter_Code_PIN;
	public static JPanel panel;
	private JPasswordField PIN_INPUT;
	/*Balance*/
	JLabel enteramount;
	JButton Balance_goback,Balance_exit ,retryCode;
	/*Wrong Code*/
	JButton Exit_Wrong_Code,Retry_Wrong_Code;
	/*Wrong Input*/
	JButton WrongInput_Retry,WrongInput_Exit;
	/*LimitAttempts*/
	JButton LimitAttempts_Exit;
	/*Distributeur*/
	JButton checkbalance ,Retrieve,cashdeposit,journal;
	/*Retrivemoney*/
	JButton Retrivemoney_dix, Retrivemoney_vingt,Retrivemoney_khamsin,Retrivemoney_cent,Retrivemoney_mytyn,Retrivemoney_custom,Retrivemoney_back;
	JButton Deposit_dix,Deposit_vingt,Deposit_khamsin,Deposit_cent,Deposit_mytyn,Deposit_custom,Deposit_back;
	JTextField Retrive_Enter_Amount_textField;
	JButton Retrive_Enter_Amount_goback,Retrive_Enter_Amount_Validate;
	JButton Retrive_Success_Exit,Retrive_Success_Back;
	
	JTextField Deposit_Enter_Amount_textField;
	JButton Deposit_Enter_Amount_goback,Deposit_Enter_Amount_Validate;
	JButton Deposit_Success_Exit,Deposit_Success_Back;

	/**/
	
	public Apdu apdu;
	static Services client;
	
	
	
	public static void main(String[] args) throws IOException,CadTransportException {
		 client = new Services();
	        client.Connect();
			try {
				client.Select();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (CadTransportException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    MAIN m = new MAIN();
	                    
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	  
	    	});
			
	    	
	

	}
	public MAIN()
	{
		frmCashewBank = new JFrame();
		frmCashewBank.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		frmCashewBank.setResizable(false);
		frmCashewBank.setTitle("Cashew Bank");
		frmCashewBank.setBounds(200, 200, 500, 500);
		frmCashewBank.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCashewBank.setVisible(true);
		ATM();
	}
	
	public void WrongInput()
	{
		
		JPanel panel = new JPanel();
		panel.setLayout(null);	
		JLabel lblNewLabel = new JLabel("Wrong Input !");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel.setForeground(new Color(4, 109, 181));
		
		lblNewLabel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		lblNewLabel.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\x-circle.png"));
		lblNewLabel.setBounds(54, 193, 324, 96);
		panel.add(lblNewLabel);
		
		WrongInput_Retry = new JButton(" Retry ");
		WrongInput_Retry.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		WrongInput_Retry.setForeground(new Color(0, 168, 222));
		WrongInput_Retry.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\reload.png"));
		WrongInput_Retry.setFont(new Font("Tahoma", Font.PLAIN, 25));
		WrongInput_Retry.setBounds(23, 339, 195, 57);
		panel.add(WrongInput_Retry);
		WrongInput_Retry.addActionListener(this);
		
		WrongInput_Exit = new JButton("Exit ");
		WrongInput_Exit.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		WrongInput_Exit.setForeground(new Color(0, 168, 222));
		WrongInput_Exit.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\exit.png"));
		WrongInput_Exit.setFont(new Font("Tahoma", Font.PLAIN, 25));
		WrongInput_Exit.setBounds(296, 339, 160, 57);
		panel.add(WrongInput_Exit);
		WrongInput_Exit.addActionListener(this);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\Cash.jpg"));
		lblNewLabel_1.setBounds(0, 0, 500, 500);
		panel.add(lblNewLabel_1);
		
		panel.setVisible(true);
		frmCashewBank.add(panel);
		frmCashewBank.setContentPane(panel);	
		
		frmCashewBank.validate();
		frmCashewBank.repaint();
	}
	public void WrongInputCode()
	{
		
		 panel = new JPanel();
		panel.setLayout(null);	
		JLabel lblNewLabel = new JLabel("Wrong Input !");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel.setForeground(new Color(4, 109, 181));
		
		lblNewLabel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		lblNewLabel.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\x-circle.png"));
		lblNewLabel.setBounds(54, 193, 324, 96);
		panel.add(lblNewLabel);
		
		retryCode = new JButton(" Retry ");
		retryCode.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		retryCode.setForeground(new Color(0, 168, 222));
		retryCode.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\reload.png"));
		retryCode.setFont(new Font("Tahoma", Font.PLAIN, 25));
		retryCode.setBounds(23, 339, 195, 57);
		panel.add(retryCode);
		retryCode.addActionListener(this);
		
		WrongInput_Exit = new JButton("Exit ");
		WrongInput_Exit.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		WrongInput_Exit.setForeground(new Color(0, 168, 222));
		WrongInput_Exit.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\exit.png"));
		WrongInput_Exit.setFont(new Font("Tahoma", Font.PLAIN, 25));
		WrongInput_Exit.setBounds(296, 339, 160, 57);
		panel.add(WrongInput_Exit);
		WrongInput_Exit.addActionListener(this);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\Cash.jpg"));
		lblNewLabel_1.setBounds(0, 0, 500, 500);
		panel.add(lblNewLabel_1);
		
		panel.setVisible(true);
		frmCashewBank.add(panel);
		frmCashewBank.setContentPane(panel);	
		
		frmCashewBank.validate();
		frmCashewBank.repaint();
	}
	public void WrongInputRetrieve()
	{
		
		panel = new JPanel();
		panel.setLayout(null);	
		JLabel lblNewLabel = new JLabel("Wrong Input !");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel.setForeground(new Color(4, 109, 181));
		
		lblNewLabel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		lblNewLabel.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\x-circle.png"));
		lblNewLabel.setBounds(54, 193, 324, 96);
		panel.add(lblNewLabel);
		
		retry_eneter_amount = new JButton(" Retry ");
		retry_eneter_amount.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		retry_eneter_amount.setForeground(new Color(0, 168, 222));
		retry_eneter_amount.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\reload.png"));
		retry_eneter_amount.setFont(new Font("Tahoma", Font.PLAIN, 25));
		retry_eneter_amount.setBounds(23, 339, 195, 57);
		panel.add(retry_eneter_amount);
		retry_eneter_amount.addActionListener(this);
		
		WrongInput_Exit = new JButton("Exit ");
		WrongInput_Exit.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		WrongInput_Exit.setForeground(new Color(0, 168, 222));
		WrongInput_Exit.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\exit.png"));
		WrongInput_Exit.setFont(new Font("Tahoma", Font.PLAIN, 25));
		WrongInput_Exit.setBounds(296, 339, 160, 57);
		panel.add(WrongInput_Exit);
		WrongInput_Exit.addActionListener(this);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\Cash.jpg"));
		lblNewLabel_1.setBounds(0, 0, 500, 500);
		panel.add(lblNewLabel_1);
		
		panel.setVisible(true);
		frmCashewBank.add(panel);
		frmCashewBank.setContentPane(panel);	
		
		frmCashewBank.validate();
		frmCashewBank.repaint();
	}
	
	public void Balance()
	{
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 486, 463);
		panel.setLayout(null);
		
		enteramount = new JLabel("Your Balance in TND :");
		enteramount.setForeground(new Color(4, 109, 181));
		enteramount.setFont(new Font("Tahoma", Font.BOLD, 19));
		enteramount.setBounds(113, 196, 279, 39);
		panel.add(enteramount);
		
		Balance_goback = new JButton("Go Back");
		Balance_goback.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\reply.png"));
		Balance_goback.setForeground(new Color(4, 109, 181));
		Balance_goback.setFont(new Font("Tahoma", Font.BOLD, 16));
		Balance_goback.setBounds(63, 323, 151, 49);
		Balance_goback.addActionListener(this);
		panel.add(Balance_goback);
		
		Balance_exit = new JButton("Exit ");
		Balance_exit.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		Balance_exit.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\exit.png"));
		Balance_exit.setForeground(new Color(4, 109, 181));
		Balance_exit.setFont(new Font("Tahoma", Font.BOLD, 16));
		Balance_exit.setBounds(303, 323, 126, 49);
		Balance_exit.addActionListener(this);
		panel.add(Balance_exit);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\Cash.jpg"));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setBounds(0, 0, 501, 477);
		panel.add(lblNewLabel);
		panel.setVisible(true);
		frmCashewBank.add(panel);
		frmCashewBank.setContentPane(panel);	
		
		frmCashewBank.validate();
		frmCashewBank.repaint();
	}
	public void WrongCode()
	{

		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Wrong Code PIN ! ");
		lblNewLabel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		lblNewLabel.setForeground(new Color(4, 109, 181));
		lblNewLabel.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\alert-octagon.png"));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(91, 223, 301, 38);
		panel.add(lblNewLabel);
		
		Exit_Wrong_Code = new JButton("Exit ");
		Exit_Wrong_Code.setActionCommand("Exit ");
		Exit_Wrong_Code.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		Exit_Wrong_Code.setForeground(new Color(0, 168, 222));
		Exit_Wrong_Code.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\exit.png"));
		Exit_Wrong_Code.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Exit_Wrong_Code.setBounds(301, 341, 149, 47);
		panel.add(Exit_Wrong_Code);
		Exit_Wrong_Code.addActionListener(this);
		
		Retry_Wrong_Code = new JButton(" Retry");
		Retry_Wrong_Code.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		Retry_Wrong_Code.setForeground(new Color(0, 168, 222));
		Retry_Wrong_Code.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Retry_Wrong_Code.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\reload.png"));
		Retry_Wrong_Code.setBounds(34, 341, 149, 47);
		panel.add(Retry_Wrong_Code);
		Retry_Wrong_Code.addActionListener(this);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\Cash.jpg"));
		lblNewLabel_1.setBounds(0, 0, 500, 500);
		panel.add(lblNewLabel_1);

		panel.setVisible(true);
		frmCashewBank.add(panel);
		frmCashewBank.setContentPane(panel);	
		
		frmCashewBank.validate();
		frmCashewBank.repaint();
	}
	
	public void ATM() {		
		panel = new JPanel();
		panel.setAutoscrolls(true);
		frmCashewBank.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Code PIN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_1.setForeground(new Color(4, 109, 181));
		lblNewLabel_1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		lblNewLabel_1.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		
		lblNewLabel_1.setSize(new Dimension(8, 0));
		lblNewLabel_1.setBounds(156, 188, 227, 43);
		panel.add(lblNewLabel_1);
		
		 PIN_INPUT =  new JPasswordField();
		 PIN_INPUT.setHorizontalAlignment(SwingConstants.CENTER);
		 PIN_INPUT.setFont(new Font("Tahoma", Font.PLAIN, 32));
		 PIN_INPUT.setBounds(132, 225, 234, 33);
		panel.add( PIN_INPUT);
		 PIN_INPUT.setColumns(4);
		
		 Enter_Code_PIN = new JButton("Enter ");
		 Enter_Code_PIN.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		 Enter_Code_PIN.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		 Enter_Code_PIN.setForeground(new Color(0, 168, 222));
		 Enter_Code_PIN.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\arrow-right-circle (1).png"));
		 Enter_Code_PIN.setFont(new Font("Tahoma", Font.PLAIN, 26));
		 Enter_Code_PIN.setBounds(288, 330, 177, 49);
		panel.add(Enter_Code_PIN);
		Enter_Code_PIN.addActionListener(this);

		
		 Exit_Code_PIN = new JButton("Exit ");
		 Exit_Code_PIN.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		 Exit_Code_PIN.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		 Exit_Code_PIN.setForeground(new Color(0, 168, 222));
		 Exit_Code_PIN.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\log-out.png"));
		 Exit_Code_PIN.setFont(new Font("Tahoma", Font.PLAIN, 26));
		 Exit_Code_PIN.setBounds(10, 330, 154, 49);
		panel.add( Exit_Code_PIN);
		 Exit_Code_PIN.addActionListener(this);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFocusTraversalPolicyProvider(true);
		lblNewLabel.setIgnoreRepaint(true);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\Cash.jpg"));
		lblNewLabel.setBounds(0, 0, 500, 500);
		lblNewLabel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panel.add(lblNewLabel);
		panel.setVisible(true);
		frmCashewBank.add(panel);
		frmCashewBank.setContentPane(panel);	
		
		frmCashewBank.validate();
		frmCashewBank.repaint();
	}
	
	public void Retrivemoney()
	{

		JPanel panel = new JPanel();
		panel.setBackground(new Color(205, 236, 244));
		panel.setLayout(null);
		
		JLabel amount = new JLabel("Choose the amount in TND :");
		amount.setForeground(new Color(4, 109, 181));
		amount.setFont(new Font("Sylfaen", Font.BOLD, 19));
		amount.setBounds(105, 174, 278, 55);
		panel.add(amount);
		
		Retrivemoney_dix = new JButton("10");
		Retrivemoney_dix.setForeground(new Color(0, 168, 222));
		Retrivemoney_dix.setFont(new Font("Sylfaen", Font.BOLD, 14));
		Retrivemoney_dix.setBounds(0, 224, 108, 36);
		Retrivemoney_dix.addActionListener(this);
		panel.add(Retrivemoney_dix);
		
		
		Retrivemoney_vingt = new JButton("20");
		Retrivemoney_vingt.setForeground(new Color(0, 168, 222));
		Retrivemoney_vingt.setFont(new Font("Sylfaen", Font.BOLD, 14));
		Retrivemoney_vingt.setBounds(0, 288, 108, 35);
		Retrivemoney_vingt.addActionListener(this);
		panel.add(Retrivemoney_vingt);
		
		Retrivemoney_khamsin = new JButton("50");
		Retrivemoney_khamsin.setForeground(new Color(0, 168, 222));
		Retrivemoney_khamsin.setFont(new Font("Tahoma", Font.BOLD, 14));
		Retrivemoney_khamsin.setBounds(0, 357, 108, 35);
		Retrivemoney_khamsin.addActionListener(this);
		panel.add(Retrivemoney_khamsin);
		
		Retrivemoney_cent = new JButton("100");
		Retrivemoney_cent.setForeground(new Color(0, 168, 222));
		Retrivemoney_cent.setFont(new Font("Sylfaen", Font.BOLD, 14));
		Retrivemoney_cent.setBounds(378, 224, 108, 36);
		Retrivemoney_cent.addActionListener(this);
		panel.add(Retrivemoney_cent);
		
		Retrivemoney_mytyn = new JButton("200");
		Retrivemoney_mytyn.setForeground(new Color(0, 168, 222));
		Retrivemoney_mytyn.setFont(new Font("Sylfaen", Font.BOLD, 14));
		Retrivemoney_mytyn.setBounds(378, 288, 108, 35);
		Retrivemoney_mytyn.addActionListener(this);
		panel.add(Retrivemoney_mytyn);
		
		Retrivemoney_custom = new JButton("custom");
		Retrivemoney_custom.setForeground(new Color(0, 168, 222));
		Retrivemoney_custom.setFont(new Font("Sylfaen", Font.BOLD, 14));
		Retrivemoney_custom.setBounds(378, 357, 108, 35);
		Retrivemoney_custom.addActionListener(this);
		panel.add(Retrivemoney_custom);
		
		Retrivemoney_back = new JButton(" GoBack");
		Retrivemoney_back.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		Retrivemoney_back.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\reply.png"));
		Retrivemoney_back.setForeground(new Color(4, 109, 181));
		Retrivemoney_back.setFont(new Font("Sylfaen", Font.BOLD, 14));
		Retrivemoney_back.setBounds(188, 417, 130, 36);
		Retrivemoney_back.addActionListener(this);
		panel.add(Retrivemoney_back);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\CashewBank1.png"));
		lblNewLabel.setBounds(0, 0, 500, 500);
		panel.add(lblNewLabel);
		
		panel.setVisible(true);
		frmCashewBank.add(panel);
		frmCashewBank.setContentPane(panel);	
		
		frmCashewBank.validate();
		frmCashewBank.repaint();
	}
	public void Cashdeposit()
	{

		JPanel panel = new JPanel();
		panel.setBackground(new Color(205, 236, 244));
		panel.setLayout(null);
		
		JLabel amount = new JLabel("Choose the amount in TND :");
		amount.setForeground(new Color(4, 109, 181));
		amount.setFont(new Font("Sylfaen", Font.BOLD, 19));
		amount.setBounds(105, 174, 278, 55);
		panel.add(amount);
		
		Deposit_dix = new JButton("10");
		Deposit_dix.setForeground(new Color(0, 168, 222));
		Deposit_dix.setFont(new Font("Sylfaen", Font.BOLD, 14));
		Deposit_dix.setBounds(0, 224, 108, 36);
		Deposit_dix.addActionListener(this);
		panel.add(Deposit_dix);
		
		
		Deposit_vingt = new JButton("20");
		Deposit_vingt.setForeground(new Color(0, 168, 222));
		Deposit_vingt.setFont(new Font("Sylfaen", Font.BOLD, 14));
		Deposit_vingt.setBounds(0, 288, 108, 35);
		Deposit_vingt.addActionListener(this);
		panel.add(Deposit_vingt);
		
		Deposit_khamsin = new JButton("50");
		Deposit_khamsin.setForeground(new Color(0, 168, 222));
		Deposit_khamsin.setFont(new Font("Tahoma", Font.BOLD, 14));
		Deposit_khamsin.setBounds(0, 357, 108, 35);
		Deposit_khamsin.addActionListener(this);
		panel.add(Deposit_khamsin);
		
		Deposit_cent = new JButton("100");
		Deposit_cent.setForeground(new Color(0, 168, 222));
		Deposit_cent.setFont(new Font("Sylfaen", Font.BOLD, 14));
		Deposit_cent.setBounds(378, 224, 108, 36);
		Deposit_cent.addActionListener(this);
		panel.add(Deposit_cent);
		
		Deposit_mytyn = new JButton("200");
		Deposit_mytyn.setForeground(new Color(0, 168, 222));
		Deposit_mytyn.setFont(new Font("Sylfaen", Font.BOLD, 14));
		Deposit_mytyn.setBounds(378, 288, 108, 35);
		Deposit_mytyn.addActionListener(this);
		panel.add(Deposit_mytyn);
		
		Deposit_custom = new JButton("custom");
		Deposit_custom.setForeground(new Color(0, 168, 222));
		Deposit_custom.setFont(new Font("Sylfaen", Font.BOLD, 14));
		Deposit_custom.setBounds(378, 357, 108, 35);
		Deposit_custom.addActionListener(this);
		panel.add(Deposit_custom);
		
		Deposit_back = new JButton(" GoBack");
		Deposit_back.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		Deposit_back.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\reply.png"));
		Deposit_back.setForeground(new Color(4, 109, 181));
		Deposit_back.setFont(new Font("Sylfaen", Font.BOLD, 14));
		Deposit_back.setBounds(188, 417, 130, 36);
		Deposit_back.addActionListener(this);
		panel.add(Deposit_back);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\CashewBank1.png"));
		lblNewLabel.setBounds(0, 0, 500, 500);
		panel.add(lblNewLabel);
		
		panel.setVisible(true);
		frmCashewBank.add(panel);
		frmCashewBank.setContentPane(panel);	
		
		frmCashewBank.validate();
		frmCashewBank.repaint();
	}
	
	public void Distributeur()
	{	
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome!");
		lblNewLabel.setForeground(new Color(4, 109, 181));
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 30));
		lblNewLabel.setBounds(167, 186, 183, 30);
		panel.add(lblNewLabel);
		
		checkbalance = new JButton("Check Balance ");
		checkbalance.setForeground(new Color(0, 168, 222));
		checkbalance.addActionListener(this);
		checkbalance.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		checkbalance.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\wallet.png"));
		checkbalance.setFont(new Font("Sylfaen", Font.BOLD, 19));
		checkbalance.setBounds(0, 246, 198, 30);
		panel.add(checkbalance);
		
		Retrieve = new JButton("Retrieve Money  ");
		Retrieve.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		Retrieve.setForeground(new Color(0, 168, 222));
		Retrieve.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\withdraw-money.png"));
		Retrieve.setFont(new Font("Sylfaen", Font.BOLD, 19));
		Retrieve.setBounds(286, 246, 214, 30);
		panel.add(Retrieve);
		Retrieve.addActionListener(this);
		
		cashdeposit = new JButton("Cash Deposit ");
		cashdeposit.setForeground(new Color(0, 168, 222));
		cashdeposit.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		cashdeposit.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\cash.png"));
		cashdeposit.setFont(new Font("Sylfaen", Font.BOLD, 19));
		cashdeposit.setBounds(0, 361, 198, 30);
		panel.add(cashdeposit);
		cashdeposit.addActionListener(this);
		
		journal = new JButton("à Propos");
		journal.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		journal.addActionListener(this);
		journal.setForeground(new Color(0, 168, 222));
		journal.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\bank.png"));
		journal.setFont(new Font("Sylfaen", Font.BOLD, 19));
		journal.setBounds(286, 361, 214, 30);
		panel.add(journal);
		journal.addActionListener(this);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\CashewBank1.png"));
		lblNewLabel_1.setBounds(0, 0, 500, 500);
		panel.add(lblNewLabel_1);
		
		panel.setVisible(true);
		frmCashewBank.add(panel);
		frmCashewBank.setContentPane(panel);	
		
		frmCashewBank.validate();
		frmCashewBank.repaint();
		
	}
	public void Apropos() {
		JPanel panel = new JPanel();
		panel.setAutoscrolls(true);
		frmCashewBank.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel realisepar = new JLabel("Realisé par:");
		realisepar.setForeground(new Color(0, 168, 222));
		realisepar.setFont(new Font("Tahoma", Font.BOLD, 13));
		realisepar.setBounds(10, 151, 125, 13);
		panel.add(realisepar);
		
		JLabel lblNewLabel = new JLabel("Ahmed Chebbi");
		lblNewLabel.setForeground(new Color(4, 109, 181));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(46, 188, 125, 20);
		panel.add(lblNewLabel);
		
		 contactahmed = new JButton("contact");
		contactahmed.addActionListener(this);
		contactahmed.setForeground(new Color(4, 109, 181));
		contactahmed.setBounds(56, 218, 94, 32);
		panel.add(contactahmed);
		
		JLabel lblNourElhoudaSalem = new JLabel("Nour Elhouda Salem");
		lblNourElhoudaSalem.setForeground(new Color(4, 109, 181));
		lblNourElhoudaSalem.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNourElhoudaSalem.setBounds(242, 188, 176, 20);
		panel.add(lblNourElhoudaSalem);
		
		contactnour = new JButton("contact");
		contactnour.setForeground(new Color(4, 109, 181));
		contactnour.setBounds(276, 215, 85, 35);
		panel.add(contactnour);
		contactnour.addActionListener(this);
		
		JLabel lblProposPar = new JLabel("Proposé par:");
		lblProposPar.setForeground(new Color(0, 168, 222));
		lblProposPar.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblProposPar.setBounds(10, 260, 125, 13);
		panel.add(lblProposPar);
		
		JLabel lblAhmedChebbi = new JLabel("Mr Ramzi Mahmoudi");
		lblAhmedChebbi.setForeground(new Color(4, 109, 181));
		lblAhmedChebbi.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAhmedChebbi.setBounds(75, 286, 166, 20);
		panel.add(lblAhmedChebbi);
		
		JLabel lblLesCoulisses = new JLabel("Les Coulisses:");
		lblLesCoulisses.setForeground(new Color(0, 168, 222));
		lblLesCoulisses.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblLesCoulisses.setBounds(10, 316, 125, 13);
		panel.add(lblLesCoulisses);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Apropos.class.getResource("/interface_graphique/nouss.png")));
		lblNewLabel_1.setBounds(56, 339, 150, 114);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Apropos.class.getResource("/interface_graphique/pcss.png")));
		lblNewLabel_2.setBounds(284, 339, 150, 114);
		panel.add(lblNewLabel_2);
		
	    goback = new JButton("");
		goback.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\bin\\interface_graphique\\reply.png"));
		goback.setForeground(new Color(4, 109, 181));
		goback.setBounds(10, 20, 41, 32);
		panel.add(goback);
		goback.addActionListener(this);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Apropos.class.getResource("/interface_graphique/CashewBank1.png")));
		lblNewLabel_3.setBounds(0, -25, 500, 500);
		panel.add(lblNewLabel_3);
		panel.setVisible(true);
		frmCashewBank.add(panel);
		frmCashewBank.setContentPane(panel);	
		
		frmCashewBank.validate();
		frmCashewBank.repaint();
	}
	public void ContactNour() {
		 panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setAutoscrolls(true);
		frmCashewBank.getContentPane().add(panel, BorderLayout.CENTER);
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
		
		Gobackapropos = new JButton(" Go Back");
		Gobackapropos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Gobackapropos.setIcon(new ImageIcon(ConnectNour.class.getResource("/interface_graphique/reply.png")));
		Gobackapropos.setBounds(192, 418, 117, 21);
		panel.add(Gobackapropos);
		Gobackapropos.addActionListener(this);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(ConnectNour.class.getResource("/interface_graphique/Cash.jpg")));
		lblNewLabel_5.setBounds(-24, -27, 500, 500);
		panel.add(lblNewLabel_5);
		panel.setVisible(true);
		frmCashewBank.add(panel);
		frmCashewBank.setContentPane(panel);	
		
		frmCashewBank.validate();
		frmCashewBank.repaint();
	}
	public void ContactAhmed() {
		 panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setAutoscrolls(true);
		frmCashewBank.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ConnectNour.class.getResource("/interface_graphique/ahmed.png")));
		lblNewLabel.setBounds(10, 145, 180, 235);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(234, 257, 35, -12);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ahmed Chebbi");
		lblNewLabel_2.setForeground(new Color(4, 109, 181));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setIcon(new ImageIcon(ConnectNour.class.getResource("/interface_graphique/linkedin.png")));
		lblNewLabel_2.setBounds(222, 170, 187, 45);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ahmed5827");
		lblNewLabel_3.setForeground(new Color(4, 109, 181));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setIcon(new ImageIcon(ConnectNour.class.getResource("/interface_graphique/github.png")));
		lblNewLabel_3.setBounds(222, 250, 177, 39);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Achebbi2002@gmail.com");
		lblNewLabel_4.setForeground(new Color(4, 109, 181));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setIcon(new ImageIcon(ConnectNour.class.getResource("/interface_graphique/gmail.png")));
		lblNewLabel_4.setBounds(222, 325, 215, 31);
		panel.add(lblNewLabel_4);
		
		Gobackapropos = new JButton(" Go Back");
		Gobackapropos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Gobackapropos.setIcon(new ImageIcon(ConnectNour.class.getResource("/interface_graphique/reply.png")));
		Gobackapropos.setBounds(192, 418, 117, 21);
		panel.add(Gobackapropos);
		Gobackapropos.addActionListener(this);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(ConnectNour.class.getResource("/interface_graphique/Cash.jpg")));
		lblNewLabel_5.setBounds(-24, -27, 500, 500);
		panel.add(lblNewLabel_5);
		panel.setVisible(true);
		frmCashewBank.add(panel);
		frmCashewBank.setContentPane(panel);	
		
		frmCashewBank.validate();
		frmCashewBank.repaint();
	}
	
	public void LimitAttempts()
	{		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Limit attempts reached ! ");
		lblNewLabel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		lblNewLabel.setForeground(new Color(4, 109, 181));
		lblNewLabel.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\lock.png"));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(72, 210, 370, 64);
		panel.add(lblNewLabel);
		
		LimitAttempts_Exit = new JButton("Exit  ");
		LimitAttempts_Exit.setForeground(new Color(4, 109, 181));
		LimitAttempts_Exit.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		LimitAttempts_Exit.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\exit.png"));
		LimitAttempts_Exit.setFont(new Font("Tahoma", Font.PLAIN, 25));
		LimitAttempts_Exit.setForeground(new Color(4, 109, 181));
		LimitAttempts_Exit.setBounds(189, 331, 132, 49);
		LimitAttempts_Exit.addActionListener(this);
		panel.add(LimitAttempts_Exit);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\Cash.jpg"));
		lblNewLabel_1.setBounds(0, 0, 500, 500);
		panel.add(lblNewLabel_1);
		panel.setVisible(true);
		frmCashewBank.add(panel);
		frmCashewBank.setContentPane(panel);	
		
		frmCashewBank.validate();
		frmCashewBank.repaint();
	}
	public void Retrive_Enter_Amount()
	{		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 486, 463);
		panel.setLayout(null);
		
		JLabel enteramount = new JLabel("Enter the amount in TND:");
		enteramount.setForeground(new Color(4, 109, 181));
		enteramount.setFont(new Font("Tahoma", Font.BOLD, 19));
		enteramount.setBounds(147, 196, 245, 39);
		panel.add(enteramount);
		
		Retrive_Enter_Amount_textField = new JTextField();
		Retrive_Enter_Amount_textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Retrive_Enter_Amount_textField.setBounds(173, 245, 174, 30);
		panel.add(Retrive_Enter_Amount_textField);
		Retrive_Enter_Amount_textField.setColumns(10);
		
		Retrive_Enter_Amount_goback = new JButton("Go Back");
		Retrive_Enter_Amount_goback.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\reply.png"));
		Retrive_Enter_Amount_goback.setForeground(new Color(4, 109, 181));
		Retrive_Enter_Amount_goback.setFont(new Font("Tahoma", Font.BOLD, 16));
		Retrive_Enter_Amount_goback.setBounds(63, 323, 151, 49);
		Retrive_Enter_Amount_goback.addActionListener(this);
		panel.add(Retrive_Enter_Amount_goback);
		
		Retrive_Enter_Amount_Validate = new JButton("Validate");
		Retrive_Enter_Amount_Validate.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		Retrive_Enter_Amount_Validate.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\tick-mark.png"));
		Retrive_Enter_Amount_Validate.setForeground(new Color(4, 109, 181));
		Retrive_Enter_Amount_Validate.setFont(new Font("Tahoma", Font.BOLD, 16));
		Retrive_Enter_Amount_Validate.setBounds(303, 323, 126, 49);
		Retrive_Enter_Amount_Validate.addActionListener(this);
		panel.add(Retrive_Enter_Amount_Validate);
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\CashewBank1.png"));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setBounds(0, 0, 501, 477);
		panel.add(lblNewLabel);
		panel.setVisible(true);
		frmCashewBank.add(panel);
		frmCashewBank.setContentPane(panel);	
		
		frmCashewBank.validate();
		frmCashewBank.repaint();
	}
	public void Retrive_Success()
	{
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Task Done Seccsesfully ");
		lblNewLabel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		lblNewLabel.setForeground(new Color(4, 109, 181));
		lblNewLabel.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\check (1).png"));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setBounds(48, 213, 388, 60);
		panel.add(lblNewLabel);
		
		Retrive_Success_Back = new JButton(" Back To Menu ");
		Retrive_Success_Back.addActionListener(this);
		Retrive_Success_Back.setForeground(new Color(0, 168, 222));
		Retrive_Success_Back.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\reply.png"));
		Retrive_Success_Back.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Retrive_Success_Back.setBounds(10, 327, 245, 40);
		Retrive_Success_Back.addActionListener(this);
		panel.add(Retrive_Success_Back);
		
		Retrive_Success_Exit = new JButton("Exit ");
		Retrive_Success_Exit.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\exit.png"));
		Retrive_Success_Exit.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		Retrive_Success_Exit.setForeground(new Color(0, 168, 222));
		Retrive_Success_Exit.setFont(new Font("Tahoma", Font.PLAIN, 26));
		Retrive_Success_Exit.setBounds(304, 328, 172, 39);
		Retrive_Success_Exit.addActionListener(this);
		panel.add(Retrive_Success_Exit);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\Cash.jpg"));
		lblNewLabel_1.setBounds(0, 0, 500, 500);
		panel.add(lblNewLabel_1);
		panel.setVisible(true);
		frmCashewBank.add(panel);
		frmCashewBank.setContentPane(panel);	
		
		frmCashewBank.validate();
		frmCashewBank.repaint();
	}
	public void Deposit_Enter_Amount()
	{		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 486, 463);
		panel.setLayout(null);
		
		JLabel enteramount = new JLabel("Enter the amount in TND:");
		enteramount.setForeground(new Color(4, 109, 181));
		enteramount.setFont(new Font("Tahoma", Font.BOLD, 19));
		enteramount.setBounds(147, 196, 245, 39);
		panel.add(enteramount);
		
		Deposit_Enter_Amount_textField = new JTextField();
		Deposit_Enter_Amount_textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Deposit_Enter_Amount_textField.setBounds(173, 245, 174, 30);
		panel.add(Deposit_Enter_Amount_textField);
		Deposit_Enter_Amount_textField.setColumns(10);
		
		Deposit_Enter_Amount_goback = new JButton("Go Back");
		Deposit_Enter_Amount_goback.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\reply.png"));
		Deposit_Enter_Amount_goback.setForeground(new Color(4, 109, 181));
		Deposit_Enter_Amount_goback.setFont(new Font("Tahoma", Font.BOLD, 16));
		Deposit_Enter_Amount_goback.setBounds(63, 323, 151, 49);
		Deposit_Enter_Amount_goback.addActionListener(this);
		panel.add(Deposit_Enter_Amount_goback);
		
		Deposit_Enter_Amount_Validate = new JButton("Validate");
		Deposit_Enter_Amount_Validate.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		Deposit_Enter_Amount_Validate.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\tick-mark.png"));
		Deposit_Enter_Amount_Validate.setForeground(new Color(4, 109, 181));
		Deposit_Enter_Amount_Validate.setFont(new Font("Tahoma", Font.BOLD, 16));
		Deposit_Enter_Amount_Validate.setBounds(303, 323, 126, 49);
		Deposit_Enter_Amount_Validate.addActionListener(this);
		panel.add(Deposit_Enter_Amount_Validate);
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\CashewBank1.png"));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setBounds(0, 0, 501, 477);
		panel.add(lblNewLabel);
		panel.setVisible(true);
		frmCashewBank.add(panel);
		frmCashewBank.setContentPane(panel);	
		
		frmCashewBank.validate();
		frmCashewBank.repaint();
	}
	public void MinDeposit() {
		 panel = new JPanel();
		frmCashewBank.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel warning = new JLabel("The minimum of Deposit is 10 TND !");
		warning.setForeground(new Color(4, 109, 181));
		warning.setFont(new Font("Tahoma", Font.PLAIN, 22));
		warning.setBounds(64, 282, 399, 53);
		panel.add(warning);
		 retry = new JButton("  Retry");
		retry.setForeground(new Color(0, 168, 222));
		retry.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\reload.png"));
		retry.setFont(new Font("Tahoma", Font.PLAIN, 18));
		retry.setBounds(10, 366, 129, 38);
		panel.add(retry);
		retry.addActionListener(this);
		
		 exit = new JButton("Exit");
		exit.setForeground(new Color(0, 168, 222));
		exit.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		exit.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\exit.png"));
		exit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		exit.setBounds(334, 366, 129, 38);
		panel.add(exit);
		exit.addActionListener(this);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\error (1).png"));
		lblNewLabel.setBounds(213, 224, 74, 68);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\CashewBank1.png"));
		lblNewLabel_2.setBounds(0, 0, 500, 500);
		panel.add(lblNewLabel_2);
		panel.setVisible(true);
		frmCashewBank.add(panel);
		frmCashewBank.setContentPane(panel);	
		
		frmCashewBank.validate();
		frmCashewBank.repaint();
	}
	public void MinRetrieve() {
		 panel = new JPanel();
		frmCashewBank.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel warning = new JLabel("The minimum of Retrieve is 10 TND !");
		warning.setForeground(new Color(4, 109, 181));
		warning.setFont(new Font("Tahoma", Font.PLAIN, 22));
		warning.setBounds(64, 282, 399, 53);
		panel.add(warning);
		 retry = new JButton("  Retry");
		retry.setForeground(new Color(0, 168, 222));
		retry.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\reload.png"));
		retry.setFont(new Font("Tahoma", Font.PLAIN, 18));
		retry.setBounds(10, 366, 129, 38);
		panel.add(retry);
		retry.addActionListener(this);
		
		 exit = new JButton("Exit");
		exit.setForeground(new Color(0, 168, 222));
		exit.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		exit.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\exit.png"));
		exit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		exit.setBounds(334, 366, 129, 38);
		panel.add(exit);
		exit.addActionListener(this);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\error (1).png"));
		lblNewLabel.setBounds(213, 224, 74, 68);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\CashewBank1.png"));
		lblNewLabel_2.setBounds(0, 0, 500, 500);
		panel.add(lblNewLabel_2);
		panel.setVisible(true);
		frmCashewBank.add(panel);
		frmCashewBank.setContentPane(panel);	
		
		frmCashewBank.validate();
		frmCashewBank.repaint();
	}
	public void EmptyInput() {
		panel = new JPanel();
		frmCashewBank.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel warning = new JLabel("                Empty Input !");
		warning.setForeground(new Color(4, 109, 181));
		warning.setFont(new Font("Tahoma", Font.PLAIN, 22));
		warning.setBounds(64, 282, 399, 53);
		panel.add(warning);
		
		 retry = new JButton("  Retry");
		retry.setForeground(new Color(0, 168, 222));
		retry.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\reload.png"));
		retry.setFont(new Font("Tahoma", Font.PLAIN, 18));
		retry.setBounds(10, 366, 129, 38);
		panel.add(retry);
		retry.addActionListener(this);
		
		 exit = new JButton("Exit");
		exit.setForeground(new Color(0, 168, 222));
		exit.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		exit.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\exit.png"));
		exit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		exit.setBounds(334, 366, 129, 38);
		panel.add(exit);
		exit.addActionListener(this);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\error (1).png"));
		lblNewLabel.setBounds(213, 224, 74, 68);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\CashewBank1.png"));
		lblNewLabel_2.setBounds(0, 0, 500, 500);
		panel.add(lblNewLabel_2);
		panel.setVisible(true);
		frmCashewBank.add(panel);
		frmCashewBank.setContentPane(panel);	
		
		frmCashewBank.validate();
		frmCashewBank.repaint();
	}
	public void multiple() {
		panel = new JPanel();
		frmCashewBank.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel warning = new JLabel("amount must be a multiple of 10 !");
		warning.setForeground(new Color(4, 109, 181));
		warning.setFont(new Font("Tahoma", Font.PLAIN, 20));
		warning.setBounds(64, 282, 399, 53);
		panel.add(warning);
		
		 retry = new JButton("  Retry");
		retry.setForeground(new Color(0, 168, 222));
		retry.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\reload.png"));
		retry.setFont(new Font("Tahoma", Font.PLAIN, 18));
		retry.setBounds(10, 366, 129, 38);
		panel.add(retry);
		retry.addActionListener(this);
		
		 exit = new JButton("Exit");
		exit.setForeground(new Color(0, 168, 222));
		exit.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		exit.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\exit.png"));
		exit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		exit.setBounds(334, 366, 129, 38);
		panel.add(exit);
		exit.addActionListener(this);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\error (1).png"));
		lblNewLabel.setBounds(213, 224, 74, 68);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\CashewBank1.png"));
		lblNewLabel_2.setBounds(0, 0, 500, 500);
		panel.add(lblNewLabel_2);
		panel.setVisible(true);
		frmCashewBank.add(panel);
		frmCashewBank.setContentPane(panel);	
		
		frmCashewBank.validate();
		frmCashewBank.repaint();
	}
	public void EmptyInputCode() {
		panel = new JPanel();
		frmCashewBank.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel warning = new JLabel("                Empty Input !");
		warning.setForeground(new Color(4, 109, 181));
		warning.setFont(new Font("Tahoma", Font.PLAIN, 22));
		warning.setBounds(64, 282, 399, 53);
		panel.add(warning);
		
		 retryCode = new JButton("  Retry");
		 retryCode.setForeground(new Color(0, 168, 222));
		 retryCode.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\reload.png"));
		 retryCode.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 retryCode.setBounds(10, 366, 129, 38);
		panel.add(retryCode);
		retryCode.addActionListener(this);
		
		 exit = new JButton("Exit");
		exit.setForeground(new Color(0, 168, 222));
		exit.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		exit.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\exit.png"));
		exit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		exit.setBounds(334, 366, 129, 38);
		panel.add(exit);
		exit.addActionListener(this);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\error (1).png"));
		lblNewLabel.setBounds(213, 224, 74, 68);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\CashewBank1.png"));
		lblNewLabel_2.setBounds(0, 0, 500, 500);
		panel.add(lblNewLabel_2);
		panel.setVisible(true);
		frmCashewBank.add(panel);
		frmCashewBank.setContentPane(panel);	
		
		frmCashewBank.validate();
		frmCashewBank.repaint();
	}
	public void toolong() {
		panel = new JPanel();
		frmCashewBank.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel warning = new JLabel("Amount exceeds max limit(5 characters)!");
		warning.setForeground(new Color(4, 109, 181));
		warning.setFont(new Font("Tahoma", Font.PLAIN, 17));
		warning.setBounds(64, 282, 399, 53);
		panel.add(warning);
		
		 retry = new JButton("  Retry");
		retry.setForeground(new Color(0, 168, 222));
		retry.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\reload.png"));
		retry.setFont(new Font("Tahoma", Font.PLAIN, 18));
		retry.setBounds(10, 366, 129, 38);
		panel.add(retry);
		retry.addActionListener(this);
		
		 exit = new JButton("Exit");
		exit.setForeground(new Color(0, 168, 222));
		exit.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		exit.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\exit.png"));
		exit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		exit.setBounds(334, 366, 129, 38);
		panel.add(exit);
		exit.addActionListener(this);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\error (1).png"));
		lblNewLabel.setBounds(213, 224, 74, 68);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\CashewBank1.png"));
		lblNewLabel_2.setBounds(0, 0, 500, 500);
		panel.add(lblNewLabel_2);
		panel.setVisible(true);
		frmCashewBank.add(panel);
		frmCashewBank.setContentPane(panel);	
		
		frmCashewBank.validate();
		frmCashewBank.repaint();
	}
	public void insuffissantBalance() {
		panel = new JPanel();
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Insuffissant balance ! ");
		lblNewLabel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\cashless (1).png"));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel.setForeground(new Color(4, 109, 181));
		lblNewLabel.setBounds(81, 170, 358, 63);
		panel.add(lblNewLabel);
		
		retry = new JButton(" Retry");
		retry.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\reply.png"));
		retry.setFont(new Font("Tahoma", Font.PLAIN, 25));
		retry.setForeground(new Color(0, 168, 222));
		retry.setBounds(10, 347, 153, 52);
		panel.add(retry);
		retry.addActionListener(this);
		
		 exit = new JButton("Exit ");
		exit.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		exit.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\exit.png"));
		exit.setFont(new Font("Tahoma", Font.PLAIN, 25));
		exit.setForeground(new Color(0, 168, 222));
		exit.setBounds(357, 352, 119, 43);
		panel.add(exit);
		exit.addActionListener(this);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\Cash.jpg"));
		lblNewLabel_3.setBounds(0, 0, 494, 501);
		panel.add(lblNewLabel_3);
		panel.setVisible(true);
		frmCashewBank.add(panel);
		frmCashewBank.setContentPane(panel);	
		
		frmCashewBank.validate();
		frmCashewBank.repaint();
	}
	public void insuffissantBalanceAmountFixed() {
		panel = new JPanel();
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Insuffissant balance ! ");
		lblNewLabel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\cashless (1).png"));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel.setForeground(new Color(4, 109, 181));
		lblNewLabel.setBounds(81, 170, 358, 63);
		panel.add(lblNewLabel);
		
		Retrive_insuff_Back = new JButton(" Retry");
		Retrive_insuff_Back.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\reply.png"));
		Retrive_insuff_Back.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Retrive_insuff_Back.setForeground(new Color(0, 168, 222));
		Retrive_insuff_Back.setBounds(10, 347, 153, 52);
		panel.add(Retrive_insuff_Back);
		Retrive_insuff_Back.addActionListener(this);
		
		 exit = new JButton("Exit ");
		exit.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		exit.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\exit.png"));
		exit.setFont(new Font("Tahoma", Font.PLAIN, 25));
		exit.setForeground(new Color(0, 168, 222));
		exit.setBounds(357, 352, 119, 43);
		panel.add(exit);
		exit.addActionListener(this);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\Cash.jpg"));
		lblNewLabel_3.setBounds(0, 0, 494, 501);
		panel.add(lblNewLabel_3);
		panel.setVisible(true);
		frmCashewBank.add(panel);
		frmCashewBank.setContentPane(panel);	
		
		frmCashewBank.validate();
		frmCashewBank.repaint();
	}
	
	public void MaxReached() {
		 panel = new JPanel();
		frmCashewBank.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel warning = new JLabel("Maximum account limit reached !");
		warning.setForeground(new Color(4, 109, 181));
		warning.setFont(new Font("Tahoma", Font.PLAIN, 22));
		warning.setBounds(73, 286, 336, 53);
		panel.add(warning);
		
		retry = new JButton("  Retry");
		retry.setForeground(new Color(0, 168, 222));
		retry.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\reload.png"));
		retry.setFont(new Font("Tahoma", Font.PLAIN, 18));
		retry.setBounds(10, 366, 129, 38);
		panel.add(retry);
		retry.addActionListener(this);
		
		 exit = new JButton("Exit");
		exit.setForeground(new Color(0, 168, 222));
		exit.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		exit.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\exit.png"));
		exit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		exit.setBounds(330, 366, 129, 38);
		panel.add(exit);
		exit.addActionListener(this);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\error (1).png"));
		lblNewLabel.setBounds(213, 224, 74, 68);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\CashewBank1.png"));
		lblNewLabel_2.setBounds(0, 0, 500, 500);
		panel.add(lblNewLabel_2);
		panel.setVisible(true);
		frmCashewBank.add(panel);
		frmCashewBank.setContentPane(panel);	
		
		frmCashewBank.validate();
		frmCashewBank.repaint();
	}
	public void MaxReachedAmountFixed() {
		 panel = new JPanel();
		frmCashewBank.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel warning = new JLabel("Maximum account limit reached !");
		warning.setForeground(new Color(4, 109, 181));
		warning.setFont(new Font("Tahoma", Font.PLAIN, 22));
		warning.setBounds(73, 286, 336, 53);
		panel.add(warning);
		
		retry_max_reached_fixed = new JButton("  Retry");
		retry_max_reached_fixed .setForeground(new Color(0, 168, 222));
		retry_max_reached_fixed .setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\reload.png"));
		retry_max_reached_fixed .setFont(new Font("Tahoma", Font.PLAIN, 18));
		retry_max_reached_fixed .setBounds(10, 366, 129, 38);
		panel.add(retry_max_reached_fixed );
		retry_max_reached_fixed .addActionListener(this);
		
		 exit = new JButton("Exit");
		exit.setForeground(new Color(0, 168, 222));
		exit.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		exit.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\exit.png"));
		exit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		exit.setBounds(330, 366, 129, 38);
		panel.add(exit);
		exit.addActionListener(this);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\error (1).png"));
		lblNewLabel.setBounds(213, 224, 74, 68);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\nours\\eclipse-workspace\\interface_graphique\\src\\interface_graphique\\CashewBank1.png"));
		lblNewLabel_2.setBounds(0, 0, 500, 500);
		panel.add(lblNewLabel_2);
		panel.setVisible(true);
		frmCashewBank.add(panel);
		frmCashewBank.setContentPane(panel);	
		
		frmCashewBank.validate();
		frmCashewBank.repaint();
	}
	public void WrongLengthCode() {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Wrong length Code! ");
		lblNewLabel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		lblNewLabel.setForeground(new Color(4, 109, 181));
		lblNewLabel.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\alert-octagon.png"));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(91, 223, 301, 38);
		panel.add(lblNewLabel);
		
		Exit_Wrong_Code = new JButton("Exit ");
		Exit_Wrong_Code.setActionCommand("Exit ");
		Exit_Wrong_Code.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		Exit_Wrong_Code.setForeground(new Color(0, 168, 222));
		Exit_Wrong_Code.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\exit.png"));
		Exit_Wrong_Code.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Exit_Wrong_Code.setBounds(301, 341, 149, 47);
		panel.add(Exit_Wrong_Code);
		Exit_Wrong_Code.addActionListener(this);
		
		Retry_Wrong_Code = new JButton(" Retry");
		Retry_Wrong_Code.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		Retry_Wrong_Code.setForeground(new Color(0, 168, 222));
		Retry_Wrong_Code.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Retry_Wrong_Code.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\reload.png"));
		Retry_Wrong_Code.setBounds(34, 341, 149, 47);
		panel.add(Retry_Wrong_Code);
		Retry_Wrong_Code.addActionListener(this);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\\\Users\\\\nours\\\\eclipse-workspace\\\\interface_graphique\\\\src\\\\interface_graphique\\\\Cash.jpg"));
		lblNewLabel_1.setBounds(0, 0, 500, 500);
		panel.add(lblNewLabel_1);

		panel.setVisible(true);
		frmCashewBank.add(panel);
		frmCashewBank.setContentPane(panel);	
		
		frmCashewBank.validate();
		frmCashewBank.repaint();
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==Enter_Code_PIN) 
		{	
    		String Field = PIN_INPUT.getText();
    		if (Field.length()==0)
    		{
    			EmptyInputCode();
    		}else {
    			if(Field.length()!=4){
    				WrongLengthCode();
    			}else {
    				if(Field.matches("\\d+")) {
    					byte data []=new byte[Field.length()];
    		    		for (int i=Field.length()-1 ; i>=0 ; i--)
    		    		{
    		    		    try {
    		    		    	data[i]=  Byte.parseByte(String.valueOf(Field.charAt(i)) );
    		    		    } catch (NumberFormatException nfe) {
    		    		    	WrongInput();
    		    		    	break;
    		    		}}
    				
    					try {
    						apdu=client.Msg( (byte) 0x40, (byte) 0x7f,data,(byte) 0x05);
    					} catch (IOException e1) {
    						System.out.print("here");
    						e1.printStackTrace();
    					} catch (CadTransportException e1) {
    						System.out.print("here2");
    						e1.printStackTrace();
    					}
    					if (apdu.getStatus() == 0x9000) 
    					{Distributeur();} 
    					else if (apdu.dataOut[0]==0) 
    					{LimitAttempts();}
    					else 	
    					{WrongCode();}
    				}else {WrongInputCode();}
    			}
    		}
    		
		}
		if(e.getSource()==retryCode) {
			ATM();
		}
		if(e.getSource()==Exit_Code_PIN)
		{
			client.Deselect();
			System.exit(0);
			
		}
		if (e.getSource()==Retry_Wrong_Code)
		{
			ATM();
		}
		if (e.getSource() ==Exit_Wrong_Code)
		{
			client.Deselect();
			System.exit(0);
		}
		if(e.getSource()==WrongInput_Retry)
		{
			ATM();
		}
		if(e.getSource()==WrongInput_Exit)
		{
			client.Deselect();
			System.exit(0);
		}
		if (e.getSource()==LimitAttempts_Exit)
		{
			client.Deselect();
			System.exit(0);
		}
		//Retrieve Money
		if(e.getSource()==Retrieve)
		{
			Retrivemoney();
		}
		if(e.getSource()==Retrivemoney_dix )
		{	try {
		            apdu=client.Msg( (byte) 0x20, (byte) 0x7f,null,(byte) 0x00);
		        } catch (IOException e1) {
		            e1.printStackTrace();
		        } catch (CadTransportException e1) {
		            e1.printStackTrace();
		        }
		        byte c []= new byte[5];
		        c=apdu.dataOut;
		        int aux=10000;
		        int x=0;
		        for (int i=0 ; i<c.length ; i++)
		        {
		            x=x+c[i]*aux;
		            aux=aux/10;
		        }
			
			
			if(x<10) {
				insuffissantBalanceAmountFixed();
				
			}else {
				try {
					apdu=client.Msg( (byte) 0x01, (byte) 0x7f,null,(byte) 0x00);
				} catch (IOException e1) {
					System.out.print("here");
					e1.printStackTrace();
				} catch (CadTransportException e1) {
					System.out.print("here2");
					e1.printStackTrace();
				}
				if (apdu.getStatus() == 0x9000) 
				{Retrive_Success();} 
			}
			
		}
		if(e.getSource()==Retrivemoney_vingt)
		{
			try {
	            apdu=client.Msg( (byte) 0x20, (byte) 0x7f,null,(byte) 0x00);
	        } catch (IOException e1) {
	            e1.printStackTrace();
	        } catch (CadTransportException e1) {
	            e1.printStackTrace();
	        }
	        byte c []= new byte[5];
	        c=apdu.dataOut;
	        int aux=10000;
	        int x=0;
	        for (int i=0 ; i<c.length ; i++)
	        {
	            x=x+c[i]*aux;
	            aux=aux/10;
	        }
		
		
		if(x<20) {
			insuffissantBalanceAmountFixed();
			
		}else {
			try {
				apdu=client.Msg( (byte) 0x02, (byte) 0x7f,null,(byte) 0x00);
			} catch (IOException e1) {
				System.out.print("here");
				e1.printStackTrace();
			} catch (CadTransportException e1) {
				System.out.print("here2");
				e1.printStackTrace();
			}
			if (apdu.getStatus() == 0x9000) 
			{Retrive_Success();} 
		}
		
		}
		if(e.getSource()==Retrivemoney_khamsin) {
			try {
	            apdu=client.Msg( (byte) 0x20, (byte) 0x7f,null,(byte) 0x00);
	        } catch (IOException e1) {
	            e1.printStackTrace();
	        } catch (CadTransportException e1) {
	            e1.printStackTrace();
	        }
	        byte c []= new byte[5];
	        c=apdu.dataOut;
	        int aux=10000;
	        int x=0;
	        for (int i=0 ; i<c.length ; i++)
	        {
	            x=x+c[i]*aux;
	            aux=aux/10;
	        }
		
		
		if(x<50) {
			insuffissantBalanceAmountFixed();
			
		}else {
			try {
				apdu=client.Msg( (byte) 0x03, (byte) 0x7f,null,(byte) 0x00);
			} catch (IOException e1) {
				System.out.print("here");
				e1.printStackTrace();
			} catch (CadTransportException e1) {
				System.out.print("here2");
				e1.printStackTrace();
			}
			if (apdu.getStatus() == 0x9000) 
			{Retrive_Success();} 
		}
		}
		if(e.getSource()==Retrivemoney_cent )
		{
			try {
	            apdu=client.Msg( (byte) 0x20, (byte) 0x7f,null,(byte) 0x00);
	        } catch (IOException e1) {
	            e1.printStackTrace();
	        } catch (CadTransportException e1) {
	            e1.printStackTrace();
	        }
	        byte c []= new byte[5];
	        c=apdu.dataOut;
	        int aux=10000;
	        int x=0;
	        for (int i=0 ; i<c.length ; i++)
	        {
	            x=x+c[i]*aux;
	            aux=aux/10;
	        }
		
		
		if(x<100) {
			insuffissantBalanceAmountFixed();
			
		}else {
			try {
				apdu=client.Msg( (byte) 0x04, (byte) 0x7f,null,(byte) 0x00);
			} catch (IOException e1) {
				System.out.print("here");
				e1.printStackTrace();
			} catch (CadTransportException e1) {
				System.out.print("here2");
				e1.printStackTrace();
			}
			if (apdu.getStatus() == 0x9000) 
			{Retrive_Success();} 
		}
		
		}
		if(e.getSource()==Retrivemoney_mytyn) {
			try {
	            apdu=client.Msg( (byte) 0x20, (byte) 0x7f,null,(byte) 0x00);
	        } catch (IOException e1) {
	            e1.printStackTrace();
	        } catch (CadTransportException e1) {
	            e1.printStackTrace();
	        }
	        byte c []= new byte[5];
	        c=apdu.dataOut;
	        int aux=10000;
	        int x=0;
	        for (int i=0 ; i<c.length ; i++)
	        {
	            x=x+c[i]*aux;
	            aux=aux/10;
	        }
		
		
		if(x<200) {
			insuffissantBalanceAmountFixed();
			
		}else {
			try {
				apdu=client.Msg( (byte) 0x05, (byte) 0x7f,null,(byte) 0x00);
			} catch (IOException e1) {
				System.out.print("here");
				e1.printStackTrace();
			} catch (CadTransportException e1) {
				System.out.print("here2");
				e1.printStackTrace();
			}
			if (apdu.getStatus() == 0x9000) 
			{Retrive_Success();} 
		}
	}
		if(e.getSource()==Retrive_Enter_Amount_goback)
		{
			Retrivemoney();
		}
		if(e.getSource()==Retrivemoney_custom )
		{
			Retrive_Enter_Amount();
		}
		
		
		if (e.getSource()==Retrive_Enter_Amount_Validate)
		{	 String Field = Retrive_Enter_Amount_textField.getText(); 
					
					try {
			             apdu=client.Msg( (byte) 0x20, (byte) 0x7f,null,(byte) 0x00);
			         } catch (IOException e1) {
			             e1.printStackTrace();
			         } catch (CadTransportException e1) {
			             e1.printStackTrace();
			         }
			         byte c []= new byte[5];
			         c=apdu.dataOut;
			         int aux=10000;
			         int x=0;
			         for (int i=0 ; i<c.length ; i++)
			         {
			             x=x+c[i]*aux;
			             aux=aux/10;
			         }
						
			
    		
    		if (Field.length()==0  )
    		{ System.out.println(Field.length());
    			EmptyInput();}
    		else if(Field.length()>5) 
		    	{toolong(); }
    		else {
    			int y=0;
    			try {
    				y=Integer.parseInt(Field);
    			}
    			catch(NumberFormatException nfe) {
    				System.out.println("NumberFormatException: " + nfe.getMessage());
    				WrongInputRetrieve();
    				return;
    			}
    			if(Integer.parseInt(Field)<10) 
        		{MinRetrieve();}
        		else if(Integer.parseInt(Field)>x)
    			{System.out.println("testt");
    			 insuffissantBalance();}
        		else {
        			byte data []=new byte[5];
					 for (int i=0 ; i<=Field.length()-1 ; i++)
			 		{
			 		    try {
			 		    	data[ data.length-1-i]=  Byte.parseByte(String.valueOf(Field.charAt(Field.length()-1-i)) );
			 		    } catch (NumberFormatException nfe) {
			 		    	WrongInput();
			 		    	break;
			 		}}
					 if (data[4]!=0x00) {multiple();}
					 else {
						try {
							apdu=client.Msg( (byte) 0x06, (byte) 0x7f,data,(byte) 0x05);
						} catch (IOException e1) {
							System.out.print("here");
							e1.printStackTrace();
						} catch (CadTransportException e1) {
							System.out.print("here2");
							e1.printStackTrace();
						}
						if (apdu.getStatus() == 0x9000) 
						{Retrive_Success();} 
					 }
        		}
    			
				
    		}

    					
    	}
		if (e.getSource()==retry)
		{
			Retrive_Enter_Amount();
		}
		if (e.getSource()==exit)
		{
			System.exit(0);
		}
		if (e.getSource()==Retrive_Success_Exit)
		{
			client.Deselect();
			System.exit(0);
		}
		if (e.getSource()==Retrive_Success_Back)
		{
			Retrivemoney();
		}
		if (e.getSource()==Retrive_insuff_Back)
		{
			Retrivemoney();
		}
		if (e.getSource()==Retrivemoney_back) {
			Distributeur();
		}
		if(e.getSource()==retry_eneter_amount) {
			Retrive_Enter_Amount();
		}
		//balance check
		if(e.getSource()==checkbalance)
		{
			Balance();
			try {
                apdu=client.Msg( (byte) 0x20, (byte) 0x7f,null,(byte) 0x00);
            } catch (IOException e1) {
                e1.printStackTrace();
            } catch (CadTransportException e1) {
                e1.printStackTrace();
            }
            byte c []= new byte[5];
            c=apdu.dataOut;
            int aux=10000;
            int x=0;
            for (int i=0 ; i<c.length ; i++)
            {
                x=x+c[i]*aux;
                aux=aux/10;
            }
            enteramount.setText("Your Balance in TND :"+x);
		}
		if(e.getSource()==Balance_goback)
		{
			Distributeur();
		}
		if(e.getSource()==Balance_exit)
		{
			client.Deselect();
			System.exit(0);
		}
		//*********************Apropos********************
		if(e.getSource()==journal) {
			Apropos();
		}
		if(e.getSource()==goback)
		{
			Distributeur();
		}
		if(e.getSource()==contactnour) {
			ContactNour();
		}
		if(e.getSource()==Gobackapropos) {
			Apropos();
		}
		if(e.getSource()==contactahmed) {
			ContactAhmed();
		}
		
	
		//*****************Cash Deposit************************
		
		if(e.getSource()==cashdeposit)
		{
			Cashdeposit();
		}
		if(e.getSource()==Deposit_dix )
		{
			try {
	            apdu=client.Msg( (byte) 0x20, (byte) 0x7f,null,(byte) 0x00);
	        } catch (IOException e1) {
	            e1.printStackTrace();
	        } catch (CadTransportException e1) {
	            e1.printStackTrace();
	        }
	        byte c []= new byte[5];
	        c=apdu.dataOut;
	        int aux=10000;
	        int x=0;
	        for (int i=0 ; i<c.length ; i++)
	        {
	            x=x+c[i]*aux;
	            aux=aux/10;
	        }
		
		int y=x+10;
		if(y>10000) {
			MaxReachedAmountFixed();
			
		}else {
			try {
				apdu=client.Msg( (byte) 0x11, (byte) 0x7f,null,(byte) 0x00);
			} catch (IOException e1) {
				System.out.print("here");
				e1.printStackTrace();
			} catch (CadTransportException e1) {
				System.out.print("here2");
				e1.printStackTrace();
			}
			if (apdu.getStatus() == 0x9000) 
			{Retrive_Success();} 
				}
		}
		if(e.getSource()==Deposit_vingt)
		{
			try {
	            apdu=client.Msg( (byte) 0x20, (byte) 0x7f,null,(byte) 0x00);
	        } catch (IOException e1) {
	            e1.printStackTrace();
	        } catch (CadTransportException e1) {
	            e1.printStackTrace();
	        }
	        byte c []= new byte[5];
	        c=apdu.dataOut;
	        int aux=10000;
	        int x=0;
	        for (int i=0 ; i<c.length ; i++)
	        {
	            x=x+c[i]*aux;
	            aux=aux/10;
	        }
		
		int y=x+20;
		if(y>10000) {
			MaxReachedAmountFixed();
			
		}else {
			try {
				apdu=client.Msg( (byte) 0x12, (byte) 0x7f,null,(byte) 0x00);
			} catch (IOException e1) {
				System.out.print("here");
				e1.printStackTrace();
			} catch (CadTransportException e1) {
				System.out.print("here2");
				e1.printStackTrace();
			}
			if (apdu.getStatus() == 0x9000) 
			{Retrive_Success();} 
				}
		}
		if(e.getSource()==Deposit_khamsin )
		{
			try {
	            apdu=client.Msg( (byte) 0x20, (byte) 0x7f,null,(byte) 0x00);
	        } catch (IOException e1) {
	            e1.printStackTrace();
	        } catch (CadTransportException e1) {
	            e1.printStackTrace();
	        }
	        byte c []= new byte[5];
	        c=apdu.dataOut;
	        int aux=10000;
	        int x=0;
	        for (int i=0 ; i<c.length ; i++)
	        {
	            x=x+c[i]*aux;
	            aux=aux/10;
	        }
		
		int y=x+50;
		if(y>10000) {
			MaxReachedAmountFixed();
			
		}else {
			try {
				apdu=client.Msg( (byte) 0x13, (byte) 0x7f,null,(byte) 0x00);
			} catch (IOException e1) {
				System.out.print("here");
				e1.printStackTrace();
			} catch (CadTransportException e1) {
				System.out.print("here2");
				e1.printStackTrace();
			}
			if (apdu.getStatus() == 0x9000) 
			{Retrive_Success();} 
				}
		}
		if(e.getSource()==Deposit_cent) {
			try {
	            apdu=client.Msg( (byte) 0x20, (byte) 0x7f,null,(byte) 0x00);
	        } catch (IOException e1) {
	            e1.printStackTrace();
	        } catch (CadTransportException e1) {
	            e1.printStackTrace();
	        }
	        byte c []= new byte[5];
	        c=apdu.dataOut;
	        int aux=10000;
	        int x=0;
	        for (int i=0 ; i<c.length ; i++)
	        {
	            x=x+c[i]*aux;
	            aux=aux/10;
	        }
		
		int y=x+100;
		if(y>10000) {
			MaxReachedAmountFixed();
			
		}else {
			try {
				apdu=client.Msg( (byte) 0x14, (byte) 0x7f,null,(byte) 0x00);
			} catch (IOException e1) {
				System.out.print("here");
				e1.printStackTrace();
			} catch (CadTransportException e1) {
				System.out.print("here2");
				e1.printStackTrace();
			}
			if (apdu.getStatus() == 0x9000) 
			{Retrive_Success();} 
				}
		}
		if(e.getSource()==Deposit_mytyn )
		{
			try {
	            apdu=client.Msg( (byte) 0x20, (byte) 0x7f,null,(byte) 0x00);
	        } catch (IOException e1) {
	            e1.printStackTrace();
	        } catch (CadTransportException e1) {
	            e1.printStackTrace();
	        }
	        byte c []= new byte[5];
	        c=apdu.dataOut;
	        int aux=10000;
	        int x=0;
	        for (int i=0 ; i<c.length ; i++)
	        {
	            x=x+c[i]*aux;
	            aux=aux/10;
	        }
		
		int y=x+200;
		if(y>10000) {
			MaxReachedAmountFixed();
			
		}else {
			try {
				apdu=client.Msg( (byte) 0x15, (byte) 0x7f,null,(byte) 0x00);
			} catch (IOException e1) {
				System.out.print("here");
				e1.printStackTrace();
			} catch (CadTransportException e1) {
				System.out.print("here2");
				e1.printStackTrace();
			}
			if (apdu.getStatus() == 0x9000) 
			{Retrive_Success();} 
				}
		}
		if(e.getSource()==Deposit_custom )
		{
			Deposit_Enter_Amount();
		}
		if(e.getSource()==retry_max_reached_fixed ) {
			Cashdeposit();
		}
		if(e.getSource()==Deposit_back )
		{ 
			Distributeur();
		}
		if (e.getSource()==Deposit_Enter_Amount_goback)
		{
			Cashdeposit();
		}
		if (e.getSource()==Deposit_Enter_Amount_Validate)
		{

	    		String Field = Deposit_Enter_Amount_textField.getText();
	    		try {
		             apdu=client.Msg( (byte) 0x20, (byte) 0x7f,null,(byte) 0x00);
		         } catch (IOException e1) {
		             e1.printStackTrace();
		         } catch (CadTransportException e1) {
		             e1.printStackTrace();
		         }
		         byte c []= new byte[5];
		         c=apdu.dataOut;
		         int aux=10000;
		         int x=0;
		         for (int i=0 ; i<c.length ; i++)
		         {
		             x=x+c[i]*aux;
		             aux=aux/10;
		         }
					
	
			
			if (Field.length()==0  )
			{ System.out.println(Field.length());
				EmptyInput();}
			else if(Field.length()>5) 
		   	{toolong(); }
			else {
				int y=0;
				try {
					y=Integer.parseInt(Field);
				}
				catch(NumberFormatException nfe) {
					System.out.println("NumberFormatException: " + nfe.getMessage());
					WrongInputRetrieve();
					return;
				}
				if(Integer.parseInt(Field)<10) 
				{MinDeposit();}
				else if(Integer.parseInt(Field)+x>10000)
				{
				MaxReached();}
				else {
					byte data []=new byte[5];
					 for (int i=0 ; i<=Field.length()-1 ; i++)
			 		{
			 		    try {
			 		    	data[ data.length-1-i]=  Byte.parseByte(String.valueOf(Field.charAt(Field.length()-1-i)) );
			 		    } catch (NumberFormatException nfe) {
			 		    	WrongInput();
			 		    	break;
			 		}}
					 if (data[4]!=0x00) {multiple();}
					 else {
						try {
							apdu=client.Msg( (byte) 0x16, (byte) 0x7f,data,(byte) 0x05);
						} catch (IOException e1) {
							System.out.print("here");
							e1.printStackTrace();
						} catch (CadTransportException e1) {
							System.out.print("here2");
							e1.printStackTrace();
						}
						if (apdu.getStatus() == 0x9000) 
						{Retrive_Success();} 
					 }
				}
				
			
			}

			
		}
		
		
		
	}

}
