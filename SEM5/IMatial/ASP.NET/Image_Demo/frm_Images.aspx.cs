using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;
using System.IO;
using System.Configuration;
using System.Data.OleDb;

public partial class frm_Images : System.Web.UI.Page
{
    OleDbDataAdapter DA = new OleDbDataAdapter();
    OleDbConnection CNN;    
    OleDbCommand CMD;
    static string cnStr = "";
    static string QRY = "";
    DataSet DS;
    public static Byte[] imgByte = null;

    protected void Page_Load(object sender, EventArgs e)
    {
        cnStr = System.Configuration.ConfigurationManager.ConnectionStrings["CnStr"].ToString();
        
        if (!IsPostBack)
        {
            try
            {
                BindMyGrid();
            }
            catch (Exception EX)
            {
                lblStatus.Visible = true;
                lblStatus.ForeColor = System.Drawing.Color.Yellow;                
                lblStatus.Text = "There was an error" + "<br /><br />" + EX.ToString();
            }
        }
    }
    protected void btnAdd_Click(object sender, EventArgs e)
    {
        if (fld_01.PostedFile.FileName != "")
        {
            try
            {
                HttpPostedFile File = fld_01.PostedFile;
                imgByte = new Byte[File.ContentLength];
                File.InputStream.Read(imgByte, 0, File.ContentLength);

                ////===================================================
                //// Read File (Image Preview) From Stream and StreamReader
                string base64String = Convert.ToBase64String(imgByte, 0, imgByte.Length);
                imgPreview.ImageUrl = "data:image/jpeg;base64," + base64String;
                imgPreview.Visible = true;
                ////===================================================

                QRY = "INSERT INTO tbl_ImageFile (ImgID, ImageName, ImageData, IsActive) ";
                QRY += "SELECT Max(ImgID)+1 AS ['ImgID'], '" + fld_01.PostedFile.FileName.ToString() + "',@theImage,'1' ";
                QRY += "FROM tbl_ImageFile";

                CNN = new OleDbConnection(cnStr);
                CMD = new System.Data.OleDb.OleDbCommand(QRY, CNN);
                CMD.Parameters.AddWithValue("@theImage", imgByte);
                CNN.Open();
                CMD.ExecuteNonQuery();
                CNN.Close();
                CNN.Dispose();
                CMD.Dispose();

                lblStatus.Visible = true;
                lblStatus.ForeColor = System.Drawing.Color.White;
                lblStatus.Text = "Image Uploaded";
            }
            catch (Exception EX)
            {
                lblStatus.Visible = true;
                lblStatus.ForeColor = System.Drawing.Color.Yellow;
                lblStatus.Text = "There was an error" + "<br /><br />" + EX.ToString();
            }
           
            BindMyGrid();
        }
        else
        {
            lblStatus.Visible = true;
            imgPreview.Visible = false;
            lblStatus.ForeColor = System.Drawing.Color.White;
            lblStatus.Text = "Kindly Select File To Upload";
        }
        
    }
    
    void BindMyGrid()
    {
        QRY = "SELECT ImgID, ImageName From tbl_ImageFile Order By ImgID";
        CNN = new OleDbConnection(cnStr);
        CMD = new OleDbCommand(QRY, CNN);
        DA = new OleDbDataAdapter(CMD);
        DS = new DataSet();
        DA.Fill(DS);
        dtGrd1.DataSource = DS.Tables[0];
        dtGrd1.DataBind();
        foreach (GridViewRow GVR in dtGrd1.Rows)
        {
            Button btnGrd = (Button)GVR.FindControl("btnGrdDel");            
            btnGrd.Attributes.Add("onclick", "return confirm('Are you sure you wish to delete " + GVR.Cells[1].Text + " ?');");
        }
    }
    protected void dtGrd1_RowDeleting(object sender, GridViewDeleteEventArgs e)
    {
        try 
        {
            QRY = "DELETE FROM tbl_ImageFile WHERE ImgID = " + dtGrd1.Rows[e.RowIndex].Cells[0].Text + "";
            CNN = new OleDbConnection(cnStr);
            CMD = new System.Data.OleDb.OleDbCommand(QRY, CNN);
            CNN.Open();
            CMD.ExecuteNonQuery();
            CNN.Close();
            CNN.Dispose();
            CMD.Dispose();

            lblStatus.Visible = true;
            lblStatus.ForeColor = System.Drawing.Color.White;
            lblStatus.Text = "Image Deleted";

        }
        catch (Exception EX)
        {
            lblStatus.Visible = true;
            lblStatus.ForeColor = System.Drawing.Color.Yellow;
            lblStatus.Text = "There was an error" + "<br /><br />" + EX.ToString();
        }
        BindMyGrid();
    }
}