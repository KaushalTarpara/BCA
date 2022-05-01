using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class frm_Form01 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        if (Session["myUser"] == null)
        {
            Session.Clear();
            Response.Redirect("frm_LogIn.aspx", true);
        }
        else
        {
            lblName.Text = Session["myUser"].ToString();
        }
    }
    protected void btnNext_Click(object sender, EventArgs e)
    {
        Response.Redirect("frm_Form02.aspx", true);
    }
    protected void lnkLogOut_Click(object sender, EventArgs e)
    {
        Session.Clear();
        Response.Redirect("frm_LogIn.aspx", true);
    }
}