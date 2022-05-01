import java.awt.EventQueue;   

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.util.Date;  
import com.mysql.jdbc.Connection;

import java.awt.event.ItemListener;
//import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Salling_Billing {

	private JFrame frm_purchase;
	private JButton btn_Back;
	private JPanel pnl_invoice;
	private JTextField txt_InvoiceNo;
	private JTextField txt_Price;
	private JTextField txt_tax;
	private JTextField txt_ItemProfit;
	private JTextField txt_avliStock;
	private JTextField txt_Quantity;
	private JTextField txt_discount;
	private JTextField txt_discAmount;
	private JTextField txt_custname;
	private JTextField txt_date;
	private JTextField txt_totamount;
	DefaultTableModel model; 
	private JTable table;
	private JScrollPane scrollPane;
	private JTextField txt_ItemId;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Salling_Billing window = new Salling_Billing();
					window.frm_purchase.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	@SuppressWarnings({ "serial", "unchecked", "rawtypes" })
	public Salling_Billing() {
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
		   	Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
			
		    
		frm_purchase = new JFrame("Purches & Billing");
		frm_purchase.setIconImage(Toolkit.getDefaultToolkit().getImage(Salling_Billing.class.getResource("/images/all.png")));
		frm_purchase.setTitle("Salling & Billing");
		frm_purchase.getContentPane().setBackground(Color.BLACK);
		frm_purchase.setBounds(0,0,1360,766);
		frm_purchase.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel contentPane = new JPanel() {  
            public void paintComponent(Graphics g) {  
                 Image img = Toolkit.getDefaultToolkit().getImage(  
                		 Main_Menu.class.getResource("Image/BG3.jpg"));  
            g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
         }  
       };  
       frm_purchase.setContentPane(contentPane);
       frm_purchase.setResizable(false);
        frm_purchase.getContentPane().setLayout(null);
		frm_purchase.setLocationRelativeTo(null);
		frm_purchase.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JPanel pnl_CustomerType = new JPanel();
		pnl_CustomerType.setBorder(new LineBorder(null, 2, true));
		pnl_CustomerType.setForeground(Color.WHITE);
		pnl_CustomerType.setBackground(new Color(0,0,0,65));
		pnl_CustomerType.setBounds(21, 106, 425, 103);
		frm_purchase.getContentPane().add(pnl_CustomerType);
		pnl_CustomerType.setLayout(null);
		
		JLabel lbl_custtype = new JLabel("Customer Type :-");
		lbl_custtype.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lbl_custtype.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_custtype.setBounds(21, 10, 191, 42);
		lbl_custtype.setForeground(Color.WHITE);
		pnl_CustomerType.add(lbl_custtype);
		
		JRadioButton rbt_OldCust = new JRadioButton("Old");
		
		rbt_OldCust.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rbt_OldCust.setBackground(new Color(0,0,0,65));
		rbt_OldCust.setForeground(Color.WHITE);
		rbt_OldCust.setBounds(237, 19, 85, 29);
		pnl_CustomerType.add(rbt_OldCust);
		
		JRadioButton rbt_NewCust = new JRadioButton("New");
		rbt_NewCust.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AddNewCustomerPopup.main(null);
			
			}
		});
		rbt_NewCust.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rbt_NewCust.setBackground(new Color(0,0,0,65));
		rbt_NewCust.setForeground(Color.WHITE);
		rbt_NewCust.setBounds(324, 19, 92, 29);
		pnl_CustomerType.add(rbt_NewCust);
		
		JComboBox<String> cmb_Customer = new JComboBox<String>();
		cmb_Customer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  txt_custname.setText(cmb_Customer.getSelectedItem().toString());
			}
		});
		cmb_Customer.setModel(new DefaultComboBoxModel(new String[] {"---Select Customer---"}));
		cmb_Customer.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		cmb_Customer.setBounds(237, 59, 173, 29);
		pnl_CustomerType.add(cmb_Customer);
		
		ButtonGroup BgCus=new ButtonGroup();
	    BgCus.add(rbt_OldCust);
	    BgCus.add(rbt_NewCust);
	    
	    JLabel lbl_Title = new JLabel("Salling & Billing");
	    lbl_Title.setHorizontalAlignment(SwingConstants.CENTER);
	    lbl_Title.setFont(new Font("Times New Roman", Font.PLAIN, 40));
	    lbl_Title.setForeground(Color.WHITE);
	    lbl_Title.setBounds(486, 21, 440, 62);
	    frm_purchase.getContentPane().add(lbl_Title);
	    
	    pnl_invoice = new JPanel();
	    pnl_invoice.setBorder(new LineBorder(Color.WHITE, 2, true));
	    pnl_invoice.setBackground(new Color(0,0,0,65));
	    pnl_invoice.setForeground(Color.BLACK);
	    pnl_invoice.setBounds(21, 219, 425, 504);
	    frm_purchase.getContentPane().add(pnl_invoice);
	    pnl_invoice.setLayout(null);
	    
	    JLabel lbl_invoiceno = new JLabel("Invoice No.");
	    lbl_invoiceno.setHorizontalAlignment(SwingConstants.RIGHT);
	    lbl_invoiceno.setForeground(Color.WHITE);
	    lbl_invoiceno.setFont(new Font("Times New Roman", Font.PLAIN, 22));
	    lbl_invoiceno.setBounds(29, 10, 155, 41);
	    pnl_invoice.add(lbl_invoiceno);
	    
	    JLabel lbl_itemname = new JLabel("Iteam Name");
	    lbl_itemname.setHorizontalAlignment(SwingConstants.RIGHT);
	    lbl_itemname.setForeground(Color.WHITE);
	    lbl_itemname.setFont(new Font("Times New Roman", Font.PLAIN, 22));
	    lbl_itemname.setBounds(29, 94, 155, 41);
	    pnl_invoice.add(lbl_itemname);
	    
	    JLabel lbl_Price = new JLabel("Price  (\u20B9)");
	    lbl_Price.setHorizontalAlignment(SwingConstants.RIGHT);
	    lbl_Price.setForeground(Color.WHITE);
	    lbl_Price.setFont(new Font("Times New Roman", Font.PLAIN, 22));
	    lbl_Price.setBounds(29, 137, 155, 41);
	    pnl_invoice.add(lbl_Price);
	    
	    JLabel lbl_Tax = new JLabel("Tax(%)");
	    lbl_Tax.setHorizontalAlignment(SwingConstants.RIGHT);
	    lbl_Tax.setForeground(Color.WHITE);
	    lbl_Tax.setFont(new Font("Times New Roman", Font.PLAIN, 22));
	    lbl_Tax.setBounds(29, 176, 155, 41);
	    pnl_invoice.add(lbl_Tax);
	    
	    JLabel lbl_Profit= new JLabel("Profit(%)");
	    lbl_Profit.setHorizontalAlignment(SwingConstants.RIGHT);
	    lbl_Profit.setForeground(Color.WHITE);
	    lbl_Profit.setFont(new Font("Times New Roman", Font.PLAIN, 22));
	    lbl_Profit.setBounds(29, 215, 155, 41);
	    pnl_invoice.add(lbl_Profit);
	    
	    JLabel lbl_Stock = new JLabel("Available Stock");
	    lbl_Stock.setHorizontalAlignment(SwingConstants.RIGHT);
	    lbl_Stock.setForeground(Color.WHITE);
	    lbl_Stock.setFont(new Font("Times New Roman", Font.PLAIN, 22));
	    lbl_Stock.setBounds(29, 252, 155, 41);
	    pnl_invoice.add(lbl_Stock);
	    
	    JLabel lbl_quantity = new JLabel("Quantity");
	    lbl_quantity.setHorizontalAlignment(SwingConstants.RIGHT);
	    lbl_quantity.setForeground(Color.WHITE);
	    lbl_quantity.setFont(new Font("Times New Roman", Font.PLAIN, 22));
	    lbl_quantity.setBounds(29, 303, 155, 41);
	    pnl_invoice.add(lbl_quantity);
	    
	    txt_InvoiceNo = new JTextField();
	    txt_InvoiceNo.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	    txt_InvoiceNo.setBounds(199, 10, 199, 34);
	    txt_InvoiceNo.setEditable(false);
	    ResultSet rsl =conn.createStatement().executeQuery("SELECT * FROM `tbl_order` ORDER BY `tbl_order`.`InvoiceID` ASC");
		if(rsl.next()==false)
		{
		txt_InvoiceNo.setText("1");
		}
		while(rsl.next())
		{
			String NI=String.valueOf(Integer.parseInt(rsl.getString("InvoiceId"))+1);
				txt_InvoiceNo.setText(NI);
		
		}
	
	    pnl_invoice.add(txt_InvoiceNo);
	    txt_InvoiceNo.setColumns(10);
	    
	    txt_Price = new JTextField();
	    txt_Price.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	    txt_Price.setColumns(10);
	    txt_Price.setBounds(199, 141, 199, 34);
	    pnl_invoice.add(txt_Price);
	    
	    
	    txt_tax = new JTextField();
	    txt_tax.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	    txt_tax.setColumns(10);
	    txt_tax.setBounds(199, 180, 199, 34);
	    pnl_invoice.add(txt_tax);
	    
	    txt_ItemProfit = new JTextField();
	    txt_ItemProfit.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	    txt_ItemProfit.setColumns(10);
	    txt_ItemProfit.setBounds(199, 219, 199, 34);
	    pnl_invoice.add(txt_ItemProfit);
	    
	    txt_avliStock = new JTextField();
	    txt_avliStock.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	    txt_avliStock.setColumns(10);
	    txt_avliStock.setBounds(199, 263, 199, 34);
	    pnl_invoice.add(txt_avliStock);
	    
	    txt_Quantity = new JTextField();
	    txt_Quantity.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	    txt_Quantity.setColumns(10);
	    txt_Quantity.setBounds(199, 307, 199, 34);
	    pnl_invoice.add(txt_Quantity);
	    
	    JButton btn_Add = new JButton("Add");
	    btn_Add.setIcon(new ImageIcon(Salling_Billing.class.getResource("/images/addnew.png")));
	    
	    btn_Add.setFont(new Font("Times New Roman", Font.BOLD, 20));
	    btn_Add.setBounds(282, 454, 110, 34);
	    pnl_invoice.add(btn_Add);
	    
	    JComboBox<String> cmb_item = new JComboBox<String>();
	    
	    cmb_item.setMaximumRowCount(10);
	    cmb_item.setFont(new Font("Times New Roman", Font.PLAIN, 21));
	    cmb_item.setModel(new DefaultComboBoxModel<String>(new String[] {"--- Select Item ---"}));
	    cmb_item.setBounds(201, 97, 197, 34);
		try {
					

			ResultSet rs =conn.createStatement().executeQuery("select *from tbl_items");
			while(rs.next())
			{
				cmb_item.addItem(rs.getString("ItemName"));
			}
			}
			catch(Exception e1)
			{
				System.out.println("Error : "+e1.toString());
			}
	
	    pnl_invoice.add(cmb_item);
		cmb_item.addItemListener(new ItemListener() { 
	    	public void itemStateChanged(ItemEvent e) {
	    		try {
	    			
	    			ResultSet rs =conn.createStatement().executeQuery("select *from tbl_items where ItemName = '"+cmb_item.getSelectedItem().toString()+"' ");
	    				if(rs.next())
	    				{		
	    						txt_ItemId.setText(rs.getString("ItemID"));
	    						txt_Price.setText(rs.getString("ItemPrice"));
	    						txt_avliStock.setText(rs.getString("ItemStock"));
	    						txt_ItemProfit.setText(rs.getString("ItemProfit"));
	    						txt_tax.setText(rs.getString("ItemTex"));
	    						txt_discount.setText(rs.getString("ItemDiscount"));
	     				}
	    				btn_Add.setEnabled(true);
	    			}
	    			catch(Exception e1)
	    			{
	    				System.out.println("Error : "+e1.toString());
	    			}
	    	}
	    });
	    
	    JButton btn_calulate = new JButton("Calulate");
	    
	    btn_calulate.setFont(new Font("Times New Roman", Font.BOLD, 20));
	    btn_calulate.setBounds(304, 351, 110, 34);
	    pnl_invoice.add(btn_calulate);
	    
	    JLabel lbl_Dicount = new JLabel("Discount(%)");
	    lbl_Dicount.setHorizontalAlignment(SwingConstants.RIGHT);
	    lbl_Dicount.setForeground(Color.WHITE);
	    lbl_Dicount.setFont(new Font("Times New Roman", Font.PLAIN, 22));
	    lbl_Dicount.setBounds(39, 347, 155, 41);
	    pnl_invoice.add(lbl_Dicount);
	    
	    txt_discount = new JTextField();
	    txt_discount.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	    txt_discount.setColumns(10);
	    txt_discount.setBounds(199, 351, 99, 34);
	    pnl_invoice.add(txt_discount);
	    
	   
	    
	    JLabel lbl_DiscountAmmount = new JLabel("Discounted Ammount");
	    lbl_DiscountAmmount.setHorizontalAlignment(SwingConstants.LEFT);
	    lbl_DiscountAmmount.setForeground(Color.WHITE);
	    lbl_DiscountAmmount.setFont(new Font("Times New Roman", Font.PLAIN, 21));
	    lbl_DiscountAmmount.setBounds(10, 391, 197, 41);
	    pnl_invoice.add(lbl_DiscountAmmount);
	    
	    txt_discAmount = new JTextField();
	    txt_discAmount.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	    txt_discAmount.setColumns(10);
	    txt_discAmount.setBounds(199, 395, 199, 34);
	    pnl_invoice.add(txt_discAmount);
	    
	    JButton btn_UpdateRecord = new JButton("Update Record");
	    btn_UpdateRecord.setIcon(new ImageIcon(Salling_Billing.class.getResource("/images/update.png")));
	    btn_UpdateRecord.setFont(new Font("Times New Roman", Font.BOLD, 20));
	    btn_UpdateRecord.setBounds(53, 454, 199, 34);
	    pnl_invoice.add(btn_UpdateRecord);
	    
	    JLabel lbl_ItemID = new JLabel("Item ID :-");
	    lbl_ItemID.setHorizontalAlignment(SwingConstants.RIGHT);
	    lbl_ItemID.setForeground(Color.WHITE);
	    lbl_ItemID.setFont(new Font("Times New Roman", Font.PLAIN, 22));
	    lbl_ItemID.setBounds(29, 54, 155, 41);
	    pnl_invoice.add(lbl_ItemID);
	    
	    txt_ItemId = new JTextField();
	    txt_ItemId.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	    txt_ItemId.setColumns(10);
	    txt_ItemId.setBounds(199, 54, 199, 34);
	    pnl_invoice.add(txt_ItemId);
	    
	    btn_Back =  new JButton("Back");
	    btn_Back.setIcon(new ImageIcon(Salling_Billing.class.getResource("/images/return.png")));
	    btn_Back.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		try {
					Main_Menu.main(null);
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace(); 
				}
				frm_purchase.setVisible(false);
			}
	    });
	    btn_Back.setBackground(Color.WHITE);
	    btn_Back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    btn_Back.setForeground(Color.BLACK);
	    btn_Back.setFont(new Font("Times New Roman", Font.BOLD, 21));
	    btn_Back.setBounds(21, 21, 120, 33);
	    frm_purchase.getContentPane().add(btn_Back);
	    
	    JPanel pnl_table = new JPanel();
	    pnl_table.setForeground(Color.BLACK);
	    pnl_table.setBorder(new LineBorder(Color.WHITE, 2, true));
	    pnl_table.setBackground(new Color(0,0,0,65));
	    pnl_table.setBounds(456, 178, 882, 543);
	    frm_purchase.getContentPane().add(pnl_table);
	    pnl_table.setLayout(null);
	   
	    JLabel lbl_custoname = new JLabel("Customer Name :-");
	    lbl_custoname.setHorizontalAlignment(SwingConstants.LEFT);
	    lbl_custoname.setForeground(Color.WHITE);
	    lbl_custoname.setFont(new Font("Times New Roman", Font.PLAIN, 25));
	    lbl_custoname.setBounds(25, 10, 197, 41);
	    pnl_table.add(lbl_custoname);
	    
	    JLabel lbl_Date = new JLabel("Date :-");
	    lbl_Date.setHorizontalAlignment(SwingConstants.LEFT);
	    lbl_Date.setForeground(Color.WHITE);
	    lbl_Date.setFont(new Font("Times New Roman", Font.PLAIN, 25));
	    lbl_Date.setBounds(572, 10, 81, 41);
	    pnl_table.add(lbl_Date);
	    
	    txt_custname = new JTextField();
	    txt_custname.setFont(new Font("Times New Roman", Font.PLAIN, 25));
	    txt_custname.setColumns(10);
	    txt_custname.setBounds(232, 13, 166, 34);
	    pnl_table.add(txt_custname);
	    
	    
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    Date date = new Date();  
	    txt_date = new JTextField();
	    txt_date.setFont(new Font("Times New Roman", Font.PLAIN, 25));
	    txt_date.setColumns(10);
	    txt_date.setBounds(663, 10, 166, 34);
	    txt_date.setText(formatter.format(date));
	    pnl_table.add(txt_date);
	    
	    JLabel lbl_totamount = new JLabel("Totle Amount :-");
	    lbl_totamount.setHorizontalAlignment(SwingConstants.LEFT);
	    lbl_totamount.setForeground(Color.WHITE);
	    lbl_totamount.setFont(new Font("Times New Roman", Font.PLAIN, 25));
	    lbl_totamount.setBounds(25, 489, 172, 41);
	    pnl_table.add(lbl_totamount);
	    
	    
	    txt_ItemId.setEditable(false);
		txt_avliStock.setEditable(false);
	    txt_totamount = new JTextField();
	    txt_totamount.setFont(new Font("Times New Roman", Font.PLAIN, 25));
	    txt_totamount.setColumns(10);
	    txt_totamount.setBounds(207, 492, 166, 38);
	    pnl_table.add(txt_totamount);
	   
	    
	    table = new JTable();
	    table.setFont(new Font("Times New Roman", Font.PLAIN, 15));
	    Object[] columns= {	"Iteam ID", "Iteam Name", "Iteam Price", "Iteam Qunttey","Iteam Profit", "Tex", "Discount", "Totle","SallingDate"};
	    DefaultTableModel model=new DefaultTableModel();
	    model.setColumnIdentifiers(columns);
	    table.setModel(model);
	    table.setBackground(Color.WHITE);
	    table.setForeground(Color.BLACK);
	    table.setGridColor(Color.RED);
	    table.setSelectionBackground(Color.BLACK);
	    table.setSelectionForeground(Color.WHITE);
	    table.setRowHeight(30);
	    table.setAutoCreateRowSorter(true);
	    
	    scrollPane = new JScrollPane(table);
	    scrollPane.setFont(new Font("Times New Roman", Font.PLAIN, 20));
	    scrollPane.setSize(new Dimension(1, 1));
	    scrollPane.setAutoscrolls(true);
	    scrollPane.setBorder(new LineBorder(null, 3, true));
	    scrollPane.setBounds(10, 53, 862, 426);
	    pnl_table.add(scrollPane);
        Object[] row=new Object[10];	   
	    scrollPane.setViewportView(table);
	    
	    JButton btn_CronfirmOrder = new JButton("Confirm  Order");
	    btn_CronfirmOrder.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		try {
	    			
	    			for(int i=0; i<model.getRowCount(); i++)
	    			{
	    				String Cstock=null;
	    				String Ostock=model.getValueAt(i,3).toString();
	    				ResultSet CS=conn.prepareStatement("Select * from tbl_items where ItemID="+model.getValueAt(i,0).toString()).executeQuery();
	    				if(CS.next()){
	    					Cstock=CS.getString("ItemStock").toString();
	    				}
	    				int Ustock=Integer.parseInt(Cstock)-Integer.parseInt(Ostock);;
	    			
	    				PreparedStatement ipst=conn.prepareStatement("update tbl_items set ItemStock=(?) where ItemId="+model.getValueAt(i,0).toString());
	    				ipst.setString(1,Integer.toString(Ustock));
	    				ipst.executeUpdate();
	    				
	    				PreparedStatement pst=conn.prepareStatement("INSERT INTO tbl_order(InvoiceId,"
	    				+ " CustomerName,ItemID,ItemName, Price,ItemQuantity, ItemProfite,Tax, Discount,TotleAmount,Date) VALUES (?,?,?,?,?,?,?,?,?,?,?)"); 
			
						//			pst.setString(1,txt_.toString());
									pst.setString(1,txt_InvoiceNo.getText().toString());
									pst.setString(2,cmb_Customer.getSelectedItem().toString());
									pst.setString(3,model.getValueAt( i,0).toString());
									pst.setString(4,model.getValueAt( i,1).toString());
									pst.setString(5,model.getValueAt( i,2).toString());
									pst.setString(6,model.getValueAt( i,3).toString());
									pst.setString(7,model.getValueAt( i,4).toString());
									pst.setString(8,model.getValueAt( i,5).toString());
									pst.setString(9,model.getValueAt( i,6).toString());
									pst.setString(10,model.getValueAt( i,7).toString());
									Date now = new Date();
								    SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd");
								    String mysqlDateString = formatter.format(now);
						
						//			Data d=model.getValueAt( i,8).toString();
									pst.setString(11,mysqlDateString.toString());
									pst.executeUpdate();
	    			}
					JOptionPane.showMessageDialog(null,"Order Confirm");
	    			
	    				
	    			}
	    			catch(Exception e1)
	    			{
	    				JOptionPane.showMessageDialog(null,e1.toString());
		    			
	    				System.out.println("Error : "+e1.toString());
	    			}
	    		
	    		
	    	}
	    });
	    btn_CronfirmOrder.setFont(new Font("Times New Roman", Font.BOLD, 25));
	    btn_CronfirmOrder.setBounds(540, 489, 227, 41);
	    pnl_table.add(btn_CronfirmOrder);
	    frm_purchase.revalidate();
	    
	    JPanel pnl_Button = new JPanel();
	    pnl_Button.setBorder(new LineBorder(null, 2));
	    pnl_Button.setBackground(new Color(0,0,0,65));
	    pnl_Button.setForeground(Color.WHITE);
	    pnl_Button.setBounds(456, 106, 882, 62);
	    frm_purchase.getContentPane().add(pnl_Button);
	    pnl_Button.setLayout(null);
	    
	    JButton btn_Delete = new JButton("Delete");
	    btn_Delete.setIcon(new ImageIcon(Salling_Billing.class.getResource("/images/delete.png")));
	    btn_Delete.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		int i = table.getSelectedRow();
		    	if(i>=0)
		    	{
		    		model.removeRow(i); 
		    		 int sum = 0;
		    	        for(int i1 = 0; i1 < table.getRowCount(); i1++)
		    	        {
		    	            sum = sum + Integer.parseInt(table.getValueAt(i1, 7).toString());
		    	        }
		    	        
		    	        txt_totamount.setText(Integer.toString(sum)); 
		    	}
		    	else {
		    		JOptionPane.showMessageDialog(frm_purchase,"Delete Error");
		    	}
		    	

	    		
	    	}
	    });
	    btn_Delete.setFont(new Font("Times New Roman", Font.BOLD, 25));
	    btn_Delete.setBounds(339, 10, 184, 34);
	    pnl_Button.add(btn_Delete);
	    
	    JButton btn_Reset = new JButton("Reset");
	    btn_Reset.setFont(new Font("Times New Roman", Font.BOLD, 25));
	    btn_Reset.setBounds(589, 10, 179, 34);
	    pnl_Button.add(btn_Reset);
	    
	    JButton btn_Update = new JButton("Modify");
	    btn_Update.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		int i=	 table.getSelectedRow();
	    		//	txt_Price.setText(row[3].toString());
					cmb_item.setSelectedItem(table.getValueAt(i, 1).toString());
		    		txt_Quantity.setText(table.getValueAt(i, 2).toString());
		    		txt_Price.setText(table.getValueAt(i, 3).toString());
		    	
		    		txt_tax.setText(table.getValueAt(i, 5).toString());
		    		txt_totamount.setText(table.getValueAt(i, 6).toString());
	    	}
	    });
	    btn_Update.setFont(new Font("Times New Roman", Font.BOLD, 25));
	    btn_Update.setBounds(98, 10, 179, 34);
	    pnl_Button.add(btn_Update);
	    
	 
	    
	    
	    rbt_OldCust.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				try {
					ResultSet rs=conn.prepareStatement("select *from tbl_Customer").executeQuery();
				
					while(rs.next())
					{
						cmb_Customer.addItem(rs.getString("Cstname"));
					}
					
					}
				catch(Exception e1)
					{
						System.out.println("Error : "+e1.toString());
					}
				
			}
		});
	 
	    btn_calulate.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		  if(txt_Quantity.getText().length()==0){
	    		      
		        		JOptionPane.showMessageDialog(frm_purchase,"Palese Enter Item Quntity");
		          }else
		          {
		        	if(Integer.parseInt(txt_Quantity.getText()) < Integer.parseInt(txt_avliStock.getText())) 
		        			{
		        		
		        		
		    		int Price=Integer.parseInt(	txt_Price.getText());
		    		int Stock =	Integer.parseInt(txt_Quantity.getText());
		    		int Profit=100+Integer.parseInt( txt_ItemProfit.getText());
		    		int Tax=100+Integer.parseInt(txt_tax.getText());
		    		int dis=100-Integer.parseInt(txt_discount.getText());
		    		int cal=((((Price*Stock)*Profit)/100*dis)/100*Tax)/100;
                    txt_discAmount.setText(String.valueOf(cal));
		        			}else
		        			{
		        				JOptionPane.showMessageDialog(frm_purchase,"Palese Enter less Item Quntity");
		        			}
		       	  }	
	    		}
	    });
	    
	  
	    btn_Add.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	   		
	    	
	    		row[0]=txt_ItemId.getText();
	    		row[1]=cmb_item.getSelectedItem().toString();
	    		row[2]=txt_Price.getText();
	    		row[3]=txt_Quantity.getText();
	    		row[4]=txt_ItemProfit.getText();	    				
	    		row[5]=txt_tax.getText();
	    		row[6]=txt_discount.getText();
	    		row[7]=txt_discAmount.getText();
	    		row[8]=txt_date.getText();	    		
	    		model.addRow(row);
	    		
	    		  int sum = 0;
	    	        for(int i = 0; i < table.getRowCount(); i++)
	    	        {
	    	            sum = sum + Integer.parseInt(table.getValueAt(i, 7).toString());
	    	        }
	    	        
	    	        txt_totamount.setText(Integer.toString(sum));
	    	    	txt_ItemId.setText("");
	    	    	cmb_item.removeItem(cmb_item.getSelectedItem());  
			    	txt_Price.setText("");
					txt_avliStock.setText("");
					txt_ItemProfit.setText("");
					txt_discAmount.setText("");
					txt_Quantity.setText("");
					txt_tax.setText("");
					txt_discount.setText("");
					btn_Add.setEnabled(false);
					cmb_item.setSelectedIndex(0);
			
	    	}
	    	
	    });
	    btn_UpdateRecord.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		int i = table.getSelectedRow();
		    	if(i>=0)
		    	{  
		    		model.setValueAt(txt_ItemId.getText(), i,0);
		    		model.setValueAt(cmb_item.getSelectedItem().toString(),i,1);
		    		model.setValueAt(txt_Price.getText(),i,2);
		    		model.setValueAt(txt_Quantity.getText(),i,3);
		    		
		    		model.setValueAt(txt_ItemProfit.getText(),i,4);
		    		model.setValueAt(txt_tax.getText(),i,5);
		    		model.setValueAt(txt_discount.getText(),i,6);
		    		model.setValueAt(txt_discAmount.getText(),i,7);
		    		
		    		  int sum = 0;
		    	        for(int i1 = 0; i1 < table.getRowCount(); i1++)
		    	        {
		    	            sum = sum + Integer.parseInt(table.getValueAt(i1, 7).toString());
		    	        }
		    	        
		    	        txt_totamount.setText(Integer.toString(sum));
		    		

		    	}
		    	else {
		    		JOptionPane.showMessageDialog(frm_purchase,"Update Error");
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
