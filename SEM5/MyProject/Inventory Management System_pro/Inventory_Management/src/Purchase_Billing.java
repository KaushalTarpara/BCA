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

import javax.swing.JTextField;

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

public class Purchase_Billing {

	private JFrame frm_purchase;
	private JButton btn_Back;
	private JPanel pnl_invoice;
	private JTextField txt_InvoiceNo;
	private JTextField txt_Price;
	private JTextField txt_tax;
	private JTextField txt_avliStock;
	private JTextField txt_Quantity;
	private JTextField txt_TotAmount;
	private JTextField txt_Supname;
	private JTextField txt_date;
	private JTextField txt_totamount;
	DefaultTableModel model;
	private JTable table;
	private JScrollPane scrollPane;
	private JTextField txt_ItemID;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Purchase_Billing window = new Purchase_Billing();
					window.frm_purchase.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@SuppressWarnings({ "serial", "unchecked", "rawtypes" })
	public Purchase_Billing() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory", "root",
					"");

			frm_purchase = new JFrame("Purches & Billing");
			frm_purchase.setIconImage(
					Toolkit.getDefaultToolkit().getImage(Purchase_Billing.class.getResource("/images/report.png")));
			frm_purchase.getContentPane().setBackground(Color.BLACK);
			frm_purchase.setBounds(0, 0, 1365, 768);
			frm_purchase.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frm_purchase.setResizable(false);
			JPanel contentPane = new JPanel() {
				public void paintComponent(Graphics g) {
					Image img = Toolkit.getDefaultToolkit().getImage(Main_Menu.class.getResource("Image/BG3.jpg"));
					g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
				}
			};
			frm_purchase.setContentPane(contentPane);
			frm_purchase.getContentPane().setLayout(null);
			frm_purchase.setLocationRelativeTo(null);
			frm_purchase.setExtendedState(JFrame.MAXIMIZED_BOTH);

			JLabel lbl_Title = new JLabel("Purchase & Billing");
			lbl_Title.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_Title.setFont(new Font("Times New Roman", Font.PLAIN, 50));
			lbl_Title.setForeground(Color.WHITE);
			lbl_Title.setBounds(413, 21, 440, 79);
			frm_purchase.getContentPane().add(lbl_Title);

			pnl_invoice = new JPanel();
			pnl_invoice.setBorder(new LineBorder(Color.WHITE, 2, true));
			pnl_invoice.setBackground(new Color(0, 0, 0, 65));
			pnl_invoice.setForeground(Color.BLACK);
			pnl_invoice.setBounds(10, 105, 478, 616);
			frm_purchase.getContentPane().add(pnl_invoice);
			pnl_invoice.setLayout(null);

			JLabel lbl_invoiceno = new JLabel("Invoice No.");
			lbl_invoiceno.setHorizontalAlignment(SwingConstants.RIGHT);
			lbl_invoiceno.setForeground(Color.WHITE);
			lbl_invoiceno.setFont(new Font("Times New Roman", Font.PLAIN, 22));
			lbl_invoiceno.setBounds(29, 68, 155, 41);
			pnl_invoice.add(lbl_invoiceno);

			JLabel lbl_itemname = new JLabel("Iteam Name");
			lbl_itemname.setHorizontalAlignment(SwingConstants.RIGHT);
			lbl_itemname.setForeground(Color.WHITE);
			lbl_itemname.setFont(new Font("Times New Roman", Font.PLAIN, 22));
			lbl_itemname.setBounds(29, 163, 155, 41);
			pnl_invoice.add(lbl_itemname);

			JLabel lbl_Price = new JLabel("Price  (\u20B9)");
			lbl_Price.setHorizontalAlignment(SwingConstants.RIGHT);
			lbl_Price.setForeground(Color.WHITE);
			lbl_Price.setFont(new Font("Times New Roman", Font.PLAIN, 22));
			lbl_Price.setBounds(29, 214, 155, 41);
			pnl_invoice.add(lbl_Price);

			JLabel lbl_Tax = new JLabel("Tax(%)");
			lbl_Tax.setHorizontalAlignment(SwingConstants.RIGHT);
			lbl_Tax.setForeground(Color.WHITE);
			lbl_Tax.setFont(new Font("Times New Roman", Font.PLAIN, 22));
			lbl_Tax.setBounds(29, 265, 155, 41);
			pnl_invoice.add(lbl_Tax);

			JLabel lbl_AvStcck = new JLabel("Available Stock");
			lbl_AvStcck.setHorizontalAlignment(SwingConstants.RIGHT);
			lbl_AvStcck.setForeground(Color.WHITE);
			lbl_AvStcck.setFont(new Font("Times New Roman", Font.PLAIN, 22));
			lbl_AvStcck.setBounds(29, 367, 155, 41);
			pnl_invoice.add(lbl_AvStcck);

			JLabel lbl_quantity = new JLabel("Quantity");
			lbl_quantity.setHorizontalAlignment(SwingConstants.RIGHT);
			lbl_quantity.setForeground(Color.WHITE);
			lbl_quantity.setFont(new Font("Times New Roman", Font.PLAIN, 22));
			lbl_quantity.setBounds(29, 317, 155, 41);
			pnl_invoice.add(lbl_quantity);

			txt_InvoiceNo = new JTextField();
			txt_InvoiceNo.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			txt_InvoiceNo.setBounds(199, 68, 253, 34);
			txt_InvoiceNo.setEditable(false);
			ResultSet rsl = conn.createStatement()
					.executeQuery("SELECT * FROM `tbl_purchase` ORDER BY `tbl_purchase`.`InvoiceID` ASC");
			if (rsl.next() == false) {
				txt_InvoiceNo.setText("1");
			}

			while (rsl.next()) {
				String NI = String.valueOf(Integer.parseInt(rsl.getString("InvoiceId")) + 1);
				txt_InvoiceNo.setText(NI);
			}
			pnl_invoice.add(txt_InvoiceNo);
			txt_InvoiceNo.setColumns(10);

			txt_Price = new JTextField();
			txt_Price.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			txt_Price.setColumns(10);
			txt_Price.setBounds(199, 213, 253, 34);
			pnl_invoice.add(txt_Price);

			txt_tax = new JTextField();
			txt_tax.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			txt_tax.setColumns(10);
			txt_tax.setBounds(199, 268, 253, 34);
			pnl_invoice.add(txt_tax);

			txt_avliStock = new JTextField();
			txt_avliStock.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			txt_avliStock.setColumns(10);
			txt_avliStock.setBounds(199, 366, 253, 34);
			txt_avliStock.setEditable(false);
			pnl_invoice.add(txt_avliStock);

			txt_Quantity = new JTextField();
			txt_Quantity.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			txt_Quantity.setColumns(10);
			txt_Quantity.setBounds(199, 316, 253, 34);
			pnl_invoice.add(txt_Quantity);

			JComboBox<String> cmb_item = new JComboBox<String>();

			cmb_item.setMaximumRowCount(10);
			cmb_item.setFont(new Font("Times New Roman", Font.PLAIN, 21));

			cmb_item.setModel(new DefaultComboBoxModel<String>(new String[] { "--- Select Item ---" }));
			cmb_item.setBounds(199, 166, 197, 34);
			try {

				ResultSet rs = conn.createStatement().executeQuery("select *from tbl_items");

				while (rs.next()) {
					cmb_item.addItem(rs.getString("ItemName"));
				}
			} catch (Exception e1) {
				System.out.println("Error : " + e1.toString());
			}

			pnl_invoice.add(cmb_item);
			JButton btn_Add = new JButton("Add");

			btn_Add.setFont(new Font("Times New Roman", Font.BOLD, 23));
			btn_Add.setBounds(344, 533, 110, 34);
			pnl_invoice.add(btn_Add);

			cmb_item.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					try {
						txt_ItemID.setText("");
						txt_Price.setText("");
						txt_avliStock.setText("");
						txt_tax.setText("");
						ResultSet rs = conn.createStatement().executeQuery("select *from tbl_items where ItemName = '"
								+ cmb_item.getSelectedItem().toString() + "' ");

						if (rs.next()) {
							txt_ItemID.setText(rs.getString("ItemID"));
							txt_Price.setText(rs.getString("ItemPrice"));
							txt_avliStock.setText(rs.getString("ItemStock"));
							txt_tax.setText(rs.getString("ItemTex"));
							btn_Add.setEnabled(true);
						}

					} catch (Exception e1) {
						System.out.println("Error : " + e1.toString());
					}
				}
			});

			JButton btn_calulate = new JButton("Calulate");

			btn_calulate.setFont(new Font("Times New Roman", Font.BOLD, 23));
			btn_calulate.setBounds(199, 420, 253, 34);
			pnl_invoice.add(btn_calulate);

			JLabel lbl_TotleAmmount = new JLabel("Totle Ammount");
			lbl_TotleAmmount.setHorizontalAlignment(SwingConstants.RIGHT);
			lbl_TotleAmmount.setForeground(Color.WHITE);
			lbl_TotleAmmount.setFont(new Font("Times New Roman", Font.PLAIN, 21));
			lbl_TotleAmmount.setBounds(10, 476, 179, 41);
			pnl_invoice.add(lbl_TotleAmmount);

			txt_TotAmount = new JTextField();
			txt_TotAmount.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			txt_TotAmount.setColumns(10);
			txt_TotAmount.setBounds(199, 478, 253, 34);
			pnl_invoice.add(txt_TotAmount);

			JButton btn_UpdateRecord = new JButton("Update Item");
			btn_UpdateRecord.setFont(new Font("Times New Roman", Font.BOLD, 23));
			btn_UpdateRecord.setBounds(139, 533, 179, 34);
			btn_UpdateRecord.setEnabled(false);
			pnl_invoice.add(btn_UpdateRecord);

			JLabel lbl_SupName_1 = new JLabel("Supplier Name :-");
			lbl_SupName_1.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_SupName_1.setForeground(Color.WHITE);
			lbl_SupName_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
			lbl_SupName_1.setBounds(10, 10, 191, 42);
			pnl_invoice.add(lbl_SupName_1);

			JComboBox<String> cmb_selectSup = new JComboBox<String>();
			cmb_selectSup.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txt_Supname.setText(cmb_selectSup.getSelectedItem().toString());
				}
			});
			cmb_selectSup.setModel(new DefaultComboBoxModel(new String[] { "---Select Supplier ---" }));
			cmb_selectSup.setFont(new Font("Times New Roman", Font.PLAIN, 22));
			cmb_selectSup.setBounds(211, 16, 218, 34);
			pnl_invoice.add(cmb_selectSup);

			JLabel lbl_ItemID = new JLabel("Item Id :-");
			lbl_ItemID.setHorizontalAlignment(SwingConstants.RIGHT);
			lbl_ItemID.setForeground(Color.WHITE);
			lbl_ItemID.setFont(new Font("Times New Roman", Font.PLAIN, 22));
			lbl_ItemID.setBounds(29, 119, 155, 41);
			pnl_invoice.add(lbl_ItemID);

			txt_ItemID = new JTextField();
			txt_ItemID.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			txt_ItemID.setColumns(10);
			txt_ItemID.setBounds(199, 119, 253, 34);
			txt_ItemID.setEditable(false);
			pnl_invoice.add(txt_ItemID);
			ResultSet rs = conn.prepareStatement("select *from tbl_supplier").executeQuery();

			while (rs.next()) {
				cmb_selectSup.addItem(rs.getString("SupName"));
			}

			btn_Back = new JButton("Back");
			btn_Back.setIcon(new ImageIcon(Purchase_Billing.class.getResource("/images/return.png")));
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
			btn_Back.setBounds(10, 10, 109, 34);
			frm_purchase.getContentPane().add(btn_Back);

			JPanel pnl_table = new JPanel();
			pnl_table.setForeground(Color.BLACK);
			pnl_table.setBorder(new LineBorder(Color.WHITE, 2, true));
			pnl_table.setBackground(new Color(0, 0, 0, 65));
			pnl_table.setBounds(496, 154, 845, 567);
			frm_purchase.getContentPane().add(pnl_table);
			pnl_table.setLayout(null);

			JLabel lbl_custoname = new JLabel("Supplier Name :-");
			lbl_custoname.setHorizontalAlignment(SwingConstants.LEFT);
			lbl_custoname.setForeground(Color.WHITE);
			lbl_custoname.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			lbl_custoname.setBounds(10, 7, 197, 41);
			pnl_table.add(lbl_custoname);

			JLabel lbl_Date = new JLabel("Date :-");
			lbl_Date.setHorizontalAlignment(SwingConstants.LEFT);
			lbl_Date.setForeground(Color.WHITE);
			lbl_Date.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			lbl_Date.setBounds(566, 7, 81, 41);
			pnl_table.add(lbl_Date);

			txt_Supname = new JTextField();
			txt_Supname.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			txt_Supname.setColumns(10);
			txt_Supname.setBounds(189, 10, 197, 34);
			pnl_table.add(txt_Supname);

			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date date = new Date();
			txt_date = new JTextField();
			txt_date.setEditable(false);
			txt_date.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			txt_date.setColumns(10);
			txt_date.setBounds(657, 10, 166, 34);
			txt_date.setText(formatter.format(date));
			pnl_table.add(txt_date);

			JLabel lbl_totamount = new JLabel("Totle Amount :-");
			lbl_totamount.setHorizontalAlignment(SwingConstants.LEFT);
			lbl_totamount.setForeground(Color.WHITE);
			lbl_totamount.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			lbl_totamount.setBounds(10, 506, 166, 38);
			pnl_table.add(lbl_totamount);

			
			txt_totamount = new JTextField();
			txt_totamount.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			txt_totamount.setColumns(10);
			txt_totamount.setBounds(190, 508, 166, 34);
			pnl_table.add(txt_totamount);

			table = new JTable();
			table.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			Object[] columns = { "Iteam ID", "Iteam Name", "Iteam Quntity", "Iteam Price", "Tex", "Totle" };
			DefaultTableModel model = new DefaultTableModel();
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
			scrollPane.setBorder(new LineBorder(new Color(130, 135, 144), 2, true));
			scrollPane.setBounds(10, 58, 825, 438);
			pnl_table.add(scrollPane);
			Object[] row = new Object[8];
			scrollPane.setViewportView(table);

			JButton btn_CronfirmPurchase = new JButton("Confirm Purchase");
			btn_CronfirmPurchase.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					try {

						for (int i = 0; i < model.getRowCount(); i++) {

							String Cstock = null;
							String Pstock = model.getValueAt(i, 2).toString();
							ResultSet CS = conn
									.prepareStatement(
											"Select * from tbl_items where ItemID=" + model.getValueAt(i, 0).toString())
									.executeQuery();
							if (CS.next()) {
								Cstock = CS.getString("ItemStock").toString();
							}
							int Ustock = Integer.parseInt(Cstock) + Integer.parseInt(Pstock);
							;

							PreparedStatement ipst = conn
									.prepareStatement("update tbl_items set ItemStock=(?) where ItemId="
											+ model.getValueAt(i, 0).toString());
							ipst.setString(1, Integer.toString(Ustock));
							ipst.executeUpdate();

							PreparedStatement pst = conn
									.prepareStatement("INSERT INTO tbl_purchase(InvoiceID,SupplierName,ItemID,"
											+ "ItemName,ItemQuantity,Price,Tax,TotleAmount,Date) VALUES (?,?,?,?,?,?,?,?,?)");

							pst.setString(1, txt_InvoiceNo.getText().toString()); // InvoiceID
							pst.setString(2, cmb_selectSup.getSelectedItem().toString()); // SUPName
							pst.setString(3, model.getValueAt(i, 0).toString()); // ItemId
							pst.setString(4, model.getValueAt(i, 1).toString()); // ItemNAme
							pst.setString(5, model.getValueAt(i, 2).toString()); // ItemQuantity
							pst.setString(6, model.getValueAt(i, 3).toString()); // ItemPrice
							pst.setString(7, model.getValueAt(i, 4).toString()); // Tax
							pst.setString(8, model.getValueAt(i, 5).toString()); // TOtle

							Date now = new Date();
							SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
							String mysqlDateString = formatter.format(now);
							pst.setString(9, mysqlDateString.toString());

							pst.executeUpdate();
						}
						if (model.getRowCount() > 0) {
							JOptionPane.showMessageDialog(null, "Purchase Confirm");
						} else {
							JOptionPane.showMessageDialog(null, "Pelese Enter Items");
						}

					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "\tSomthing is wrong .\n Please Check All Detials");

						System.out.println("Error : " + e1.toString());
					}

					txt_avliStock.setText("");
					txt_InvoiceNo.setText("");
					txt_Price.setText("");
					txt_Quantity.setText("");
					txt_totamount.setText("");
					txt_Supname.setText("");
					txt_tax.setText("");
					txt_ItemID.setText("");
					txt_TotAmount.setText("");
					int rowsToRemove = model.getRowCount();
					// remove rows from the bottom one by one
					for (int i = rowsToRemove - 1; i >= 0; i--) {
						model.removeRow(i);
					}

				}
			});
			btn_CronfirmPurchase.setFont(new Font("Times New Roman", Font.BOLD, 25));
			btn_CronfirmPurchase.setBounds(513, 507, 236, 37);
			pnl_table.add(btn_CronfirmPurchase);

			JButton btn_Update = new JButton("Update");
			btn_Update.setIcon(new ImageIcon(Purchase_Billing.class.getResource("/images/update.png")));
			btn_Update.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int i = table.getSelectedRow();
					if (i == -1) {
						JOptionPane.showMessageDialog(frm_purchase, "Pelase Select Item in tabel for Edit");
					} else {

						txt_Quantity.setText(table.getValueAt(i, 2).toString());
						txt_Price.setText(table.getValueAt(i, 3).toString());
						txt_tax.setText(table.getValueAt(i, 4).toString());
						txt_TotAmount.setText(table.getValueAt(i, 5).toString());
						btn_UpdateRecord.setEnabled(true);
						btn_Add.setEnabled(false);
						try {
							ResultSet rs = conn.createStatement().executeQuery("select *from tbl_items");
							cmb_item.removeAllItems();
							
							while (rs.next()) {
								cmb_item.addItem(rs.getString("ItemName"));
							}
							cmb_item.setSelectedItem(table.getValueAt(i, 1).toString());
						} catch (Exception e1) {
							System.out.println("Error : " + e1.toString());
						}
						btn_Add.setEnabled(false);
					}
				}
			});
			btn_Update.setFont(new Font("Times New Roman", Font.BOLD, 25));
			btn_Update.setBounds(498, 110, 179, 34);
			frm_purchase.getContentPane().add(btn_Update);

			JButton btn_Delete = new JButton("Delete");
			btn_Delete.setIcon(new ImageIcon(Purchase_Billing.class.getResource("/images/delete.png")));
			btn_Delete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int i = table.getSelectedRow();
					if (i >= 0) {
						model.removeRow(i);
						int sum = 0;
						for (int i1 = 0; i1 < table.getRowCount(); i1++) {
							sum = sum + Integer.parseInt(table.getValueAt(i1, 7).toString());
						}

						txt_totamount.setText(Integer.toString(sum));
					} else {
						JOptionPane.showMessageDialog(frm_purchase, "Delete Error");
					}
				}
			});
			frm_purchase.revalidate();
			btn_Delete.setFont(new Font("Times New Roman", Font.BOLD, 25));
			btn_Delete.setBounds(703, 110, 184, 34);
			frm_purchase.getContentPane().add(btn_Delete);

			JButton btn_Reset = new JButton("Reset");
			btn_Reset.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txt_avliStock.setText("");
					txt_InvoiceNo.setText("");
					txt_Price.setText("");
					txt_Quantity.setText("");
					txt_Supname.setText("");
					txt_tax.setText("");
					txt_totamount.setText("");
					txt_TotAmount.setText("");
					txt_ItemID.setText("");
					int rowsToRemove = model.getRowCount();
					// remove rows from the bottom one by one
					for (int i = rowsToRemove - 1; i >= 0; i--) {
						model.removeRow(i);
					}
				}
			});
			btn_Reset.setFont(new Font("Times New Roman", Font.BOLD, 25));
			btn_Reset.setBounds(935, 110, 179, 34);
			frm_purchase.getContentPane().add(btn_Reset);

			btn_calulate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (txt_Quantity.getText().length() == 0) {

						JOptionPane.showMessageDialog(frm_purchase, "Palese Enter Item Quntity");
					} else {
						if (Integer.parseInt(txt_Quantity.getText()) > Integer.parseInt(txt_avliStock.getText())) {
							JOptionPane.showMessageDialog(frm_purchase, "Palese Enter Less Quantity");
							txt_Quantity.setText("");
						} else {
							int Price = Integer.parseInt(txt_Price.getText());
							int Stock = Integer.parseInt(txt_Quantity.getText());
							int Tax = 100 + Integer.parseInt(txt_tax.getText());
							int cal = ((Price * Stock) / 100 * Tax);
							txt_TotAmount.setText(String.valueOf(cal));
						}
					}
				}
			});

			btn_Add.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (txt_totamount.getText().toString() != null && txt_ItemID.getText().length() != 0) {
						row[0] = txt_ItemID.getText();
						row[1] = cmb_item.getSelectedItem().toString();
						row[2] = txt_Quantity.getText();
						row[3] = txt_Price.getText();
						row[4] = txt_tax.getText();
						row[5] = txt_TotAmount.getText();

						model.addRow(row);

						int sum = 0;
						for (int i = 0; i < table.getRowCount(); i++) {
							sum = sum + Integer.parseInt(table.getValueAt(i, 5).toString());
						}
						cmb_item.removeItem(cmb_item.getSelectedItem());
						btn_Add.setEnabled(false);
						cmb_item.setSelectedIndex(0);

						txt_totamount.setText(Integer.toString(sum));
						txt_avliStock.setText("");
						txt_Price.setText("");
						txt_Quantity.setText("");
						txt_tax.setText("");
						txt_ItemID.setText("");

						txt_TotAmount.setText("");
					} else {

						JOptionPane.showMessageDialog(null, "Somthing is Wroung \nPlease Select Item");

					}
				}

			});
			btn_UpdateRecord.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					int i = table.getSelectedRow();
					if (i >= 0) {
						model.setValueAt(1, i, 0);
						model.setValueAt(cmb_item.getSelectedItem().toString(), i, 1);
						model.setValueAt(txt_Quantity.getText(), i, 2);
						model.setValueAt(txt_Price.getText(), i, 3);
						model.setValueAt(txt_tax.getText(), i, 4);
						model.setValueAt(txt_TotAmount.getText(), i, 5);

						int sum = 0;
						for (int i1 = 0; i1 < table.getRowCount(); i1++) {
							sum = sum + Integer.parseInt(table.getValueAt(i1, 7).toString());
						}
						txt_totamount.setText(Integer.toString(sum));
					}
					cmb_item.removeItem(cmb_item.getSelectedItem());
					cmb_item.setSelectedIndex(0);

					txt_avliStock.setText("");
					txt_Price.setText("");
					txt_Quantity.setText("");
					txt_tax.setText("");
					txt_ItemID.setText("");

					txt_TotAmount.setText("");

					JOptionPane.showMessageDialog(null, "Item IS Udated");

				}
			});
		} catch (Exception e1) {

			System.out.println("Error : " + e1.toString());
		}
	}
}
