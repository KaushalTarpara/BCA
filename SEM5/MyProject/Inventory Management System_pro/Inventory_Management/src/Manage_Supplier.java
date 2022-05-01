
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
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
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Manage_Supplier {

	private JFrame frm_ManageSupplier;
	private JTextField txt_SupID;
	private JTextField txt_SuptGSTno;
	private JTextField txt_SupAddress;
	private JTextField txt_Supstate;
	private JTextField txt_SupShopName;
	private JTable jtbl_Supplier;
	private JTextField txt_SupplierName;
	private JLabel lbl_SupllierName;
	private JLabel lbl_SupNo;
	private JTextField txt_SupName;
	private JTextField txt_Supmob;
	private JLabel lbl_AddSup;
	private JPanel pnl_Supplier;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manage_Supplier window = new Manage_Supplier();
					window.frm_ManageSupplier.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Manage_Supplier() {
		applicationfrm();
	}

	void applicationfrm() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory", "root",
					"");

			DefaultTableModel model = new DefaultTableModel();

			class Rfun {

				void showTData() {
					try {

						ResultSet rs = null;
						String s1 = txt_SupplierName.getText().toString();
						if (s1.equals("")) {
							rs = conn.createStatement().executeQuery("SELECT * FROM  tbl_Supplier order by SupID");
						} else {
							rs = conn.createStatement()
									.executeQuery("SELECT * FROM  tbl_Supplier" + " where SupName like '" + s1 + "%' ");
						}

						ResultSetMetaData rsMD = (ResultSetMetaData) rs.getMetaData();
						int q = rsMD.getColumnCount();

						for (int i = model.getRowCount() - 1; i >= 0; i--) {
							model.removeRow(i);
						}
						while (rs.next()) {
							Vector<String> columnData = new Vector<String>();
							for (int i = 1; i <= q; i++) {
								columnData.add(rs.getString("SupID"));
								columnData.add(rs.getString("SupName"));
								columnData.add(rs.getString("SupAddress"));
								columnData.add(rs.getString("SupMoblieNo"));
								columnData.add(rs.getString("SupGSTNumber"));
								columnData.add(rs.getString("SupShopName"));
								columnData.add(rs.getString("SupState"));
								columnData.add(rs.getString("SupRemarks"));

							}
							model.addRow(columnData);
						}
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Error");
						System.out.println("Error : " + e1.toString());
					}
				}
			}
			Rfun r1 = new Rfun();

			frm_ManageSupplier = new JFrame();
			frm_ManageSupplier.setIconImage(
					Toolkit.getDefaultToolkit().getImage(Manage_Supplier.class.getResource("/images/users.png")));
			frm_ManageSupplier.setTitle("Manage Supplier");
			frm_ManageSupplier.getContentPane().setForeground(Color.WHITE);
			frm_ManageSupplier.getContentPane().setBackground(Color.BLACK);
			frm_ManageSupplier.setForeground(Color.WHITE);
			frm_ManageSupplier.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			frm_ManageSupplier.setResizable(false);
			frm_ManageSupplier.setBounds(0, 0, 1360, 798);
			JPanel contentPane = new JPanel() {

				public void paintComponent(Graphics g) {
					Image img = Toolkit.getDefaultToolkit().getImage(Main_Menu.class.getResource("Image/BG3.jpg"));
					g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
				}
			};
			frm_ManageSupplier.setContentPane(contentPane);
			frm_ManageSupplier.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frm_ManageSupplier.setExtendedState(JFrame.MAXIMIZED_BOTH);
			frm_ManageSupplier.getContentPane().setLayout(null);

			pnl_Supplier = new JPanel();
			pnl_Supplier.setLayout(null);
			pnl_Supplier.setForeground(Color.BLACK);
			pnl_Supplier.setBorder(new LineBorder(Color.WHITE, 2, true));
			pnl_Supplier.setBackground(new Color(0, 0, 0, 65));
			pnl_Supplier.setBounds(10, 91, 424, 628);
			frm_ManageSupplier.getContentPane().add(pnl_Supplier);

			JLabel lbl_SupID = new JLabel("Supplier ID ");
			lbl_SupID.setHorizontalAlignment(SwingConstants.RIGHT);
			lbl_SupID.setForeground(Color.WHITE);
			lbl_SupID.setFont(new Font("Times New Roman", Font.PLAIN, 22));
			lbl_SupID.setBounds(22, 61, 155, 41);
			pnl_Supplier.add(lbl_SupID);

			JLabel lbl_Supname = new JLabel("Supplier Name");
			lbl_Supname.setHorizontalAlignment(SwingConstants.RIGHT);
			lbl_Supname.setForeground(Color.WHITE);
			lbl_Supname.setFont(new Font("Times New Roman", Font.PLAIN, 22));
			lbl_Supname.setBounds(22, 112, 155, 41);
			pnl_Supplier.add(lbl_Supname);

			JLabel lbl_GSTNo = new JLabel("GST No");
			lbl_GSTNo.setHorizontalAlignment(SwingConstants.RIGHT);
			lbl_GSTNo.setForeground(Color.WHITE);
			lbl_GSTNo.setFont(new Font("Times New Roman", Font.PLAIN, 22));
			lbl_GSTNo.setBounds(22, 271, 155, 41);
			pnl_Supplier.add(lbl_GSTNo);

			lbl_SupNo = new JLabel("Moblie No");
			lbl_SupNo.setHorizontalAlignment(SwingConstants.RIGHT);
			lbl_SupNo.setForeground(Color.WHITE);
			lbl_SupNo.setFont(new Font("Times New Roman", Font.PLAIN, 22));
			lbl_SupNo.setBounds(22, 216, 155, 41);
			pnl_Supplier.add(lbl_SupNo);

			JLabel lbl_SupShopName = new JLabel("Shop Name");
			lbl_SupShopName.setHorizontalAlignment(SwingConstants.RIGHT);
			lbl_SupShopName.setForeground(Color.WHITE);
			lbl_SupShopName.setFont(new Font("Times New Roman", Font.PLAIN, 22));
			lbl_SupShopName.setBounds(22, 322, 155, 41);
			pnl_Supplier.add(lbl_SupShopName);

			txt_SupID = new JTextField();
			txt_SupID.setText("Auto Generated");
			txt_SupID.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			txt_SupID.setColumns(10);
			txt_SupID.setBounds(185, 61, 228, 30);
			pnl_Supplier.add(txt_SupID);

			txt_SuptGSTno = new JTextField();
			txt_SuptGSTno.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			txt_SuptGSTno.setColumns(10);
			txt_SuptGSTno.setBounds(185, 272, 228, 30);
			pnl_Supplier.add(txt_SuptGSTno);

			txt_SupAddress = new JTextField();
			txt_SupAddress.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			txt_SupAddress.setColumns(10);
			txt_SupAddress.setBounds(185, 165, 228, 30);
			pnl_Supplier.add(txt_SupAddress);

			txt_Supstate = new JTextField();
			txt_Supstate.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			txt_Supstate.setColumns(10);
			txt_Supstate.setBounds(185, 385, 228, 30);
			pnl_Supplier.add(txt_Supstate);

			JLabel lbl_SupState = new JLabel("State");
			lbl_SupState.setHorizontalAlignment(SwingConstants.RIGHT);
			lbl_SupState.setForeground(Color.WHITE);
			lbl_SupState.setFont(new Font("Times New Roman", Font.PLAIN, 22));
			lbl_SupState.setBounds(22, 381, 155, 41);
			pnl_Supplier.add(lbl_SupState);

			txt_SupShopName = new JTextField();
			txt_SupShopName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			txt_SupShopName.setColumns(10);
			txt_SupShopName.setBounds(185, 326, 228, 30);
			pnl_Supplier.add(txt_SupShopName);

			JLabel lbl_SupRemark = new JLabel("Remarks :");
			lbl_SupRemark.setHorizontalAlignment(SwingConstants.RIGHT);
			lbl_SupRemark.setForeground(Color.WHITE);
			lbl_SupRemark.setFont(new Font("Times New Roman", Font.PLAIN, 23));
			lbl_SupRemark.setBounds(39, 444, 138, 41);
			pnl_Supplier.add(lbl_SupRemark);

			JLabel lbl_SupAddress = new JLabel("Address");
			lbl_SupAddress.setHorizontalAlignment(SwingConstants.RIGHT);
			lbl_SupAddress.setForeground(Color.WHITE);
			lbl_SupAddress.setFont(new Font("Times New Roman", Font.PLAIN, 22));
			lbl_SupAddress.setBounds(22, 165, 155, 41);
			pnl_Supplier.add(lbl_SupAddress);

			JTextArea txtA_SuptRemark = new JTextArea();
			txtA_SuptRemark.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			txtA_SuptRemark.setBounds(185, 444, 228, 107);
			pnl_Supplier.add(txtA_SuptRemark);

			txt_SupName = new JTextField();
			txt_SupName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			txt_SupName.setColumns(10);
			txt_SupName.setBounds(185, 112, 228, 30);
			pnl_Supplier.add(txt_SupName);

			txt_Supmob = new JTextField();
			txt_Supmob.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			txt_Supmob.setColumns(10);
			txt_Supmob.setBounds(185, 219, 228, 30);
			pnl_Supplier.add(txt_Supmob);

			lbl_AddSup = new JLabel("Add New Supplier");
			lbl_AddSup.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_AddSup.setForeground(Color.WHITE);
			lbl_AddSup.setFont(new Font("Times New Roman", Font.BOLD, 28));
			lbl_AddSup.setBounds(115, 10, 241, 41);
			pnl_Supplier.add(lbl_AddSup);

			JButton btn_AddSupplier = new JButton("Add New Supplier ");
			btn_AddSupplier.setBounds(185, 561, 228, 27);
			pnl_Supplier.add(btn_AddSupplier);
			btn_AddSupplier.setFont(new Font("Times New Roman", Font.BOLD, 21));

			btn_AddSupplier.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {

						PreparedStatement pst = conn.prepareStatement("INSERT INTO tbl_Supplier(Supname, "
								+ "SupAddress, SupMoblieNo, SupGSTNumber, SupShopName, SupState, "
								+ "SupRemarks) VALUES (?,?,?,?,?,?,?)");

						// pst.setString(1,txt_SupID.getText());
						pst.setString(1, txt_SupName.getText());
						pst.setString(2, txt_SupAddress.getText());
						pst.setString(3, txt_Supmob.getText());
						pst.setString(4, txt_SuptGSTno.getText());
						pst.setString(5, txt_SupShopName.getText());
						pst.setString(6, txt_Supstate.getText());
						pst.setString(7, txtA_SuptRemark.getText());

						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "Supllier Added");

						txt_SupAddress.setText("");
						txt_Supmob.setText("");
						txt_SupName.setText("");
						txt_SupplierName.setText("");
						txt_SupShopName.setText("");
						txt_Supstate.setText("");
						txt_SuptGSTno.setText("");

						r1.showTData();// after adding data show all items in tabel

					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null,
								"Somthing is wrong in Deatils \n Please Enter Deails Carefull");
						System.out.println("Error : " + e1.toString());
					}

				}
			});

			JLabel lbl_Title = new JLabel("Manage Supplier");
			lbl_Title.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_Title.setForeground(Color.WHITE);
			lbl_Title.setFont(new Font("Times New Roman", Font.PLAIN, 40));
			lbl_Title.setBounds(412, 2, 440, 79);
			frm_ManageSupplier.getContentPane().add(lbl_Title);

			JPanel pnl_tabel = new JPanel();
			pnl_tabel.setBorder(new LineBorder(null, 2, true));
			pnl_tabel.setBackground(new Color(0, 0, 0, 65));
			pnl_tabel.setForeground(Color.WHITE);
			pnl_tabel.setBounds(444, 93, 892, 626);
			frm_ManageSupplier.getContentPane().add(pnl_tabel);
			pnl_tabel.setLayout(null);

			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			scrollPane.setSize(new Dimension(1, 1));
			scrollPane.setAutoscrolls(true);
			scrollPane.setBorder(new LineBorder(new Color(130, 135, 144), 2, true));
			@SuppressWarnings("unused")
			Object[] row = new Object[8];
			scrollPane.setBounds(10, 131, 872, 485);
			pnl_tabel.add(scrollPane);

			jtbl_Supplier = new JTable();
			jtbl_Supplier.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			Object[] columns = { "Supplier ID", "Supplier  Name", " Address", " MoblieNo", " GSTNumber", " ShopName",
					"State", "Remarks" };
			model.setColumnIdentifiers(columns);
			jtbl_Supplier.setModel(model);
			jtbl_Supplier.setBackground(Color.WHITE);
			jtbl_Supplier.setForeground(Color.BLACK);
			jtbl_Supplier.setGridColor(Color.RED);
			jtbl_Supplier.setSelectionBackground(Color.BLACK);
			jtbl_Supplier.setSelectionForeground(Color.WHITE);
			jtbl_Supplier.setRowHeight(30);
			scrollPane.setViewportView(jtbl_Supplier);

			lbl_SupllierName = new JLabel("Supplier  Name:-");
			lbl_SupllierName.setHorizontalAlignment(SwingConstants.RIGHT);
			lbl_SupllierName.setForeground(Color.WHITE);
			lbl_SupllierName.setFont(new Font("Times New Roman", Font.PLAIN, 21));
			lbl_SupllierName.setBounds(28, 26, 194, 41);
			pnl_tabel.add(lbl_SupllierName);

			txt_SupplierName = new JTextField();
			txt_SupplierName.setFont(new Font("Times New Roman", Font.PLAIN, 25));
			txt_SupplierName.setColumns(10);
			txt_SupplierName.setBounds(229, 32, 210, 29);
			pnl_tabel.add(txt_SupplierName);

			JButton btn_Search = new JButton("Search");
			btn_Search.setIcon(new ImageIcon(Manage_Supplier.class.getResource("/images/search.png")));
			btn_Search.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					r1.showTData();// after adding data show all items in tabel
				}
			});
			btn_Search.setBounds(449, 33, 128, 27);
			pnl_tabel.add(btn_Search);
			btn_Search.setFont(new Font("Times New Roman", Font.BOLD, 21));

			JButton btn_ModifyItem = new JButton("Modify");
			btn_ModifyItem.setFont(new Font("Times New Roman", Font.BOLD, 21));
			btn_ModifyItem.setBounds(211, 87, 117, 27);
			pnl_tabel.add(btn_ModifyItem);

			JButton btn_Remove = new JButton("Remove");
			btn_Remove.setIcon(new ImageIcon(Manage_Supplier.class.getResource("/images/delete.png")));
			btn_Remove.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					try {

						int a = jtbl_Supplier.getSelectedRow();

						PreparedStatement pst = conn.prepareStatement("delete from tbl_Supplier where SupID=?");
						pst.setInt(1, Integer.parseInt(jtbl_Supplier.getValueAt(a, 0).toString()));
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "Supplier Delete");

						r1.showTData();// after delete item show data of table
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Error");
						System.out.println("Error : " + e1.toString());
					}
				}
			});
			btn_Remove.setFont(new Font("Times New Roman", Font.BOLD, 21));
			btn_Remove.setBounds(379, 87, 136, 27);
			pnl_tabel.add(btn_Remove);

			JButton btn_Clear = new JButton("Clear");
			btn_Clear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					txt_SupAddress.setText("");
					txt_Supmob.setText("");
					txt_SupName.setText("");
					txt_SupplierName.setText("");
					txt_SupShopName.setText("");
					txt_Supstate.setText("");
					txt_SuptGSTno.setText("");
					txtA_SuptRemark.setText("");

					for (int i = model.getRowCount() - 1; i >= 0; i--) {
						model.removeRow(i);
					}

				}
			});
			btn_Clear.setFont(new Font("Times New Roman", Font.BOLD, 21));
			btn_Clear.setBounds(544, 87, 117, 27);
			pnl_tabel.add(btn_Clear);

			JButton btn_update = new JButton("Update");
			btn_update.setIcon(new ImageIcon(Manage_Supplier.class.getResource("/images/update.png")));
			btn_update.setFont(new Font("Times New Roman", Font.BOLD, 21));
			btn_update.setBounds(42, 87, 134, 27);
			pnl_tabel.add(btn_update);

			JButton btnNewButton = new JButton("Back");
			btnNewButton.setIcon(new ImageIcon(Manage_Supplier.class.getResource("/images/return.png")));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					try {
						Main_Menu.main(null);
					} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
							| UnsupportedLookAndFeelException e1) {
						e1.printStackTrace();
					}
					frm_ManageSupplier.setVisible(false);
				}
			});
			btnNewButton.setForeground(Color.BLACK);
			btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 21));
			btnNewButton.setBackground(Color.WHITE);
			btnNewButton.setBounds(10, 16, 113, 31);
			frm_ManageSupplier.getContentPane().add(btnNewButton);

			btn_ModifyItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					int i = jtbl_Supplier.getSelectedRow();

					txt_SupID.setText(jtbl_Supplier.getValueAt(i, 0).toString());
					txt_SupName.setText(jtbl_Supplier.getValueAt(i, 1).toString());
					txt_SupAddress.setText(jtbl_Supplier.getValueAt(i, 2).toString());
					txt_Supmob.setText(jtbl_Supplier.getValueAt(i, 3).toString());
					txt_SuptGSTno.setText(jtbl_Supplier.getValueAt(i, 4).toString());
					txt_SupShopName.setText(jtbl_Supplier.getValueAt(i, 5).toString());
					txt_Supstate.setText(jtbl_Supplier.getValueAt(i, 6).toString());
					txtA_SuptRemark.setText(jtbl_Supplier.getValueAt(i, 7).toString());

				}
			});

			btn_update.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {

						PreparedStatement pst = conn.prepareStatement("UPDATE tbl_Supplier SET Supname=?,"
								+ "SupAddress=?,SupMoblieNo=?,SupGSTNumber=?,SupShopName=?,"
								+ "SupState=?,SupRemarks=? WHERE SupID=?");

						pst.setString(1, txt_SupName.getText());
						pst.setString(2, txt_SupAddress.getText());
						pst.setString(3, txt_Supmob.getText());
						pst.setString(4, txt_SuptGSTno.getText());
						pst.setString(5, txt_SupShopName.getText());
						pst.setString(6, txt_Supstate.getText());
						pst.setString(7, txtA_SuptRemark.getText());
						pst.setString(8, txt_SupID.getText());

						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "Customer Record Updated");

						r1.showTData();// after update data of table
					} catch (Exception e1) {

						System.out.println("Error : " + e1.toString());
					}

				}
			});

		} catch (Exception e1) {

			System.out.println("Error : " + e1.toString());
		}
	}
}
