using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class frm_Cntrl_2_DtGrd : System.Web.UI.Page
{
    System.Data.DataTable DT = new System.Data.DataTable();
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void btnAdd_Click(object sender, EventArgs e)
    {
        
        DT.Columns.Add("SrNo");
        DT.Columns.Add("Name");
        DT.Columns.Add("Gender");
        DT.Columns.Add("City");

        DT.Rows.Add();
        DT.Rows[DT.Rows.Count - 1][0] = DT.Rows.Count.ToString();
        DT.Rows[DT.Rows.Count - 1][1] = txtName.Text;
        DT.Rows[DT.Rows.Count - 1][2] = "Male";
        DT.Rows[DT.Rows.Count - 1][3] = cmbCity.SelectedItem.Text.ToString();

        dtGrd1.DataSource = DT;
        dtGrd1.DataBind();
    }
    protected void rdbMale_CheckedChanged(object sender, EventArgs e)
    {
        if (rdbMale.Checked)
        {
            dtGrd1.EditIndex = 0;
        }        
    }
    protected void rdbFemale_CheckedChanged(object sender, EventArgs e)
    {
        if (rdbFemale.Checked)
        {
            dtGrd1.EditIndex = -1;            
        }        
    }
}