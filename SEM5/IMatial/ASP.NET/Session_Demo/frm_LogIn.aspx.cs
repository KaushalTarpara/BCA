using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class frm_LogIn : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void btnSubmit_Click(object sender, EventArgs e)
    {
        if (txtUName.Text.ToLower() == "admin" && txtPassword.Text.ToLower() == "admin")
        {
            Session.Clear();
            Session["myUser"] = "Administrator";
            Response.Redirect("frm_Form01.aspx", true);
        }
        else
        {
            lblStatus.Visible = true;
            lblStatus.Text = "Invalid LogIn";
        }
    }
}