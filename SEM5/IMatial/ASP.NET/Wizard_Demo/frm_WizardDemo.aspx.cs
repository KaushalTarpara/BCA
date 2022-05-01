using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class frm_WizardDemo : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        
    }

    void ClearMyControls()
    { 
        
    }

    protected void Wizard1_FinishButtonClick(object sender, WizardNavigationEventArgs e)
    {
        lblResult.Visible = true;
        lblResult.Text = "";
       

        fldImage.SaveAs(Server.MapPath("Images") + "\\" + fldImage.PostedFile.FileName.ToString());       
        
        lblResult.Text = "<table align='center' border='0' cellpadding='8' cellspacing='0' width='100%' style='Font-family: Book Antiqua; font-size: 18px'>";
        lblResult.Text += "<tr align='left' valign='Top'>";
        lblResult.Text += "<td align='center' valign='middle' colspan='3'><h1>Application Form</h1></td></tr>";
        lblResult.Text += "<tr align='left' valign='Top'>";
        lblResult.Text += "<td align='center' valign='middle' colspan='3'>";
        lblResult.Text += "<table border='0' cellpadding='8' cellspacing='0' width='100%' style='Font-family: Book Antiqua; font-size: 18px'>";
        lblResult.Text += "<tr align='left' valign='Top'>";
        lblResult.Text += "<td align='right' valign='Top' style='width:40%'>First Name</td>";
        lblResult.Text += "<td align='center' valign='Top' style='width:1%'>:</td>";
        lblResult.Text += "<td align='left' valign='Top' style='width:29%'>"+ txtfName.Text +"</td>";
        lblResult.Text += "<td align='left' valign='Top' style='width:30%;' rowspan='4'>";
        //------------------------------------------
        //Image Will be here
        //------------------------------------------
        lblResult.Text += "<img src='Images\\"+ fldImage.PostedFile.FileName.ToString() +"' border='3' width='50%' height='100%' />";
        //------------------------------------------
        lblResult.Text += "</td></tr><tr align='left' valign='Top'>";
        lblResult.Text += "<td align='right' valign='Top' style='width:40%'>Middle Name</td>";
        lblResult.Text += "<td align='center' valign='Top' style='width:1%'>:</td>";
        lblResult.Text += "<td align='left' valign='Top' style='width:29%'>" + txtMName.Text + "</td></tr>";
        lblResult.Text += "<tr align='left' valign='Top'>";
        lblResult.Text += "<td align='right' valign='Top' style='width:40%'>Last Name</td>";
        lblResult.Text += "<td align='center' valign='Top' style='width:1%'>:</td>";
        lblResult.Text += "<td align='left' valign='Top' style='width:29%'>" + txtLName.Text + "</td></tr>";
        lblResult.Text += "<tr align='left' valign='Top'>";
        lblResult.Text += "<td align='right' valign='Top' style='width:40%'>Gender</td>";
        lblResult.Text += "<td align='center' valign='Top' style='width:1%'>:</td>";
        lblResult.Text += "<td align='left' valign='Top' style='width:29%'>";
        
        if (rdbMale.Checked)
        {
            lblResult.Text += "Male</td></tr></table>";
        }
        else
            lblResult.Text += "Female</td></tr></table>";
        
        lblResult.Text += "</td></tr>";
        lblResult.Text += "<tr align='left' valign='Top'>";
        lblResult.Text += "<td align='right' valign='Top' style='width:40%'>Address</td>";
        lblResult.Text += "<td align='center' valign='Top' style='width:1%'>:</td>";
        lblResult.Text += "<td align='left' valign='Top' style='width:59%'>" + txtAdd.Text + "</td></tr>";
        lblResult.Text += "<tr align='left' valign='Top'>";
        lblResult.Text += "<td align='right' valign='Top' style='width:40%'>City</td>";
        lblResult.Text += "<td align='center' valign='Top' style='width:1%'>:</td>";
        lblResult.Text += "<td align='left' valign='Top' style='width:59%'>" + cmbCity.SelectedItem.Text + "</td></tr>";
        lblResult.Text += "<tr align='left' valign='Top'>";
        lblResult.Text += "<td align='right' valign='Top' style='width:40%'>S.S.C. School Name</td>";
        lblResult.Text += "<td align='center' valign='Top' style='width:1%'>:</td>";
        lblResult.Text += "<td align='left' valign='Top' style='width:59%'>" + txtSSCSchlName.Text + "</td></tr>";
        lblResult.Text += "<tr align='left' valign='Top'>";
        lblResult.Text += "<td align='right' valign='Top' style='width:40%'>S.S.C. Board Name</td>";
        lblResult.Text += "<td align='center' valign='Top' style='width:1%'>:</td>";
        lblResult.Text += "<td align='left' valign='Top' style='width:59%'>" + txtSSCBrdName.Text + "</td></tr>";
        lblResult.Text += "<tr align='left' valign='Top'>";
        lblResult.Text += "<td align='right' valign='Top' style='width:40%'>S.S.C. Per</td>";
        lblResult.Text += "<td align='center' valign='Top' style='width:1%'>:</td>";
        lblResult.Text += "<td align='left' valign='Top' style='width:59%'>" + txtSSCPer.Text + "</td></tr>";
        lblResult.Text += "<tr align='left' valign='Top'>";
        lblResult.Text += "<td align='right' valign='Top' style='width:40%'>H.S.C. School Name</td>";
        lblResult.Text += "<td align='center' valign='Top' style='width:1%'>:</td>";
        lblResult.Text += "<td align='left' valign='Top' style='width:59%'>" + txtHSCSchlName.Text + "</td></tr>";
        lblResult.Text += "<tr align='left' valign='Top'>";
        lblResult.Text += "<td align='right' valign='Top' style='width:40%'>H.S.C. Board Name</td>";
        lblResult.Text += "<td align='center' valign='Top' style='width:1%'>:</td>";
        lblResult.Text += "<td align='left' valign='Top' style='width:59%'>" + txtHSCBrdName.Text + "e</td></tr>";
        lblResult.Text += "<tr align='left' valign='Top'>";
        lblResult.Text += "<td align='right' valign='Top' style='width:40%'>H.S.C. Per & Stream";
        lblResult.Text += "</td>";
        lblResult.Text += "<td align='center' valign='Top' style='width:1%'>:";
        lblResult.Text += "</td>";
        lblResult.Text += "<td align='left' valign='Top' style='width:59%'>" + txtHSCPer.Text + "</td>";
        lblResult.Text += "</tr>";
        lblResult.Text += "<tr align='left' valign='Top'>";
        lblResult.Text += "<td align='right' valign='Top' style='width:40%'>Laungages Known";
        lblResult.Text += "</td>";
        lblResult.Text += "<td align='center' valign='Top' style='width:1%'>:";
        lblResult.Text += "</td>";
        lblResult.Text += "<td align='left' valign='Top' style='width:59%'>" + txtLaung.Text + "";
        lblResult.Text += "</td>";
        lblResult.Text += "</tr>";
        lblResult.Text += "<tr align='left' valign='Top'>";
        lblResult.Text += "<td align='right' valign='Top' style='width:40%'>Admission Stream";
        lblResult.Text += "</td>";
        lblResult.Text += "<td align='center' valign='Top' style='width:1%'>:";
        lblResult.Text += "</td>";
        lblResult.Text += "<td align='left' valign='Top' style='width:59%'>" + cmbStream.SelectedItem.Text + "";
        lblResult.Text += "</td>";
        lblResult.Text += "</tr>";
        lblResult.Text += "</table>";
        Wizard1.Visible = false;
        btnBack.Visible = true;
    }
    protected void btnBack_Click(object sender, EventArgs e)
    {
        lblResult.Text = "";
        lblResult.Visible = false;
        btnBack.Visible = false;
        Wizard1.Visible = true;
        Wizard1.ActiveStepIndex = 0;
    }
}