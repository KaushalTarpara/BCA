<%@ Page Language="C#" AutoEventWireup="true" CodeFile="frm_Form01.aspx.cs" Inherits="frm_Form01" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body style="background-color:lightgoldenrodyellow; color:navy; font-family:Verdana; font-size:1.2em">
    <form id="form1" runat="server">
    <center>
    <table id="tblMain" width="75%" border="0" cellpadding="8">
        <tr align="Left" valign="Top">
            <td  align="center" valign="Top" colspan="3" style="background-color:lightblue; color:navy;">
                <h1 style="text-shadow: 2px 2px 14px yellow;">Cookies Demo</h1>
                <h2>Page 01</h2>
            </td>
        </tr>
        <tr align="Left" valign="Top">
            <td  align="right" valign="Top" style="width:20%">
                Hello : 
            </td>
            <td  align="left" valign="Top" style="width:60%">
                <asp:Label ID="lblName" runat="server" Width="100%"></asp:Label>
            </td>
            <td  align="right" valign="Top" style="width:20%">
                <asp:LinkButton ID="lnkLogOut" Text="Log Out" runat="server" ForeColor="Navy" OnClick="lnkLogOut_Click"></asp:LinkButton>
            </td>
        </tr>
        <tr align="Left" valign="Top"><td  align="center" valign="Top" style="width:60%; font-family:'Comic Sans MS'" colspan="3">
               <h2>This is Page 01</h2>
            </td></tr>
        <tr align="Left" valign="Top"><td  align="center" valign="Top" style="width:60%" colspan="3">
               <asp:Button ID="btnNext" Text="Next" runat="server" Width="20%" OnClick="btnNext_Click"></asp:Button>
            </td></tr>         
    </table>        
    </center>
    </form>
</body>
</html>
