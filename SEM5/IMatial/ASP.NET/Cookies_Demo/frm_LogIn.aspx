<%@ Page Language="C#" AutoEventWireup="true" CodeFile="frm_LogIn.aspx.cs" Inherits="frm_LogIn" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body style="font-family:Verdana; font-size: 1.2em; color:navy; background-color:darksalmon; margin-top:5%">
    <form id="form1" runat="server">
    <center>
    <div style="border: 1px solid Navy; width:75%; background-color:burlywood; box-shadow: -4px -4px 12px Navy;">
    <table cellpadding="4" width="100%">
        <tr><td align="center" valign="Top" colspan="2"> 
     <h1 style="text-shadow: 2px 2px 14px yellow;">Cookies Demo</h1>
            <h2>LogIn Page</h2>
            </td></tr>

<tr align="left" valign="Top">
<td  align="right" valign="Top" style="width:50%">User Name :</td>
    <td align="left" valign="Top" style="width:50%"><asp:TextBox ID="txtUName" runat="server"/></td>
</tr>
<tr  align="left" valign="Top">
<td  align="right" valign="Top">Password :</td>
    <td  align="left" valign="Top"><asp:TextBox ID="txtPassword" runat="server"/></td>
</tr>
        <tr><td align="center" valign="Top" colspan="2"> 
    <asp:Label ID="lblStatus" runat="server" Width="100%" ForeColor="White" Visible="False" /></td></tr>
<tr><td align="center" valign="Top" colspan="2"> 
    <asp:Button ID="btnSubmit" runat="server" Text="Log In" OnClick="btnSubmit_Click" Width="20%" /></td></tr>
</table>
    </div></center>
    </form>
</body>
</html>
