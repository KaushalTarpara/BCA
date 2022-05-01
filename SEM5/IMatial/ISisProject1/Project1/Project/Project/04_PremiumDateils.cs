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
    public partial class PremiumPaymentDateils : Form
    {
        public PremiumPaymentDateils()
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

        private void PremiumPaymentDateils_Load(object sender, EventArgs e)
        {
            fillCombo();
            loadmygrid();
        }

        void fillCombo()
        {
            QRY = "SELECT PolicyType FROM tbl_PolicyDetails";
            CNN = new SqlConnection(cnStr);
            CMD = new SqlCommand(QRY, CNN);
            CNN.Open();
            SqlDataReader DR = CMD.ExecuteReader();
            while (DR.Read())
            {
                cmbPolicyName.Items.Add(DR.GetValue(0).ToString());
            }
            CNN.Close();
            CNN.Dispose();
        }

        private void btn_add_Click(object sender, EventArgs e)
        {
            btn_add.Enabled = false;
            btn_Edit.Enabled = false;
            btn_delt.Enabled = false;

            txt_Chr.Clear();
            txt_PaIdAmou.Clear();
            cmbPolicyName.SelectedIndex = 0;
         }

        void loadmygrid()
        {
            QRY = "SELECT * from tbl_PremiumPayment";
            CNN = new SqlConnection(cnStr);
            CMD = new SqlCommand(QRY, CNN);
            DS = new DataSet();
            AD = new SqlDataAdapter(CMD);
            CNN.Open();
            CMD.ExecuteNonQuery();
            AD.Fill(DS);
            PrimGrid.DataSource = DS.Tables[0];
            CNN.Close();
            CNN.Dispose();
            CMD.Dispose();

            //fillMyCombo();
        }
        void fillmygrid(int row)
        {
            cmbPolicyName.Text = PrimGrid.Rows[row].Cells[1].Value.ToString();
            txt_PaIdAmou.Text = PrimGrid.Rows[row].Cells[2].Value.ToString();
            date.Value = DateTime.Parse(PrimGrid.Rows[row].Cells[3].Value.ToString());
            txt_Chr.Text = PrimGrid.Rows[row].Cells[4].Value.ToString();
        }

        

        private void btnExit_Click(object sender, EventArgs e)
        {
            QRY = "DELETE FROM tbl_PremiumPayment WHERE PremiumId='" + int.Parse(PrimGrid.SelectedCells[0].Value.ToString()) + "'";
            CNN = new SqlConnection(cnStr);
            CMD = new SqlCommand(QRY, CNN);
            DS = new DataSet();
            CNN.Open();
            CMD.ExecuteNonQuery();
            CNN.Close();
            CNN.Dispose();
            CMD.Dispose();

            MessageBox.Show("are you want to delete ?", "Delete", MessageBoxButtons.YesNoCancel, MessageBoxIcon.Error);

            MessageBox.Show("Record deleted...", "DELETE", MessageBoxButtons.OK, MessageBoxIcon.Asterisk);

            loadmygrid();
        }

        private void btn_Edit_Click(object sender, EventArgs e)
        {
            QRY = "UPDATE tbl_PremiumPayment SET ";
            QRY += "PolicyName='" + cmbPolicyName.SelectedItem.ToString() + "',";
            QRY += " PaidAmount='" + txt_PaIdAmou.Text + "',";
            //QRY += " DateOfPayment='" + txt_ContNo.Text + "',";
            QRY += " Charges='" + txt_Chr.Text + "'";
            QRY += "WHERE  PremiumId='" + int.Parse(PrimGrid.SelectedCells[0].Value.ToString()) + "'";
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

        }

        private void PrimGrid_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            fillmygrid(e.RowIndex);
            //MessageBox.Show(PrimGrid.Rows[e.RowIndex].Cells[5].Value.ToString());
        }

        private void btnSave_Click(object sender, EventArgs e)
        {
            QRY = "INSERT INTO tbl_PremiumPayment VALUES(";
            QRY += "(select max(PremiumId)+1 from tbl_PremiumPayment),";
            // QRY += "'" + txt_PolicyN.Text + "',";
            QRY += "'" + cmbPolicyName.SelectedItem.ToString() + "',";
            QRY += "'" + txt_PaIdAmou.Text + "',";
            QRY += "'" + date.Value.ToShortDateString() + "',";
            QRY += "'" + txt_Chr.Text + "'";
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
        }
    }
}
