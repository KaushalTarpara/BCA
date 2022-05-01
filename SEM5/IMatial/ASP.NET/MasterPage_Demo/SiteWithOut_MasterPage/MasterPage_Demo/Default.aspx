<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Master Page Demo</title>
    <style>
        body {
            background-color:coral;
            color:white;
            font-family: Verdana;
        }
        #MyTitle {            
            color:white;
            font-family: Bookman Old Style ;
            font-size: 1.4em;
            border: 3px solid white;
            box-shadow : 4px 4px 1px lightgreen;
            width: 75%;
            margin-top:15px;
            margin-bottom:25px;
        }
         #MyCont {                        
            font-family: Cambria ;
            font-size: 1.2em;    
        }
         #myBanner {                        
            font-family: Cambria ;
            font-size: 1.4em;    
            color: lightyellow;
            text-shadow: 6px 4px 2px Navy;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <center>
    <table border="0" cellpading="8" cellspacing="0" width="75%">
        <tr align="left" valign="Top">
            <td align="center" valign="Top" colspan="2">
                <table border="0" cellpading="0" cellspacing="0" width="100%">
                    <tr align="left" valign="Top">
                            <td align="center" valign="middle" style="width:15%">
                             <img src="Images/Logo_01.png" width="100%" />
                            </td>
                            <td id="myBanner" align="center" valign="middle" style="width:85%; background-image:url(Images/Banner_01.png)">
                            Bhavan's<br />Shree H. J. Doshi Info. Tech. Inst.<br />Jamnagar
                            </td>
                        </tr>
                </table>
            </td>
        </tr>
         <tr align="left" valign="Top">
            <td align="center" valign="Top" colspan="2" style="background-color:purple">
                <marquee>Welcome to HJD College, Jamnagar</marquee>
            </td>
        </tr>
        <tr align="left" valign="Top">
            <td align="center" valign="Top" colspan="2">
                <asp:Menu ID="mnuMain" runat="server" BackColor="#FFFBD6" DynamicHorizontalOffset="2" Font-Names="Verdana" Font-Size="0.8em" ForeColor="#990000" Orientation="Horizontal" StaticSubMenuIndent="10px">
                    <DynamicHoverStyle BackColor="#990000" ForeColor="White" />
                    <DynamicMenuItemStyle HorizontalPadding="5px" VerticalPadding="2px" />
                    <DynamicMenuStyle BackColor="#FFFBD6" />
                    <DynamicSelectedStyle BackColor="#FFCC66" />
                    <Items>
                        <asp:MenuItem Text="Personal Details" Value="Personal Details"></asp:MenuItem>
                        <asp:MenuItem Selectable="False" Text="||" Value="||"></asp:MenuItem>
                        <asp:MenuItem Text="Acedemic Details" Value="Acedemic Details"></asp:MenuItem>
                        <asp:MenuItem Selectable="False" Text="||" Value="||"></asp:MenuItem>
                        <asp:MenuItem Text="Proffesional Details" Value="Proffesional Details"></asp:MenuItem>
                        <asp:MenuItem Selectable="False" Text="||" Value="||"></asp:MenuItem>
                        <asp:MenuItem Text="Display" Value="Display"></asp:MenuItem>
                    </Items>
                    <StaticHoverStyle BackColor="#990000" ForeColor="White" />
                    <StaticMenuItemStyle HorizontalPadding="5px" VerticalPadding="2px" />
                    <StaticSelectedStyle BackColor="#FFCC66" />
                </asp:Menu>
            </td>
        </tr>

        <tr align="left" valign="Top">
            <td align="center" valign="Top" colspan="2">
                <div id="MyTitle">Student Personal Information</div>
            </td>
        </tr>
       
        <tr align="left" valign="Top">
            <td align="Right" valign="Top" style="width:50%">
                First Name :
            </td>
            <td align="left" valign="Top" style="width:50%">
                <asp:TextBox ID="txtFName" runat="server" Width="75%"></asp:TextBox>
                <br />
                <asp:RequiredFieldValidator ID="ReqFName" runat="server" ControlToValidate="txtFName" Display="Dynamic" ErrorMessage="First Name must not be Black" Font-Bold="True" Font-Size="0.8em" ForeColor="#CCFFCC">First Name must not be Black</asp:RequiredFieldValidator>
            </td>
        </tr>
        <tr align="left" valign="Top">
            <td id="myCont" align="Right" valign="Top" style="width:50%">
                Middle Name :
            </td>
            <td align="left" valign="Top" style="width:50%">
                <asp:TextBox ID="txtMName" runat="server" Width="15%"></asp:TextBox>
                <br />
                <asp:RequiredFieldValidator ID="ReqMName" runat="server" ControlToValidate="txtMName" Display="Dynamic" ErrorMessage="First Name must not be Black" Font-Bold="True" Font-Size="0.8em" ForeColor="#CCFFCC">Middle Name must not be Black</asp:RequiredFieldValidator>
            </td>
        </tr>
        <tr align="left" valign="Top">
            <td id="Td1" align="Right" valign="Top" style="width:50%">
                Last Name :
            </td>
            <td align="left" valign="Top" style="width:50%">
                <asp:TextBox ID="txtLName" runat="server" Width="75%"></asp:TextBox>
                <br />
                <asp:RequiredFieldValidator ID="ReqLName" runat="server" ControlToValidate="txtLName" Display="Dynamic" ErrorMessage="First Name must not be Black" Font-Bold="True" Font-Size="0.8em" ForeColor="#CCFFCC">Last Name must not be Black</asp:RequiredFieldValidator>
            </td>
        </tr>
        <tr align="left" valign="Top">
            <td id="Td2" align="Right" valign="Top" style="width:50%">
                Gender :
            </td>
            <td align="left" valign="Top" style="width:50%">
                <asp:RadioButton ID="rdbMale" runat="server" GroupName="Gen" Text="Male" />
                <br />
                <asp:RadioButton ID="rdbFemale" runat="server" GroupName="Gen" Text="Female" />
            </td>
        </tr>
        <tr align="left" valign="Top">
            <td id="Td3" align="Right" valign="Top" style="width:50%">
                Address :
            </td>
            <td align="left" valign="Top" style="width:50%">
                <asp:TextBox ID="txtAdd" runat="server" TextMode="MultiLine" Width="75%"></asp:TextBox>
                <br />
                <asp:RequiredFieldValidator ID="ReqAdd" runat="server" ControlToValidate="txtAdd" Display="Dynamic" ErrorMessage="First Name must not be Black" Font-Bold="True" Font-Size="0.8em" ForeColor="#CCFFCC">Addres must not be Black</asp:RequiredFieldValidator>
            </td>
        </tr>
        <tr align="left" valign="Top">
            <td id="Td4" align="Right" valign="Top" style="width:50%">
                Contact No :
            </td>
            <td align="left" valign="Top" style="width:50%">
                <asp:TextBox ID="txtContNo" runat="server" Width="75%"></asp:TextBox>
                <br />
                <asp:RequiredFieldValidator ID="ReqContNo" runat="server" ControlToValidate="txtContNo" Display="Dynamic" ErrorMessage="First Name must not be Black" Font-Bold="True" Font-Size="0.8em" ForeColor="#CCFFCC">Contact No must not be Black</asp:RequiredFieldValidator>

            </td>
        </tr>
        <tr align="left" valign="Top">
            <td id="Td5" align="Right" valign="Top" style="width:50%">
                Email ID :
            </td>
            <td align="left" valign="Top" style="width:50%">
                <asp:TextBox ID="txtEmailID" runat="server" Width="75%"></asp:TextBox>
                <br />
                <asp:RequiredFieldValidator ID="ReqEmail" runat="server" ControlToValidate="txtEmailID" Display="Dynamic" ErrorMessage="Email ID must not be Black" Font-Bold="True" Font-Size="0.8em" ForeColor="#CCFFCC">Addressmust not be Black</asp:RequiredFieldValidator>

            </td>
        </tr>
         <tr align="left" valign="Top">
            <td align="center" valign="Top" colspan="2">
                <table border="0" cellpading="8" cellspacing="0" width="50%">
                    <tr align="left" valign="Top">
                            <td align="center" valign="middle" style="width:50%">
                             <asp:Button ID="btnReset" runat="server" Text="Reset" Width="75%" />
                            </td>
                            <td align="center" valign="middle" style="width:50%">
                             <asp:Button ID="btnAdd" runat="server" Text="Add" Width="75%" />
                            </td>
                        </tr>
                </table>
            </td>
        </tr>
        <tr align="left" valign="Top">
            <td align="center" valign="Top" colspan="2" style="background-color:purple">
                <marquee>This Site Is Developed By BCA Sem : 5</marquee>
            </td>
        </tr>
       
    </table>
        
    </center>
    </form>
</body>
</html>
