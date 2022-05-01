using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.OleDb;
using System.Data.SqlClient;

namespace Project
{
    public partial class Home : Form
    {
        public Home()
        {
            InitializeComponent();
        }    

        private void btnLogin_Click(object sender, EventArgs e)
        {
            if (txtUName.Text == "Admin" && txtPass.Text == "Admin")
            {
                mainFrm hm = new mainFrm();
                hm.Show();
            }
            else MessageBox.Show("Invalid password or user name...");
            txtUName.Clear();
            txtPass.Clear();
        }

        private void btnExit_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void Home_KeyPress(object sender, KeyPressEventArgs e)
        {

        }

        private void btnLogin_ClientSizeChanged(object sender, EventArgs e)
        {

        }

        private void btnLogin_KeyPress(object sender, KeyPressEventArgs e)
        {
           
        }

        private void Home_Load(object sender, EventArgs e)
        {

        }
    }
}
