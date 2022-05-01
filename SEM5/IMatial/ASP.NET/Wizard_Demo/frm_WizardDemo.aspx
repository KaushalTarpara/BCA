<%@ Page Language="C#" AutoEventWireup="true" CodeFile="frm_WizardDemo.aspx.cs" Inherits="frm_WizardDemo" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Wizard Demo</title>
</head>
<body style="font-family: Verdana; font-size: 16pt; margin-top: 0; margin-left: 0; margin-right: 0">
    <form id="frmWizardDemo" runat="server">
        <center>
    <div id="div1" style="width:100%; font-family:'Book Antiqua'; font-size:24pt; color:brown">
        Wizard Demo
    </div>
       
        <div id="div_Wizard" runat="server" style="width:100%">
            <asp:Wizard ID="Wizard1" runat="server" ActiveStepIndex="0" BackColor="#E6E2D8" BorderColor="#999999" BorderStyle="Solid" BorderWidth="3px" CellPadding="8" Font-Names="Verdana" Font-Size="12pt" Width="100%" OnFinishButtonClick="Wizard1_FinishButtonClick">
                <HeaderStyle BackColor="#666666" BorderColor="#E6E2D8" BorderStyle="Solid" BorderWidth="2px" Font-Bold="True" Font-Size="0.9em" ForeColor="White" HorizontalAlign="Center" />
                <NavigationButtonStyle BackColor="White" BorderColor="#C5BBAF" BorderStyle="Solid" BorderWidth="1px" Font-Names="Verdana" Font-Size="0.8em" ForeColor="#1C5E55" />
                <SideBarButtonStyle Font-Names="Cambria" Font-Size="12pt" ForeColor="White" Width="100%" />
                <SideBarStyle BackColor="#1C5E55" BorderColor="#FF0066" BorderStyle="Solid" BorderWidth="2px" Font-Size="10pt" VerticalAlign="Top" Font-Names="Bookman Old Style" Width="15%" HorizontalAlign="Left" />
                <StepStyle BackColor="#F7F6F3" BorderColor="#E6E2D8" BorderStyle="Solid" BorderWidth="2px" />
                <WizardSteps>
                    <asp:WizardStep ID="step_PerDet" runat="server" title="Personal Details">
                        <table id="tblPerDet" border="0" cellpadding="4" cellspacing="0" width="100%" style="background-color:coral; font-family:'Book Antiqua'">
                                <tr align="left" valign="Top">
                                    <td align="Center" valign="Middle" colspan="2">
                                       <h1>Personal Details</h1>
                                    </td>
                                </tr>
                            <tr align="left" valign="Top">
                                    <td align="Right" valign="Top" style="width:40%">
                                        First Name :
                                    </td>
                                    <td align="left" valign="Top"  style="width:60%">
                                        <asp:TextBox ID="txtfName" runat="server" Width="90%"></asp:TextBox>
                                        </td>
                                </tr>

                            <tr align="left" valign="Top">
                                    <td align="Right" valign="Top" style="width:40%">
                                        Middle Name :
                                    </td>
                                    <td align="left" valign="Top"  style="width:60%">
                                        <asp:TextBox ID="txtMName" runat="server" Width="90%"></asp:TextBox>
                                        </td>
                                </tr>
                            <tr align="left" valign="Top">
                                    <td align="Right" valign="Top" style="width:40%">
                                        Last Name :
                                    </td>
                                    <td align="left" valign="Top"  style="width:60%">
                                        <asp:TextBox ID="txtLName" runat="server" Width="90%"></asp:TextBox>
                                        </td>
                                </tr>
                            <tr align="left" valign="Top">
                                    <td align="Right" valign="Top" style="width:40%">
                                        Gender :
                                    </td>
                                    <td align="left" valign="Top"  style="width:60%">
                                        <asp:RadioButton ID="rdbMale" runat="server" Text="Male" GroupName="grpGen" />
                                        <asp:RadioButton ID="rdbFemale" runat="server" Text="Female" GroupName="grpGen" />
                                        </td>
                                </tr>
                            <tr align="left" valign="Top">
                                    <td align="Right" valign="Top" style="width:40%">
                                        Address :
                                    </td>
                                    <td align="left" valign="Top"  style="width:60%">
                                        <asp:TextBox ID="txtAdd" runat="server" TextMode="MultiLine" Width="90%"></asp:TextBox>
                                        </td>
                                </tr>
                            <tr align="left" valign="Top">
                                    <td align="Right" valign="Top" style="width:40%">
                                        City :
                                    </td>
                                    <td align="left" valign="Top"  style="width:60%">
                                        <asp:DropDownList ID="cmbCity" runat="server" AutoPostBack="true" Width="85%">
                                            <asp:ListItem Text="--Select--" Value="0" Selected="True"></asp:ListItem>
                                            <asp:ListItem Text="Jamnagar" Value="1"></asp:ListItem>
                                            <asp:ListItem Text="Rajkot" Value="2"></asp:ListItem>
                                        </asp:DropDownList>
                                        </td>
                                </tr>
                            
                        </table>
                    </asp:WizardStep>
                    <asp:WizardStep ID="step_EduDet" runat="server" title="Educational Details">
                        <table id="tbl_EduDet" border="0" cellpadding="8" cellspacing="0" width="100%" style="background-color:coral;">
                                <tr align="left" valign="Top">
                                    <td align="Center" valign="Middle" colspan="2">
                                       <h1>Educational Details</h1>
                                    </td>
                                </tr>
                            <tr align="left" valign="Top">
                                    <td align="Right" valign="Top" style="width:40%">
                                        S.S.C. School Name :
                                    </td>
                                    <td align="left" valign="Top"  style="width:60%">
                                        <asp:TextBox ID="txtSSCSchlName" runat="server" Width="90%"></asp:TextBox>
                                        </td>
                                </tr>

                            <tr align="left" valign="Top">
                                    <td align="Right" valign="Top" style="width:40%">
                                       S.S.C. Board Name :
                                    </td>
                                    <td align="left" valign="Top"  style="width:60%">
                                        <asp:TextBox ID="txtSSCBrdName" runat="server" Width="90%"></asp:TextBox>
                                        </td>
                                </tr>
                            <tr align="left" valign="Top">
                                    <td align="Right" valign="Top" style="width:40%">
                                       S.S.C. Percentage :
                                    </td>
                                    <td align="left" valign="Top"  style="width:60%">
                                        <asp:TextBox ID="txtSSCPer" runat="server" Width="90%"></asp:TextBox>
                                        </td>
                                </tr> 
                            
                            <tr align="left" valign="Top">
                                    <td align="Right" valign="Top" style="width:40%">
                                        H.S.C. School Name :
                                    </td>
                                    <td align="left" valign="Top"  style="width:60%">
                                        <asp:TextBox ID="txtHSCSchlName" runat="server" Width="90%"></asp:TextBox>
                                        </td>
                                </tr>

                            <tr align="left" valign="Top">
                                    <td align="Right" valign="Top" style="width:40%">
                                       H.S.C. Board Name :
                                    </td>
                                    <td align="left" valign="Top"  style="width:60%">
                                        <asp:TextBox ID="txtHSCBrdName" runat="server" Width="90%"></asp:TextBox>
                                        </td>
                                </tr>
                            <tr align="left" valign="Top">
                                    <td align="Right" valign="Top" style="width:40%">
                                       H.S.C. Percentage And Stream:
                                    </td>
                                    <td align="left" valign="Top"  style="width:60%">
                                        <asp:TextBox ID="txtHSCPer" runat="server" Width="90%"></asp:TextBox>
                                        </td>
                                </tr>                                                       
                        </table>
                    </asp:WizardStep>
                    <asp:WizardStep ID="step_StrmDet" runat="server" Title="Stream Details">
                        <table id="Table1" border="0" cellpadding="8" cellspacing="0" width="100%" style="background-color:coral;">
                                <tr align="left" valign="Top">
                                    <td align="Center" valign="Middle" colspan="2">
                                       <h1>Stream Details</h1>
                                    </td>
                                </tr>
                            <tr align="left" valign="Top">
                                    <td align="Right" valign="Top" style="width:40%">
                                        Laungages Known :
                                    </td>
                                    <td align="left" valign="Top"  style="width:60%">
                                        <asp:TextBox ID="txtLaung" runat="server" Width="90%"></asp:TextBox>
                                        </td>
                                </tr>
                             <tr align="left" valign="Top">
                                    <td align="Right" valign="Top" style="width:40%">
                                        Stream :
                                    </td>
                                    <td align="left" valign="Top"  style="width:60%">
                                        <asp:DropDownList ID="cmbStream" runat="server" AutoPostBack="true" Width="85%">
                                            <asp:ListItem Text="--Select--" Value="0" Selected="True"></asp:ListItem>
                                            <asp:ListItem Text="BCA" Value="1"></asp:ListItem>
                                            <asp:ListItem Text="PGDCA" Value="2"></asp:ListItem>
                                        </asp:DropDownList>
                                        </td>
                                </tr>
                            <tr align="left" valign="Top">
                                    <td align="Right" valign="Top" style="width:40%">
                                        Select Photo :
                                    </td>
                                    <td align="left" valign="Top"  style="width:60%">
                                        <asp:FileUpload ID="fldImage" AllowMultiple="false" runat="server" Width="90%" />
                                        </td>
                            </tr>
                            </table>
                    </asp:WizardStep>
                </WizardSteps>
            </asp:Wizard>
</div>
       
        <div id="div_Result" runat="server" style="width:100%; background-color:powderblue">
            <asp:Label ID="lblResult" runat="server" Text="Result Will be HERE" Width="100%" Visible="False"></asp:Label>
        </div>
        <br />
       <div id="div_Back" runat="server" style="width:100%;">
            <asp:Button ID="btnBack" runat="server" Text="Back" Width="20%" Visible="false" OnClick="btnBack_Click" />
    </div>
    </center>
    </form>
</body>
</html>
