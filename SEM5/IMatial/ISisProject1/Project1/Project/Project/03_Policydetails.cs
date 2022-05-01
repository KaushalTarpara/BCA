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
    public partial class Policydetails : Form
    {
        public Policydetails()
        {
            InitializeComponent();
        }

        string cnStr = "Data Source=DELL-PC;Initial Catalog=ins_man;Integrated Security=True";
        string QRY = "";
        SqlConnection CNN;
        SqlCommand CMD;
        SqlDataAdapter AD;
        DataSet DS;

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void btn_add_Click(object sender, EventArgs e)
        {
            btn_add.Enabled = false;

            //------Clear all the contrlls ------

            //txt_PoliID.Clear();
            txt_Poliname.Clear();
            cmb_PoliType.SelectedIndex = 0;
           // txt_Politerm.Clear();
            txt_PliAmount.Clear();
        }

        private void btnSave_Click(object sender, EventArgs e)
        {
            QRY = "INSERT INTO tbl_PolicyDetails VALUES(";
            QRY += "(SELECT MAX(PolicyId) + 1 FROM tbl_PolicyDetails), ";
            QRY += "'"+txt_Poliname.Text+"',";
            QRY += "'"+txt_PliAmount.Text+"',";
            QRY += "'" + dateOfPolicy.Value.ToShortDateString() + "',";
            QRY += "'" + cmb_PoliType.SelectedItem.ToString() + "'";
            QRY += ")";

            CNN = new SqlConnection(cnStr);
            CMD = new SqlCommand(QRY,CNN);
            CNN.Open();
            CMD.ExecuteNonQuery();
            CNN.Close();
            CNN.Dispose();
            CMD.Dispose();

            MessageBox.Show("Insert sucessfully...", "Insert", MessageBoxButtons.OK, MessageBoxIcon.Asterisk);

            loadMygrid();
        }

        private void btn_delt_Click(object sender, EventArgs e)
        {
            QRY = "DELETE From tbl_PolicyDetails WHERE PolicyType='" + txt_Poliname.Text + "'";
            CNN = new SqlConnection(cnStr);
            CMD = new SqlCommand(QRY, CNN);
            DS = new DataSet();
            CNN.Open();
            CMD.ExecuteNonQuery();
            CNN.Close();
            CNN.Dispose();
            CMD.Dispose();

            MessageBox.Show("are you want to delete ?", "Delete", MessageBoxButtons.YesNoCancel, MessageBoxIcon.Error);

            MessageBox.Show("Insert sucessfully...", "Insert", MessageBoxButtons.OK, MessageBoxIcon.Asterisk);

            loadMygrid();
        }
        void loadMygrid()
        {
            QRY = "SELECT PolicyType,PolicyAmount,PolicyDate, PolicyTerm FROM tbl_PolicyDetails";
            CNN = new SqlConnection(cnStr);
            CMD = new SqlCommand(QRY, CNN);
            DS = new DataSet();
            AD = new SqlDataAdapter(CMD);
            CNN.Open();
            CMD.ExecuteNonQuery();
            AD.Fill(DS);
            poli_grid.DataSource = DS.Tables[0];
            CNN.Close();
            CNN.Dispose();
            CMD.Dispose();
        }

        private void Policydetails_Load(object sender, EventArgs e)
        {
            loadMygrid();
        }

        private void btn_Edit_Click(object sender, EventArgs e)
        {
            QRY = "UPDATE tbl_PolicyDetails SET ";
            QRY += "PolicyAmount='" + txt_PliAmount.Text + "',";
            QRY += " PolicyDate='" +dateOfPolicy.Value.ToShortDateString()  + "',";
            QRY += "PolicyTerm='" + cmb_PoliType.SelectedItem.ToString() + "'";
            QRY += " WHERE PolicyType='" +txt_Poliname.Text + "'";
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

            loadMygrid();

            MessageBox.Show("Edited sucessfully...", "Insert", MessageBoxButtons.OK, MessageBoxIcon.Asterisk);
        }

        void fillMyControl(int row)
        {
            txt_Poliname.Text = poli_grid.Rows[row].Cells[0].Value.ToString();
            txt_PliAmount.Text = poli_grid.Rows[row].Cells[1].Value.ToString();
            dateOfPolicy.Value = DateTime.Parse(poli_grid.Rows[row].Cells[2].Value.ToString());
            cmb_PoliType.Text = poli_grid.Rows[row].Cells[3].Value.ToString();
         }

        private void poli_grid_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            fillMyControl(e.RowIndex);
            //MessageBox.Show(poli_grid.Rows[e.RowIndex].Cells[0].Value.ToString());
        }
    }
}
