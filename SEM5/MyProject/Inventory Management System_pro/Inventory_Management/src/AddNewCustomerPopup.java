	import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;

import com.mysql.jdbc.Connection;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class AddNewCustomerPopup {

	private JFrame frmAddNewCustomer;
	private JTextField txt_CustID;
	private JTextField txt_CstGSTno;
	private JTextField txt_CstAddress;
	private JTextField txt_CstState;
	private JTextField txt_CstShopName;
	private JTextField txt_CusName;
	private JTextField txt_CstMoblie;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddNewCustomerPopup window = new AddNewCustomerPopup();
					window.frmAddNewCustomer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public AddNewCustomerPopup() {
		initialize();
	}

	
	private void initialize() {
		frmAddNewCustomer = new JFrame();
		frmAddNewCustomer.getContentPane().setBackground(Color.DARK_GRAY);
		frmAddNewCustomer.setIconImage(Toolkit.getDefaultToolkit().getImage(AddNewCustomerPopup.class.getResource("/images/users.png")));
		frmAddNewCustomer.setTitle("Add New Customer Popup");
		frmAddNewCustomer.setBounds(470, 0, 542, 794);
		frmAddNewCustomer.setResizable(false);
		frmAddNewCustomer.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmAddNewCustomer.setResizable(false);
		JPanel contentPane = new JPanel() {  
		public void paintComponent(Graphics g) {  
            Image img = Toolkit.getDefaultToolkit().getImage(  
           		 Main_Menu.class.getResource("Image/P2.jpg"));  
       g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
    }  
  };  
  		frmAddNewCustomer.setContentPane(contentPane);
		frmAddNewCustomer.getContentPane().setLayout(null);
		
		JPanel pnl_customer = new JPanel();
		pnl_customer.setLayout(null);
		pnl_customer.setForeground(Color.BLACK);
		pnl_customer.setBorder(new LineBorder(Color.WHITE, 2, true));
		
		pnl_customer.setBackground(Color.BLACK);
		pnl_customer.setBounds(30, 32, 461, 683);
		pnl_customer.setBackground(new Color(0,0,0,65));
		frmAddNewCustomer.getContentPane().add(pnl_customer);
		
		JLabel lbl_CustID = new JLabel("Custmor ID ");
		lbl_CustID.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_CustID.setForeground(Color.WHITE);
		lbl_CustID.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lbl_CustID.setBounds(22, 83, 155, 41);
	
			pnl_customer.add(lbl_CustID);
		
		JLabel lbl_Custname = new JLabel("Customer Name");
		lbl_Custname.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_Custname.setForeground(Color.WHITE);
		lbl_Custname.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lbl_Custname.setBounds(22, 144, 155, 41);
		pnl_customer.add(lbl_Custname);
		
		JLabel lbl_GSTNo = new JLabel("GST No");
		lbl_GSTNo.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_GSTNo.setForeground(Color.WHITE);
		lbl_GSTNo.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lbl_GSTNo.setBounds(20, 308, 155, 41);
		pnl_customer.add(lbl_GSTNo);
		
		JLabel lbl_MoblieNo = new JLabel("Moblie No");
		lbl_MoblieNo.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_MoblieNo.setForeground(Color.WHITE);
		lbl_MoblieNo.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lbl_MoblieNo.setBounds(20, 253, 155, 41);
		pnl_customer.add(lbl_MoblieNo);
		
		JLabel lbl_CustShopName = new JLabel("Shop Name");
		lbl_CustShopName.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_CustShopName.setForeground(Color.WHITE);
		lbl_CustShopName.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lbl_CustShopName.setBounds(20, 359, 155, 41);
		pnl_customer.add(lbl_CustShopName);
		
		txt_CustID = new JTextField();
	
		txt_CustID.setEditable(false);
		txt_CustID.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txt_CustID.setColumns(10);
		txt_CustID.setBounds(185, 87, 253, 34);
		try {
			Class.forName("com.mysql.jdbc.Driver");
		   	Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
		
		   	ResultSet rsl =conn.createStatement().executeQuery("SELECT * FROM `tbl_customer` ORDER BY `tbl_customer`.`CstID` ASC");
			while(rsl.next())
			{
				String NI=String.valueOf(Integer.parseInt(rsl.getString("CstId"))+1);
				if(rsl.getString("CstId")=="")
				{
					txt_CustID.setText("1");
				}else
				{
					txt_CustID.setText(NI);
				}
					
			}	}
		catch(Exception e1)
		{
			JOptionPane.showMessageDialog(null,"Something is Wrong");
			System.out.println("Error : "+e1.toString());
		}
		pnl_customer.add(txt_CustID);
		
		txt_CstGSTno = new JTextField();
		txt_CstGSTno.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txt_CstGSTno.setColumns(10);
		txt_CstGSTno.setBounds(185, 312, 253, 34);
		pnl_customer.add(txt_CstGSTno);
		
		txt_CstAddress = new JTextField();
		txt_CstAddress.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txt_CstAddress.setColumns(10);
		txt_CstAddress.setBounds(185, 199, 253, 34);
		pnl_customer.add(txt_CstAddress);
		
		txt_CstState = new JTextField();
		txt_CstState.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txt_CstState.setColumns(10);
		txt_CstState.setBounds(185, 427, 253, 34);
		pnl_customer.add(txt_CstState);
		
		JLabel lbl_CustState = new JLabel("State");
		lbl_CustState.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_CustState.setForeground(Color.WHITE);
		lbl_CustState.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lbl_CustState.setBounds(20, 423, 155, 41);
		pnl_customer.add(lbl_CustState);
		
		txt_CstShopName = new JTextField();
		txt_CstShopName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txt_CstShopName.setColumns(10);
		txt_CstShopName.setBounds(185, 366, 253, 34);
		pnl_customer.add(txt_CstShopName);
		
		JLabel lbl_CustRemark = new JLabel("Remarks :");
		lbl_CustRemark.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_CustRemark.setForeground(Color.WHITE);
		lbl_CustRemark.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lbl_CustRemark.setBounds(39, 484, 138, 41);
		pnl_customer.add(lbl_CustRemark);
		
		JLabel lbl_CustAddress = new JLabel("Address");
		lbl_CustAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_CustAddress.setForeground(Color.WHITE);
		lbl_CustAddress.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lbl_CustAddress.setBounds(20, 195, 155, 41);
		pnl_customer.add(lbl_CustAddress);
		
		JTextArea txtA_custRemark = new JTextArea();
		txtA_custRemark.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtA_custRemark.setBounds(185, 484, 253, 107);
		pnl_customer.add(txtA_custRemark);
		
		txt_CusName = new JTextField();
		txt_CusName.setFont(new Font("Times New Roman", Font.PLAIN, 20)); 
		txt_CusName.setColumns(10);
		txt_CusName.setBounds(185, 144, 253, 34);
		pnl_customer.add(txt_CusName);
		
		txt_CstMoblie = new JTextField();
		txt_CstMoblie.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txt_CstMoblie.setColumns(10);
		txt_CstMoblie.setBounds(185, 257, 253, 34);
		pnl_customer.add(txt_CstMoblie);
		
		JLabel lbl_AddCustomer = new JLabel("Add New Customer");
		lbl_AddCustomer.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_AddCustomer.setForeground(Color.WHITE);
		lbl_AddCustomer.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lbl_AddCustomer.setBounds(115, 22, 241, 41);
		pnl_customer.add(lbl_AddCustomer);
		
		JButton btn_AddCustomer = new JButton("Add New Customer");
		btn_AddCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					try {
						Class.forName("com.mysql.jdbc.Driver");
					   	Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
					
					PreparedStatement pst=conn.prepareStatement("INSERT INTO tbl_customer( Cstname, CstAddress, CstMoblieNo, CstGSTNumber, CstShopName, CstState, "
							+ "CstRemarks) VALUES (?,?,?,?,?,?,?)"); 
			
									//pst.setString(1,txt_CustID.getText());
									pst.setString(1,txt_CusName.getText());
									pst.setString(2,txt_CstAddress.getText());								
									pst.setString(3,txt_CstMoblie.getText());
									pst.setString(4,txt_CstGSTno.getText());
									pst.setString(5,txt_CstShopName.getText());
									pst.setString(6,txt_CstState.getText());
									pst.setString(7,txtA_custRemark.getText());
									
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null,"Customer Added");
					
					}
					catch(Exception e1)
					{
						JOptionPane.showMessageDialog(null,"Pelese Enter Right Detials of Customer");
						System.out.println("Error : "+e1.toString());
					}	
			}
		});
		btn_AddCustomer.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btn_AddCustomer.setBounds(185, 612, 253, 41);
		pnl_customer.add(btn_AddCustomer);
	}
}
