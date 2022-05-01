namespace Project
{
    partial class Agenteu
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
            this.splitContainer1 = new System.Windows.Forms.SplitContainer();
            this.btnSave = new System.Windows.Forms.Button();
            this.btnExit = new System.Windows.Forms.Button();
            this.btnrdiofemale = new System.Windows.Forms.RadioButton();
            this.btnrdiomale = new System.Windows.Forms.RadioButton();
            this.label2 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.btn_Edit = new System.Windows.Forms.Button();
            this.btnEdit = new System.Windows.Forms.Button();
            this.txt_Quali = new System.Windows.Forms.TextBox();
            this.txt_Age = new System.Windows.Forms.TextBox();
            this.txt_Email = new System.Windows.Forms.TextBox();
            this.txt_Cont = new System.Windows.Forms.TextBox();
            this.txt_Addr = new System.Windows.Forms.TextBox();
            this.txt_AgentN = new System.Windows.Forms.TextBox();
            this.txt_AgentId = new System.Windows.Forms.TextBox();
            this.lbl_Quali = new System.Windows.Forms.Label();
            this.lbl_Gender = new System.Windows.Forms.Label();
            this.lbl_Age = new System.Windows.Forms.Label();
            this.lbl_Email = new System.Windows.Forms.Label();
            this.lbl_ContactNo = new System.Windows.Forms.Label();
            this.lbl_Addr = new System.Windows.Forms.Label();
            this.lbl_AgentN = new System.Windows.Forms.Label();
            this.lbl_AgentId = new System.Windows.Forms.Label();
            this.agentGrd = new System.Windows.Forms.DataGridView();
            this.AgentID = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.AgentName = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Address = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.ContactNo = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Email = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Age = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Gender = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Qualification = new System.Windows.Forms.DataGridViewTextBoxColumn();
            ((System.ComponentModel.ISupportInitialize)(this.splitContainer1)).BeginInit();
            this.splitContainer1.Panel1.SuspendLayout();
            this.splitContainer1.Panel2.SuspendLayout();
            this.splitContainer1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.agentGrd)).BeginInit();
            this.SuspendLayout();
            // 
            // splitContainer1
            // 
            this.splitContainer1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitContainer1.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.splitContainer1.Location = new System.Drawing.Point(0, 0);
            this.splitContainer1.Name = "splitContainer1";
            // 
            // splitContainer1.Panel1
            // 
            this.splitContainer1.Panel1.Controls.Add(this.btnSave);
            this.splitContainer1.Panel1.Controls.Add(this.btnExit);
            this.splitContainer1.Panel1.Controls.Add(this.btnrdiofemale);
            this.splitContainer1.Panel1.Controls.Add(this.btnrdiomale);
            this.splitContainer1.Panel1.Controls.Add(this.label2);
            this.splitContainer1.Panel1.Controls.Add(this.label1);
            this.splitContainer1.Panel1.Controls.Add(this.btn_Edit);
            this.splitContainer1.Panel1.Controls.Add(this.btnEdit);
            this.splitContainer1.Panel1.Controls.Add(this.txt_Quali);
            this.splitContainer1.Panel1.Controls.Add(this.txt_Age);
            this.splitContainer1.Panel1.Controls.Add(this.txt_Email);
            this.splitContainer1.Panel1.Controls.Add(this.txt_Cont);
            this.splitContainer1.Panel1.Controls.Add(this.txt_Addr);
            this.splitContainer1.Panel1.Controls.Add(this.txt_AgentN);
            this.splitContainer1.Panel1.Controls.Add(this.txt_AgentId);
            this.splitContainer1.Panel1.Controls.Add(this.lbl_Quali);
            this.splitContainer1.Panel1.Controls.Add(this.lbl_Gender);
            this.splitContainer1.Panel1.Controls.Add(this.lbl_Age);
            this.splitContainer1.Panel1.Controls.Add(this.lbl_Email);
            this.splitContainer1.Panel1.Controls.Add(this.lbl_ContactNo);
            this.splitContainer1.Panel1.Controls.Add(this.lbl_Addr);
            this.splitContainer1.Panel1.Controls.Add(this.lbl_AgentN);
            this.splitContainer1.Panel1.Controls.Add(this.lbl_AgentId);
            // 
            // splitContainer1.Panel2
            // 
            this.splitContainer1.Panel2.Controls.Add(this.agentGrd);
            this.splitContainer1.Size = new System.Drawing.Size(904, 491);
            this.splitContainer1.SplitterDistance = 492;
            this.splitContainer1.TabIndex = 0;
            this.splitContainer1.SplitterMoved += new System.Windows.Forms.SplitterEventHandler(this.splitContainer1_SplitterMoved);
            // 
            // btnSave
            // 
            this.btnSave.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btnSave.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnSave.ForeColor = System.Drawing.Color.Maroon;
            this.btnSave.Location = new System.Drawing.Point(151, 447);
            this.btnSave.Name = "btnSave";
            this.btnSave.Size = new System.Drawing.Size(118, 32);
            this.btnSave.TabIndex = 52;
            this.btnSave.Text = "Save";
            this.btnSave.UseVisualStyleBackColor = false;
            // 
            // btnExit
            // 
            this.btnExit.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btnExit.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnExit.ForeColor = System.Drawing.Color.Maroon;
            this.btnExit.Location = new System.Drawing.Point(361, 420);
            this.btnExit.Name = "btnExit";
            this.btnExit.Size = new System.Drawing.Size(118, 32);
            this.btnExit.TabIndex = 51;
            this.btnExit.Text = "exit";
            this.btnExit.UseVisualStyleBackColor = false;
            this.btnExit.Click += new System.EventHandler(this.btnExit_Click);
            // 
            // btnrdiofemale
            // 
            this.btnrdiofemale.AutoSize = true;
            this.btnrdiofemale.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnrdiofemale.Location = new System.Drawing.Point(262, 329);
            this.btnrdiofemale.Name = "btnrdiofemale";
            this.btnrdiofemale.Size = new System.Drawing.Size(73, 23);
            this.btnrdiofemale.TabIndex = 50;
            this.btnrdiofemale.Text = "female";
            this.btnrdiofemale.UseVisualStyleBackColor = true;
            // 
            // btnrdiomale
            // 
            this.btnrdiomale.AutoSize = true;
            this.btnrdiomale.Checked = true;
            this.btnrdiomale.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnrdiomale.Location = new System.Drawing.Point(191, 329);
            this.btnrdiomale.Name = "btnrdiomale";
            this.btnrdiomale.Size = new System.Drawing.Size(60, 23);
            this.btnrdiomale.TabIndex = 49;
            this.btnrdiomale.TabStop = true;
            this.btnrdiomale.Text = "male";
            this.btnrdiomale.UseVisualStyleBackColor = true;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.ForeColor = System.Drawing.Color.White;
            this.label2.Location = new System.Drawing.Point(169, 15);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(100, 19);
            this.label2.TabIndex = 48;
            this.label2.Text = "Agent Dateils";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(126, 24);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(0, 19);
            this.label1.TabIndex = 47;
            // 
            // btn_Edit
            // 
            this.btn_Edit.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btn_Edit.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_Edit.ForeColor = System.Drawing.Color.Maroon;
            this.btn_Edit.Location = new System.Drawing.Point(361, 382);
            this.btn_Edit.Name = "btn_Edit";
            this.btn_Edit.Size = new System.Drawing.Size(118, 32);
            this.btn_Edit.TabIndex = 46;
            this.btn_Edit.Text = "Clear";
            this.btn_Edit.UseVisualStyleBackColor = false;
            this.btn_Edit.Click += new System.EventHandler(this.btn_Edit_Click);
            // 
            // btnEdit
            // 
            this.btnEdit.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btnEdit.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnEdit.ForeColor = System.Drawing.Color.Maroon;
            this.btnEdit.Location = new System.Drawing.Point(12, 447);
            this.btnEdit.Name = "btnEdit";
            this.btnEdit.Size = new System.Drawing.Size(110, 32);
            this.btnEdit.TabIndex = 45;
            this.btnEdit.Text = "Edit";
            this.btnEdit.UseVisualStyleBackColor = false;
            // 
            // txt_Quali
            // 
            this.txt_Quali.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_Quali.Location = new System.Drawing.Point(191, 373);
            this.txt_Quali.Name = "txt_Quali";
            this.txt_Quali.Size = new System.Drawing.Size(144, 26);
            this.txt_Quali.TabIndex = 44;
            // 
            // txt_Age
            // 
            this.txt_Age.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_Age.Location = new System.Drawing.Point(191, 284);
            this.txt_Age.Name = "txt_Age";
            this.txt_Age.Size = new System.Drawing.Size(144, 26);
            this.txt_Age.TabIndex = 43;
            // 
            // txt_Email
            // 
            this.txt_Email.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_Email.Location = new System.Drawing.Point(191, 243);
            this.txt_Email.Name = "txt_Email";
            this.txt_Email.Size = new System.Drawing.Size(144, 26);
            this.txt_Email.TabIndex = 42;
            // 
            // txt_Cont
            // 
            this.txt_Cont.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_Cont.Location = new System.Drawing.Point(191, 205);
            this.txt_Cont.Name = "txt_Cont";
            this.txt_Cont.Size = new System.Drawing.Size(144, 26);
            this.txt_Cont.TabIndex = 41;
            // 
            // txt_Addr
            // 
            this.txt_Addr.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_Addr.Location = new System.Drawing.Point(191, 162);
            this.txt_Addr.Name = "txt_Addr";
            this.txt_Addr.Size = new System.Drawing.Size(144, 26);
            this.txt_Addr.TabIndex = 40;
            // 
            // txt_AgentN
            // 
            this.txt_AgentN.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_AgentN.Location = new System.Drawing.Point(191, 117);
            this.txt_AgentN.Name = "txt_AgentN";
            this.txt_AgentN.Size = new System.Drawing.Size(144, 26);
            this.txt_AgentN.TabIndex = 39;
            // 
            // txt_AgentId
            // 
            this.txt_AgentId.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_AgentId.Location = new System.Drawing.Point(191, 79);
            this.txt_AgentId.Name = "txt_AgentId";
            this.txt_AgentId.Size = new System.Drawing.Size(144, 26);
            this.txt_AgentId.TabIndex = 38;
            // 
            // lbl_Quali
            // 
            this.lbl_Quali.AutoSize = true;
            this.lbl_Quali.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_Quali.ForeColor = System.Drawing.Color.White;
            this.lbl_Quali.Location = new System.Drawing.Point(26, 366);
            this.lbl_Quali.Name = "lbl_Quali";
            this.lbl_Quali.Size = new System.Drawing.Size(99, 19);
            this.lbl_Quali.TabIndex = 37;
            this.lbl_Quali.Text = "Qualification:";
            // 
            // lbl_Gender
            // 
            this.lbl_Gender.AutoSize = true;
            this.lbl_Gender.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_Gender.ForeColor = System.Drawing.Color.White;
            this.lbl_Gender.Location = new System.Drawing.Point(75, 329);
            this.lbl_Gender.Name = "lbl_Gender";
            this.lbl_Gender.Size = new System.Drawing.Size(64, 19);
            this.lbl_Gender.TabIndex = 36;
            this.lbl_Gender.Text = "Gender:";
            // 
            // lbl_Age
            // 
            this.lbl_Age.AutoSize = true;
            this.lbl_Age.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_Age.ForeColor = System.Drawing.Color.White;
            this.lbl_Age.Location = new System.Drawing.Point(108, 284);
            this.lbl_Age.Name = "lbl_Age";
            this.lbl_Age.Size = new System.Drawing.Size(39, 19);
            this.lbl_Age.TabIndex = 35;
            this.lbl_Age.Text = "Age:";
            // 
            // lbl_Email
            // 
            this.lbl_Email.AutoSize = true;
            this.lbl_Email.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_Email.ForeColor = System.Drawing.Color.White;
            this.lbl_Email.Location = new System.Drawing.Point(90, 243);
            this.lbl_Email.Name = "lbl_Email";
            this.lbl_Email.Size = new System.Drawing.Size(51, 19);
            this.lbl_Email.TabIndex = 34;
            this.lbl_Email.Text = "Email:";
            // 
            // lbl_ContactNo
            // 
            this.lbl_ContactNo.AutoSize = true;
            this.lbl_ContactNo.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_ContactNo.ForeColor = System.Drawing.Color.White;
            this.lbl_ContactNo.Location = new System.Drawing.Point(48, 205);
            this.lbl_ContactNo.Name = "lbl_ContactNo";
            this.lbl_ContactNo.Size = new System.Drawing.Size(85, 19);
            this.lbl_ContactNo.TabIndex = 33;
            this.lbl_ContactNo.Text = "ContactNo:";
            // 
            // lbl_Addr
            // 
            this.lbl_Addr.AutoSize = true;
            this.lbl_Addr.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_Addr.ForeColor = System.Drawing.Color.White;
            this.lbl_Addr.Location = new System.Drawing.Point(67, 157);
            this.lbl_Addr.Name = "lbl_Addr";
            this.lbl_Addr.Size = new System.Drawing.Size(70, 19);
            this.lbl_Addr.TabIndex = 32;
            this.lbl_Addr.Text = "Address:";
            // 
            // lbl_AgentN
            // 
            this.lbl_AgentN.AutoSize = true;
            this.lbl_AgentN.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_AgentN.ForeColor = System.Drawing.Color.White;
            this.lbl_AgentN.Location = new System.Drawing.Point(38, 114);
            this.lbl_AgentN.Name = "lbl_AgentN";
            this.lbl_AgentN.Size = new System.Drawing.Size(93, 19);
            this.lbl_AgentN.TabIndex = 31;
            this.lbl_AgentN.Text = "AgentName:";
            // 
            // lbl_AgentId
            // 
            this.lbl_AgentId.AutoSize = true;
            this.lbl_AgentId.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_AgentId.ForeColor = System.Drawing.Color.White;
            this.lbl_AgentId.Location = new System.Drawing.Point(70, 72);
            this.lbl_AgentId.Name = "lbl_AgentId";
            this.lbl_AgentId.Size = new System.Drawing.Size(67, 19);
            this.lbl_AgentId.TabIndex = 30;
            this.lbl_AgentId.Text = "AgentId:";
            // 
            // agentGrd
            // 
            this.agentGrd.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.agentGrd.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.AgentID,
            this.AgentName,
            this.Address,
            this.ContactNo,
            this.Email,
            this.Age,
            this.Gender,
            this.Qualification});
            this.agentGrd.Dock = System.Windows.Forms.DockStyle.Fill;
            this.agentGrd.Location = new System.Drawing.Point(0, 0);
            this.agentGrd.Name = "agentGrd";
            this.agentGrd.RowHeadersVisible = false;
            this.agentGrd.Size = new System.Drawing.Size(408, 491);
            this.agentGrd.TabIndex = 53;
            // 
            // AgentID
            // 
            this.AgentID.HeaderText = "AgentID";
            this.AgentID.Name = "AgentID";
            // 
            // AgentName
            // 
            this.AgentName.HeaderText = "AgentName";
            this.AgentName.Name = "AgentName";
            // 
            // Address
            // 
            this.Address.HeaderText = "Address";
            this.Address.Name = "Address";
            // 
            // ContactNo
            // 
            this.ContactNo.HeaderText = "ContactNo";
            this.ContactNo.Name = "ContactNo";
            // 
            // Email
            // 
            this.Email.HeaderText = "Email";
            this.Email.Name = "Email";
            // 
            // Age
            // 
            this.Age.HeaderText = "Age";
            this.Age.Name = "Age";
            // 
            // Gender
            // 
            this.Gender.HeaderText = "Gender";
            this.Gender.Name = "Gender";
            // 
            // Qualification
            // 
            this.Qualification.HeaderText = "Qualification";
            this.Qualification.Name = "Qualification";
            // 
            // Agenteu
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.Teal;
            this.ClientSize = new System.Drawing.Size(904, 491);
            this.Controls.Add(this.splitContainer1);
            this.Name = "Agenteu";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Agenteu";
            this.splitContainer1.Panel1.ResumeLayout(false);
            this.splitContainer1.Panel1.PerformLayout();
            this.splitContainer1.Panel2.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.splitContainer1)).EndInit();
            this.splitContainer1.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.agentGrd)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.SplitContainer splitContainer1;
        private System.Windows.Forms.Button btnSave;
        private System.Windows.Forms.Button btnExit;
        private System.Windows.Forms.RadioButton btnrdiofemale;
        private System.Windows.Forms.RadioButton btnrdiomale;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button btn_Edit;
        private System.Windows.Forms.Button btnEdit;
        private System.Windows.Forms.TextBox txt_Quali;
        private System.Windows.Forms.TextBox txt_Age;
        private System.Windows.Forms.TextBox txt_Email;
        private System.Windows.Forms.TextBox txt_Cont;
        private System.Windows.Forms.TextBox txt_Addr;
        private System.Windows.Forms.TextBox txt_AgentN;
        private System.Windows.Forms.TextBox txt_AgentId;
        private System.Windows.Forms.Label lbl_Quali;
        private System.Windows.Forms.Label lbl_Gender;
        private System.Windows.Forms.Label lbl_Age;
        private System.Windows.Forms.Label lbl_Email;
        private System.Windows.Forms.Label lbl_ContactNo;
        private System.Windows.Forms.Label lbl_Addr;
        private System.Windows.Forms.Label lbl_AgentN;
        private System.Windows.Forms.Label lbl_AgentId;
        private System.Windows.Forms.DataGridView agentGrd;
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