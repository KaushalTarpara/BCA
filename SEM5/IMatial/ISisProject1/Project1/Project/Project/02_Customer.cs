using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace Project
{
    public partial class Customer : Form
    {
        public Customer()
        {
            InitializeComponent();
        }
        //string cnStr = "Data Source=PC177;Initial Catalog=ins_man;Integrated Security=True";
        string cnStr = "Data Source=DELL-PC;Initial Catalog=ins_man;Integrated Security=True";
        string QRY = "";
        SqlCommand CMD;
        SqlConnection CNN;
        SqlDataAdapter AD;
        DataSet DS;
        int mypos;
        string gen;

        private void Customer_Load(object sender, EventArgs e)
        {
           loadmygrid();
           
           fillMyCombo();
           fillBranchName();
           fillAgentName();
        }
        
        void fillMyCombo()
        {
            QRY = "SELECT PolicyType FROM tbl_PolicyDetails";
            CNN = new SqlConnection(cnStr);
            CMD = new SqlCommand(QRY,CNN);
            CNN.Open();
            SqlDataReader DR = CMD.ExecuteReader();
            while (DR.Read())
            {
                cmbPName.Items.Add(DR.GetValue(0).ToString());
            }
            CNN.Close();
            CNN.Dispose();
         }

        void fillBranchName()
        {
            QRY = "SELECT BranchName FROM tbl_BranchDateils";
            CNN = new SqlConnection(cnStr);
            CMD = new SqlCommand(QRY, CNN);
            CNN.Open();
            SqlDataReader DR = CMD.ExecuteReader();
            while(DR.Read())
            {
                cmbBranchName.Items.Add(DR.GetValue(0).ToString());
            }
            CNN.Close();
            CNN.Dispose();
        }

        void fillAgentName()
        {
            QRY = "SELECT AgentName FROM tbl_AgentDateils";
            CNN = new SqlConnection(cnStr);
            CMD = new SqlCommand(QRY, CNN);
            CNN.Open();
            SqlDataReader DR = CMD.ExecuteReader();
            while(DR.Read())
            {
                cmbAgentName.Items.Add(DR.GetValue(0).ToString());
            }
            CNN.Close();
            CNN.Dispose();
        }
        private void btn_add_Click(object sender, EventArgs e)
        {
            btn_add.Enabled = false;
            btn_delt.Enabled = true;
            
            //------Clear all the contrlls ------
                        
            txt_CustName.Clear();
            txt_ADD.Clear();
            cmbPName.SelectedIndex = 0;
            cmbBranchName.SelectedIndex = 0;
            txt_ContNo.Clear();
            txt_Email.Clear();
            txt_Age.Clear();
            txt_Relation.Clear();
            txt_Priemium.Clear();
            cmbAgentName.SelectedIndex = 0;
            
            
            btnedit.Enabled = true;
    }
        private void lblGender_Click(object sender, EventArgs e)
        {

        }
     private void btnedit_Click(object sender, EventArgs e)
        {
            if (maleradio.Checked)
            {
                gen = "Male";
            }
            else
            {
                gen = "Female";
            }
            QRY = "UPDATE tbl_CustomerDetails SET ";
            QRY += "CustomerName='" + txt_CustName.Text + "',";
            QRY += " Address='" + txt_ADD.Text + "',";
            QRY += " ContactNo='" + txt_ContNo.Text + "',";
            QRY += " Email='" + txt_Email.Text + "',";
            QRY += " Age='" + txt_Age.Text + "' ,";
            QRY += "Gender='" + gen.ToString() + "',";
            QRY += "Relation='" + txt_Relation.Text + "',";
            QRY += "PolicyName='" + cmbPName.SelectedItem.ToString() + "',";
            QRY += "Agent='" + cmbAgentName.SelectedItem.ToString() + "',";
            QRY += "Premium='" + txt_Priemium.Text + "',";
            QRY += "Branch_Name='" + cmbBranchName.SelectedItem.ToString() + "'";
            QRY += "WHERE  CustomerID='" + int.Parse(custgrid.SelectedCells[0].Value.ToString()) + "'";   
            CNN = new SqlConnection(cnStr);
            CMD = new SqlCommand(QRY, CNN);
            DS = new DataSet();
            AD = new SqlDataAdapter(CMD);
            CNN.Open();
            CMD.ExecuteNonQuery();
            AD.Fill(DS);           
            CNN.Close();
            CNN.Dispose();
            CMD.Dispose();

            loadmygrid();

            MessageBox.Show("Edited sucessfully...", "Edit", MessageBoxButtons.OK, MessageBoxIcon.Asterisk);

            txt_CustName.Clear();
            txt_ADD.Clear();
            cmbPName.SelectedIndex = 0;
            cmbBranchName.SelectedIndex = 0;
            txt_ContNo.Clear();
            txt_Email.Clear();
            txt_Age.Clear();
            txt_Relation.Clear();
            txt_Priemium.Clear();
            cmbAgentName.SelectedIndex = 0;

           
     }

        void loadmygrid()
        {
            QRY = "SELECT * from tbl_CustomerDetails WHERE CustomerID>0";
            CNN = new SqlConnection(cnStr);
            CMD = new SqlCommand(QRY, CNN);
            DS = new DataSet();
            AD = new SqlDataAdapter(CMD);
            CNN.Open();
            CMD.ExecuteNonQuery();
            AD.Fill(DS);
            custgrid.DataSource = DS.Tables[0];
            CNN.Close();
            CNN.Dispose();
            CMD.Dispose();

            //fillMyCombo();
        }

        void filemygrid(int row)
        {
            txt_CustName.Text = custgrid.Rows[row].Cells[1].Value.ToString();
            txt_ADD.Text = custgrid.Rows[row].Cells[2].Value.ToString();
            txt_ContNo.Text = custgrid.Rows[row].Cells[3].Value.ToString();
            txt_Email.Text = custgrid.Rows[row].Cells[4].Value.ToString();
            txt_Age.Text = custgrid.Rows[row].Cells[5].Value.ToString();
            if(custgrid.Rows[row].Cells[6].Value.Equals("Male"))
            {
                maleradio.Checked = true;
            }
            else
            {
                femalerdio.Checked = true;
            }
            datePic.Value = DateTime.Parse(custgrid.Rows[row].Cells[7].Value.ToString());
            txt_Relation.Text = custgrid.Rows[row].Cells[8].Value.ToString();
            cmbPName.Text = custgrid.Rows[row].Cells[9].Value.ToString();
            cmbAgentName.Text = custgrid.Rows[row].Cells[10].Value.ToString();
            txt_Priemium.Text = custgrid.Rows[row].Cells[11].Value.ToString();
            cmbBranchName.Text = custgrid.Rows[row].Cells[12].Value.ToString();
        }
        
       

        private void btn_save_Click(object sender, EventArgs e)
        {
            mypos = 0;
            

            //--------Insert data---------------

            //string gen;
            if (maleradio.Checked)
            {
                gen = "Male";
            }
            else
            {
                gen = "Female";
            }
            QRY = "INSERT INTO tbl_CustomerDetails VALUES(";
            QRY += "(select max(CustomerID)+1 from tbl_CustomerDetails),";
            QRY += "'" + txt_CustName.Text + "',";
            QRY += "'" + txt_ADD.Text + "',";
            QRY += "'" + txt_ContNo.Text + "',";
            QRY += "'" + txt_Email.Text + "',";
            QRY += "'" + txt_Age.Text + "',";
            QRY += "'" + gen.ToString()+ "',";
            QRY += "'" + datePic.Value.ToShortDateString() + "',";
            QRY += "'" + txt_Relation.Text + "',";
            QRY += "'" + cmbPName.SelectedItem.ToString() + "',";
            QRY += "'" + cmbAgentName.SelectedItem.ToString() + "',";
            QRY += "'"+txt_Priemium.Text+"',";
            QRY += "'" + cmbBranchName.SelectedItem.ToString() + "'";
            QRY += ")";

            CNN = new SqlConnection(cnStr);
            CMD = new SqlCommand(QRY, CNN);
            CNN.Open();
            CMD.ExecuteNonQuery();
            CNN.Close();
            CNN.Dispose();
            CMD.Dispose();

            MessageBox.Show("Insert sucessfully...", "Insert", MessageBoxButtons.OK, MessageBoxIcon.Asterisk);

            loadmygrid();

            btn_add.Enabled = true;
        }

        

        private void btndelt_Click(object sender, EventArgs e)
        {
            QRY = "DELETE FROM tbl_CustomerDetails WHERE CustomerID='" + int.Parse(custgrid.SelectedCells[0].Value.ToString()) + "'";
            CNN = new SqlConnection(cnStr);
            CMD = new SqlCommand(QRY,CNN);
            DS = new DataSet();
            CNN.Open();
            CMD.ExecuteNonQuery();
            CNN.Close();
            CNN.Dispose();
            CMD.Dispose();

            MessageBox.Show("are you want to delete ?","Delete",MessageBoxButtons.YesNoCancel,MessageBoxIcon.Error);

            MessageBox.Show("Record deleted...", "DELETE", MessageBoxButtons.OK, MessageBoxIcon.Asterisk);

            loadmygrid();
        }

        private void custgrid_CellContentClick_1(object sender, DataGridViewCellEventArgs e)
        {
            filemygrid(e.RowIndex);
            //MessageBox.Show(custgrid.Rows[e.RowIndex].Cells[0].Value.ToString());
        }

        private void femalerdio_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void lbl_Rela_Click(object sender, EventArgs e)
        {

        }
    }
        }

        
