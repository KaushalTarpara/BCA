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
    public partial class BranchDateils : Form
    {
        public BranchDateils()
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

        private void btn_add_Click(object sender, EventArgs e)
        {
            txt_BranchName.Clear();
            txt_Addre.Clear();
            txt_ContactNo.Clear();
        }
        private void BranchDateils_Load(object sender, EventArgs e)
        {
            LoadmyGrid();
        }

        private void btnSave_Click(object sender, EventArgs e)
        {
            QRY = "INSERT INTO tbl_BranchDateils VALUES(";
            QRY += "(select max(BranchId)+1 from tbl_BranchDateils),";
            QRY += "'" + txt_BranchName.Text + "',";
            QRY += "'" + txt_Addre.Text + "',";
            QRY += "'" + txt_ContactNo.Text + "'";
            QRY += ")";

            CNN = new SqlConnection(cnStr);
            CMD = new SqlCommand(QRY, CNN);
            CNN.Open();
            CMD.ExecuteNonQuery();
            CNN.Close();
            CNN.Dispose();
            CMD.Dispose();

            MessageBox.Show("Insert sucessfully...", "Insert", MessageBoxButtons.OK, MessageBoxIcon.Asterisk);

            LoadmyGrid();
        }

        void LoadmyGrid()
        {
            QRY = "SELECT * FROM tbl_BranchDateils";
            CNN = new SqlConnection(cnStr);
            CMD = new SqlCommand(QRY,CNN);            
            DS = new DataSet();
            AD = new SqlDataAdapter(CMD);
            CNN.Open();
            CMD.ExecuteNonQuery();
            AD.Fill(DS);
            branchgrid.DataSource = DS.Tables[0];
            CNN.Close();
            CNN.Dispose();
            CMD.Dispose();
        }
        void filemygrid(int row)
        {
            txt_BranchName.Text = branchgrid.Rows[row].Cells[1].Value.ToString();
            txt_Addre.Text = branchgrid.Rows[row].Cells[2].Value.ToString();
            txt_ContactNo.Text = branchgrid.Rows[row].Cells[3].Value.ToString();
            
        }

        private void branchgrid_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            filemygrid(e.RowIndex);
        }

        private void btn_edit_Click(object sender, EventArgs e)
        {
            QRY = "UPDATE tbl_BranchDateils SET ";
            QRY += "Address='" + txt_Addre.Text + "',";
            QRY += " Phone='" + txt_ContactNo.Text + "'";
            QRY += " WHERE BranchName='" + txt_BranchName.Text + "'";
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

            MessageBox.Show("Edited sucessfully...", "Insert", MessageBoxButtons.OK, MessageBoxIcon.Asterisk);

            LoadmyGrid();
        }

        private void btn_delt_Click(object sender, EventArgs e)
        {
            QRY = "DELETE FROM tbl_BranchDateils WHERE BranchName='" +txt_BranchName.Text + "'";
            CNN = new SqlConnection(cnStr);
            CMD = new SqlCommand(QRY, CNN);
            DS = new DataSet();
            CNN.Open();
            CMD.ExecuteNonQuery();
            CNN.Close();
            CNN.Dispose();
            CMD.Dispose();

            //MessageBox.Show("are you want to delete ?", "Delete", MessageBoxButtons.YesNoCancel, MessageBoxIcon.Error);

            MessageBox.Show("Insert sucessfully...", "Insert", MessageBoxButtons.OK, MessageBoxIcon.Asterisk);

            LoadmyGrid();
        

        }
    }
}
