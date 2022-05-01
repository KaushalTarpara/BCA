using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Project
{
    public partial class mainFrm : Form
    {
        public mainFrm()
        {
            InitializeComponent();
        }

        private void addToolStripMenuItem_Click_1(object sender, EventArgs e)
        {
            Customer cu = new Customer();
            cu.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            cu.MdiParent = this;
            cu.Show();
        }

        private void addToolStripMenuItem1_Click_1(object sender, EventArgs e)
        {
            Policydetails pc = new Policydetails();
            pc.MdiParent = this;
            pc.Show();
        }

        private void addToolStripMenuItem2_Click_1(object sender, EventArgs e)
        {
            PremiumPaymentDateils pr = new PremiumPaymentDateils();
            pr.MdiParent = this;
            pr.Show();
        }

        private void addToolStripMenuItem3_Click_1(object sender, EventArgs e)
        {
            BranchDateils Bd = new BranchDateils();
            Bd.MdiParent = this;
            Bd.Show();
        }

        private void addToolStripMenuItem4_Click_1(object sender, EventArgs e)
        {
            AgentDateils ag = new AgentDateils();
            ag.MdiParent = this;
            ag.Show();
        }

        private void serchToolStripMenuItem_Click(object sender, EventArgs e)
        {
            //Cust_Grid CG = new Cust_Grid();
            //CG.Show();
        }

        private void btnLogout_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void editOrUpdateToolStripMenuItem_Click(object sender, EventArgs e)
        {
           
        }

        private void customerToolStripMenuItem_Click(object sender, EventArgs e)
        {

        }

        private void reportToolStripMenuItem_Click(object sender, EventArgs e)
        {
            CustomerReport CS = new CustomerReport();
            CS.Show();
        }

        private void reportToolStripMenuItem1_Click(object sender, EventArgs e)
        {
            PolicyReport PS = new PolicyReport();
            PS.Show();
        }

        private void reportToolStripMenuItem2_Click(object sender, EventArgs e)
        {
            premiumReport PR = new premiumReport();
            PR.Show();
        }

        private void reportToolStripMenuItem3_Click(object sender, EventArgs e)
        {
            BranchReport BR = new BranchReport();
            BR.Show();
        }

        private void reportToolStripMenuItem4_Click(object sender, EventArgs e)
        {
            AgentReport AR = new AgentReport();
            AR.Show();
        }

        
    }
      
}
