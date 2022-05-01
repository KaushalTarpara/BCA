<%@ Page Language="C#" AutoEventWireup="true" CodeFile="frm_Cntrl_2_DtGrd.aspx.cs" Inherits="frm_Cntrl_2_DtGrd" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <center>
    <div style="width:75%; border-style:dotted; border-width:medium; font-family:Verdana; font-size:12pt; font-weight:normal">
    <table border="0" cellpadding="5" cellspacing="0" style="width:100%; background-color:coral">
        <tr>
            <td align="center" colspan="2" style="font-family:'Times New Roman'; font-size:32pt; font-weight:bold">
                Controls To DataGrid Demo
            </td>
        </tr>
        <tr>
            <td align="right" style="width:40%">
                Enter Your Name :
            </td>
            <td align="left" style="width:60%">
                <asp:TextBox ID="txtName" runat="server" Width="75%"></asp:TextBox>
            </td>
        </tr>
        <tr>
            <td align="right" style="width:40%">
                Select Your Gender :
            </td>
            <td align="left" style="width:60%">
                <asp:RadioButton ID="rdbMale" runat="server" GroupName="Gen" Text="Male" AutoPostBack="True" OnCheckedChanged="rdbMale_CheckedChanged" />
                <asp:RadioButton ID="rdbFemale" runat="server" GroupName="Gen" Text="Female" AutoPostBack="True" OnCheckedChanged="rdbFemale_CheckedChanged" />
            </td>
        </tr>
        <tr>
            <td align="right" style="width:40%">
                Select Your City :
            </td>
            <td align="left" style="width:60%">
                <asp:DropDownList ID="cmbCity" runat="server" Width="75%" AutoPostBack="True">
                    <asp:ListItem Text="-- Select --" Value="0"></asp:ListItem>
                    <asp:ListItem Text="Baroda" Value="1"></asp:ListItem>
                    <asp:ListItem Text="Jamnagar" Value="2"></asp:ListItem>
                    <asp:ListItem Text="Rajkot" Value="3"></asp:ListItem>
                    <asp:ListItem Text="Surat" Value="4"></asp:ListItem>
                </asp:DropDownList>
            </td>
        </tr>
         <tr>
            <td align="center" colspan="2">
            <asp:Label ID="lblStatus" runat="server" Text=""></asp:Label>    
            </td>
        </tr>
        <tr>
            <td align="center" colspan="2">
            <asp:Button ID="btnAdd" runat="server" Text="Add" Width="40%" OnClick="btnAdd_Click" />
            </td>
        </tr>
        <tr>
            <td align="center" colspan="2">
                <asp:GridView ID="dtGrd1" runat="server" Width="100%" AutoGenerateColumns="False" BackColor="#DEBA84" BorderColor="#DEBA84" BorderStyle="None" BorderWidth="1px" CellPadding="3" CellSpacing="2">
                <Columns>
                    <asp:TemplateField HeaderText="Sr. No.">
                        <ItemTemplate>
                            <asp:Label ID="lblSrNo" Text="1" runat="server"></asp:Label>
                        </ItemTemplate>
                    </asp:TemplateField>
                    <asp:TemplateField HeaderText="Name">
                        <ItemTemplate>
                            <asp:Label ID="lblName" Text="Mr. ABC" runat="server"></asp:Label>
                        </ItemTemplate>
                    </asp:TemplateField>
                    <asp:TemplateField HeaderText="Gender">
                        <ItemTemplate>
                            <asp:Label ID="lblGen" Text="Male" runat="server"></asp:Label>
                        </ItemTemplate>
                    </asp:TemplateField>
                    <asp:TemplateField HeaderText="City">
                        <ItemTemplate>
                            <asp:Label ID="lblCity" Text="Jamnagar" runat="server"></asp:Label>
                        </ItemTemplate>
                    </asp:TemplateField>
                </Columns>
                <FooterStyle BackColor="#F7DFB5" ForeColor="#8C4510" />
                <HeaderStyle BackColor="#A55129" Font-Bold="True" ForeColor="White" />
                <PagerStyle ForeColor="#8C4510" HorizontalAlign="Center" />
                <RowStyle BackColor="#FFF7E7" ForeColor="#8C4510" />
                <SelectedRowStyle BackColor="#738A9C" Font-Bold="True" ForeColor="White" />
                <SortedAscendingCellStyle BackColor="#FFF1D4" />
                <SortedAscendingHeaderStyle BackColor="#B95C30" />
                <SortedDescendingCellStyle BackColor="#F1E5CE" />
                <SortedDescendingHeaderStyle BackColor="#93451F" />
                </asp:GridView>
               
            </td>
        </tr>
    </table>
    </div>
            </center>
    </form>
</body>
</html>
