using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class frm_Form02 : System.Web.UI.Page
{
    HttpCookie CK;
    protected void Page_Load(object sender, EventArgs e)
    {
        CK = Request.Cookies["myUser"];
        if (CK != null)
            {
                lblName.Text = CK.Value.ToString();
            }
            else
            {               
                Response.Redirect("frm_LogIn.aspx", true);
            }
        
    }
    protected void lnkLogOut_Click(object sender, EventArgs e)
    {
        if (CK != null)
        {
            CK.Expires = System.DateTime.Now.AddYears(-100);
            Response.Cookies.Add(CK);            
        }
        Response.Redirect("frm_LogIn.aspx", true);
    }
    protected void btnBack_Click(object sender, EventArgs e)
    {
        Response.Redirect("frm_Form01.aspx", true);
    }
}