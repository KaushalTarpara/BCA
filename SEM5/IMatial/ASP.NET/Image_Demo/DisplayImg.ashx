<%@ WebHandler Language="C#" Class="DisplayImg" %>

using System;
using System.Web;
using System.Configuration;
using System.IO;
using System.Data;
using System.Data.OleDb;

public class DisplayImg : IHttpHandler {

    public void ProcessRequest(HttpContext context)
    {
        try
        {
            Int32 theID;
            if (context.Request.QueryString["id"] != null)
                theID = Convert.ToInt32(context.Request.QueryString["id"]);
            else
                throw new ArgumentException("No parameter specified");

            context.Response.ContentType = "image/jpeg";
            Stream strm = DisplayImage(theID);
            byte[] buffer = new byte[4096];
            int byteSeq = strm.Read(buffer, 0, 4096);

            while (byteSeq > 0)
            {
                context.Response.OutputStream.Write(buffer, 0, byteSeq);
                byteSeq = strm.Read(buffer, 0, 4096);
            }
        }
        catch
        {

        }

    }
    public Stream DisplayImage(int theID)
    {
        System.Data.OleDb.OleDbConnection connection = new System.Data.OleDb.OleDbConnection(ConfigurationManager.ConnectionStrings["CnStr"].ConnectionString.ToString());
        string QRY = "SELECT ImageData FROM tbl_ImageFile WHERE ImgID = @ID";
        System.Data.OleDb.OleDbCommand cmd = new System.Data.OleDb.OleDbCommand(QRY, connection);
        cmd.CommandType = CommandType.Text;
        cmd.Parameters.AddWithValue("@ID", theID);
        connection.Open();
        object theImg = cmd.ExecuteScalar();
        try
        {
            return new MemoryStream((byte[])theImg);
        }
        catch
        {
            return null;
        }
        finally
        {
            connection.Close();
        }
    }
    public bool IsReusable {
        get {
            return false;
        }
    }

}