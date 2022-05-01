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
    public partial class editorupdate : Form
    {
        public editorupdate()
        {
            InitializeComponent();
        }
        string cnStr = "Data Source=PC177;Initial Catalog=ins_man;Integrated Security=True";
        string QRY = "";
        SqlCommand CMD;
        SqlConnection CNN;
        SqlDataAdapter AD;
        DataSet DS;
        
        void Myserchbox(string search)
        {
            //DS = new DataSet();
            //QRY = "Select * from tbl_CustomerDetails ";

            //if (search.Trim() != "")
            //{
            //    QRY += "WHERE CustomerName LIKE '%" + search + "%'";
            //}
            //CNN = new SqlConnection(cnStr);
            //CMD = new SqlCommand(QRY,CNN);
            //AD = new SqlDataAdapter(CMD);
            //AD.Fill(DS);

            //dtgrid.DataSource=DS.Tables[0];

            //CNN.Dispose();
            //CMD.Dispose();
            //AD.Dispose();
       }
        void BindMyGrid()
        {
            QRY = "Select * from tbl_CustomerDetails";
            CNN = new SqlConnection(cnStr);
            //DS = new DataSet();
            CMD = new SqlCommand(QRY,CNN);
            AD = new SqlDataAdapter(CMD);
            DataTable dt = new DataTable();
            //AD.Fill(DS);

            //dtgrid.DataSource = DS.Tables[0];
            dtgrid.DataSource = dt;
            CNN.Dispose();
            CMD.Dispose();
            AD.Dispose();
        }

        private void btnExit_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void splitContainer1_Panel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void splitContainer1_Panel2_Paint(object sender, PaintEventArgs e)
        {

        }

        private void SearchTxt_TextChanged(object sender, EventArgs e)
        {

        }

        private void btn_add_Click(object sender, EventArgs e)
        {

        }

        private void btnSave_Click(object sender, EventArgs e)
        {

        }

        private void editorupdate_Load(object sender, EventArgs e)
        {
            BindMyGrid();
        }

        private void btnsrch_Click(object sender, EventArgs e)
        {
            BindMyGrid();
        }

        private void btnExit_Click_1(object sender, EventArgs e)
        {
            
        }
    }
}
