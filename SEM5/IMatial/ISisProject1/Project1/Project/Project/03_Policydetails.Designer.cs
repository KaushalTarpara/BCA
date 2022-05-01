namespace Project
{
    partial class Policydetails
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
            this.lbl_PName = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.txt_Poliname = new System.Windows.Forms.TextBox();
            this.txt_PliAmount = new System.Windows.Forms.TextBox();
            this.btnSave = new System.Windows.Forms.Button();
            this.btn_Edit = new System.Windows.Forms.Button();
            this.btn_delt = new System.Windows.Forms.Button();
            this.btn_add = new System.Windows.Forms.Button();
            this.cmb_PoliType = new System.Windows.Forms.ComboBox();
            this.dateOfPolicy = new System.Windows.Forms.DateTimePicker();
            this.Poli_Panl = new System.Windows.Forms.Panel();
            this.poli_grid = new System.Windows.Forms.DataGridView();
            this.PolicyType = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.PolicyAmount = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.PolicyDate = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.PolicyTerm = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Poli_Panl.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.poli_grid)).BeginInit();
            this.SuspendLayout();
            // 
            // lbl_PName
            // 
            this.lbl_PName.AutoSize = true;
            this.lbl_PName.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_PName.ForeColor = System.Drawing.Color.White;
            this.lbl_PName.Location = new System.Drawing.Point(6, 13);
            this.lbl_PName.Name = "lbl_PName";
            this.lbl_PName.Size = new System.Drawing.Size(109, 23);
            this.lbl_PName.TabIndex = 1;
            this.lbl_PName.Text = "Policy Type";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.ForeColor = System.Drawing.Color.White;
            this.label3.Location = new System.Drawing.Point(348, 9);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(111, 23);
            this.label3.TabIndex = 2;
            this.label3.Text = "Policy Term";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.ForeColor = System.Drawing.Color.White;
            this.label5.Location = new System.Drawing.Point(-3, 58);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(135, 23);
            this.label5.TabIndex = 4;
            this.label5.Text = "Policy Amount";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label6.ForeColor = System.Drawing.Color.White;
            this.label6.Location = new System.Drawing.Point(351, 52);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(102, 23);
            this.label6.TabIndex = 5;
            this.label6.Text = "PolicyDate";
            // 
            // txt_Poliname
            // 
            this.txt_Poliname.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_Poliname.Location = new System.Drawing.Point(147, 6);
            this.txt_Poliname.Name = "txt_Poliname";
            this.txt_Poliname.Size = new System.Drawing.Size(162, 31);
            this.txt_Poliname.TabIndex = 7;
            // 
            // txt_PliAmount
            // 
            this.txt_PliAmount.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_PliAmount.Location = new System.Drawing.Point(143, 55);
            this.txt_PliAmount.Name = "txt_PliAmount";
            this.txt_PliAmount.Size = new System.Drawing.Size(162, 31);
            this.txt_PliAmount.TabIndex = 10;
            // 
            // btnSave
            // 
            this.btnSave.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btnSave.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnSave.ForeColor = System.Drawing.Color.Maroon;
            this.btnSave.Location = new System.Drawing.Point(498, 159);
            this.btnSave.Name = "btnSave";
            this.btnSave.Size = new System.Drawing.Size(123, 37);
            this.btnSave.TabIndex = 46;
            this.btnSave.Text = "Save";
            this.btnSave.UseVisualStyleBackColor = false;
            this.btnSave.Click += new System.EventHandler(this.btnSave_Click);
            // 
            // btn_Edit
            // 
            this.btn_Edit.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btn_Edit.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_Edit.ForeColor = System.Drawing.Color.Maroon;
            this.btn_Edit.Location = new System.Drawing.Point(216, 158);
            this.btn_Edit.Name = "btn_Edit";
            this.btn_Edit.Size = new System.Drawing.Size(123, 38);
            this.btn_Edit.TabIndex = 45;
            this.btn_Edit.Text = "Edit";
            this.btn_Edit.UseVisualStyleBackColor = false;
            this.btn_Edit.Click += new System.EventHandler(this.btn_Edit_Click);
            // 
            // btn_delt
            // 
            this.btn_delt.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btn_delt.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_delt.ForeColor = System.Drawing.Color.Maroon;
            this.btn_delt.Location = new System.Drawing.Point(360, 158);
            this.btn_delt.Name = "btn_delt";
            this.btn_delt.Size = new System.Drawing.Size(123, 38);
            this.btn_delt.TabIndex = 44;
            this.btn_delt.Text = "Delete";
            this.btn_delt.UseVisualStyleBackColor = false;
            this.btn_delt.Click += new System.EventHandler(this.btn_delt_Click);
            // 
            // btn_add
            // 
            this.btn_add.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btn_add.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_add.ForeColor = System.Drawing.Color.Maroon;
            this.btn_add.Location = new System.Drawing.Point(58, 159);
            this.btn_add.Name = "btn_add";
            this.btn_add.Size = new System.Drawing.Size(123, 37);
            this.btn_add.TabIndex = 43;
            this.btn_add.Text = "ADD";
            this.btn_add.UseVisualStyleBackColor = false;
            this.btn_add.Click += new System.EventHandler(this.btn_add_Click);
            // 
            // cmb_PoliType
            // 
            this.cmb_PoliType.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.cmb_PoliType.FormattingEnabled = true;
            this.cmb_PoliType.Items.AddRange(new object[] {
            "---SELECT---",
            "Yearly",
            "Monthly",
            "Weekly"});
            this.cmb_PoliType.Location = new System.Drawing.Point(481, 10);
            this.cmb_PoliType.Name = "cmb_PoliType";
            this.cmb_PoliType.Size = new System.Drawing.Size(162, 27);
            this.cmb_PoliType.TabIndex = 49;
            // 
            // dateOfPolicy
            // 
            this.dateOfPolicy.Format = System.Windows.Forms.DateTimePickerFormat.Short;
            this.dateOfPolicy.Location = new System.Drawing.Point(468, 55);
            this.dateOfPolicy.Name = "dateOfPolicy";
            this.dateOfPolicy.Size = new System.Drawing.Size(162, 20);
            this.dateOfPolicy.TabIndex = 50;
            // 
            // Poli_Panl
            // 
            this.Poli_Panl.Controls.Add(this.poli_grid);
            this.Poli_Panl.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.Poli_Panl.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Poli_Panl.Location = new System.Drawing.Point(0, 220);
            this.Poli_Panl.Name = "Poli_Panl";
            this.Poli_Panl.Size = new System.Drawing.Size(700, 171);
            this.Poli_Panl.TabIndex = 51;
            // 
            // poli_grid
            // 
            this.poli_grid.AllowUserToAddRows = false;
            this.poli_grid.AllowUserToDeleteRows = false;
            this.poli_grid.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.poli_grid.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.PolicyType,
            this.PolicyAmount,
            this.PolicyDate,
            this.PolicyTerm});
            dataGridViewCellStyle1.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleLeft;
            dataGridViewCellStyle1.BackColor = System.Drawing.SystemColors.Window;
            dataGridViewCellStyle1.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            dataGridViewCellStyle1.ForeColor = System.Drawing.SystemColors.ControlText;
            dataGridViewCellStyle1.SelectionBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            dataGridViewCellStyle1.SelectionForeColor = System.Drawing.Color.Maroon;
            dataGridViewCellStyle1.WrapMode = System.Windows.Forms.DataGridViewTriState.False;
            this.poli_grid.DefaultCellStyle = dataGridViewCellStyle1;
            this.poli_grid.Dock = System.Windows.Forms.DockStyle.Fill;
            this.poli_grid.Location = new System.Drawing.Point(0, 0);
            this.poli_grid.Name = "poli_grid";
            this.poli_grid.ReadOnly = true;
            this.poli_grid.RowHeadersVisible = false;
            this.poli_grid.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.poli_grid.Size = new System.Drawing.Size(700, 171);
            this.poli_grid.TabIndex = 0;
            this.poli_grid.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.poli_grid_CellContentClick);
            // 
            // PolicyType
            // 
            this.PolicyType.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.Fill;
            this.PolicyType.DataPropertyName = "PolicyType";
            this.PolicyType.HeaderText = "Policy Type";
            this.PolicyType.Name = "PolicyType";
            this.PolicyType.ReadOnly = true;
            // 
            // PolicyAmount
            // 
            this.PolicyAmount.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.Fill;
            this.PolicyAmount.DataPropertyName = "PolicyAmount";
            this.PolicyAmount.HeaderText = "Amount";
            this.PolicyAmount.Name = "PolicyAmount";
            this.PolicyAmount.ReadOnly = true;
            // 
            // PolicyDate
            // 
            this.PolicyDate.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.Fill;
            this.PolicyDate.DataPropertyName = "PolicyDate";
            this.PolicyDate.HeaderText = "Date";
            this.PolicyDate.Name = "PolicyDate";
            this.PolicyDate.ReadOnly = true;
            // 
            // PolicyTerm
            // 
            this.PolicyTerm.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.Fill;
            this.PolicyTerm.DataPropertyName = "PolicyTerm";
            this.PolicyTerm.HeaderText = "Term";
            this.PolicyTerm.Name = "PolicyTerm";
            this.PolicyTerm.ReadOnly = true;
            // 
            // Policydetails
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.Teal;
            this.ClientSize = new System.Drawing.Size(700, 391);
            this.Controls.Add(this.Poli_Panl);
            this.Controls.Add(this.dateOfPolicy);
            this.Controls.Add(this.cmb_PoliType);
            this.Controls.Add(this.btnSave);
            this.Controls.Add(this.btn_Edit);
            this.Controls.Add(this.btn_delt);
            this.Controls.Add(this.btn_add);
            this.Controls.Add(this.txt_PliAmount);
            this.Controls.Add(this.txt_Poliname);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.lbl_PName);
            this.Name = "Policydetails";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Policy Details";
            this.Load += new System.EventHandler(this.Policydetails_Load);
            this.Poli_Panl.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.poli_grid)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lbl_PName;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.TextBox txt_Poliname;
        private System.Windows.Forms.TextBox txt_PliAmount;
        private System.Windows.Forms.Button btnSave;
        private System.Windows.Forms.Button btn_Edit;
        private System.Windows.Forms.Button btn_delt;
        private System.Windows.Forms.Button btn_add;
        private System.Windows.Forms.ComboBox cmb_PoliType;
        private System.Windows.Forms.DateTimePicker dateOfPolicy;
        private System.Windows.Forms.Panel Poli_Panl;
        private System.Windows.Forms.DataGridView poli_grid;
        private System.Windows.Forms.DataGridViewTextBoxColumn PolicyType;
        private System.Windows.Forms.DataGridViewTextBoxColumn PolicyAmount;
        private System.Windows.Forms.DataGridViewTextBoxColumn PolicyDate;
        private System.Windows.Forms.DataGridViewTextBoxColumn PolicyTerm;
    }
}