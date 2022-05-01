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
import java.awt.Toolkit;

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
import javax.swing.ImageIcon;

public class PurchaseData {

	private JFrame frm_PurchaseData;
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
					PurchaseData window = new PurchaseData();
					window.frm_PurchaseData.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public PurchaseData() { 
	
		
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
		    		 rs =conn.createStatement().executeQuery("select *from tbl_Purchase order by "+sort);
		    	}else
		    	{
		    		rs =conn.createStatement().executeQuery("SELECT * FROM  tbl_Purchase where ItemName like '"+search+"%' order by "+sort);
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
					 columnData.add(rs.getString("PurchaseID"));
					 columnData.add(rs.getString("InvoiceID"));
					 columnData.add(rs.getString("SupplierName"));
					 columnData.add(rs.getString("ItemID"));
					 columnData.add(rs.getString("ItemName"));
					 columnData.add(rs.getString("ItemQuantity"));
					 columnData.add(rs.getString("Price"));
					 columnData.add(rs.getString("Tax"));
					 columnData.add(rs.getString("TotleAmount"));
					 columnData.add(rs.getString("Date"));
					 
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
		frm_PurchaseData = new JFrame();
		frm_PurchaseData.setTitle("Purchase Data");
		frm_PurchaseData.setIconImage(Toolkit.getDefaultToolkit().getImage(PurchaseData.class.getResource("/images/report.png")));
		frm_PurchaseData.getContentPane().setBackground(Color.BLACK);
		frm_PurchaseData.getContentPane().setForeground(Color.WHITE);
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
       frm_PurchaseData.setResizable(false);
       frm_PurchaseData.setContentPane(contentPane);
       frm_PurchaseData.getContentPane().setLayout(null);
       frm_PurchaseData.setExtendedState(JFrame.MAXIMIZED_BOTH);
	
	//	model.setColumnIdentifiers(columns);

		
		pnl_importStock = new JPanel();
		pnl_importStock.setBackground(new Color(0,0,0,65));
		pnl_importStock.setBorder(new LineBorder(Color.WHITE, 2, true));
		pnl_importStock.setBounds(10, 120, 1330, 79);
		frm_PurchaseData.getContentPane().add(pnl_importStock);
		pnl_importStock.setLayout(null);
		
		txt_ItemSearch = new JTextField();
		txt_ItemSearch.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		txt_ItemSearch.setColumns(10);
		txt_ItemSearch.setBounds(219, 27, 280, 33);
		pnl_importStock.add(txt_ItemSearch);
		
		lbl_Search = new JLabel("Search Item :-");
		lbl_Search.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_Search.setForeground(Color.WHITE);
		lbl_Search.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lbl_Search.setBounds(43, 26, 156, 41);
		pnl_importStock.add(lbl_Search);
		
		
		
		JComboBox<String> cmb_sort = new JComboBox<String>();
		cmb_sort.setModel(new DefaultComboBoxModel<String>(new String[] {"PurchaseID", "InvoiceID", "SupplierName", "ItemID", "ItemName", "ItemQuantity", "Price", "Tax", "TotleAmount", "Date"}));
		cmb_sort.setMaximumRowCount(10);
		cmb_sort.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		cmb_sort.setBounds(690, 27, 185, 33);
		pnl_importStock.add(cmb_sort);
		
		btn_Search = new JButton("Search");
		btn_Search.setIcon(new ImageIcon(PurchaseData.class.getResource("/images/search.png")));
		btn_Search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1=txt_ItemSearch.getText().toString();	
				String sort=cmb_sort.getSelectedItem().toString();
				r1.showTData(sort,s1);
			
			}
		});
		btn_Search.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btn_Search.setBounds(931, 27, 156, 38);
		pnl_importStock.add(btn_Search);
		
		JLabel lbl_Sort = new JLabel("Sort By :-");
		lbl_Sort.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_Sort.setForeground(Color.WHITE);
		lbl_Sort.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lbl_Sort.setBounds(524, 26, 156, 41);
		pnl_importStock.add(lbl_Sort);
		
		JLabel lbl_Title = new JLabel("Purchase Data ");
		lbl_Title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Title.setForeground(Color.WHITE);
		lbl_Title.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lbl_Title.setBounds(415, 31, 440, 79);
		frm_PurchaseData.getContentPane().add(lbl_Title);
		
		pnl_table = new JPanel();
		pnl_table.setLayout(null);
		pnl_table.setBorder(new LineBorder(Color.WHITE, 2, true));
		pnl_table.setBackground(new Color(0,0,0,65));
		pnl_table.setBounds(10, 210, 1330, 520);
		frm_PurchaseData.getContentPane().add(pnl_table);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		scrollPane.setSize(new Dimension(1, 1));
	    scrollPane.setAutoscrolls(true);
	    scrollPane.setBorder(new LineBorder(new Color(130, 135, 144), 2, true));
	    @SuppressWarnings("unused")
		Object[] row=new Object[11];	   
	    scrollPane.setBounds(10, 10, 1300, 498);
		pnl_table.add(scrollPane);
		
			table = new JTable();
			table.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		 	Object[] columns= {"PurchaseID","InvoiceID","SupplierName" ,"ItemID", "ItemName", "ItemQuanity", "Price", "Tex", "TotleAmount", "Date"};
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
		btnNewButton.setIcon(new ImageIcon(PurchaseData.class.getResource("/images/return.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				Main_Menu.main(null);
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
					| UnsupportedLookAndFeelException e1) {
				e1.printStackTrace();
			}
			frm_PurchaseData.setVisible(false);
			
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(10, 10, 107, 37);
		frm_PurchaseData.getContentPane().add(btnNewButton);
		frm_PurchaseData.setBounds(0,0,1364,777);
		frm_PurchaseData.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		catch(Exception e1)
		{
			
			System.out.println("Error : "+e1.toString());
		}	

	}
}
