using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class frm_ValidationDemo : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        dtGrd1.Visible = false;
    }

    void ClearMyControls()
    {
        txtName.Text = "";
        txtAge.Text = "";
        txtAdd.Text = "";
        txtContNo.Text = "";
        txtEmail.Text = "";
        txtEvenNo.Text = "";
    }

    protected void btnReset_Click(object sender, EventArgs e)
    {
        ClearMyControls();
    }
    protected void btnAdd_Click(object sender, EventArgs e)
    {
        if (IsValid)
        {
            System.Data.DataTable DT = new System.Data.DataTable();
            DT.Columns.Add("SrNo");
            DT.Columns.Add("Name");
            DT.Columns.Add("Age");
            DT.Columns.Add("Address");
            DT.Columns.Add("Contact No");
            DT.Columns.Add("Email ID");

            DT.Rows.Add();
            DT.Rows[0][0] = DT.Rows.Count.ToString();
            DT.Rows[0][1] = txtName.Text.Trim();
            DT.Rows[0][2] = txtAge.Text.Trim();
            DT.Rows[0][3] = txtAdd.Text.Trim();
            DT.Rows[0][4] = txtContNo.Text.Trim();
            DT.Rows[0][5] = txtEmail.Text.Trim();

            dtGrd1.DataSource = DT;
            dtGrd1.DataBind();
            dtGrd1.Visible = true;
        }
        else dtGrd1.Visible = false;
    }
    protected void cst_EnvNo_ServerValidate(object source, ServerValidateEventArgs args)
    {
        try
        {
            int n = int.Parse(txtEvenNo.Text.Trim());
            if (n % 2 == 0)
            {
                args.IsValid = true;
            }
            else
            {
                args.IsValid = false;
            }
        }
        catch
        {
            args.IsValid = false;
        }
    }
}