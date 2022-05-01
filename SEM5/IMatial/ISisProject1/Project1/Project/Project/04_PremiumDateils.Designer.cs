namespace Project
{
    partial class PremiumPaymentDateils
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
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle2 = new System.Windows.Forms.DataGridViewCellStyle();
            this.lbl_PolicyN = new System.Windows.Forms.Label();
            this.lbl_PaidAmo = new System.Windows.Forms.Label();
            this.lbl_DOPay = new System.Windows.Forms.Label();
            this.lbl_Char = new System.Windows.Forms.Label();
            this.txt_PaIdAmou = new System.Windows.Forms.TextBox();
            this.txt_Chr = new System.Windows.Forms.TextBox();
            this.btn_add = new System.Windows.Forms.Button();
            this.date = new System.Windows.Forms.DateTimePicker();
            this.btn_delt = new System.Windows.Forms.Button();
            this.btnSave = new System.Windows.Forms.Button();
            this.Prem_Panel = new System.Windows.Forms.Panel();
            this.PrimGrid = new System.Windows.Forms.DataGridView();
            this.PolicyName = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.PaidAmount = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.DateOfPayment = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Charges = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.colorDialog1 = new System.Windows.Forms.ColorDialog();
            this.cmbPolicyName = new System.Windows.Forms.ComboBox();
            this.btn_Edit = new System.Windows.Forms.Button();
            this.Prem_Panel.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.PrimGrid)).BeginInit();
            this.SuspendLayout();
            // 
            // lbl_PolicyN
            // 
            this.lbl_PolicyN.AutoSize = true;
            this.lbl_PolicyN.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_PolicyN.ForeColor = System.Drawing.Color.White;
            this.lbl_PolicyN.Location = new System.Drawing.Point(20, 17);
            this.lbl_PolicyN.Name = "lbl_PolicyN";
            this.lbl_PolicyN.Size = new System.Drawing.Size(129, 25);
            this.lbl_PolicyN.TabIndex = 1;
            this.lbl_PolicyN.Text = "Policy Name:";
            // 
            // lbl_PaidAmo
            // 
            this.lbl_PaidAmo.AutoSize = true;
            this.lbl_PaidAmo.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_PaidAmo.ForeColor = System.Drawing.Color.White;
            this.lbl_PaidAmo.Location = new System.Drawing.Point(14, 65);
            this.lbl_PaidAmo.Name = "lbl_PaidAmo";
            this.lbl_PaidAmo.Size = new System.Drawing.Size(135, 25);
            this.lbl_PaidAmo.TabIndex = 2;
            this.lbl_PaidAmo.Text = "Paid Amount:";
            // 
            // lbl_DOPay
            // 
            this.lbl_DOPay.AutoSize = true;
            this.lbl_DOPay.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_DOPay.ForeColor = System.Drawing.Color.White;
            this.lbl_DOPay.Location = new System.Drawing.Point(365, 19);
            this.lbl_DOPay.Name = "lbl_DOPay";
            this.lbl_DOPay.Size = new System.Drawing.Size(168, 25);
            this.lbl_DOPay.TabIndex = 4;
            this.lbl_DOPay.Text = "Date Of Payment:";
            // 
            // lbl_Char
            // 
            this.lbl_Char.AutoSize = true;
            this.lbl_Char.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_Char.ForeColor = System.Drawing.Color.White;
            this.lbl_Char.Location = new System.Drawing.Point(433, 64);
            this.lbl_Char.Name = "lbl_Char";
            this.lbl_Char.Size = new System.Drawing.Size(90, 25);
            this.lbl_Char.TabIndex = 5;
            this.lbl_Char.Text = "Charges:";
            // 
            // txt_PaIdAmou
            // 
            this.txt_PaIdAmou.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_PaIdAmou.Location = new System.Drawing.Point(164, 70);
            this.txt_PaIdAmou.Name = "txt_PaIdAmou";
            this.txt_PaIdAmou.Size = new System.Drawing.Size(189, 31);
            this.txt_PaIdAmou.TabIndex = 8;
            // 
            // txt_Chr
            // 
            this.txt_Chr.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_Chr.Location = new System.Drawing.Point(543, 68);
            this.txt_Chr.Name = "txt_Chr";
            this.txt_Chr.Size = new System.Drawing.Size(198, 31);
            this.txt_Chr.TabIndex = 11;
            // 
            // btn_add
            // 
            this.btn_add.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btn_add.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_add.ForeColor = System.Drawing.Color.Maroon;
            this.btn_add.Location = new System.Drawing.Point(32, 150);
            this.btn_add.Name = "btn_add";
            this.btn_add.Size = new System.Drawing.Size(146, 44);
            this.btn_add.TabIndex = 15;
            this.btn_add.Text = "ADD";
            this.btn_add.UseVisualStyleBackColor = false;
            this.btn_add.Click += new System.EventHandler(this.btn_add_Click);
            // 
            // date
            // 
            this.date.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.date.Format = System.Windows.Forms.DateTimePickerFormat.Short;
            this.date.Location = new System.Drawing.Point(543, 22);
            this.date.Name = "date";
            this.date.Size = new System.Drawing.Size(135, 31);
            this.date.TabIndex = 28;
            // 
            // btn_delt
            // 
            this.btn_delt.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btn_delt.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_delt.ForeColor = System.Drawing.Color.Maroon;
            this.btn_delt.Location = new System.Drawing.Point(373, 150);
            this.btn_delt.Name = "btn_delt";
            this.btn_delt.Size = new System.Drawing.Size(159, 44);
            this.btn_delt.TabIndex = 29;
            this.btn_delt.Text = "Delete";
            this.btn_delt.UseVisualStyleBackColor = false;
            this.btn_delt.Click += new System.EventHandler(this.btnExit_Click);
            // 
            // btnSave
            // 
            this.btnSave.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btnSave.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnSave.ForeColor = System.Drawing.Color.Maroon;
            this.btnSave.Location = new System.Drawing.Point(543, 150);
            this.btnSave.Name = "btnSave";
            this.btnSave.Size = new System.Drawing.Size(152, 44);
            this.btnSave.TabIndex = 30;
            this.btnSave.Text = "Save";
            this.btnSave.UseVisualStyleBackColor = false;
            this.btnSave.Click += new System.EventHandler(this.btnSave_Click);
            // 
            // Prem_Panel
            // 
            this.Prem_Panel.Controls.Add(this.PrimGrid);
            this.Prem_Panel.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.Prem_Panel.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Prem_Panel.Location = new System.Drawing.Point(0, 212);
            this.Prem_Panel.Name = "Prem_Panel";
            this.Prem_Panel.Size = new System.Drawing.Size(786, 176);
            this.Prem_Panel.TabIndex = 33;
            // 
            // PrimGrid
            // 
            this.PrimGrid.AllowUserToAddRows = false;
            this.PrimGrid.AllowUserToDeleteRows = false;
            this.PrimGrid.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.PrimGrid.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.PolicyName,
            this.PaidAmount,
            this.DateOfPayment,
            this.Charges});
            dataGridViewCellStyle2.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleLeft;
            dataGridViewCellStyle2.BackColor = System.Drawing.SystemColors.Window;
            dataGridViewCellStyle2.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            dataGridViewCellStyle2.ForeColor = System.Drawing.SystemColors.ControlText;
            dataGridViewCellStyle2.SelectionBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            dataGridViewCellStyle2.SelectionForeColor = System.Drawing.Color.Maroon;
            dataGridViewCellStyle2.WrapMode = System.Windows.Forms.DataGridViewTriState.False;
            this.PrimGrid.DefaultCellStyle = dataGridViewCellStyle2;
            this.PrimGrid.Dock = System.Windows.Forms.DockStyle.Fill;
            this.PrimGrid.Location = new System.Drawing.Point(0, 0);
            this.PrimGrid.Name = "PrimGrid";
            this.PrimGrid.ReadOnly = true;
            this.PrimGrid.RowHeadersVisible = false;
            this.PrimGrid.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.PrimGrid.Size = new System.Drawing.Size(786, 176);
            this.PrimGrid.TabIndex = 0;
            this.PrimGrid.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.PrimGrid_CellContentClick);
            // 
            // PolicyName
            // 
            this.PolicyName.DataPropertyName = "PolicyName";
            this.PolicyName.HeaderText = "Policy Name";
            this.PolicyName.Name = "PolicyName";
            this.PolicyName.ReadOnly = true;
            // 
            // PaidAmount
            // 
            this.PaidAmount.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.Fill;
            this.PaidAmount.DataPropertyName = "PaidAmount";
            this.PaidAmount.HeaderText = "Paid Amount";
            this.PaidAmount.Name = "PaidAmount";
            this.PaidAmount.ReadOnly = true;
            // 
            // DateOfPayment
            // 
            this.DateOfPayment.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.Fill;
            this.DateOfPayment.DataPropertyName = "DateOfPayment";
            this.DateOfPayment.HeaderText = "Date Of Payment";
            this.DateOfPayment.Name = "DateOfPayment";
            this.DateOfPayment.ReadOnly = true;
            // 
            // Charges
            // 
            this.Charges.AutoSizeMode = System.Windows.Forms.DataGridViewAutoSizeColumnMode.Fill;
            this.Charges.DataPropertyName = "Charges";
            this.Charges.HeaderText = "Charges";
            this.Charges.Name = "Charges";
            this.Charges.ReadOnly = true;
            // 
            // cmbPolicyName
            // 
            this.cmbPolicyName.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.cmbPolicyName.FormattingEnabled = true;
            this.cmbPolicyName.Location = new System.Drawing.Point(164, 17);
            this.cmbPolicyName.Name = "cmbPolicyName";
            this.cmbPolicyName.Size = new System.Drawing.Size(189, 31);
            this.cmbPolicyName.TabIndex = 34;
            // 
            // btn_Edit
            // 
            this.btn_Edit.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btn_Edit.Font = new System.Drawing.Font("Cambria", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_Edit.ForeColor = System.Drawing.Color.Maroon;
            this.btn_Edit.Location = new System.Drawing.Point(207, 150);
            this.btn_Edit.Name = "btn_Edit";
            this.btn_Edit.Size = new System.Drawing.Size(146, 44);
            this.btn_Edit.TabIndex = 35;
            this.btn_Edit.Text = "Edit";
            this.btn_Edit.UseVisualStyleBackColor = false;
            this.btn_Edit.Click += new System.EventHandler(this.btn_Edit_Click);
            // 
            // PremiumPaymentDateils
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.Teal;
            this.ClientSize = new System.Drawing.Size(786, 388);
            this.Controls.Add(this.btn_Edit);
            this.Controls.Add(this.cmbPolicyName);
            this.Controls.Add(this.Prem_Panel);
            this.Controls.Add(this.btnSave);
            this.Controls.Add(this.btn_delt);
            this.Controls.Add(this.date);
            this.Controls.Add(this.btn_add);
            this.Controls.Add(this.txt_Chr);
            this.Controls.Add(this.txt_PaIdAmou);
            this.Controls.Add(this.lbl_Char);
            this.Controls.Add(this.lbl_DOPay);
            this.Controls.Add(this.lbl_PaidAmo);
            this.Controls.Add(this.lbl_PolicyN);
            this.Name = "PremiumPaymentDateils";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "PremiumPaymentDateils";
            this.Load += new System.EventHandler(this.PremiumPaymentDateils_Load);
            this.Prem_Panel.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.PrimGrid)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lbl_PolicyN;
        private System.Windows.Forms.Label lbl_PaidAmo;
        private System.Windows.Forms.Label lbl_DOPay;
        private System.Windows.Forms.Label lbl_Char;
        private System.Windows.Forms.TextBox txt_PaIdAmou;
        private System.Windows.Forms.TextBox txt_Chr;
        private System.Windows.Forms.Button btn_add;
        private System.Windows.Forms.DateTimePicker date;
        private System.Windows.Forms.Button btn_delt;
        private System.Windows.Forms.Button btnSave;
        private System.Windows.Forms.Panel Prem_Panel;
        private System.Windows.Forms.DataGridView PrimGrid;
        private System.Windows.Forms.DataGridViewTextBoxColumn PolicyName;
        private System.Windows.Forms.DataGridViewTextBoxColumn PaidAmount;
        private System.Windows.Forms.DataGridViewTextBoxColumn DateOfPayment;
        private System.Windows.Forms.DataGridViewTextBoxColumn Charges;
        private System.Windows.Forms.ColorDialog colorDialog1;
        private System.Windows.Forms.ComboBox cmbPolicyName;
        private System.Windows.Forms.Button btn_Edit;
    }
}