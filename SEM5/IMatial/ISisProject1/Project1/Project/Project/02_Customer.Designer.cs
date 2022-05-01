namespace Project
{
    partial class Customer
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle1 = new System.Windows.Forms.DataGridViewCellStyle();
            this.lblCustName = new System.Windows.Forms.Label();
            this.lblADD = new System.Windows.Forms.Label();
            this.lblConNo = new System.Windows.Forms.Label();
            this.lblEmail = new System.Windows.Forms.Label();
            this.lblAge = new System.Windows.Forms.Label();
            this.lblGender = new System.Windows.Forms.Label();
            this.lbl_Dob = new System.Windows.Forms.Label();
            this.lbl_Rela = new System.Windows.Forms.Label();
            this.lbl_PoliName = new System.Windows.Forms.Label();
            this.txt_CustName = new System.Windows.Forms.TextBox();
            this.txt_ADD = new System.Windows.Forms.TextBox();
            this.txt_ContNo = new System.Windows.Forms.TextBox();
            this.txt_Email = new System.Windows.Forms.TextBox();
            this.txt_Age = new System.Windows.Forms.TextBox();
            this.txt_Relation = new System.Windows.Forms.TextBox();
            this.btn_add = new System.Windows.Forms.Button();
            this.datePic = new System.Windows.Forms.DateTimePicker();
            this.btn_delt = new System.Windows.Forms.Button();
            this.cmbPName = new System.Windows.Forms.ComboBox();
            this.btnedit = new System.Windows.Forms.Button();
            this.maleradio = new System.Windows.Forms.RadioButton();
            this.femalerdio = new System.Windows.Forms.RadioButton();
            this.panel1 = new System.Windows.Forms.Panel();
            this.custgrid = new System.Windows.Forms.DataGridView();
            this.CustomerID = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.CustomerName = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Address = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.ContactNo = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Email = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Age = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Gender = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.PolicyName = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Agent = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Premium = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Branch_Name = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.btn_save = new System.Windows.Forms.Button();
            this.txt_Priemium = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.cmbAgentName = new System.Windows.Forms.ComboBox();
            this.cmbBranchName = new System.Windows.Forms.ComboBox();
            this.label3 = new System.Windows.Forms.Label();
            this.panel1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.custgrid)).BeginInit();
            this.SuspendLayout();
            // 
            // lblCustName
            // 
            this.lblCustName.AutoSize = true;
            this.lblCustName.BackColor = System.Drawing.Color.Teal;
            this.lblCustName.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblCustName.ForeColor = System.Drawing.Color.White;
            this.lblCustName.Location = new System.Drawing.Point(4, 87);
            this.lblCustName.Name = "lblCustName";
            this.lblCustName.Size = new System.Drawing.Size(161, 25);
            this.lblCustName.TabIndex = 1;
            this.lblCustName.Text = "Customer Name:";
            // 
            // lblADD
            // 
            this.lblADD.AutoSize = true;
            this.lblADD.BackColor = System.Drawing.Color.Teal;
            this.lblADD.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblADD.ForeColor = System.Drawing.Color.White;
            this.lblADD.Location = new System.Drawing.Point(73, 138);
            this.lblADD.Name = "lblADD";
            this.lblADD.Size = new System.Drawing.Size(92, 25);
            this.lblADD.TabIndex = 2;
            this.lblADD.Text = "Address:";
            // 
            // lblConNo
            // 
            this.lblConNo.AutoSize = true;
            this.lblConNo.BackColor = System.Drawing.Color.Teal;
            this.lblConNo.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblConNo.ForeColor = System.Drawing.Color.White;
            this.lblConNo.Location = new System.Drawing.Point(461, 144);
            this.lblConNo.Name = "lblConNo";
            this.lblConNo.Size = new System.Drawing.Size(111, 25);
            this.lblConNo.TabIndex = 3;
            this.lblConNo.Text = "ContactNo:";
            // 
            // lblEmail
            // 
            this.lblEmail.AutoSize = true;
            this.lblEmail.BackColor = System.Drawing.Color.Teal;
            this.lblEmail.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblEmail.ForeColor = System.Drawing.Color.White;
            this.lblEmail.Location = new System.Drawing.Point(96, 291);
            this.lblEmail.Name = "lblEmail";
            this.lblEmail.Size = new System.Drawing.Size(69, 25);
            this.lblEmail.TabIndex = 4;
            this.lblEmail.Text = "Email:";
            // 
            // lblAge
            // 
            this.lblAge.AutoSize = true;
            this.lblAge.BackColor = System.Drawing.Color.Teal;
            this.lblAge.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblAge.ForeColor = System.Drawing.Color.White;
            this.lblAge.Location = new System.Drawing.Point(521, 245);
            this.lblAge.Name = "lblAge";
            this.lblAge.Size = new System.Drawing.Size(51, 25);
            this.lblAge.TabIndex = 5;
            this.lblAge.Text = "Age:";
            // 
            // lblGender
            // 
            this.lblGender.AutoSize = true;
            this.lblGender.BackColor = System.Drawing.Color.Teal;
            this.lblGender.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblGender.ForeColor = System.Drawing.Color.White;
            this.lblGender.Location = new System.Drawing.Point(488, 96);
            this.lblGender.Name = "lblGender";
            this.lblGender.Size = new System.Drawing.Size(84, 25);
            this.lblGender.TabIndex = 6;
            this.lblGender.Text = "Gender:";
            this.lblGender.Click += new System.EventHandler(this.lblGender_Click);
            // 
            // lbl_Dob
            // 
            this.lbl_Dob.AutoSize = true;
            this.lbl_Dob.BackColor = System.Drawing.Color.Teal;
            this.lbl_Dob.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_Dob.ForeColor = System.Drawing.Color.White;
            this.lbl_Dob.Location = new System.Drawing.Point(517, 193);
            this.lbl_Dob.Name = "lbl_Dob";
            this.lbl_Dob.Size = new System.Drawing.Size(55, 25);
            this.lbl_Dob.TabIndex = 8;
            this.lbl_Dob.Text = "Dob:";
            // 
            // lbl_Rela
            // 
            this.lbl_Rela.AutoSize = true;
            this.lbl_Rela.BackColor = System.Drawing.Color.Teal;
            this.lbl_Rela.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_Rela.ForeColor = System.Drawing.Color.White;
            this.lbl_Rela.Location = new System.Drawing.Point(72, 189);
            this.lbl_Rela.Name = "lbl_Rela";
            this.lbl_Rela.Size = new System.Drawing.Size(93, 25);
            this.lbl_Rela.TabIndex = 9;
            this.lbl_Rela.Text = "Relation:";
            this.lbl_Rela.Click += new System.EventHandler(this.lbl_Rela_Click);
            // 
            // lbl_PoliName
            // 
            this.lbl_PoliName.AutoSize = true;
            this.lbl_PoliName.BackColor = System.Drawing.Color.Teal;
            this.lbl_PoliName.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_PoliName.ForeColor = System.Drawing.Color.White;
            this.lbl_PoliName.Location = new System.Drawing.Point(892, 93);
            this.lbl_PoliName.Name = "lbl_PoliName";
            this.lbl_PoliName.Size = new System.Drawing.Size(124, 25);
            this.lbl_PoliName.TabIndex = 10;
            this.lbl_PoliName.Text = "PolicyName:";
            // 
            // txt_CustName
            // 
            this.txt_CustName.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_CustName.Location = new System.Drawing.Point(177, 87);
            this.txt_CustName.Name = "txt_CustName";
            this.txt_CustName.Size = new System.Drawing.Size(197, 31);
            this.txt_CustName.TabIndex = 1;
            // 
            // txt_ADD
            // 
            this.txt_ADD.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_ADD.Location = new System.Drawing.Point(174, 136);
            this.txt_ADD.Multiline = true;
            this.txt_ADD.Name = "txt_ADD";
            this.txt_ADD.Size = new System.Drawing.Size(197, 33);
            this.txt_ADD.TabIndex = 2;
            // 
            // txt_ContNo
            // 
            this.txt_ContNo.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_ContNo.Location = new System.Drawing.Point(578, 141);
            this.txt_ContNo.Name = "txt_ContNo";
            this.txt_ContNo.Size = new System.Drawing.Size(141, 31);
            this.txt_ContNo.TabIndex = 8;
            // 
            // txt_Email
            // 
            this.txt_Email.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_Email.Location = new System.Drawing.Point(174, 289);
            this.txt_Email.Name = "txt_Email";
            this.txt_Email.Size = new System.Drawing.Size(197, 31);
            this.txt_Email.TabIndex = 5;
            // 
            // txt_Age
            // 
            this.txt_Age.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_Age.Location = new System.Drawing.Point(578, 239);
            this.txt_Age.Name = "txt_Age";
            this.txt_Age.Size = new System.Drawing.Size(77, 31);
            this.txt_Age.TabIndex = 10;
            // 
            // txt_Relation
            // 
            this.txt_Relation.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_Relation.Location = new System.Drawing.Point(174, 191);
            this.txt_Relation.Name = "txt_Relation";
            this.txt_Relation.Size = new System.Drawing.Size(197, 31);
            this.txt_Relation.TabIndex = 3;
            // 
            // btn_add
            // 
            this.btn_add.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btn_add.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_add.ForeColor = System.Drawing.Color.Maroon;
            this.btn_add.Location = new System.Drawing.Point(171, 347);
            this.btn_add.Name = "btn_add";
            this.btn_add.Size = new System.Drawing.Size(163, 40);
            this.btn_add.TabIndex = 14;
            this.btn_add.Text = "ADD";
            this.btn_add.UseVisualStyleBackColor = false;
            this.btn_add.Click += new System.EventHandler(this.btn_add_Click);
            // 
            // datePic
            // 
            this.datePic.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.datePic.Format = System.Windows.Forms.DateTimePickerFormat.Short;
            this.datePic.Location = new System.Drawing.Point(578, 189);
            this.datePic.Name = "datePic";
            this.datePic.Size = new System.Drawing.Size(144, 31);
            this.datePic.TabIndex = 9;
            // 
            // btn_delt
            // 
            this.btn_delt.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btn_delt.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_delt.ForeColor = System.Drawing.Color.Maroon;
            this.btn_delt.Location = new System.Drawing.Point(536, 347);
            this.btn_delt.Name = "btn_delt";
            this.btn_delt.Size = new System.Drawing.Size(163, 40);
            this.btn_delt.TabIndex = 16;
            this.btn_delt.Text = "Delete";
            this.btn_delt.UseVisualStyleBackColor = false;
            this.btn_delt.Click += new System.EventHandler(this.btndelt_Click);
            // 
            // cmbPName
            // 
            this.cmbPName.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.cmbPName.FormattingEnabled = true;
            this.cmbPName.Items.AddRange(new object[] {
            "--Select--"});
            this.cmbPName.Location = new System.Drawing.Point(1022, 91);
            this.cmbPName.Name = "cmbPName";
            this.cmbPName.Size = new System.Drawing.Size(197, 31);
            this.cmbPName.TabIndex = 11;
            // 
            // btnedit
            // 
            this.btnedit.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btnedit.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnedit.ForeColor = System.Drawing.Color.Maroon;
            this.btnedit.Location = new System.Drawing.Point(350, 347);
            this.btnedit.Name = "btnedit";
            this.btnedit.Size = new System.Drawing.Size(163, 40);
            this.btnedit.TabIndex = 15;
            this.btnedit.Text = "Edit";
            this.btnedit.UseVisualStyleBackColor = false;
            this.btnedit.Click += new System.EventHandler(this.btnedit_Click);
            // 
            // maleradio
            // 
            this.maleradio.AutoSize = true;
            this.maleradio.Checked = true;
            this.maleradio.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.maleradio.ForeColor = System.Drawing.Color.White;
            this.maleradio.Location = new System.Drawing.Point(586, 93);
            this.maleradio.Name = "maleradio";
            this.maleradio.Size = new System.Drawing.Size(69, 27);
            this.maleradio.TabIndex = 6;
            this.maleradio.TabStop = true;
            this.maleradio.Text = "Male";
            this.maleradio.UseVisualStyleBackColor = true;
            // 
            // femalerdio
            // 
            this.femalerdio.AutoSize = true;
            this.femalerdio.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.femalerdio.ForeColor = System.Drawing.Color.White;
            this.femalerdio.Location = new System.Drawing.Point(666, 93);
            this.femalerdio.Name = "femalerdio";
            this.femalerdio.Size = new System.Drawing.Size(90, 27);
            this.femalerdio.TabIndex = 7;
            this.femalerdio.Text = "Female";
            this.femalerdio.UseVisualStyleBackColor = true;
            this.femalerdio.CheckedChanged += new System.EventHandler(this.femalerdio_CheckedChanged);
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.custgrid);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.panel1.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.panel1.Location = new System.Drawing.Point(0, 435);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(1226, 155);
            this.panel1.TabIndex = 41;
            // 
            // custgrid
            // 
            this.custgrid.AllowUserToAddRows = false;
            this.custgrid.AllowUserToDeleteRows = false;
            this.custgrid.AllowUserToResizeColumns = false;
            this.custgrid.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.custgrid.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.CustomerID,
            this.CustomerName,
            this.Address,
            this.ContactNo,
            this.Email,
            this.Age,
            this.Gender,
            this.PolicyName,
            this.Agent,
            this.Premium,
            this.Branch_Name});
            dataGridViewCellStyle1.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleLeft;
            dataGridViewCellStyle1.BackColor = System.Drawing.SystemColors.Window;
            dataGridViewCellStyle1.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            dataGridViewCellStyle1.ForeColor = System.Drawing.SystemColors.ControlText;
            dataGridViewCellStyle1.SelectionBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            dataGridViewCellStyle1.SelectionForeColor = System.Drawing.Color.Maroon;
            dataGridViewCellStyle1.WrapMode = System.Windows.Forms.DataGridViewTriState.False;
            this.custgrid.DefaultCellStyle = dataGridViewCellStyle1;
            this.custgrid.Dock = System.Windows.Forms.DockStyle.Fill;
            this.custgrid.Location = new System.Drawing.Point(0, 0);
            this.custgrid.Name = "custgrid";
            this.custgrid.ReadOnly = true;
            this.custgrid.RowHeadersVisible = false;
            this.custgrid.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.custgrid.Size = new System.Drawing.Size(1226, 155);
            this.custgrid.TabIndex = 0;
            this.custgrid.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.custgrid_CellContentClick_1);
            // 
            // CustomerID
            // 
            this.CustomerID.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.Fill;
            this.CustomerID.DataPropertyName = "CustomerID";
            this.CustomerID.HeaderText = "ID";
            this.CustomerID.Name = "CustomerID";
            this.CustomerID.ReadOnly = true;
            // 
            // CustomerName
            // 
            this.CustomerName.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.Fill;
            this.CustomerName.DataPropertyName = "CustomerName";
            this.CustomerName.HeaderText = "Name";
            this.CustomerName.Name = "CustomerName";
            this.CustomerName.ReadOnly = true;
            // 
            // Address
            // 
            this.Address.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.Fill;
            this.Address.DataPropertyName = "Address";
            this.Address.HeaderText = "Address";
            this.Address.Name = "Address";
            this.Address.ReadOnly = true;
            // 
            // ContactNo
            // 
            this.ContactNo.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.Fill;
            this.ContactNo.DataPropertyName = "ContactNo";
            this.ContactNo.HeaderText = "Con-No";
            this.ContactNo.Name = "ContactNo";
            this.ContactNo.ReadOnly = true;
            // 
            // Email
            // 
            this.Email.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.Fill;
            this.Email.DataPropertyName = "Email";
            this.Email.HeaderText = "Email";
            this.Email.Name = "Email";
            this.Email.ReadOnly = true;
            // 
            // Age
            // 
            this.Age.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.Fill;
            this.Age.DataPropertyName = "Age";
            this.Age.HeaderText = "Age";
            this.Age.Name = "Age";
            this.Age.ReadOnly = true;
            // 
            // Gender
            // 
            this.Gender.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.Fill;
            this.Gender.DataPropertyName = "Gender";
            this.Gender.HeaderText = "Gender";
            this.Gender.Name = "Gender";
            this.Gender.ReadOnly = true;
            // 
            // PolicyName
            // 
            this.PolicyName.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.Fill;
            this.PolicyName.DataPropertyName = "PolicyName";
            this.PolicyName.HeaderText = "Policy Name";
            this.PolicyName.Name = "PolicyName";
            this.PolicyName.ReadOnly = true;
            // 
            // Agent
            // 
            this.Agent.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.Fill;
            this.Agent.DataPropertyName = "Agent";
            this.Agent.HeaderText = "Agent";
            this.Agent.Name = "Agent";
            this.Agent.ReadOnly = true;
            // 
            // Premium
            // 
            this.Premium.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.Fill;
            this.Premium.DataPropertyName = "Premium";
            this.Premium.HeaderText = "Premium";
            this.Premium.Name = "Premium";
            this.Premium.ReadOnly = true;
            // 
            // Branch_Name
            // 
            this.Branch_Name.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.Fill;
            this.Branch_Name.DataPropertyName = "Branch_Name";
            this.Branch_Name.HeaderText = "Branch Name";
            this.Branch_Name.Name = "Branch_Name";
            this.Branch_Name.ReadOnly = true;
            // 
            // btn_save
            // 
            this.btn_save.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btn_save.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_save.ForeColor = System.Drawing.Color.Maroon;
            this.btn_save.Location = new System.Drawing.Point(729, 347);
            this.btn_save.Name = "btn_save";
            this.btn_save.Size = new System.Drawing.Size(163, 40);
            this.btn_save.TabIndex = 17;
            this.btn_save.Text = "Save";
            this.btn_save.UseVisualStyleBackColor = false;
            this.btn_save.Click += new System.EventHandler(this.btn_save_Click);
            // 
            // txt_Priemium
            // 
            this.txt_Priemium.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_Priemium.Location = new System.Drawing.Point(174, 241);
            this.txt_Priemium.Multiline = true;
            this.txt_Priemium.Name = "txt_Priemium";
            this.txt_Priemium.Size = new System.Drawing.Size(197, 33);
            this.txt_Priemium.TabIndex = 4;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.BackColor = System.Drawing.Color.Teal;
            this.label1.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.ForeColor = System.Drawing.Color.White;
            this.label1.Location = new System.Drawing.Point(64, 243);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(101, 25);
            this.label1.TabIndex = 46;
            this.label1.Text = "Premium:";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.BackColor = System.Drawing.Color.Teal;
            this.label2.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.ForeColor = System.Drawing.Color.White;
            this.label2.Location = new System.Drawing.Point(946, 151);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(70, 25);
            this.label2.TabIndex = 44;
            this.label2.Text = "Agent:";
            // 
            // cmbAgentName
            // 
            this.cmbAgentName.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.cmbAgentName.FormattingEnabled = true;
            this.cmbAgentName.Items.AddRange(new object[] {
            "--SELECT--"});
            this.cmbAgentName.Location = new System.Drawing.Point(1022, 146);
            this.cmbAgentName.Name = "cmbAgentName";
            this.cmbAgentName.Size = new System.Drawing.Size(201, 27);
            this.cmbAgentName.TabIndex = 12;
            // 
            // cmbBranchName
            // 
            this.cmbBranchName.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.cmbBranchName.FormattingEnabled = true;
            this.cmbBranchName.Items.AddRange(new object[] {
            "--SELECT--"});
            this.cmbBranchName.Location = new System.Drawing.Point(1022, 195);
            this.cmbBranchName.Name = "cmbBranchName";
            this.cmbBranchName.Size = new System.Drawing.Size(201, 27);
            this.cmbBranchName.TabIndex = 13;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.BackColor = System.Drawing.Color.Teal;
            this.label3.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.ForeColor = System.Drawing.Color.White;
            this.label3.Location = new System.Drawing.Point(877, 193);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(139, 25);
            this.label3.TabIndex = 48;
            this.label3.Text = "Branch Name:";
            // 
            // Customer
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.Teal;
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.ClientSize = new System.Drawing.Size(1226, 590);
            this.Controls.Add(this.cmbBranchName);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.cmbAgentName);
            this.Controls.Add(this.txt_Priemium);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.btn_save);
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.femalerdio);
            this.Controls.Add(this.maleradio);
            this.Controls.Add(this.btnedit);
            this.Controls.Add(this.cmbPName);
            this.Controls.Add(this.btn_delt);
            this.Controls.Add(this.datePic);
            this.Controls.Add(this.btn_add);
            this.Controls.Add(this.txt_Relation);
            this.Controls.Add(this.txt_Age);
            this.Controls.Add(this.txt_Email);
            this.Controls.Add(this.txt_ContNo);
            this.Controls.Add(this.txt_ADD);
            this.Controls.Add(this.txt_CustName);
            this.Controls.Add(this.lbl_PoliName);
            this.Controls.Add(this.lbl_Rela);
            this.Controls.Add(this.lbl_Dob);
            this.Controls.Add(this.lblGender);
            this.Controls.Add(this.lblAge);
            this.Controls.Add(this.lblEmail);
            this.Controls.Add(this.lblConNo);
            this.Controls.Add(this.lblADD);
            this.Controls.Add(this.lblCustName);
            this.Name = "Customer";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Customer";
            this.Load += new System.EventHandler(this.Customer_Load);
            this.panel1.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.custgrid)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblCustName;
        private System.Windows.Forms.Label lblADD;
        private System.Windows.Forms.Label lblConNo;
        private System.Windows.Forms.Label lblEmail;
        private System.Windows.Forms.Label lblAge;
        private System.Windows.Forms.Label lblGender;
        private System.Windows.Forms.Label lbl_Dob;
        private System.Windows.Forms.Label lbl_Rela;
        private System.Windows.Forms.Label lbl_PoliName;
        private System.Windows.Forms.TextBox txt_CustName;
        private System.Windows.Forms.TextBox txt_ADD;
        private System.Windows.Forms.TextBox txt_ContNo;
        private System.Windows.Forms.TextBox txt_Email;
        private System.Windows.Forms.TextBox txt_Age;
        private System.Windows.Forms.TextBox txt_Relation;
        private System.Windows.Forms.Button btn_add;
        private System.Windows.Forms.DateTimePicker datePic;
        private System.Windows.Forms.Button btn_delt;
        private System.Windows.Forms.ComboBox cmbPName;
        private System.Windows.Forms.Button btnedit;
        private System.Windows.Forms.RadioButton maleradio;
        private System.Windows.Forms.RadioButton femalerdio;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Button btn_save;
        private System.Windows.Forms.TextBox txt_Priemium;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.ComboBox cmbAgentName;
        private System.Windows.Forms.ComboBox cmbBranchName;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.DataGridView custgrid;
        private System.Windows.Forms.DataGridViewTextBoxColumn CustomerID;
        private System.Windows.Forms.DataGridViewTextBoxColumn CustomerName;
        private System.Windows.Forms.DataGridViewTextBoxColumn Address;
        private System.Windows.Forms.DataGridViewTextBoxColumn ContactNo;
        private System.Windows.Forms.DataGridViewTextBoxColumn Email;
        private System.Windows.Forms.DataGridViewTextBoxColumn Age;
        private System.Windows.Forms.DataGridViewTextBoxColumn Gender;
        private System.Windows.Forms.DataGridViewTextBoxColumn PolicyName;
        private System.Windows.Forms.DataGridViewTextBoxColumn Agent;
        private System.Windows.Forms.DataGridViewTextBoxColumn Premium;
        private System.Windows.Forms.DataGridViewTextBoxColumn Branch_Name;
    }
}