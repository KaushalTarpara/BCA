<%@ Page Language="C#" AutoEventWireup="true" CodeFile="frm_ValidationDemo.aspx.cs" Inherits="frm_ValidationDemo" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Validation Demo</title>
</head>
<body style="margin-top:0px; margin-left:0px; background-color:brown">
    <form id="frmValidationDemo" runat="server">
    <center>
        <table id="tblMain" border="0" cellpadding="8" cellspacing="0" width="50%" style="font-family:Verdana; font-size:12pt; color:#FFFFCC">
            <tr align="left" valign="Top">
                <td align="center" colspan="2" style="font-family:'Book Antiqua'; font-size:24pt ;color:#FFCC99">
                    Validation Demo
                </td>
            </tr>
            <tr align="left" valign="Top">
                <td align="right" width="40%">
                    Enter Your Name :
                </td>
                <td align="left" width="60%">
                    <asp:TextBox ID="txtName" runat="server" Width="75%"></asp:TextBox>
                    <br />
                    <asp:RequiredFieldValidator ID="Req_txtName" runat="server" ControlToValidate="txtName" Display="Dynamic" ErrorMessage="Name must not be Blank" Font-Names="Bookman Old Style" Font-Size="11pt" ForeColor="#FFFF99" SetFocusOnError="True" Width="100%"></asp:RequiredFieldValidator>                    
                    <asp:RegularExpressionValidator ID="Reg_txtName" runat="server" ErrorMessage="Name Must be 5 to 15 characters long" ControlToValidate="txtName" Display="Dynamic" Font-Names="Bookman Old Style" Font-Size="11pt" ForeColor="#FFFF99" SetFocusOnError="True" Width="100%" ValidationExpression="\w{5,15}"></asp:RegularExpressionValidator>
                </td>
            </tr>
            <tr align="left" valign="Top">
                <td align="right" width="40%">
                    Enter Your Age :
                </td>
                <td align="left" width="60%">
                    <asp:TextBox ID="txtAge" runat="server" Width="10%" MaxLength="2"></asp:TextBox>
                    <br />
                    <asp:RequiredFieldValidator ID="Req_txtAge" runat="server" ControlToValidate="txtAge" Display="Dynamic" ErrorMessage="Age must not be Blank" Font-Names="Bookman Old Style" Font-Size="11pt" ForeColor="#FFFF99" SetFocusOnError="True" Width="100%"></asp:RequiredFieldValidator>                    
                    <asp:RangeValidator ID="rng_Age" runat="server" ControlToValidate="txtAge" Display="Dynamic" ErrorMessage="Age must be between 1 to 100" Font-Names="Bookman Old Style" Font-Size="11pt" ForeColor="#FFFF99" SetFocusOnError="True" Width="100%" MaximumValue="100" MinimumValue="1" Type="Integer"></asp:RangeValidator>
                </td>
            </tr>
            <tr align="left" valign="Top">
                <td align="right" width="40%">
                    Enter Your Address :
                </td>
                <td align="left" width="60%">
                    <asp:TextBox ID="txtAdd" runat="server" Width="75%" TextMode="MultiLine"></asp:TextBox>
                    <br />
                    <asp:RequiredFieldValidator ID="Req_Address" runat="server" ControlToValidate="txtAdd" Display="Dynamic" ErrorMessage="Address must not be Blank" Font-Names="Bookman Old Style" Font-Size="11pt" ForeColor="#FFFF99" SetFocusOnError="True" Width="100%"></asp:RequiredFieldValidator>
                </td>
            </tr>
            <tr align="left" valign="Top">
                <td align="right" width="40%">
                    Enter Your Contact No :
                </td>
                <td align="left" width="60%">
                    <asp:TextBox ID="txtContNo" runat="server" Width="75%"></asp:TextBox>
                    <br />
                    <asp:RequiredFieldValidator ID="Req_ContNo" runat="server" ControlToValidate="txtContNo" Display="Dynamic" ErrorMessage="Contact Number must not be Blank" Font-Names="Bookman Old Style" Font-Size="11pt" ForeColor="#FFFF99" SetFocusOnError="True" Width="100%"></asp:RequiredFieldValidator>
                    <asp:RegularExpressionValidator ID="Reg_ContNo" runat="server" ControlToValidate="txtContNo" Display="Dynamic" ErrorMessage="Contact Number must be Like +00-0000000000" Font-Names="Bookman Old Style" Font-Size="11pt" ForeColor="#FFFF99" SetFocusOnError="True" Width="100%" ValidationExpression="\+\d{2}-\d{10}"></asp:RegularExpressionValidator>
                </td>
            </tr>
            <tr align="left" valign="Top">
                <td align="right" width="40%">
                    Enter Your Email ID :
                </td>
                <td align="left" width="60%">
                    <asp:TextBox ID="txtEmail" runat="server" Width="75%"></asp:TextBox>
                    <br />
                    <asp:RequiredFieldValidator ID="Req_Email" runat="server" ControlToValidate="txtEmail" Display="Dynamic" ErrorMessage="EmailID must not be Blank" Font-Names="Bookman Old Style" Font-Size="11pt" ForeColor="#FFFF99" SetFocusOnError="True" Width="100%"></asp:RequiredFieldValidator>
                    <asp:RegularExpressionValidator ID="Reg_EmailID" runat="server" ControlToValidate="txtEmail" Display="Dynamic" ErrorMessage="Email Id must be like aaa@aaa.com or .co.in" Font-Names="Bookman Old Style" Font-Size="11pt" ForeColor="#FFFF99" SetFocusOnError="True" Width="100%" ValidationExpression="\S+@\S+\.\S+"></asp:RegularExpressionValidator>
                </td>
            </tr>
            <tr align="left" valign="Top">
                <td align="right" width="40%">
                    Enter Any EvenNumber :
                </td>
                <td align="left" width="60%">
                    <asp:TextBox ID="txtEvenNo" runat="server" Width="10%" MaxLength="3"></asp:TextBox>
                    <br />
                    <asp:CustomValidator ID="cst_EnvNo" runat="server" Display="Dynamic" ErrorMessage="Not Even Number" Font-Names="Bookman Old Style" Font-Size="11pt" ForeColor="#FFFF99" SetFocusOnError="True" Width="100%" ControlToValidate="txtEvenNo" OnServerValidate="cst_EnvNo_ServerValidate"></asp:CustomValidator>
                </td>
            </tr>
            <tr align="left" valign="Top">
                <td align="center" colspan="2">
                    <table id="tblBtns" width="75%" border="0" cellpadding="5" cellspacing="0">
                        <tr>
                            <td align="center" width="50%">
                                <asp:Button ID="btnReset" runat="server" Width="50%" Text="RESET" OnClick="btnReset_Click" />
                                </td>
                            <td align="center" width="50%">
                                <asp:Button ID="btnAdd" runat="server" Width="50%" Text="Add" OnClick="btnAdd_Click" />
                                </td>
                        </tr>
                        </table>
                    </td>
                        </tr>
                        <tr>
                            <td align="center" colspan="2">
                                <asp:GridView ID="dtGrd1" runat="server" BackColor="White" BorderColor="#DEDFDE" BorderStyle="None" BorderWidth="1px" CellPadding="4" ForeColor="Black" GridLines="Vertical" Width="100%">
                                    <AlternatingRowStyle BackColor="White" />
                                    <FooterStyle BackColor="#CCCC99" />
                                    <HeaderStyle BackColor="#6B696B" Font-Bold="True" ForeColor="White" />
                                    <PagerStyle BackColor="#F7F7DE" ForeColor="Black" HorizontalAlign="Right" />
                                    <RowStyle BackColor="#F7F7DE" />
                                    <SelectedRowStyle BackColor="#CE5D5A" Font-Bold="True" ForeColor="White" />
                                    <SortedAscendingCellStyle BackColor="#FBFBF2" />
                                    <SortedAscendingHeaderStyle BackColor="#848384" />
                                    <SortedDescendingCellStyle BackColor="#EAEAD3" />
                                    <SortedDescendingHeaderStyle BackColor="#575357" />
                                </asp:GridView>
                                </td>
                            </tr>                    
        </table>
    </center>
    </form>
</body>
</html>
