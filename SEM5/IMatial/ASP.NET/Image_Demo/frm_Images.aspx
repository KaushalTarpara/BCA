<%@ Page Language="C#" AutoEventWireup="true" CodeFile="frm_Images.aspx.cs" Inherits="frm_Images" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>ImageFromDatabase</title>
    <style>
        table {
            font-family:Verdana;
            font-size: 1.0em;
            background-color:steelblue;
            color:white;
        }
         h1 {
            font-family:'Comic Sans MS';            
            background-color:steelblue;
            color:white;
        }
    </style>
    
</head>
<body>
    <form id="frmImages" runat="server">
    <center>
   
        <table border="0" cellpadding="8" cellspacing="0" width="50%">
            <tr align="Left" valign="Top">
                <td align="center" valign="Top">
                    <h1>Images From Database</h1>
                </td>
            </tr>
            <tr align="Left" valign="Top">
                <td align="center" valign="Top">
                    <asp:Image ID="imgPreview" runat="server" Width="50%" BorderColor="White" BorderStyle="Solid" BorderWidth="2px" Visible="False" />
                </td>
            </tr>
            <tr align="Left" valign="Top">
                <td align="center" valign="Top">
                    Select File : <asp:FileUpload ID="fld_01" runat="server" /> &nbsp;&nbsp;&nbsp;
                    <asp:Button ID="btnAdd" runat="server" Text="Upload" Width="20%" OnClick="btnAdd_Click" />
                </td>
            </tr>
             <tr align="Left" valign="Top">
                <td align="center" valign="Top">
                   <asp:Label ID="lblStatus" runat="server" Width="100%" Visible="false"></asp:Label>
                </td>
            </tr>
             <tr align="Left" valign="Top">
                <td align="center" valign="Top">
                   <asp:GridView ID="dtGrd1" runat="server" Width="100%" AutoGenerateColumns="False" BorderStyle="None" BorderWidth="0px" OnRowDeleting="dtGrd1_RowDeleting">
                       <Columns>
                           <asp:BoundField DataField="ImgID" HeaderText="Image ID">
                           <ControlStyle Width="100%" />
                           <ItemStyle HorizontalAlign="Center" VerticalAlign="Top" Width="15%" />
                           </asp:BoundField>
                           <asp:BoundField DataField="ImageName" HeaderText="Image Name">
                           <ControlStyle Width="100%" Font-Size="0.8em" />
                           <ItemStyle HorizontalAlign="Center" VerticalAlign="Top" Width="25%" Font-Size="0.8em" />
                           </asp:BoundField>
                           <asp:TemplateField HeaderText="Images">                              
                               <ItemTemplate>
                                   <asp:Image ID="img_01" ImageUrl='<%# "DisplayImg.ashx?ID="+Eval("ImgID") %>' AlternateText='<%# Eval("ImageName")  %>' runat="server" />
                               </ItemTemplate>
                               <ControlStyle BorderColor="White" BorderStyle="Solid" BorderWidth="1px" Width="99%" />
                               <ItemStyle HorizontalAlign="Center" VerticalAlign="Middle" Width="50%" />
                           </asp:TemplateField>
                           <asp:TemplateField HeaderText="Delete" ShowHeader="False">
                               <ItemTemplate>
                                   <asp:Button ID="btnGrdDel" runat="server" CausesValidation="False" CommandName="Delete" Text="Delete Image" />
                               </ItemTemplate>
                               <ControlStyle BackColor="#FF0066" BorderStyle="Solid" BorderWidth="1px" Font-Names="Bookman Old Style" Font-Size="0.8em" ForeColor="White" Width="90%" />
                               <ItemStyle HorizontalAlign="Center" VerticalAlign="Top" Width="10%" />
                           </asp:TemplateField>
                       </Columns>
                       <RowStyle BorderStyle="None" BorderWidth="0px" />
                    </asp:GridView>
                </td>
            </tr>
        </table>
    </center>
    </form>
</body>
</html>
