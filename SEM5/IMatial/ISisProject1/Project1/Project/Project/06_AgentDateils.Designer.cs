namespace Project
{
    partial class AgentDateils
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
            this.lbl_AgentN = new System.Windows.Forms.Label();
            this.lbl_Addr = new System.Windows.Forms.Label();
            this.lbl_ContactNo = new System.Windows.Forms.Label();
            this.lbl_Email = new System.Windows.Forms.Label();
            this.lbl_Age = new System.Windows.Forms.Label();
            this.lbl_Gender = new System.Windows.Forms.Label();
            this.lbl_Quali = new System.Windows.Forms.Label();
            this.txt_AgentN = new System.Windows.Forms.TextBox();
            this.txt_Addr = new System.Windows.Forms.TextBox();
            this.txt_Cont = new System.Windows.Forms.TextBox();
            this.txt_Email = new System.Windows.Forms.TextBox();
            this.txt_Age = new System.Windows.Forms.TextBox();
            this.txt_Quali = new System.Windows.Forms.TextBox();
            this.btn_add = new System.Windows.Forms.Button();
            this.btnrdiomale = new System.Windows.Forms.RadioButton();
            this.btnrdiofemale = new System.Windows.Forms.RadioButton();
            this.btnSave = new System.Windows.Forms.Button();
            this.btn_del = new System.Windows.Forms.Button();
            this.btn_edit = new System.Windows.Forms.Button();
            this.panel1 = new System.Windows.Forms.Panel();
            this.agentgrid = new System.Windows.Forms.DataGridView();
            this.AgentID = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.AgentName = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Address = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.ContactNo = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Email = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Age = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Gender = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Qualification = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.panel1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.agentgrid)).BeginInit();
            this.SuspendLayout();
            // 
            // lbl_AgentN
            // 
            this.lbl_AgentN.AutoSize = true;
            this.lbl_AgentN.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_AgentN.ForeColor = System.Drawing.Color.White;
            this.lbl_AgentN.Location = new System.Drawing.Point(9, 22);
            this.lbl_AgentN.Name = "lbl_AgentN";
            this.lbl_AgentN.Size = new System.Drawing.Size(116, 23);
            this.lbl_AgentN.TabIndex = 1;
            this.lbl_AgentN.Text = "AgentName:";
            // 
            // lbl_Addr
            // 
            this.lbl_Addr.AutoSize = true;
            this.lbl_Addr.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_Addr.ForeColor = System.Drawing.Color.White;
            this.lbl_Addr.Location = new System.Drawing.Point(38, 65);
            this.lbl_Addr.Name = "lbl_Addr";
            this.lbl_Addr.Size = new System.Drawing.Size(85, 23);
            this.lbl_Addr.TabIndex = 2;
            this.lbl_Addr.Text = "Address:";
            // 
            // lbl_ContactNo
            // 
            this.lbl_ContactNo.AutoSize = true;
            this.lbl_ContactNo.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_ContactNo.ForeColor = System.Drawing.Color.White;
            this.lbl_ContactNo.Location = new System.Drawing.Point(19, 113);
            this.lbl_ContactNo.Name = "lbl_ContactNo";
            this.lbl_ContactNo.Size = new System.Drawing.Size(106, 23);
            this.lbl_ContactNo.TabIndex = 3;
            this.lbl_ContactNo.Text = "ContactNo:";
            // 
            // lbl_Email
            // 
            this.lbl_Email.AutoSize = true;
            this.lbl_Email.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_Email.ForeColor = System.Drawing.Color.White;
            this.lbl_Email.Location = new System.Drawing.Point(400, 30);
            this.lbl_Email.Name = "lbl_Email";
            this.lbl_Email.Size = new System.Drawing.Size(69, 25);
            this.lbl_Email.TabIndex = 4;
            this.lbl_Email.Text = "Email:";
            // 
            // lbl_Age
            // 
            this.lbl_Age.AutoSize = true;
            this.lbl_Age.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_Age.ForeColor = System.Drawing.Color.White;
            this.lbl_Age.Location = new System.Drawing.Point(418, 71);
            this.lbl_Age.Name = "lbl_Age";
            this.lbl_Age.Size = new System.Drawing.Size(51, 25);
            this.lbl_Age.TabIndex = 5;
            this.lbl_Age.Text = "Age:";
            // 
            // lbl_Gender
            // 
            this.lbl_Gender.AutoSize = true;
            this.lbl_Gender.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_Gender.ForeColor = System.Drawing.Color.White;
            this.lbl_Gender.Location = new System.Drawing.Point(385, 116);
            this.lbl_Gender.Name = "lbl_Gender";
            this.lbl_Gender.Size = new System.Drawing.Size(84, 25);
            this.lbl_Gender.TabIndex = 6;
            this.lbl_Gender.Text = "Gender:";
            // 
            // lbl_Quali
            // 
            this.lbl_Quali.AutoSize = true;
            this.lbl_Quali.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_Quali.ForeColor = System.Drawing.Color.White;
            this.lbl_Quali.Location = new System.Drawing.Point(336, 153);
            this.lbl_Quali.Name = "lbl_Quali";
            this.lbl_Quali.Size = new System.Drawing.Size(133, 25);
            this.lbl_Quali.TabIndex = 7;
            this.lbl_Quali.Text = "Qualification:";
            // 
            // txt_AgentN
            // 
            this.txt_AgentN.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_AgentN.Location = new System.Drawing.Point(162, 25);
            this.txt_AgentN.Name = "txt_AgentN";
            this.txt_AgentN.Size = new System.Drawing.Size(162, 31);
            this.txt_AgentN.TabIndex = 1;
            // 
            // txt_Addr
            // 
            this.txt_Addr.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_Addr.Location = new System.Drawing.Point(162, 70);
            this.txt_Addr.Name = "txt_Addr";
            this.txt_Addr.Size = new System.Drawing.Size(162, 31);
            this.txt_Addr.TabIndex = 2;
            // 
            // txt_Cont
            // 
            this.txt_Cont.AccessibleRole = System.Windows.Forms.AccessibleRole.OutlineButton;
            this.txt_Cont.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_Cont.Location = new System.Drawing.Point(162, 113);
            this.txt_Cont.Name = "txt_Cont";
            this.txt_Cont.Size = new System.Drawing.Size(137, 31);
            this.txt_Cont.TabIndex = 3;
            // 
            // txt_Email
            // 
            this.txt_Email.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_Email.Location = new System.Drawing.Point(501, 30);
            this.txt_Email.Name = "txt_Email";
            this.txt_Email.Size = new System.Drawing.Size(166, 31);
            this.txt_Email.TabIndex = 4;
            // 
            // txt_Age
            // 
            this.txt_Age.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_Age.Location = new System.Drawing.Point(501, 71);
            this.txt_Age.Name = "txt_Age";
            this.txt_Age.Size = new System.Drawing.Size(98, 31);
            this.txt_Age.TabIndex = 5;
            // 
            // txt_Quali
            // 
            this.txt_Quali.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_Quali.Location = new System.Drawing.Point(501, 160);
            this.txt_Quali.Name = "txt_Quali";
            this.txt_Quali.Size = new System.Drawing.Size(166, 31);
            this.txt_Quali.TabIndex = 8;
            // 
            // btn_add
            // 
            this.btn_add.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btn_add.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_add.ForeColor = System.Drawing.Color.Maroon;
            this.btn_add.Location = new System.Drawing.Point(33, 208);
            this.btn_add.Name = "btn_add";
            this.btn_add.Size = new System.Drawing.Size(126, 42);
            this.btn_add.TabIndex = 9;
            this.btn_add.Text = "ADD";
            this.btn_add.UseVisualStyleBackColor = false;
            this.btn_add.Click += new System.EventHandler(this.btn_add_Click);
            // 
            // btnrdiomale
            // 
            this.btnrdiomale.AutoSize = true;
            this.btnrdiomale.Checked = true;
            this.btnrdiomale.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnrdiomale.ForeColor = System.Drawing.Color.White;
            this.btnrdiomale.Location = new System.Drawing.Point(501, 116);
            this.btnrdiomale.Name = "btnrdiomale";
            this.btnrdiomale.Size = new System.Drawing.Size(70, 27);
            this.btnrdiomale.TabIndex = 6;
            this.btnrdiomale.TabStop = true;
            this.btnrdiomale.Text = "male";
            this.btnrdiomale.UseVisualStyleBackColor = true;
            // 
            // btnrdiofemale
            // 
            this.btnrdiofemale.AutoSize = true;
            this.btnrdiofemale.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnrdiofemale.ForeColor = System.Drawing.Color.White;
            this.btnrdiofemale.Location = new System.Drawing.Point(575, 119);
            this.btnrdiofemale.Name = "btnrdiofemale";
            this.btnrdiofemale.Size = new System.Drawing.Size(86, 27);
            this.btnrdiofemale.TabIndex = 7;
            this.btnrdiofemale.Text = "female";
            this.btnrdiofemale.UseVisualStyleBackColor = true;
            // 
            // btnSave
            // 
            this.btnSave.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btnSave.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnSave.ForeColor = System.Drawing.Color.Maroon;
            this.btnSave.Location = new System.Drawing.Point(625, 208);
            this.btnSave.Name = "btnSave";
            this.btnSave.Size = new System.Drawing.Size(134, 42);
            this.btnSave.TabIndex = 12;
            this.btnSave.Text = "Save";
            this.btnSave.UseVisualStyleBackColor = false;
            this.btnSave.Click += new System.EventHandler(this.btnSave_Click);
            // 
            // btn_del
            // 
            this.btn_del.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btn_del.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_del.ForeColor = System.Drawing.Color.Maroon;
            this.btn_del.Location = new System.Drawing.Point(427, 208);
            this.btn_del.Name = "btn_del";
            this.btn_del.Size = new System.Drawing.Size(134, 42);
            this.btn_del.TabIndex = 11;
            this.btn_del.Text = "Delete";
            this.btn_del.UseVisualStyleBackColor = false;
            this.btn_del.Click += new System.EventHandler(this.btn_del_Click);
            // 
            // btn_edit
            // 
            this.btn_edit.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btn_edit.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_edit.ForeColor = System.Drawing.Color.Maroon;
            this.btn_edit.Location = new System.Drawing.Point(220, 208);
            this.btn_edit.Name = "btn_edit";
            this.btn_edit.Size = new System.Drawing.Size(134, 42);
            this.btn_edit.TabIndex = 10;
            this.btn_edit.Text = "Edit";
            this.btn_edit.UseVisualStyleBackColor = false;
            this.btn_edit.Click += new System.EventHandler(this.btn_edit_Click_1);
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.agentgrid);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.panel1.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.panel1.Location = new System.Drawing.Point(0, 287);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(834, 191);
            this.panel1.TabIndex = 32;
            // 
            // agentgrid
            // 
            this.agentgrid.AllowUserToAddRows = false;
            this.agentgrid.AllowUserToDeleteRows = false;
            this.agentgrid.BackgroundColor = System.Drawing.Color.Silver;
            this.agentgrid.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.agentgrid.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.AgentID,
            this.AgentName,
            this.Address,
            this.ContactNo,
            this.Email,
            this.Age,
            this.Gender,
            this.Qualification});
            dataGridViewCellStyle1.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleLeft;
            dataGridViewCellStyle1.BackColor = System.Drawing.SystemColors.Window;
            dataGridViewCellStyle1.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            dataGridViewCellStyle1.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(64)))), ((int)(((byte)(0)))), ((int)(((byte)(64)))));
            dataGridViewCellStyle1.SelectionBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            dataGridViewCellStyle1.SelectionForeColor = System.Drawing.Color.Maroon;
            dataGridViewCellStyle1.WrapMode = System.Windows.Forms.DataGridViewTriState.False;
            this.agentgrid.DefaultCellStyle = dataGridViewCellStyle1;
            this.agentgrid.Dock = System.Windows.Forms.DockStyle.Fill;
            this.agentgrid.Location = new System.Drawing.Point(0, 0);
            this.agentgrid.Name = "agentgrid";
            this.agentgrid.ReadOnly = true;
            this.agentgrid.RowHeadersVisible = false;
            this.agentgrid.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.agentgrid.Size = new System.Drawing.Size(834, 191);
            this.agentgrid.TabIndex = 0;
            this.agentgrid.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.agentgrid_CellContentClick);
            //this.agentgrid.CellEnter += new System.Windows.Forms.DataGridViewCellEventHandler(this.agentgrid_CellEnter);
            // 
            // AgentID
            // 
            this.AgentID.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.Fill;
            this.AgentID.DataPropertyName = "AgentID";
            this.AgentID.HeaderText = "ID";
            this.AgentID.Name = "AgentID";
            this.AgentID.ReadOnly = true;
            // 
            // AgentName
            // 
            this.AgentName.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.Fill;
            this.AgentName.DataPropertyName = "AgentName";
            this.AgentName.HeaderText = "Agent Name";
            this.AgentName.Name = "AgentName";
            this.AgentName.ReadOnly = true;
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
            this.ContactNo.HeaderText = "Contact No";
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
            // Qualification
            // 
            this.Qualification.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.Fill;
            this.Qualification.DataPropertyName = "Qualification";
            this.Qualification.HeaderText = "Qualification";
            this.Qualification.Name = "Qualification";
            this.Qualification.ReadOnly = true;
            // 
            // AgentDateils
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.Teal;
            this.ClientSize = new System.Drawing.Size(834, 478);
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.btn_edit);
            this.Controls.Add(this.btn_del);
            this.Controls.Add(this.btnSave);
            this.Controls.Add(this.btnrdiofemale);
            this.Controls.Add(this.btnrdiomale);
            this.Controls.Add(this.btn_add);
            this.Controls.Add(this.txt_Quali);
            this.Controls.Add(this.txt_Age);
            this.Controls.Add(this.txt_Email);
            this.Controls.Add(this.txt_Cont);
            this.Controls.Add(this.txt_Addr);
            this.Controls.Add(this.txt_AgentN);
            this.Controls.Add(this.lbl_Quali);
            this.Controls.Add(this.lbl_Gender);
            this.Controls.Add(this.lbl_Age);
            this.Controls.Add(this.lbl_Email);
            this.Controls.Add(this.lbl_ContactNo);
            this.Controls.Add(this.lbl_Addr);
            this.Controls.Add(this.lbl_AgentN);
            this.Name = "AgentDateils";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "AgentDateils";
            this.Load += new System.EventHandler(this.AgentDateils_Load);
            this.panel1.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.agentgrid)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lbl_AgentN;
        private System.Windows.Forms.Label lbl_Addr;
        private System.Windows.Forms.Label lbl_ContactNo;
        private System.Windows.Forms.Label lbl_Email;
        private System.Windows.Forms.Label lbl_Age;
        private System.Windows.Forms.Label lbl_Gender;
        private System.Windows.Forms.Label lbl_Quali;
        private System.Windows.Forms.TextBox txt_AgentN;
        private System.Windows.Forms.TextBox txt_Addr;
        private System.Windows.Forms.TextBox txt_Cont;
        private System.Windows.Forms.TextBox txt_Email;
        private System.Windows.Forms.TextBox txt_Age;
        private System.Windows.Forms.TextBox txt_Quali;
        private System.Windows.Forms.Button btn_add;
        private System.Windows.Forms.RadioButton btnrdiomale;
        private System.Windows.Forms.RadioButton btnrdiofemale;
        private System.Windows.Forms.Button btnSave;
        private System.Windows.Forms.Button btn_del;
        private System.Windows.Forms.Button btn_edit;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.DataGridView agentgrid;
        private System.Windows.Forms.DataGridViewTextBoxColumn AgentID;
        private System.Windows.Forms.DataGridViewTextBoxColumn AgentName;
        private System.Windows.Forms.DataGridViewTextBoxColumn Address;
        private System.Windows.Forms.DataGridViewTextBoxColumn ContactNo;
        private System.Windows.Forms.DataGridViewTextBoxColumn Email;
        private System.Windows.Forms.DataGridViewTextBoxColumn Age;
        private System.Windows.Forms.DataGridViewTextBoxColumn Gender;
        private System.Windows.Forms.DataGridViewTextBoxColumn Qualification;
    }
}