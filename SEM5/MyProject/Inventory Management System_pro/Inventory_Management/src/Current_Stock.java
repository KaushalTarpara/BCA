import java.awt.EventQueue; 

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSetMetaData;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.UnsupportedLookAndFeelException;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Current_Stock {

	private JFrame frm_CurantStock;
	private JPanel pnl_importStock;
	private JTextField txt_ItemSearch;
	private JLabel lbl_Search;
	private JButton btn_Search;
	private JPanel pnl_table;
	private JButton btnNewButton;
	private JTable table;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Current_Stock window = new Current_Stock();
					window.frm_CurantStock.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Current_Stock() { 
	
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
		   	Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
			DefaultTableModel model=new DefaultTableModel();
		    
			class Rfun
		    {
		      void showTData(String sort ,String search)
		    	{
		    	try {
		    	//	  String sort =cmb_sort.getSelectedItem().toString();
				    	
		    	ResultSet rs=null;
		    	if(search.equals(""))
		    	{
		    		 rs =conn.createStatement().executeQuery("select *from tbl_Items order by "+sort);
		    	}else
		    	{
		    		rs =conn.createStatement().executeQuery("SELECT * FROM  tbl_Items where ItemName like '"+search+"%' order by "+sort);
		    	}
//		    	else
//		    	{
//		    		rs =conn.createStatement().executeQuery("SELECT * FROM  tbl_Items where order by '"+sort+"'");
//		    	}
		   
		    		
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
					JOptionPane.showMessageDialog(null,"Error showing data");
					System.out.println("Error : "+e1.toString());
				}
		    	}
			}		
		 Rfun r1=new Rfun();
		frm_CurantStock = new JFrame();
		frm_CurantStock.setTitle("Currant Stock Data");
		frm_CurantStock.setIconImage(Toolkit.getDefaultToolkit().getImage(Current_Stock.class.getResource("/images/all.png")));
		frm_CurantStock.getContentPane().setBackground(Color.BLACK);
		frm_CurantStock.setResizable(false);
		frm_CurantStock.getContentPane().setForeground(Color.WHITE);
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
       frm_CurantStock.setContentPane(contentPane);

		frm_CurantStock.getContentPane().setLayout(null);
		frm_CurantStock.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frm_CurantStock.setBounds(0,0, 1380, 798);
	
	//	model.setColumnIdentifiers(columns);

		
		pnl_importStock = new JPanel();
		pnl_importStock.setBackground(new Color(0,0,0,65));
		pnl_importStock.setBorder(new LineBorder(Color.WHITE, 2, true));
		pnl_importStock.setBounds(10, 138, 1346, 89);
		frm_CurantStock.getContentPane().add(pnl_importStock);
		pnl_importStock.setLayout(null);
		
		txt_ItemSearch = new JTextField();
		txt_ItemSearch.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		txt_ItemSearch.setColumns(10);
		txt_ItemSearch.setBounds(219, 31, 218, 29);
		pnl_importStock.add(txt_ItemSearch);
		
		lbl_Search = new JLabel("Search Item :-");
		lbl_Search.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_Search.setForeground(Color.WHITE);
		lbl_Search.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lbl_Search.setBounds(43, 26, 156, 41);
		pnl_importStock.add(lbl_Search);
		
		
		
		JComboBox<String> cmb_sort = new JComboBox<String>();
		cmb_sort.setModel(new DefaultComboBoxModel<String>(new String[] {"ItemID", "ItemName", "ItemMetel", "ItemBrand", "ItemPrice", "ItemProfit", "ItemDIscount", "ItemTex", "ItemStock", "ItemTotleCost", "ItemUPdateDate"}));
//		cmb_sort.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//		    	
//				String sort =cmb_sort.getSelectedItem().toString();
//				r1.showTData(sort,null);
//				
//			}
//		});
		cmb_sort.setMaximumRowCount(10);
		cmb_sort.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		cmb_sort.setBounds(626, 27, 165, 33);
		pnl_importStock.add(cmb_sort);
		
		btn_Search = new JButton("Search");
		btn_Search.setIcon(new ImageIcon(Current_Stock.class.getResource("/images/search.png")));
		btn_Search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1=txt_ItemSearch.getText().toString();	
				String sort=cmb_sort.getSelectedItem().toString();
				r1.showTData(sort,s1);
			
			}
		});
		btn_Search.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btn_Search.setBounds(812, 27, 156, 33);
		pnl_importStock.add(btn_Search);
		
		JLabel lbl_Sort = new JLabel("Sort By :-");
		lbl_Sort.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_Sort.setForeground(Color.WHITE);
		lbl_Sort.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lbl_Sort.setBounds(465, 26, 156, 41);
		pnl_importStock.add(lbl_Sort);
		
		JLabel lbl_Title = new JLabel("Currant Stock Data");
		lbl_Title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Title.setForeground(Color.WHITE);
		lbl_Title.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lbl_Title.setBounds(428, 38, 440, 79);
		frm_CurantStock.getContentPane().add(lbl_Title);
		
		pnl_table = new JPanel();
		pnl_table.setLayout(null);
		pnl_table.setBorder(new LineBorder(Color.WHITE, 2, true));
		pnl_table.setBackground(new Color(0,0,0,65));
		pnl_table.setBounds(10, 237, 1346, 498);
		frm_CurantStock.getContentPane().add(pnl_table);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		scrollPane.setSize(new Dimension(1, 1));
	    scrollPane.setAutoscrolls(true);
	    scrollPane.setBorder(new LineBorder(new Color(130, 135, 144), 2, true));
	    @SuppressWarnings("unused")
		Object[] row=new Object[11];	   
	    scrollPane.setBounds(20, 22, 1300, 451);
		pnl_table.add(scrollPane);
		
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

		
		btnNewButton = new JButton("Back");
		btnNewButton.setIcon(new ImageIcon(Current_Stock.class.getResource("/images/return.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				Main_Menu.main(null);
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
					| UnsupportedLookAndFeelException e1) {
				e1.printStackTrace();
			}
			frm_CurantStock.setVisible(false);
			
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(10, 28, 118, 29);
		frm_CurantStock.getContentPane().add(btnNewButton);
	
		frm_CurantStock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		catch(Exception e1)
		{
			
			System.out.println("Error : "+e1.toString());
		}	

	}
}
