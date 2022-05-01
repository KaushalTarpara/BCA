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
    public partial class PolicyReport : Form
    {
        string cnStr = "Data Source=DELL-PC;Initial Catalog=ins_man;Integrated Security=True";
        string QRY = "";
        SqlCommand CMD;
        SqlConnection CNN;
        SqlDataAdapter DA;
        public PolicyReport()
        {
            InitializeComponent();
        }

        private void PolicyReport_Load(object sender, EventArgs e)
        {
            QRY = "SELECT * FROM tbl_PolicyDetails";
            DataSet4 ds = new DataSet4();
            CNN = new SqlConnection(cnStr);
            CMD = new SqlCommand(QRY, CNN);
            DA = new SqlDataAdapter(CMD);
            DA.Fill(ds.DataTable1);
            CrystalReport4 myreport = new CrystalReport4();
            myreport.SetDataSource(ds);
            crystalReportViewer1.ReportSource = myreport;
        }
    }
}
