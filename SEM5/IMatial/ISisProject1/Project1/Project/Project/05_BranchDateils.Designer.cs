namespace Project
{
    partial class BranchDateils
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
            this.lbl_BranchN = new System.Windows.Forms.Label();
            this.lbl_Addr = new System.Windows.Forms.Label();
            this.lbl_ContN = new System.Windows.Forms.Label();
            this.txt_BranchName = new System.Windows.Forms.TextBox();
            this.txt_Addre = new System.Windows.Forms.TextBox();
            this.txt_ContactNo = new System.Windows.Forms.TextBox();
            this.btn_edit = new System.Windows.Forms.Button();
            this.btn_add = new System.Windows.Forms.Button();
            this.btn_delt = new System.Windows.Forms.Button();
            this.btnSave = new System.Windows.Forms.Button();
            this.panel1 = new System.Windows.Forms.Panel();
            this.branchgrid = new System.Windows.Forms.DataGridView();
            this.BranchId = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.BranchName = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Address = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Phone = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.panel1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.branchgrid)).BeginInit();
            this.SuspendLayout();
            // 
            // lbl_BranchN
            // 
            this.lbl_BranchN.AutoSize = true;
            this.lbl_BranchN.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_BranchN.ForeColor = System.Drawing.Color.White;
            this.lbl_BranchN.Location = new System.Drawing.Point(35, 32);
            this.lbl_BranchN.Name = "lbl_BranchN";
            this.lbl_BranchN.Size = new System.Drawing.Size(127, 23);
            this.lbl_BranchN.TabIndex = 1;
            this.lbl_BranchN.Text = "BranchName:";
            // 
            // lbl_Addr
            // 
            this.lbl_Addr.AutoSize = true;
            this.lbl_Addr.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_Addr.ForeColor = System.Drawing.Color.White;
            this.lbl_Addr.Location = new System.Drawing.Point(483, 40);
            this.lbl_Addr.Name = "lbl_Addr";
            this.lbl_Addr.Size = new System.Drawing.Size(85, 23);
            this.lbl_Addr.TabIndex = 2;
            this.lbl_Addr.Text = "Address:";
            // 
            // lbl_ContN
            // 
            this.lbl_ContN.AutoSize = true;
            this.lbl_ContN.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_ContN.ForeColor = System.Drawing.Color.White;
            this.lbl_ContN.Location = new System.Drawing.Point(260, 102);
            this.lbl_ContN.Name = "lbl_ContN";
            this.lbl_ContN.Size = new System.Drawing.Size(106, 23);
            this.lbl_ContN.TabIndex = 3;
            this.lbl_ContN.Text = "ContactNo:";
            // 
            // txt_BranchName
            // 
            this.txt_BranchName.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_BranchName.Location = new System.Drawing.Point(188, 40);
            this.txt_BranchName.Name = "txt_BranchName";
            this.txt_BranchName.Size = new System.Drawing.Size(164, 31);
            this.txt_BranchName.TabIndex = 5;
            // 
            // txt_Addre
            // 
            this.txt_Addre.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_Addre.Location = new System.Drawing.Point(574, 40);
            this.txt_Addre.Name = "txt_Addre";
            this.txt_Addre.Size = new System.Drawing.Size(151, 31);
            this.txt_Addre.TabIndex = 6;
            // 
            // txt_ContactNo
            // 
            this.txt_ContactNo.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_ContactNo.Location = new System.Drawing.Point(372, 99);
            this.txt_ContactNo.Name = "txt_ContactNo";
            this.txt_ContactNo.Size = new System.Drawing.Size(143, 31);
            this.txt_ContactNo.TabIndex = 7;
            // 
            // btn_edit
            // 
            this.btn_edit.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btn_edit.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_edit.ForeColor = System.Drawing.Color.Maroon;
            this.btn_edit.Location = new System.Drawing.Point(229, 174);
            this.btn_edit.Name = "btn_edit";
            this.btn_edit.Size = new System.Drawing.Size(123, 38);
            this.btn_edit.TabIndex = 19;
            this.btn_edit.Text = "Edit";
            this.btn_edit.UseVisualStyleBackColor = false;
            this.btn_edit.Click += new System.EventHandler(this.btn_edit_Click);
            // 
            // btn_add
            // 
            this.btn_add.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btn_add.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_add.ForeColor = System.Drawing.Color.Maroon;
            this.btn_add.Location = new System.Drawing.Point(70, 174);
            this.btn_add.Name = "btn_add";
            this.btn_add.Size = new System.Drawing.Size(123, 37);
            this.btn_add.TabIndex = 18;
            this.btn_add.Text = "ADD";
            this.btn_add.UseVisualStyleBackColor = false;
            this.btn_add.Click += new System.EventHandler(this.btn_add_Click);
            // 
            // btn_delt
            // 
            this.btn_delt.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btn_delt.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_delt.ForeColor = System.Drawing.Color.Maroon;
            this.btn_delt.Location = new System.Drawing.Point(377, 174);
            this.btn_delt.Name = "btn_delt";
            this.btn_delt.Size = new System.Drawing.Size(123, 38);
            this.btn_delt.TabIndex = 28;
            this.btn_delt.Text = "Delete";
            this.btn_delt.UseVisualStyleBackColor = false;
            this.btn_delt.Click += new System.EventHandler(this.btn_delt_Click);
            // 
            // btnSave
            // 
            this.btnSave.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btnSave.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnSave.ForeColor = System.Drawing.Color.Maroon;
            this.btnSave.Location = new System.Drawing.Point(518, 174);
            this.btnSave.Name = "btnSave";
            this.btnSave.Size = new System.Drawing.Size(123, 37);
            this.btnSave.TabIndex = 29;
            this.btnSave.Text = "Save";
            this.btnSave.UseVisualStyleBackColor = false;
            this.btnSave.Click += new System.EventHandler(this.btnSave_Click);
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.branchgrid);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.panel1.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.panel1.Location = new System.Drawing.Point(0, 266);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(812, 208);
            this.panel1.TabIndex = 30;
            // 
            // branchgrid
            // 
            this.branchgrid.AllowUserToAddRows = false;
            this.branchgrid.AllowUserToDeleteRows = false;
            this.branchgrid.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.branchgrid.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.BranchId,
            this.BranchName,
            this.Address,
            this.Phone});
            dataGridViewCellStyle1.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleLeft;
            dataGridViewCellStyle1.BackColor = System.Drawing.SystemColors.Window;
            dataGridViewCellStyle1.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            dataGridViewCellStyle1.ForeColor = System.Drawing.SystemColors.ControlText;
            dataGridViewCellStyle1.SelectionBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            dataGridViewCellStyle1.SelectionForeColor = System.Drawing.Color.Maroon;
            dataGridViewCellStyle1.WrapMode = System.Windows.Forms.DataGridViewTriState.False;
            this.branchgrid.DefaultCellStyle = dataGridViewCellStyle1;
            this.branchgrid.Dock = System.Windows.Forms.DockStyle.Fill;
            this.branchgrid.Location = new System.Drawing.Point(0, 0);
            this.branchgrid.Name = "branchgrid";
            this.branchgrid.ReadOnly = true;
            this.branchgrid.RowHeadersVisible = false;
            this.branchgrid.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.branchgrid.Size = new System.Drawing.Size(812, 208);
            this.branchgrid.TabIndex = 0;
            this.branchgrid.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.branchgrid_CellContentClick);
            // 
            // BranchId
            // 
            this.BranchId.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.Fill;
            this.BranchId.DataPropertyName = "BranchId";
            this.BranchId.HeaderText = "ID";
            this.BranchId.Name = "BranchId";
            this.BranchId.ReadOnly = true;
            // 
            // BranchName
            // 
            this.BranchName.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.Fill;
            this.BranchName.DataPropertyName = "BranchName";
            this.BranchName.HeaderText = "Name";
            this.BranchName.Name = "BranchName";
            this.BranchName.ReadOnly = true;
            // 
            // Address
            // 
            this.Address.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.Fill;
            this.Address.DataPropertyName = "Address";
            this.Address.HeaderText = "Address";
            this.Address.Name = "Address";
            this.Address.ReadOnly = true;
            // 
            // Phone
            // 
            this.Phone.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.Fill;
            this.Phone.DataPropertyName = "Phone";
            this.Phone.HeaderText = "Phone";
            this.Phone.Name = "Phone";
            this.Phone.ReadOnly = true;
            // 
            // BranchDateils
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.Teal;
            this.ClientSize = new System.Drawing.Size(812, 474);
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.btnSave);
            this.Controls.Add(this.btn_delt);
            this.Controls.Add(this.btn_edit);
            this.Controls.Add(this.btn_add);
            this.Controls.Add(this.txt_ContactNo);
            this.Controls.Add(this.txt_Addre);
            this.Controls.Add(this.txt_BranchName);
            this.Controls.Add(this.lbl_ContN);
            this.Controls.Add(this.lbl_Addr);
            this.Controls.Add(this.lbl_BranchN);
            this.Name = "BranchDateils";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "BranchDateils";
            this.Load += new System.EventHandler(this.BranchDateils_Load);
            this.panel1.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.branchgrid)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lbl_BranchN;
        private System.Windows.Forms.Label lbl_Addr;
        private System.Windows.Forms.Label lbl_ContN;
        private System.Windows.Forms.TextBox txt_BranchName;
        private System.Windows.Forms.TextBox txt_Addre;
        private System.Windows.Forms.TextBox txt_ContactNo;
        private System.Windows.Forms.Button btn_edit;
        private System.Windows.Forms.Button btn_add;
        private System.Windows.Forms.Button btn_delt;
        private System.Windows.Forms.Button btnSave;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.DataGridView branchgrid;
        private System.Windows.Forms.DataGridViewTextBoxColumn BranchId;
        private System.Windows.Forms.DataGridViewTextBoxColumn BranchName;
        private System.Windows.Forms.DataGridViewTextBoxColumn Address;
        private System.Windows.Forms.DataGridViewTextBoxColumn Phone;
    }
}