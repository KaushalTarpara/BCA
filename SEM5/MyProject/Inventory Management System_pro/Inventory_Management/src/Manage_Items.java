

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

//import sun.jvm.hotspot.tools.PStack;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Manage_Items {

	private JFrame frm_ManageIteam;
	private JTextField txt_ItemID;
	private JTextField txt_Discount;
	private JTextField txt_Price;
	private JTextField txt_AvaStock;
	private JTextField txt_Tax;
	private JTextField txt_TotAmount;
	private JTable table;
	private JTextField txt_Date;
	private JTextField txt_Profit;
	private JTextField txt_NewItemName;
	private JTextField txt_ItemSearch;
	
	
public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manage_Items window = new Manage_Items();
					window.frm_ManageIteam.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		
		  
	public Manage_Items()
	{
		
		application();
	}
	 
	
	public void application()
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
		    	String s1=txt_ItemSearch.getText().toString();	
		    	if(s1.equals(""))
		    	{
		    		 rs =conn.createStatement().executeQuery("select *from tbl_Items order by ItemID");
		    	}else
		    	{
		    		rs =conn.createStatement().executeQuery("SELECT * FROM  tbl_Items where ItemName like '"+s1+"%' ");
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
					 columnData.add(rs.getString("ItemID"));
					 columnData.add(rs.getString("ItemName"));
					 columnData.add(rs.getString("ItemMetel"));
					 columnData.add(rs.getString("ItemBrand"));
					 columnData.add(rs.getString("ItemStock"));
					 columnData.add(rs.getString("ItemPrice"));
					 columnData.add(rs.getString("ItemProfit"));
					 columnData.add(rs.getString("ItemTex"));
					 columnData.add(rs.getString("ItemDiscount"));
					 columnData.add(rs.getString("ItemTotleCost"));
					 columnData.add(rs.getString("ItemUpdateDate"));
					 
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
		
		frm_ManageIteam = new JFrame();
		frm_ManageIteam.setIconImage(Toolkit.getDefaultToolkit().getImage(Manage_Items.class.getResource("/images/all.png")));
		frm_ManageIteam.getContentPane().setLocation(-546, -257);
		frm_ManageIteam.setTitle("Manage Item");
		frm_ManageIteam.getContentPane().setForeground(Color.WHITE);
		frm_ManageIteam.getContentPane().setBackground(Color.BLACK);
		frm_ManageIteam.setForeground(Color.WHITE);
		frm_ManageIteam.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		frm_ManageIteam.setResizable(false);
		frm_ManageIteam.setBounds(0, 0, 1360,768);
		frm_ManageIteam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm_ManageIteam.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		JPanel contentPane = new JPanel() {  
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) {  
                 Image img = Toolkit.getDefaultToolkit().getImage(  
                		 Main_Menu.class.getResource("Image/BG3.jpg"));  
            g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
         }  
       };  
       frm_ManageIteam.setContentPane(contentPane);

		frm_ManageIteam.getContentPane().setLayout(null);
		
		JPanel pnl_invoice = new JPanel();
		pnl_invoice.setLayout(null);
		pnl_invoice.setForeground(Color.BLACK);
		pnl_invoice.setBorder(new LineBorder(Color.WHITE, 2, true));
		pnl_invoice.setBackground(new Color(0,0,0,65));
		pnl_invoice.setBounds(10, 112, 440, 595);
		frm_ManageIteam.getContentPane().add(pnl_invoice);
		
		JLabel lbl_ItemId = new JLabel("Item ID ");
		lbl_ItemId.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_ItemId.setForeground(Color.WHITE);
		lbl_ItemId.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lbl_ItemId.setBounds(53, 59, 132, 41);
		pnl_invoice.add(lbl_ItemId);
		
		JLabel lbl_itemname = new JLabel("Iteam Name");
		lbl_itemname.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_itemname.setForeground(Color.WHITE);
		lbl_itemname.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lbl_itemname.setBounds(53, 137, 132, 41);
		pnl_invoice.add(lbl_itemname);
		
		JLabel lbl_Tax = new JLabel("Tax(%)");
		lbl_Tax.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_Tax.setForeground(Color.WHITE);
		lbl_Tax.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lbl_Tax.setBounds(53, 306, 132, 41);
		pnl_invoice.add(lbl_Tax);
		
		JLabel lbl_Price = new JLabel("Price \u20B9");
		lbl_Price.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_Price.setForeground(Color.WHITE);
		lbl_Price.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lbl_Price.setBounds(20, 228, 155, 41);
		pnl_invoice.add(lbl_Price);
		
		JLabel lbl_Stock = new JLabel("Available Stock");
		lbl_Stock.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_Stock.setForeground(Color.WHITE);
		lbl_Stock.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lbl_Stock.setBounds(43, 357, 142, 41);
		pnl_invoice.add(lbl_Stock);
		
		txt_ItemID = new JTextField();
		txt_ItemID.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		txt_ItemID.setColumns(10);
		txt_ItemID.setBounds(198, 65, 225, 29);
		txt_ItemID.setEditable(false);
		txt_ItemID.setText("AUTO Generated");
		pnl_invoice.add(txt_ItemID);
		
		txt_Discount = new JTextField();
		txt_Discount.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		txt_Discount.setColumns(10);
		txt_Discount.setBounds(198, 317, 225, 29);
		pnl_invoice.add(txt_Discount);
		
		txt_Price = new JTextField();
		txt_Price.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		txt_Price.setColumns(10);
		txt_Price.setBounds(198, 234, 225, 29);
		pnl_invoice.add(txt_Price);
		
		txt_AvaStock = new JTextField();
		txt_AvaStock.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		txt_AvaStock.setColumns(10);
		txt_AvaStock.setBounds(198, 363, 225, 29);
		pnl_invoice.add(txt_AvaStock);
	
		
		JButton btn_calulate = new JButton("Calulate");
		btn_calulate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int Price=Integer.parseInt(	txt_Price.getText());
	    	//	int Stock =	Integer.parseInt(txt_AvaStock.getText());
	    		int Profit=100+Integer.parseInt( txt_Profit.getText());
	    		int Tax=100+Integer.parseInt(txt_Tax.getText());
	    		int dis=100-Integer.parseInt(txt_Discount.getText());
	    		int cal=(((Price*Profit)/100*dis)/100*Tax)/100;
               
            		   txt_TotAmount.setText(String.valueOf(cal));
			}
		});
		btn_calulate.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		btn_calulate.setBounds(198, 447, 225, 34);
		pnl_invoice.add(btn_calulate);
		
		JLabel lbl_Dicount = new JLabel("Dicount(%)");
		lbl_Dicount.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_Dicount.setForeground(Color.WHITE);
		lbl_Dicount.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lbl_Dicount.setBounds(60, 402, 125, 41);
		pnl_invoice.add(lbl_Dicount);
		
		txt_Tax = new JTextField();
		txt_Tax.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		txt_Tax.setColumns(10);
		txt_Tax.setBounds(198, 407, 225, 30);
		pnl_invoice.add(txt_Tax);
		
		JLabel lbl_TotleAmmount = new JLabel("Totle Ammount ");
		lbl_TotleAmmount.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_TotleAmmount.setForeground(Color.WHITE);
		lbl_TotleAmmount.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lbl_TotleAmmount.setBounds(33, 489, 150, 41);
		pnl_invoice.add(lbl_TotleAmmount);
		
		txt_TotAmount = new JTextField();
		txt_TotAmount.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		txt_TotAmount.setColumns(10);
		txt_TotAmount.setBounds(198, 495, 225, 29);
		pnl_invoice.add(txt_TotAmount);
		
		JLabel lbl_ItemType = new JLabel("Item Type");
		lbl_ItemType.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_ItemType.setForeground(Color.WHITE);
		lbl_ItemType.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lbl_ItemType.setBounds(63, 101, 125, 41);
		pnl_invoice.add(lbl_ItemType);
		
		JLabel lbl_itemBrand = new JLabel("Iteam Brand");
		lbl_itemBrand.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_itemBrand.setForeground(Color.WHITE);
		lbl_itemBrand.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lbl_itemBrand.setBounds(56, 188, 132, 41);
		pnl_invoice.add(lbl_itemBrand);
		
		JComboBox<String> cmb_Brand = new JComboBox<String>();
		cmb_Brand.setMaximumRowCount(10);
		cmb_Brand.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		cmb_Brand.setBounds(198, 191, 225, 29);
		try {
		
			ResultSet rs =conn.createStatement().executeQuery("select *from tbl_itembrand");
			while(rs.next())
			{
				cmb_Brand.addItem(rs.getString("BrandName"));
			}
			}
			catch(Exception e1)
			{
				System.out.println("Error : "+e1.toString());
			}
	

		pnl_invoice.add(cmb_Brand);
		
		JLabel lbl_AddTitle = new JLabel("Add New Item");
		lbl_AddTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_AddTitle.setForeground(Color.WHITE);
		lbl_AddTitle.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lbl_AddTitle.setBounds(119, 8, 197, 41);
		pnl_invoice.add(lbl_AddTitle);
		
		JButton btn_AddItem = new JButton("Add Item");
		btn_AddItem.setIcon(new ImageIcon(Manage_Items.class.getResource("/images/addnew.png")));
		btn_AddItem.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		btn_AddItem.setBounds(291, 539, 132, 29);
		pnl_invoice.add(btn_AddItem);
		
		JRadioButton rbt_SS = new JRadioButton("S.S.");
		rbt_SS.setForeground(Color.WHITE);
		rbt_SS.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rbt_SS.setBackground(new Color(0,0,0,65));
		rbt_SS.setBounds(198, 108, 85, 29);
		pnl_invoice.add(rbt_SS);
		
		JRadioButton rbt_Brass = new JRadioButton("Brass");
		rbt_Brass.setForeground(Color.WHITE);
		rbt_Brass.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rbt_Brass.setBackground(new Color(0,0,0,65));
		rbt_Brass.setBounds(321, 108, 92, 29);
		pnl_invoice.add(rbt_Brass);
		
		ButtonGroup BgCus=new ButtonGroup();
	    BgCus.add(rbt_SS);
	    BgCus.add(rbt_Brass);
	    
	    
	    JLabel lbl_Profit = new JLabel("Profit(%)");
	    lbl_Profit.setHorizontalAlignment(SwingConstants.RIGHT);
	    lbl_Profit.setForeground(Color.WHITE);
	    lbl_Profit.setFont(new Font("Times New Roman", Font.PLAIN, 21));
	    lbl_Profit.setBounds(73, 267, 115, 41);
	    pnl_invoice.add(lbl_Profit);
	    
	    txt_Profit = new JTextField();
	    txt_Profit.setFont(new Font("Times New Roman", Font.PLAIN, 21));
	    txt_Profit.setColumns(10);
	    txt_Profit.setBounds(198, 273, 225, 29);
	    pnl_invoice.add(txt_Profit);
	    
	    txt_NewItemName = new JTextField();
	    txt_NewItemName.setFont(new Font("Times New Roman", Font.PLAIN, 21));
	    txt_NewItemName.setColumns(10);
	    txt_NewItemName.setBounds(198, 143, 225, 29);
	    pnl_invoice.add(txt_NewItemName);
	    
	    JButton btn_SaveItem = new JButton("Update Item");
	    btn_SaveItem.setIcon(new ImageIcon(Manage_Items.class.getResource("/images/update.png")));
	   btn_SaveItem.setFont(new Font("Times New Roman", Font.PLAIN, 21));
	    btn_SaveItem.setBounds(107, 539, 161, 29);
	    pnl_invoice.add(btn_SaveItem);
	    
		JLabel lbl_Title = new JLabel("Manage Item");
		lbl_Title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Title.setForeground(Color.WHITE);
		lbl_Title.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lbl_Title.setBounds(416, 10, 440, 79);
		frm_ManageIteam.getContentPane().add(lbl_Title);
		
		JPanel pnl_button = new JPanel();
		pnl_button.setBorder(new LineBorder(null, 2));
		pnl_button.setForeground(Color.WHITE);
		pnl_button.setBackground(new Color(0,0,0,65));
		pnl_button.setBounds(460, 112, 504, 124);
		frm_ManageIteam.getContentPane().add(pnl_button);
		pnl_button.setLayout(null);
		
		JButton btn_ModifyItem = new JButton("Modify");
			btn_ModifyItem.setBounds(50, 79, 115, 24);
		btn_ModifyItem.setFont(new Font("Times New Roman", Font.BOLD, 21));
		pnl_button.add(btn_ModifyItem);
		
		JButton btn_Delete = new JButton("Delete");
		btn_Delete.setIcon(new ImageIcon(Manage_Items.class.getResource("/images/delete.png")));
		btn_Delete.setBounds(223, 79, 115, 24);
		btn_Delete.setFont(new Font("Times New Roman", Font.BOLD, 21));
		pnl_button.add(btn_Delete);
		
		JButton btn_Clear = new JButton("Clear");
		btn_Clear.setBounds(388, 79, 104, 24);
		btn_Clear.setFont(new Font("Times New Roman", Font.BOLD, 21));
		pnl_button.add(btn_Clear);
		
		JButton btn_Search = new JButton("Search");
		btn_Search.setIcon(new ImageIcon(Manage_Items.class.getResource("/images/search.png")));
	    btn_Search.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btn_Search.setBounds(334, 25, 123, 24);
		pnl_button.add(btn_Search);
		
		JLabel lbl_ItemName = new JLabel("Item Name :-");
		lbl_ItemName.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_ItemName.setForeground(Color.WHITE);
		lbl_ItemName.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lbl_ItemName.setBounds(27, 17, 145, 41);
		pnl_button.add(lbl_ItemName);
		
		txt_ItemSearch = new JTextField();
		txt_ItemSearch.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		txt_ItemSearch.setColumns(10);
		txt_ItemSearch.setBounds(154, 25, 153, 24);
		pnl_button.add(txt_ItemSearch);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(null, 2, true));
		panel.setBackground(new Color(0,0,0,65));
		panel.setForeground(Color.WHITE);
		panel.setBounds(460, 243, 865, 464);
		frm_ManageIteam.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		scrollPane.setSize(new Dimension(1, 1));
	    scrollPane.setAutoscrolls(true);
	    scrollPane.setBorder(new LineBorder(new Color(130, 135, 144), 2, true));
	    @SuppressWarnings("unused")
		Object[] row=new Object[11];	   
	    scrollPane.setBounds(10, 10, 845, 444);
		panel.add(scrollPane);
		
			table = new JTable();
			table.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		 	Object[] columns= {	"Iteam ID", "Iteam Name","Iteam Metal", "Brand","Iteam Quntity", "Iteam Price","Iteam Profit", "Discount","Tex", "Totle","Date"};
		 	model.setColumnIdentifiers(columns);
		    table.setModel(model);
		    table.setBackground(Color.WHITE);
		    table.setForeground(Color.BLACK);
		    table.setGridColor(Color.RED);
		    table.setSelectionBackground(Color.BLACK);
		    table.setSelectionForeground(Color.WHITE);
		    table.setRowHeight(30);
		    scrollPane.setViewportView(table);
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
		Date date = new Date();  
		
		JButton btn_Back = new JButton("Back");
		btn_Back.setIcon(new ImageIcon(Manage_Items.class.getResource("/images/return.png")));
		btn_Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		//		Main_Menu info=new Main_Menu();
				try {
					Main_Menu.main(null);
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					e1.printStackTrace();
				}
				frm_ManageIteam.setVisible(false);
			}
		});
		btn_Back.setForeground(Color.BLACK);
		btn_Back.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btn_Back.setBackground(Color.WHITE);
		btn_Back.setBounds(24, 22, 120, 34);
		frm_ManageIteam.getContentPane().add(btn_Back);
		
		JLabel lbl_Date = new JLabel("Date :-");
		lbl_Date.setBounds(974, 117, 81, 41);
		frm_ManageIteam.getContentPane().add(lbl_Date);
		lbl_Date.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_Date.setForeground(Color.WHITE);
		lbl_Date.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		txt_Date = new JTextField();
		txt_Date.setBounds(1045, 120, 142, 34);
		frm_ManageIteam.getContentPane().add(txt_Date);
		txt_Date.setEditable(false);
		txt_Date.setText(formatter.format(date));
		txt_Date.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		txt_Date.setColumns(10);
		
		btn_Search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			r1.showTData();			
			}
		});
		btn_AddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String a=null;
					if(rbt_SS.isSelected())
				 	{
				 		 a="S.S";
				 	}else if(rbt_Brass.isSelected())
				 	{
				 	  a="Brass";
				 	}else
				 	{
				 		JOptionPane.showMessageDialog(null,"Pelese Selcte Item Metel");
				 	}
				 		
					
					PreparedStatement pst=conn.prepareStatement("insert into tbl_items(ItemName,ItemMetel,ItemBrand,ItemPrice,"
							+ "ItemProfit,ItemDiscount,ItemTex,ItemStock,ItemTotleCost,ItemUpdateDate) VALUES (?,?,?,?,?,?,?,?,?,?)"); 
			
								//	pst.setString(1,txt_ItemID.getText());
									pst.setString(1,txt_NewItemName.getText());
									pst.setString(2,a.toString());								
									pst.setString(3,cmb_Brand.getSelectedItem().toString());
									pst.setString(4,txt_Price.getText());
									pst.setString(5,txt_Profit.getText());
									pst.setString(6,txt_Discount.getText());
									pst.setString(7,txt_Tax.getText());
									pst.setString(8,txt_AvaStock.getText());
									pst.setString(9,txt_TotAmount.getText());
						     		pst.setString(10,java.time.LocalDate.now().toString());
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null,"Item Added");
					
					txt_AvaStock.setText("");
					txt_Discount.setText("");
					txt_ItemID.setText("");
					txt_ItemSearch.setText("");
					txt_NewItemName.setText("");
					txt_Price.setText("");
					txt_Profit.setText("");
					txt_Tax.setText("");
					txt_TotAmount.setText("");
					
					r1.showTData();//after adding data show all items in tabel
					
					}
					catch(Exception e1)
					{
						
						System.out.println("Error : "+e1.toString());
					}	
				
			}
		});
		
		btn_ModifyItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=	 table.getSelectedRow();
	    		//	txt_Price.setText(row[3].toString());
			  	String Rbc=table.getValueAt(i, 2).toString(); 
			  		txt_ItemID.setText(table.getValueAt(i, 0).toString());
			  	 	txt_NewItemName.setText(table.getValueAt(i, 1).toString());
			  	
			  	 	if(Rbc.equals("S.S."))
			  	 	{			  	 		
			  	 		rbt_SS.setSelected(true);
			  	 	}else if(Rbc.equals("Brass")) 
			  	 	{			  	 		
			  	 		rbt_Brass.setSelected(true);
			  	 	}else
			  	 	{
			  	 		JOptionPane.showMessageDialog(null,"CheckBox Facting Error");
			  	 	}
			  		
			  	 	cmb_Brand.setSelectedItem(table.getValueAt(i, 3).toString());
			  		txt_AvaStock.setText(table.getValueAt(i, 4).toString());
			  	 	txt_Price.setText(table.getValueAt(i, 5).toString());
		    		txt_Profit.setText(table.getValueAt(i, 6).toString());
		    		txt_Tax.setText(table.getValueAt(i, 7).toString());
		    		txt_Discount.setText(table.getValueAt(i, 8).toString());
		    		txt_TotAmount.setText(table.getValueAt(i, 9).toString());
		    		txt_Date.setText(table.getValueAt(i, 10).toString());
				
				
				
			
			}
		});
	
		btn_Delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					int a=	table.getSelectedRow();
					
					PreparedStatement pst=conn.prepareStatement("delete from tbl_items where ItemID=?"); 
					pst.setInt(1,Integer.parseInt(table.getValueAt(a,0).toString()));
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
		
		btn_Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_AvaStock.setText("");
				txt_Discount.setText("");
				txt_ItemID.setText("");
				txt_ItemSearch.setText("");
				txt_NewItemName.setText("");
				txt_Price.setText("");
				txt_Profit.setText("");
				txt_Tax.setText("");
				txt_TotAmount.setText("");
				
				for (int i = model.getRowCount() - 1; i >= 0; i--) {
				    model.removeRow(i);
				}
			
			}
		});
		
		 btn_SaveItem.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    	
		    		
					try {
					
						String a=null;
						if(rbt_SS.isSelected())
					 	{
					 		 a="S.S";
					 	}else if(rbt_Brass.isSelected())
					 	{
					 	  a="Brass";
					 	}else
					 	{
					 		JOptionPane.showMessageDialog(null,"Pelese Selcte Item Metel");
					 	}
					 		
						
						PreparedStatement pst=conn.prepareStatement("UPDATE tbl_items SET ItemName=?,ItemMetel=?,ItemBrand=?,ItemPrice=?,"
								+ "ItemProfit=?,ItemDiscount=?,ItemTex=?,ItemStock=?,ItemTotleCost=?,ItemUpdateDate=? WHERE ItemID=?"); 
				
								
										pst.setString(1,txt_NewItemName.getText());
										pst.setString(2,a.toString());								
										pst.setString(3,cmb_Brand.getSelectedItem().toString());
										pst.setString(4,txt_Price.getText());
										pst.setString(5,txt_Profit.getText());
										pst.setString(6,txt_Discount.getText());
										pst.setString(7,txt_Tax.getText());
										pst.setString(8,txt_AvaStock.getText());
										pst.setString(9,txt_TotAmount.getText());
							     		pst.setString(10,java.time.LocalDate.now().toString());
							    		pst.setString(11,txt_ItemID.getText());
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null,"Item Updated");
						
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
