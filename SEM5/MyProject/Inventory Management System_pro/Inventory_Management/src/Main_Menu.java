import java.awt.EventQueue;   


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import java.awt.*;
public class Main_Menu {

	private JFrame frmMainMenu;
	 private JPanel contentPane;  
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
	//	UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Menu window = new Main_Menu();
					window.frmMainMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	@SuppressWarnings("serial")
	public Main_Menu() {
		
		frmMainMenu = new JFrame();
		frmMainMenu.setIconImage(Toolkit.getDefaultToolkit().getImage(Main_Menu.class.getResource("/images/open.png")));
		frmMainMenu.getContentPane().setBackground(Color.BLACK);
		frmMainMenu.setBackground(Color.BLACK);
		frmMainMenu.getContentPane().setForeground(Color.WHITE);
		frmMainMenu.setType(Type.POPUP);
		frmMainMenu.setTitle("Main Menu");
		frmMainMenu.setResizable(false);
		frmMainMenu.setBounds(0,0, 1380, 798);
		contentPane = new JPanel() {  
			                public void paintComponent(Graphics g) {  
			                     Image img = Toolkit.getDefaultToolkit().getImage(  
			                    		 Main_Menu.class.getResource("Image/MM_I2.png"));  
		                    g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
		                 }  
			           };  
		frmMainMenu.setContentPane(contentPane);
//		JLabel background = new JLabel("",new ImageIcon("C:\\Project_Inventory\\Inventory_Mangment\\src\\Image\\MM_I2.png"),JLabel.CENTER);
//		background.setBounds(0, 0, 1380,798);
//		frmMainMenu.add(background);
//		JLabel label = new JLabel(new ImageIcon("C:\\Project_Inventory\\Inventory_Mangment\\src\\Image\\MM_I2.png"));
	
		frmMainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMainMenu.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frmMainMenu.getContentPane().setLayout(null);
		
		JButton btn_purchase = new JButton("Purchase");
		btn_purchase.setIcon(new ImageIcon(Main_Menu.class.getResource("/images/open.png")));
		btn_purchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Purchase_Billing.main(null);
				frmMainMenu.setVisible(false);
			}
		});
		btn_purchase.setForeground(new Color(0, 0, 51));
		btn_purchase.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_purchase.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_purchase.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn_purchase.setBackground(new Color(255, 255, 255)); 
		btn_purchase.setBounds(1013, 144, 190, 40);
		frmMainMenu.getContentPane().add(btn_purchase);
		
		JButton btn_ManageIteam = new JButton("Manage Iteam");
		btn_ManageIteam.setIcon(new ImageIcon(Main_Menu.class.getResource("/images/all.png")));
		btn_ManageIteam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Manage_Items.main(null);
				frmMainMenu.setVisible(false);
			}
		});
		btn_ManageIteam.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_ManageIteam.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_ManageIteam.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn_ManageIteam.setBackground(new Color(255, 255, 255));
		btn_ManageIteam.setBounds(1013, 267, 190, 40);
		frmMainMenu.getContentPane().add(btn_ManageIteam);
		
		JButton btn_ManageCustomers = new JButton("Manage Customers");
		btn_ManageCustomers.setIcon(new ImageIcon(Main_Menu.class.getResource("/images/users.png")));
		btn_ManageCustomers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manage_Customer.main(null);
				frmMainMenu.setVisible(false);
			}
		});
		btn_ManageCustomers.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_ManageCustomers.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_ManageCustomers.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn_ManageCustomers.setBackground(new Color(255, 255, 255));
		btn_ManageCustomers.setBounds(1013, 327, 190, 40);
		frmMainMenu.getContentPane().add(btn_ManageCustomers);
		
		JButton btn_ManageSupplayer = new JButton("Manage Supplier");
		btn_ManageSupplayer.setIcon(new ImageIcon(Main_Menu.class.getResource("/images/users.png")));
		btn_ManageSupplayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Manage_Supplier.main(null);
			frmMainMenu.setVisible(false);
			}
		});
		btn_ManageSupplayer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_ManageSupplayer.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_ManageSupplayer.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn_ManageSupplayer.setBackground(new Color(255, 255, 255));
		btn_ManageSupplayer.setBounds(1013, 388, 190, 40);
		frmMainMenu.getContentPane().add(btn_ManageSupplayer);
		
		JButton btn_PurchaseData= new JButton("Purchase Reports");
		btn_PurchaseData.setIcon(new ImageIcon(Main_Menu.class.getResource("/images/report.png")));
		btn_PurchaseData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PurchaseData.main(null);
				frmMainMenu.setVisible(false);
			}
		});
		btn_PurchaseData.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_PurchaseData.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_PurchaseData.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn_PurchaseData.setBackground(new Color(255, 255, 255));
		btn_PurchaseData.setBounds(1013, 456, 190, 40);
		frmMainMenu.getContentPane().add(btn_PurchaseData);
		
		JButton btn_SallingData= new JButton("Salling Reports");
		btn_SallingData.setIcon(new ImageIcon(Main_Menu.class.getResource("/images/report.png")));
		btn_SallingData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SallingData.main(null);
				frmMainMenu.setVisible(false);
			}
		});
		btn_SallingData.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_SallingData.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_SallingData.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn_SallingData.setBackground(new Color(255, 255, 255));
		btn_SallingData.setBounds(1013, 520, 190, 40);
		frmMainMenu.getContentPane().add(btn_SallingData);
		
		JButton btn_AvailableStock = new JButton("Available Stock");
		btn_AvailableStock.setIcon(new ImageIcon(Main_Menu.class.getResource("/images/report.png")));
		btn_AvailableStock.setSelectedIcon(null);
		btn_AvailableStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Current_Stock.main(null);
				frmMainMenu.setVisible(false);
			}
		});
		btn_AvailableStock.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_AvailableStock.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_AvailableStock.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn_AvailableStock.setBackground(new Color(255, 255, 255));
		btn_AvailableStock.setBounds(1013, 587, 190, 40);
		frmMainMenu.getContentPane().add(btn_AvailableStock);
		
		JButton btn_LogOut = new JButton("Log Out");
		btn_LogOut.setIcon(new ImageIcon(Main_Menu.class.getResource("/images/return.png")));
		btn_LogOut.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_LogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Login.main(null);
			frmMainMenu.setVisible(false);
			}
		});
		btn_LogOut.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn_LogOut.setBackground(new Color(255, 255, 255));
		btn_LogOut.setBounds(1013, 653, 190, 40);
		frmMainMenu.getContentPane().add(btn_LogOut);
		
		JButton btn_Salling = new JButton("Salling");
		btn_Salling.setIcon(new ImageIcon(Main_Menu.class.getResource("/images/open.png")));
		btn_Salling.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Salling_Billing.main(null);
			frmMainMenu.setVisible(false);
			}
		});
		btn_Salling.setForeground(new Color(0, 0, 51));
		btn_Salling.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btn_Salling.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_Salling.setBackground(Color.WHITE);
		btn_Salling.setBounds(1013, 204, 190, 40);
		frmMainMenu.getContentPane().add(btn_Salling);
		
		
		
	}
}
