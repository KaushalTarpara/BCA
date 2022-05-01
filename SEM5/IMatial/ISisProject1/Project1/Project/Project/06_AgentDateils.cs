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
    public partial class AgentDateils : Form
    {
        public AgentDateils()
        {
            InitializeComponent();
        }
        string cnStr = "Data Source=DELL-PC;Initial Catalog=ins_man;Integrated Security=True";
        //string cnStr = "Data Source=PC177;Initial Catalog=ins_man;Integrated Security=True";
        string QRY = "";
        SqlCommand CMD;
        SqlConnection CNN;
        SqlDataAdapter AD;
        DataSet DS;
        string gen;

        private void AgentDateils_Load(object sender, EventArgs e)
        {
            loadMygrid();
        }

        private void btn_add_Click(object sender, EventArgs e)
        {
            btn_add.Enabled = false;

           // ---------------Clear controls--------------

            //txt_AgentId.Clear();
            txt_AgentN.Clear();
            txt_Addr.Clear();
            txt_Cont.Clear();
            txt_Email.Clear();
            txt_Age.Clear();
            txt_Quali.Clear();
        }

        private void btnExit_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void btnSave_Click(object sender, EventArgs e)
        {
            btn_add.Enabled = true;
            //string gen;
            if (btnrdiomale.Checked)
            {
                gen = "Male";
            }
            else
            {
                gen = "Female";
            }
            QRY = "INSERT INTO tbl_AgentDateils VALUES(";
            QRY += "(SELECT MAX(AgentID) + 1 FROM tbl_AgentDateils),";
            QRY += "'" + txt_AgentN.Text + "',";
            QRY += "'" + txt_Addr.Text + "',";
            QRY += "'" + txt_Cont.Text + "',";
            QRY += "'" + txt_Email.Text + "',";
            QRY += "'" + txt_Age.Text + "',";
            QRY += "'" + gen + "',";
            QRY += "'" + txt_Quali.Text + "'";
            QRY += ")";

            CNN = new SqlConnection(cnStr);
            CMD = new SqlCommand(QRY, CNN);
            CNN.Open();
            CMD.ExecuteNonQuery();
            CNN.Close();
            CNN.Dispose();
            CMD.Dispose();

            MessageBox.Show("Insert sucessfully...", "Insert", MessageBoxButtons.OK, MessageBoxIcon.Asterisk);
            loadMygrid();
        }

        void filemygrid(int row)
        {
            txt_AgentN.Text = agentgrid.Rows[row].Cells[1].Value.ToString();
            txt_Addr.Text = agentgrid.Rows[row].Cells[2].Value.ToString();
            txt_Cont.Text = agentgrid.Rows[row].Cells[3].Value.ToString();
            txt_Email.Text = agentgrid.Rows[row].Cells[4].Value.ToString();
            txt_Age.Text = agentgrid.Rows[row].Cells[5].Value.ToString();
            if (btnrdiomale.Checked)
            {
                btnrdiomale.Text = agentgrid.Rows[row].Cells[6].Value.ToString();
            }
            else
            {
                btnrdiofemale.Text = agentgrid.Rows[row].Cells[6].Value.ToString();
            }
            txt_Quali.Text = agentgrid.Rows[row].Cells[7].Value.ToString();
        }

        
        void loadMygrid()
        {
            QRY = "SELECT * FROM tbl_AgentDateils";
            CNN = new SqlConnection(cnStr);
            CMD = new SqlCommand(QRY, CNN);
            DS = new DataSet();
            AD = new SqlDataAdapter(CMD);
            CNN.Open();
            CMD.ExecuteNonQuery();
            AD.Fill(DS);
            agentgrid.DataSource = DS.Tables[0];
            CNN.Close();
            CNN.Dispose();
            CMD.Dispose();
        }

        private void btn_edit_Click_1(object sender, EventArgs e)
        {
            QRY = "UPDATE tbl_AgentDateils SET ";
            QRY += "Address='" + txt_Addr.Text + "',";
            QRY += " ContactNo='" + txt_Cont.Text + "',";
            QRY += "Email='" + txt_Email.Text + "',";
            QRY += "Age='" + txt_Age.Text + "',";
            QRY += "Qualification='" + txt_Quali.Text + "'";
            QRY += " WHERE AgentName='" + txt_AgentN.Text  +"'"; 
            btnrdiomale.Enabled = false;
            btnrdiofemale.Enabled = false;
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

        private void btn_del_Click(object sender, EventArgs e)
        {
            QRY = "DELETE FROM tbl_AgentDateils WHERE AgentName='" + txt_AgentN.Text + "'";
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

        private void agentgrid_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            filemygrid(e.RowIndex);
           // MessageBox.Show(agentgrid.Rows[e.RowIndex].Cells[7].Value.ToString());
        }
       }
}
