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
    public partial class CustomerReport : Form
    {
        string cnStr = "Data Source=DELL-PC;Initial Catalog=ins_man;Integrated Security=True";
        string QRY = "";
        SqlCommand CMD;
        SqlConnection CNN;
        SqlDataAdapter DA;
        public CustomerReport()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            //QRY = "SELECT * FROM tbl_CustomerDetails";
            //DataSet1 ds = new DataSet1();
            //CNN = new SqlConnection(cnStr);
            //CMD = new SqlCommand(QRY,CNN);
            //DA = new SqlDataAdapter(CMD);
            //DA.Fill(ds.DataTable1);
            //CrystalReport1 myreport = new CrystalReport1();
            //myreport.SetDataSource(ds);
            //crystalReportViewer1.ReportSource = myreport;
            QRY = "SELECT * FROM tbl_CustomerDetails";
            DataSet1 ds = new DataSet1();
            CNN = new SqlConnection(cnStr);
            CMD = new SqlCommand(QRY, CNN);
            DA = new SqlDataAdapter(CMD);
            DA.Fill(ds.DataTable1);
            CrystalReport1 myreport = new CrystalReport1();
            myreport.SetDataSource(ds);
            crystalReportViewer1.ReportSource = myreport;
            
          }

        private void Form1_Load(object sender, EventArgs e)
        {
        //    QRY = "SELECT * FROM tbl_CustomerDetails";
        //    DataSet1 ds = new DataSet1();
        //    CNN = new SqlConnection(cnStr);
        //    CMD = new SqlCommand(QRY, CNN);
        //    DA = new SqlDataAdapter(CMD);
        //    DA.Fill(ds.DataTable1);
        //    CrystalReport1 myreport = new CrystalReport1();
        //    myreport.SetDataSource(ds);
        //    crystalReportViewer1.ReportSource = myreport;
        }

        private void crystalReportViewer1_Load(object sender, EventArgs e)
        {

        }
    }
}
