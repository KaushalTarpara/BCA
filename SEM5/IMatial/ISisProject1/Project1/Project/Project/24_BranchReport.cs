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
    public partial class BranchReport : Form
    {
        string cnStr = "Data Source=DELL-PC;Initial Catalog=ins_man;Integrated Security=True";
        string QRY = "";
        SqlCommand CMD;
        SqlConnection CNN;
        SqlDataAdapter DA;
        public BranchReport()
        {
            InitializeComponent();
        }

        private void branchReport_Load(object sender, EventArgs e)
        {
            QRY = "SELECT * FROM tbl_BranchDateils";
            DataSet3 ds = new DataSet3();
            CNN = new SqlConnection(cnStr);
            CMD = new SqlCommand(QRY, CNN);
            DA = new SqlDataAdapter(CMD);
            DA.Fill(ds.DataTable1);
            CrystalReport3 myreport = new CrystalReport3();
            myreport.SetDataSource(ds);
            crystalReportViewer1.ReportSource = myreport;
        }
    }
}
