

import java.awt.EventQueue; 

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSetMetaData;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JTextField;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;


import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Manage_Customer {

	private JFrame frm_ManageCustomer;
	private JTextField txt_CustID;
	private JTextField txt_CustGSTno;
	private JTextField txt_CustAddress;
	private JTextField txt_Custstate;
	private JTextField txt_CustShopName;
	private JTable jtbl_Customer;
	private JTextField txt_CstNameSearch;
	private JLabel lbl_CustomerSearchName;
	private JLabel lbl_MoblieNo;
	private JTextField txt_CustName;
	private JTextField txt_Custmob;
	private JLabel lbl_AddCustomer;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manage_Customer window = new Manage_Customer();
					window.frm_ManageCustomer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Manage_Customer() 
	{
		applicationfrm();
	}
	
	
	void applicationfrm()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		   	Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
			
		
		   DefaultTableModel model=new DefaultTableModel();
		
			  class Rfun
			    {
				
			    	void showTData()
			    	{
			    	try {
			    		ResultSet rs=null;
			    		String s1=txt_CstNameSearch.getText().toString();
			    	if(s1.equals(""))
			    	{
					rs =conn.createStatement().executeQuery("SELECT * FROM  tbl_customer order by CstID");
			    	}
			    	else
			    	{
			    		rs =conn.createStatement().executeQuery("SELECT * FROM  tbl_customer where CstName like '"+s1+"%' ");
			    	}
			    	
			    	ResultSetMetaData rsMD =(ResultSetMetaData) rs.getMetaData();
					int q=rsMD.getColumnCount();
					
					for (int i = model.getRowCount() - 1; i >= 0; i--) {
					    model.removeRow(i);
					}
					while(rs.next())
					{
					 Vector<String> columnData =new Vector<String>();
					 for(int i=1; i<=q; i++)
					 {
						 columnData.add(rs.getString("CstID"));
						 columnData.add(rs.getString("CstName"));
						 columnData.add(rs.getString("CstAddress"));
						 columnData.add(rs.getString("CstMoblieNo"));
						 columnData.add(rs.getString("CstGSTNumber"));
						 columnData.add(rs.getString("CstShopName"));
						 columnData.add(rs.getString("CstState"));
						 columnData.add(rs.getString("CstRemarks"));
						 
					 }
					 model.addRow(columnData);
					}
					}
					catch(Exception e1)
					{
						JOptionPane.showMessageDialog(null,"Error");
						System.out.println("Error : "+e1.toString());
					}
			    	}
				}		
			  Rfun r1=new Rfun();
		
		frm_ManageCustomer = new JFrame();
		frm_ManageCustomer.setIconImage(Toolkit.getDefaultToolkit().getImage(Manage_Customer.class.getResource("/images/users.png")));
		frm_ManageCustomer.setTitle("Manage Customer");
		frm_ManageCustomer.getContentPane().setForeground(Color.WHITE);
		frm_ManageCustomer.getContentPane().setBackground(new Color(0, 0, 0));
		frm_ManageCustomer.setForeground(Color.WHITE);
		frm_ManageCustomer.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		frm_ManageCustomer.setBounds(0, 0, 1360,768);
		frm_ManageCustomer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm_ManageCustomer.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frm_ManageCustomer.setResizable(false);
		@SuppressWarnings("serial")
		JPanel contentPane = new JPanel() {  
            public void paintComponent(Graphics g) {  
                 Image img = Toolkit.getDefaultToolkit().getImage(  
                		 Main_Menu.class.getResource("Image/BG3.jpg"));  
            g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
         }  
       };  
       frm_ManageCustomer.setContentPane(contentPane);
       frm_ManageCustomer.getContentPane().setLayout(null);
		JPanel pnl_customer = new JPanel();
		pnl_customer.setLayout(null);
		pnl_customer.setForeground(Color.BLACK);
		pnl_customer.setBorder(new LineBorder(Color.WHITE, 2, true));
		pnl_customer.setBackground(new Color(0,0,0,65));
		pnl_customer.setBounds(10, 105, 419, 616);
		frm_ManageCustomer.getContentPane().add(pnl_customer);
		
		JLabel lbl_CustID = new JLabel("Custmor ID ");
		lbl_CustID.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_CustID.setForeground(Color.WHITE);
		lbl_CustID.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lbl_CustID.setBounds(32, 61, 142, 41);
		pnl_customer.add(lbl_CustID);
		
		JLabel lbl_Custname = new JLabel("Customer Name");
		lbl_Custname.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_Custname.setForeground(Color.WHITE);
		lbl_Custname.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lbl_Custname.setBounds(32, 112, 142, 41);
		pnl_customer.add(lbl_Custname);
		
		JLabel lbl_GSTNo = new JLabel("GST No");
		lbl_GSTNo.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_GSTNo.setForeground(Color.WHITE);
		lbl_GSTNo.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lbl_GSTNo.setBounds(30, 286, 144, 41);
		pnl_customer.add(lbl_GSTNo);
		
		lbl_MoblieNo = new JLabel("Moblie No");
		lbl_MoblieNo.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_MoblieNo.setForeground(Color.WHITE);
		lbl_MoblieNo.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lbl_MoblieNo.setBounds(30, 235, 144, 41);
		pnl_customer.add(lbl_MoblieNo);
		
		JLabel lbl_CustShopName = new JLabel("Shop Name");
		lbl_CustShopName.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_CustShopName.setForeground(Color.WHITE);
		lbl_CustShopName.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lbl_CustShopName.setBounds(30, 336, 144, 41);
		pnl_customer.add(lbl_CustShopName);
		
		txt_CustID = new JTextField();
		txt_CustID.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txt_CustID.setColumns(10);
		txt_CustID.setEditable(false);
		txt_CustID.setText("AUTO Generated");
		txt_CustID.setBounds(182, 61, 227, 34);
		pnl_customer.add(txt_CustID);
		
		txt_CustGSTno = new JTextField();
		txt_CustGSTno.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txt_CustGSTno.setColumns(10);
		txt_CustGSTno.setBounds(182, 286, 227, 34);
		pnl_customer.add(txt_CustGSTno);
		
		txt_CustAddress = new JTextField();
		txt_CustAddress.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txt_CustAddress.setColumns(10);
		txt_CustAddress.setBounds(182, 173, 227, 34);
		pnl_customer.add(txt_CustAddress);
		
		txt_Custstate = new JTextField();
		txt_Custstate.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txt_Custstate.setColumns(10);
		txt_Custstate.setBounds(182, 401, 227, 34);
		pnl_customer.add(txt_Custstate);
		
		JLabel lbl_CustState = new JLabel("State");
		lbl_CustState.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_CustState.setForeground(Color.WHITE);
		lbl_CustState.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lbl_CustState.setBounds(30, 397, 144, 41);
		pnl_customer.add(lbl_CustState);
		
		txt_CustShopName = new JTextField();
		txt_CustShopName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txt_CustShopName.setColumns(10);
		txt_CustShopName.setBounds(182, 340, 227, 34);
		pnl_customer.add(txt_CustShopName);
		
		JLabel lbl_CustRemark = new JLabel("Remarks :");
		lbl_CustRemark.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_CustRemark.setForeground(Color.WHITE);
		lbl_CustRemark.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lbl_CustRemark.setBounds(49, 451, 125, 41);
		pnl_customer.add(lbl_CustRemark);
		
		JLabel lbl_CustAddress = new JLabel("Address");
		lbl_CustAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_CustAddress.setForeground(Color.WHITE);
		lbl_CustAddress.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lbl_CustAddress.setBounds(32, 173, 144, 41);
		pnl_customer.add(lbl_CustAddress);
		
		JTextArea txtA_custRemark = new JTextArea();
		txtA_custRemark.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtA_custRemark.setBounds(182, 458, 227, 74);
		pnl_customer.add(txtA_custRemark);
		
		txt_CustName = new JTextField();
		txt_CustName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txt_CustName.setColumns(10);
		txt_CustName.setBounds(182, 118, 227, 34);
		pnl_customer.add(txt_CustName);
		
		txt_Custmob = new JTextField();
		txt_Custmob.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txt_Custmob.setColumns(10);
		txt_Custmob.setBounds(182, 231, 227, 34);
		pnl_customer.add(txt_Custmob);
		
		lbl_AddCustomer = new JLabel("Add New Customer");
		lbl_AddCustomer.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_AddCustomer.setForeground(Color.WHITE);
		lbl_AddCustomer.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lbl_AddCustomer.setBounds(98, 10, 241, 41);
		pnl_customer.add(lbl_AddCustomer);
		
		JButton btn_AddCustomer = new JButton("Add New Customer");
		btn_AddCustomer.setBounds(182, 552, 227, 34);
		pnl_customer.add(btn_AddCustomer);
		btn_AddCustomer.setFont(new Font("Times New Roman", Font.BOLD, 22));
		
		btn_AddCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					PreparedStatement pst=conn.prepareStatement("INSERT INTO tbl_customer( Cstname, CstAddress, CstMoblieNo, CstGSTNumber, CstShopName, CstState, "
							+ "CstRemarks) VALUES (?,?,?,?,?,?,?)"); 
			
						
									pst.setString(1,txt_CustName.getText());
									pst.setString(2,txt_CustAddress.getText());								
									pst.setString(3,txt_Custmob.getText());
									pst.setString(4,txt_CustGSTno.getText());
									pst.setString(5,txt_CustShopName.getText());
									pst.setString(6,txt_Custstate.getText());
									pst.setString(7,txtA_custRemark.getText());
									
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null,"Customer Added");
					
					
					txt_CustAddress.setText("");
					txt_CustGSTno.setText("");
					txt_CustID.setText("");
					txt_Custmob.setText("");
					txt_CustName.setText("");
					txt_CustShopName.setText("");
					txt_Custstate.setText("");						
					txt_CstNameSearch.setText("");
					txtA_custRemark.setText("");
					
					r1.showTData();//after adding data show all items in tabel
					
					}
					catch(Exception e1)
					{
						JOptionPane.showMessageDialog(null,"Somthing  is Wrong \n Customer information is Duplicate Cheack ");
						System.out.println("Error : "+e1.toString());
					}	
				
			}
		});
		
		JLabel lbl_Title = new JLabel("Manage Customer");
		lbl_Title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Title.setForeground(Color.WHITE);
		lbl_Title.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lbl_Title.setBounds(393, 16, 392, 69);
		frm_ManageCustomer.getContentPane().add(lbl_Title);
		
		JPanel pnl_table = new JPanel();
		pnl_table.setBorder(new LineBorder(null, 2, true));
		pnl_table.setBackground(new Color(0,0,0,65));
		pnl_table.setForeground(Color.WHITE);
		pnl_table.setBounds(439, 105, 886, 616);
		frm_ManageCustomer.getContentPane().add(pnl_table);
		pnl_table.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		scrollPane.setSize(new Dimension(1, 1));
	    scrollPane.setAutoscrolls(true);
	    scrollPane.setBorder(new LineBorder(new Color(130, 135, 144), 2, true));
	    @SuppressWarnings("unused")
		Object[] row=new Object[8];	   
	    scrollPane.setBounds(10, 149, 859, 446);
		pnl_table.add(scrollPane);
		
			jtbl_Customer = new JTable();
			jtbl_Customer.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		 	Object[] columns= {	"Customer ID", "Customer Name"," Address"," MoblieNo"," GSTNumber"," ShopName","State", "Remarks"};
		 	model.setColumnIdentifiers(columns);
		    jtbl_Customer.setModel(model);
		    jtbl_Customer.setBackground(Color.WHITE);
		    jtbl_Customer.setForeground(Color.BLACK);
		    jtbl_Customer.setGridColor(Color.RED);
		    jtbl_Customer.setSelectionBackground(Color.BLACK);
		    jtbl_Customer.setSelectionForeground(Color.WHITE);
		    jtbl_Customer.setRowHeight(30);
		    scrollPane.setViewportView(jtbl_Customer);
		
		lbl_CustomerSearchName = new JLabel("Customer Shop Name:-");
		lbl_CustomerSearchName.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_CustomerSearchName.setForeground(Color.WHITE);
		lbl_CustomerSearchName.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lbl_CustomerSearchName.setBounds(30, 24, 241, 41);
		pnl_table.add(lbl_CustomerSearchName);
		
		txt_CstNameSearch = new JTextField();
		txt_CstNameSearch.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		txt_CstNameSearch.setColumns(10);
		txt_CstNameSearch.setBounds(277, 27, 267, 29);
		pnl_table.add(txt_CstNameSearch);
		
		JButton btn_Search = new JButton("Search");
		btn_Search.setIcon(new ImageIcon(Manage_Customer.class.getResource("/images/search.png")));
		btn_Search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				r1.showTData();//after adding data show all items in tabel	
			}
		});
		btn_Search.setBounds(583, 29, 128, 29);
		pnl_table.add(btn_Search);
		btn_Search.setFont(new Font("Times New Roman", Font.BOLD, 21));
		
		JButton btn_ModifyItem = new JButton("Modify");
		btn_ModifyItem.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btn_ModifyItem.setBounds(196, 92, 117, 29);
		pnl_table.add(btn_ModifyItem);
		
		JButton btn_Remove = new JButton("Remove");
		btn_Remove.setIcon(new ImageIcon(Manage_Customer.class.getResource("/images/delete.png")));
		btn_Remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					int a=	jtbl_Customer.getSelectedRow();
					
					PreparedStatement pst=conn.prepareStatement("delete from tbl_customer where CstID=?"); 
					pst.setInt(1,Integer.parseInt(jtbl_Customer.getValueAt(a,0).toString()));
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null,"Recored Delete");

					r1.showTData();//after delete item show data of table
					}
					catch(Exception e1)
					{
						JOptionPane.showMessageDialog(null,"Error");
						System.out.println("Error : "+e1.toString());
					}
			}
		});
		btn_Remove.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btn_Remove.setBounds(344, 92, 128, 29);
		pnl_table.add(btn_Remove);
		
		JButton btn_Clear = new JButton("Clear");
		btn_Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				txt_CustAddress.setText("");
				txt_CustGSTno.setText("");
				txt_CustID.setText("");
				txt_Custmob.setText("");
				txt_CustName.setText("");
				txt_CustShopName.setText("");
				txt_Custstate.setText("");						
				txt_CstNameSearch.setText("");
				txtA_custRemark.setText("");
				
				for (int i = model.getRowCount() - 1; i >= 0; i--) {
				    model.removeRow(i);
				}
			
				
			}
		});
		btn_Clear.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btn_Clear.setBounds(507, 92, 117, 29);
		pnl_table.add(btn_Clear);
		
		JButton btn_update = new JButton("Update");
		btn_update.setIcon(new ImageIcon(Manage_Customer.class.getResource("/images/update.png")));
		btn_update.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btn_update.setBounds(42, 92, 128, 29);
		pnl_table.add(btn_update);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setIcon(new ImageIcon(Manage_Customer.class.getResource("/images/return.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Main_Menu.main(null);
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			frm_ManageCustomer.setVisible(false);
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(10, 10, 112, 37);
		frm_ManageCustomer.getContentPane().add(btnNewButton);
		
		
		
		btn_ModifyItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i=	jtbl_Customer.getSelectedRow();
	    		 
			  		txt_CustID.setText(jtbl_Customer.getValueAt(i, 0).toString());
			  	 	txt_CustName.setText(jtbl_Customer.getValueAt(i, 1).toString());
			  		txt_CustAddress.setText(jtbl_Customer.getValueAt(i, 2).toString());
			  	 	txt_Custmob.setText(jtbl_Customer.getValueAt(i, 3).toString());
		    		txt_CustGSTno.setText(jtbl_Customer.getValueAt(i, 4).toString());
		    		txt_CustShopName.setText(jtbl_Customer.getValueAt(i, 5).toString());
		    		txt_Custstate.setText(jtbl_Customer.getValueAt(i, 6).toString());
		    		txtA_custRemark.setText(jtbl_Customer.getValueAt(i, 7).toString());
		    		
				
			}
		});
		
		btn_update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					
				 		
					
					PreparedStatement pst=conn.prepareStatement("UPDATE tbl_customer SET Cstname=?,CstAddress=?,CstMoblieNo=?,CstGSTNumber=?,CstShopName=?,"
							+ "CstState=?,CstRemarks=? WHERE CstID=?"); 
			
							
					pst.setString(1,txt_CustName.getText());
					pst.setString(2,txt_CustAddress.getText());
					pst.setString(3,txt_Custmob.getText());
					pst.setString(4,txt_CustGSTno.getText());
					pst.setString(5,txt_CustShopName.getText());
					pst.setString(6,txt_Custstate.getText());
					pst.setString(7,txtA_custRemark.getText());
					pst.setString(8,txt_CustID.getText());
								
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null,"Customer Record Updated");
					
					r1.showTData();//after update data of table 
					}
					catch(Exception e1)
					{
						
						System.out.println("Error : "+e1.toString());
					}	
	    	
			
			}
		});
	
		
		}	  
		catch(Exception e1)
		{
			
			System.out.println("Error : "+e1.toString());
		}	
	}
}
