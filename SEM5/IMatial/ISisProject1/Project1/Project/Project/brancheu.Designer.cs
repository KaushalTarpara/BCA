namespace Project
{
    partial class brancheu
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
            this.label2 = new System.Windows.Forms.Label();
            this.btnClear = new System.Windows.Forms.Button();
            this.btn_edit = new System.Windows.Forms.Button();
            this.txt_ContactNo = new System.Windows.Forms.TextBox();
            this.txt_Addre = new System.Windows.Forms.TextBox();
            this.txt_BraName = new System.Windows.Forms.TextBox();
            this.txt_BranchId = new System.Windows.Forms.TextBox();
            this.lbl_ContN = new System.Windows.Forms.Label();
            this.lbl_Addr = new System.Windows.Forms.Label();
            this.lbl_BranchN = new System.Windows.Forms.Label();
            this.lbl_BranchId = new System.Windows.Forms.Label();
            this.branchdtgr = new System.Windows.Forms.DataGridView();
            this.BranchId = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.BranchName = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Address = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Phone = new System.Windows.Forms.DataGridViewTextBoxColumn();
            ((System.ComponentModel.ISupportInitialize)(this.splitContainer1)).BeginInit();
            this.splitContainer1.Panel1.SuspendLayout();
            this.splitContainer1.Panel2.SuspendLayout();
            this.splitContainer1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.branchdtgr)).BeginInit();
            this.SuspendLayout();
            // 
            // splitContainer1
            // 
            this.splitContainer1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitContainer1.Location = new System.Drawing.Point(0, 0);
            this.splitContainer1.Name = "splitContainer1";
            // 
            // splitContainer1.Panel1
            // 
            this.splitContainer1.Panel1.Controls.Add(this.btnSave);
            this.splitContainer1.Panel1.Controls.Add(this.btnExit);
            this.splitContainer1.Panel1.Controls.Add(this.label2);
            this.splitContainer1.Panel1.Controls.Add(this.btnClear);
            this.splitContainer1.Panel1.Controls.Add(this.btn_edit);
            this.splitContainer1.Panel1.Controls.Add(this.txt_ContactNo);
            this.splitContainer1.Panel1.Controls.Add(this.txt_Addre);
            this.splitContainer1.Panel1.Controls.Add(this.txt_BraName);
            this.splitContainer1.Panel1.Controls.Add(this.txt_BranchId);
            this.splitContainer1.Panel1.Controls.Add(this.lbl_ContN);
            this.splitContainer1.Panel1.Controls.Add(this.lbl_Addr);
            this.splitContainer1.Panel1.Controls.Add(this.lbl_BranchN);
            this.splitContainer1.Panel1.Controls.Add(this.lbl_BranchId);
            // 
            // splitContainer1.Panel2
            // 
            this.splitContainer1.Panel2.Controls.Add(this.branchdtgr);
            this.splitContainer1.Size = new System.Drawing.Size(966, 346);
            this.splitContainer1.SplitterDistance = 392;
            this.splitContainer1.TabIndex = 0;
            // 
            // btnSave
            // 
            this.btnSave.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btnSave.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnSave.ForeColor = System.Drawing.Color.Maroon;
            this.btnSave.Location = new System.Drawing.Point(169, 263);
            this.btnSave.Name = "btnSave";
            this.btnSave.Size = new System.Drawing.Size(100, 34);
            this.btnSave.TabIndex = 42;
            this.btnSave.Text = "Save";
            this.btnSave.UseVisualStyleBackColor = false;
            // 
            // btnExit
            // 
            this.btnExit.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btnExit.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnExit.ForeColor = System.Drawing.Color.Maroon;
            this.btnExit.Location = new System.Drawing.Point(297, 157);
            this.btnExit.Name = "btnExit";
            this.btnExit.Size = new System.Drawing.Size(92, 33);
            this.btnExit.TabIndex = 41;
            this.btnExit.Text = "Exit";
            this.btnExit.UseVisualStyleBackColor = false;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.ForeColor = System.Drawing.Color.White;
            this.label2.Location = new System.Drawing.Point(107, 24);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(110, 19);
            this.label2.TabIndex = 40;
            this.label2.Text = "Branch Dateils";
            this.label2.Click += new System.EventHandler(this.label2_Click);
            // 
            // btnClear
            // 
            this.btnClear.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btnClear.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnClear.ForeColor = System.Drawing.Color.Maroon;
            this.btnClear.Location = new System.Drawing.Point(297, 95);
            this.btnClear.Name = "btnClear";
            this.btnClear.Size = new System.Drawing.Size(92, 33);
            this.btnClear.TabIndex = 39;
            this.btnClear.Text = "Clear";
            this.btnClear.UseVisualStyleBackColor = false;
            // 
            // btn_edit
            // 
            this.btn_edit.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btn_edit.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_edit.ForeColor = System.Drawing.Color.Maroon;
            this.btn_edit.Location = new System.Drawing.Point(27, 264);
            this.btn_edit.Name = "btn_edit";
            this.btn_edit.Size = new System.Drawing.Size(100, 34);
            this.btn_edit.TabIndex = 38;
            this.btn_edit.Text = "Edit";
            this.btn_edit.UseVisualStyleBackColor = false;
            // 
            // txt_ContactNo
            // 
            this.txt_ContactNo.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_ContactNo.Location = new System.Drawing.Point(169, 209);
            this.txt_ContactNo.Name = "txt_ContactNo";
            this.txt_ContactNo.Size = new System.Drawing.Size(100, 26);
            this.txt_ContactNo.TabIndex = 37;
            // 
            // txt_Addre
            // 
            this.txt_Addre.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_Addre.Location = new System.Drawing.Point(169, 164);
            this.txt_Addre.Name = "txt_Addre";
            this.txt_Addre.Size = new System.Drawing.Size(100, 26);
            this.txt_Addre.TabIndex = 36;
            // 
            // txt_BraName
            // 
            this.txt_BraName.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_BraName.Location = new System.Drawing.Point(169, 118);
            this.txt_BraName.Name = "txt_BraName";
            this.txt_BraName.Size = new System.Drawing.Size(100, 26);
            this.txt_BraName.TabIndex = 35;
            // 
            // txt_BranchId
            // 
            this.txt_BranchId.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_BranchId.Location = new System.Drawing.Point(169, 77);
            this.txt_BranchId.Name = "txt_BranchId";
            this.txt_BranchId.Size = new System.Drawing.Size(100, 26);
            this.txt_BranchId.TabIndex = 34;
            // 
            // lbl_ContN
            // 
            this.lbl_ContN.AutoSize = true;
            this.lbl_ContN.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_ContN.ForeColor = System.Drawing.Color.White;
            this.lbl_ContN.Location = new System.Drawing.Point(39, 203);
            this.lbl_ContN.Name = "lbl_ContN";
            this.lbl_ContN.Size = new System.Drawing.Size(85, 19);
            this.lbl_ContN.TabIndex = 33;
            this.lbl_ContN.Text = "ContactNo:";
            // 
            // lbl_Addr
            // 
            this.lbl_Addr.AutoSize = true;
            this.lbl_Addr.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_Addr.ForeColor = System.Drawing.Color.White;
            this.lbl_Addr.Location = new System.Drawing.Point(58, 164);
            this.lbl_Addr.Name = "lbl_Addr";
            this.lbl_Addr.Size = new System.Drawing.Size(70, 19);
            this.lbl_Addr.TabIndex = 32;
            this.lbl_Addr.Text = "Address:";
            // 
            // lbl_BranchN
            // 
            this.lbl_BranchN.AutoSize = true;
            this.lbl_BranchN.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_BranchN.ForeColor = System.Drawing.Color.White;
            this.lbl_BranchN.Location = new System.Drawing.Point(16, 110);
            this.lbl_BranchN.Name = "lbl_BranchN";
            this.lbl_BranchN.Size = new System.Drawing.Size(103, 19);
            this.lbl_BranchN.TabIndex = 31;
            this.lbl_BranchN.Text = "BranchName:";
            // 
            // lbl_BranchId
            // 
            this.lbl_BranchId.AutoSize = true;
            this.lbl_BranchId.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_BranchId.ForeColor = System.Drawing.Color.White;
            this.lbl_BranchId.Location = new System.Drawing.Point(48, 71);
            this.lbl_BranchId.Name = "lbl_BranchId";
            this.lbl_BranchId.Size = new System.Drawing.Size(77, 19);
            this.lbl_BranchId.TabIndex = 30;
            this.lbl_BranchId.Text = "BranchId:";
            // 
            // branchdtgr
            // 
            this.branchdtgr.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.branchdtgr.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.BranchId,
            this.BranchName,
            this.Address,
            this.Phone});
            this.branchdtgr.Dock = System.Windows.Forms.DockStyle.Fill;
            this.branchdtgr.Location = new System.Drawing.Point(0, 0);
            this.branchdtgr.Name = "branchdtgr";
            this.branchdtgr.RowHeadersVisible = false;
            this.branchdtgr.Size = new System.Drawing.Size(570, 346);
            this.branchdtgr.TabIndex = 0;
            // 
            // BranchId
            // 
            this.BranchId.HeaderText = "BranchId";
            this.BranchId.Name = "BranchId";
            // 
            // BranchName
            // 
            this.BranchName.HeaderText = "BranchName";
            this.BranchName.Name = "BranchName";
            // 
            // Address
            // 
            this.Address.HeaderText = "Address";
            this.Address.Name = "Address";
            // 
            // Phone
            // 
            this.Phone.HeaderText = "Phone";
            this.Phone.Name = "Phone";
            // 
            // brancheu
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.Teal;
            this.ClientSize = new System.Drawing.Size(966, 346);
            this.Controls.Add(this.splitContainer1);
            this.Name = "brancheu";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "brancheu";
            this.splitContainer1.Panel1.ResumeLayout(false);
            this.splitContainer1.Panel1.PerformLayout();
            this.splitContainer1.Panel2.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.splitContainer1)).EndInit();
            this.splitContainer1.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.branchdtgr)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.SplitContainer splitContainer1;
        private System.Windows.Forms.Button btnSave;
        private System.Windows.Forms.Button btnExit;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Button btnClear;
        private System.Windows.Forms.Button btn_edit;
        private System.Windows.Forms.TextBox txt_ContactNo;
        private System.Windows.Forms.TextBox txt_Addre;
        private System.Windows.Forms.TextBox txt_BraName;
        private System.Windows.Forms.TextBox txt_BranchId;
        private System.Windows.Forms.Label lbl_ContN;
        private System.Windows.Forms.Label lbl_Addr;
        private System.Windows.Forms.Label lbl_BranchN;
        private System.Windows.Forms.Label lbl_BranchId;
        private System.Windows.Forms.DataGridView branchdtgr;
        private System.Windows.Forms.DataGridViewTextBoxColumn BranchId;
        private System.Windows.Forms.DataGridViewTextBoxColumn BranchName;
        private System.Windows.Forms.DataGridViewTextBoxColumn Address;
        private System.Windows.Forms.DataGridViewTextBoxColumn Phone;

    }
}