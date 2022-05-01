import java.awt.EventQueue;  

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

import javax.swing.JPanel;
import java.awt.Cursor;

import javax.swing.border.LineBorder;

public class Login {

	private JFrame frm_Login;
	private JTextField textUser;
	private JPasswordField textPass;
	private JPanel contentPane;  

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frm_Login.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Login() {
		
		frm_Login = new JFrame();
		frm_Login.getContentPane().setBackground(Color.BLACK);
		frm_Login.getContentPane().setForeground(Color.WHITE);
		frm_Login.setBackground(Color.WHITE);
		frm_Login.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/images/Login.png")));
		frm_Login.setForeground(Color.BLACK);	
//		frm_Login.setContentPane(new JLabel(new ImageIcon("C:\\Project_Inventory\\Inventory_Mangment\\src\\Image\\LOG_I1.png")));
		frm_Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm_Login.getContentPane().setLayout(null);
		frm_Login.setTitle("Login");
		frm_Login.setBounds(0,0,1378,800);
		frm_Login.setExtendedState(Frame.MAXIMIZED_BOTH); 
		frm_Login.setResizable(false);
		contentPane = new JPanel() {  
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) {  
                 Image img = Toolkit.getDefaultToolkit().getImage(  
                		 Main_Menu.class.getResource("Image/Log_I1.png"));  
            g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
         }  
       };  
       frm_Login.setContentPane(contentPane);
       frm_Login.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN Page\r\n");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.YELLOW); 
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 42));
		lblNewLabel.setBounds(530, 188, 339, 65);
		frm_Login.getContentPane().add(lblNewLabel);
		
		JLabel lblUser = new JLabel("Username");
		lblUser.setIcon(new ImageIcon(Login.class.getResource("/images/users.png")));
		lblUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser.setBackground(Color.WHITE);
		lblUser.setForeground(Color.WHITE);
		lblUser.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblUser.setBounds(488, 320, 183, 48);
		frm_Login.getContentPane().add(lblUser);
		
		JLabel lblPass = new JLabel("Password");
		lblPass.setIcon(new ImageIcon(Login.class.getResource("/images/pass.png")));
		lblPass.setHorizontalAlignment(SwingConstants.CENTER);
		lblPass.setBackground(Color.WHITE);
		lblPass.setForeground(Color.WHITE);
		lblPass.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblPass.setBounds(488, 391, 183, 48);
		frm_Login.getContentPane().add(lblPass);
		
		textUser = new JTextField();
		textUser.setBackground(Color.WHITE);
		textUser.setForeground(Color.BLACK);
		textUser.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textUser.setBounds(689, 332, 256, 31);
		frm_Login.getContentPane().add(textUser);
		textUser.setColumns(10);
		
		textPass = new JPasswordField();
		textPass.setEchoChar('*');
		textPass.setBackground(Color.WHITE);
		textPass.setForeground(Color.BLACK);
		textPass.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textPass.setBounds(689, 406, 256, 33);
		frm_Login.getContentPane().add(textPass);
		
		JButton btnLogin = new JButton("Log IN");
		btnLogin.setIcon(new ImageIcon(Login.class.getResource("/images/clear.png")));
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setForeground(Color.BLACK);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				@SuppressWarnings("deprecation")
				String Password=textPass.getText();
         		String Username =textUser.getText();

				try {
					
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
				
				PreparedStatement pst=conn.prepareStatement("select *from tbl_user where username=? and password=?");
				
				pst.setString(1,Username);
				pst.setString(2,Password);
				ResultSet rs=pst.executeQuery();
				
				//if(Password.contains("king") && Username.contains("one"))
				if(rs.next())
				{
					textUser.setText(null);
					textPass.setText(null);
					
					Main_Menu.main(null);
					frm_Login.setVisible(false);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invelid LogIn Details","Error Message",JOptionPane.ERROR_MESSAGE);
					textUser.setText(null);
					textPass.setText(null);
				}
				}
				catch(Exception e1)
				{
					System.out.println("Error : "+e1.toString());
				}
			}
		});
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnLogin.setBounds(423, 511, 139, 35);
		frm_Login.getContentPane().add(btnLogin);
		
		JSeparator separator = new JSeparator();
		separator.setBorder(new LineBorder(null, 3));
		separator.setBackground(Color.WHITE);
		separator.setForeground(Color.WHITE);
		separator.setBounds(370, 487, 656, 2);
		frm_Login.getContentPane().add(separator);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnReset.setBackground(Color.WHITE);
		btnReset.setForeground(Color.BLACK);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textUser.setText(null);
				textPass.setText(null);
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnReset.setBounds(649, 511, 124, 35);
		frm_Login.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setIcon(new ImageIcon(Login.class.getResource("/images/exit.png")));
		btnExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR) );
		btnExit.setBackground(Color.WHITE);
		btnExit.setForeground(Color.BLACK);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 System.exit(0); 
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnExit.setBounds(858, 511, 124, 35);
		frm_Login.getContentPane().add(btnExit);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBorder(new LineBorder(null, 3));
		separator_1.setBackground(Color.BLACK);
		separator_1.setForeground(Color.WHITE);
		separator_1.setBounds(370, 283, 656, 2);
		frm_Login.getContentPane().add(separator_1);
	}
}
