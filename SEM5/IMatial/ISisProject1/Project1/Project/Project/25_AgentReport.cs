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
    public partial class AgentReport : Form
    {
        string cnStr = "Data Source=DELL-PC;Initial Catalog=ins_man;Integrated Security=True";
        string QRY = "";
        SqlCommand CMD;
        SqlConnection CNN;
        SqlDataAdapter DA;
        public AgentReport()
        {
            InitializeComponent();
        }

        private void AgentReport_Load(object sender, EventArgs e)
        {
            QRY = "SELECT * FROM tbl_AgentDateils";
            DataSet2 ds = new DataSet2();
            CNN = new SqlConnection(cnStr);
            CMD = new SqlCommand(QRY, CNN);
            DA = new SqlDataAdapter(CMD);
            DA.Fill(ds.DataTable1);
            CrystalReport2 myreport = new CrystalReport2();
            myreport.SetDataSource(ds);
            crystalReportViewer1.ReportSource = myreport;
        }
    }
}
