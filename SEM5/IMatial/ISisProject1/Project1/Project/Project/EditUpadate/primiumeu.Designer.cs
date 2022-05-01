namespace Project
{
    partial class primiumeu
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
            this.date = new System.Windows.Forms.DateTimePicker();
            this.btnClear = new System.Windows.Forms.Button();
            this.label2 = new System.Windows.Forms.Label();
            this.btn_edit = new System.Windows.Forms.Button();
            this.txt_Chr = new System.Windows.Forms.TextBox();
            this.txt_CustId = new System.Windows.Forms.TextBox();
            this.txt_PaIdAmou = new System.Windows.Forms.TextBox();
            this.txt_PolicyN = new System.Windows.Forms.TextBox();
            this.txt_PreId = new System.Windows.Forms.TextBox();
            this.lbl_Char = new System.Windows.Forms.Label();
            this.lbl_DOPay = new System.Windows.Forms.Label();
            this.lbl_CustomerId = new System.Windows.Forms.Label();
            this.lbl_PaidAmo = new System.Windows.Forms.Label();
            this.lbl_PolicyN = new System.Windows.Forms.Label();
            this.lbl_PremiumId = new System.Windows.Forms.Label();
            this.primiumdtgr = new System.Windows.Forms.DataGridView();
            this.PremiumId = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.PolicyName = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.PaidAmount = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.CustomerId = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.DateOfPayment = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Charges = new System.Windows.Forms.DataGridViewTextBoxColumn();
            ((System.ComponentModel.ISupportInitialize)(this.splitContainer1)).BeginInit();
            this.splitContainer1.Panel1.SuspendLayout();
            this.splitContainer1.Panel2.SuspendLayout();
            this.splitContainer1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.primiumdtgr)).BeginInit();
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
            this.splitContainer1.Panel1.Controls.Add(this.date);
            this.splitContainer1.Panel1.Controls.Add(this.btnClear);
            this.splitContainer1.Panel1.Controls.Add(this.label2);
            this.splitContainer1.Panel1.Controls.Add(this.btn_edit);
            this.splitContainer1.Panel1.Controls.Add(this.txt_Chr);
            this.splitContainer1.Panel1.Controls.Add(this.txt_CustId);
            this.splitContainer1.Panel1.Controls.Add(this.txt_PaIdAmou);
            this.splitContainer1.Panel1.Controls.Add(this.txt_PolicyN);
            this.splitContainer1.Panel1.Controls.Add(this.txt_PreId);
            this.splitContainer1.Panel1.Controls.Add(this.lbl_Char);
            this.splitContainer1.Panel1.Controls.Add(this.lbl_DOPay);
            this.splitContainer1.Panel1.Controls.Add(this.lbl_CustomerId);
            this.splitContainer1.Panel1.Controls.Add(this.lbl_PaidAmo);
            this.splitContainer1.Panel1.Controls.Add(this.lbl_PolicyN);
            this.splitContainer1.Panel1.Controls.Add(this.lbl_PremiumId);
            // 
            // splitContainer1.Panel2
            // 
            this.splitContainer1.Panel2.Controls.Add(this.primiumdtgr);
            this.splitContainer1.Size = new System.Drawing.Size(1145, 437);
            this.splitContainer1.SplitterDistance = 561;
            this.splitContainer1.TabIndex = 0;
            // 
            // btnSave
            // 
            this.btnSave.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btnSave.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnSave.ForeColor = System.Drawing.Color.Maroon;
            this.btnSave.Location = new System.Drawing.Point(202, 366);
            this.btnSave.Name = "btnSave";
            this.btnSave.Size = new System.Drawing.Size(119, 44);
            this.btnSave.TabIndex = 47;
            this.btnSave.Text = "Save";
            this.btnSave.UseVisualStyleBackColor = false;
            // 
            // btnExit
            // 
            this.btnExit.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btnExit.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnExit.ForeColor = System.Drawing.Color.Maroon;
            this.btnExit.Location = new System.Drawing.Point(425, 366);
            this.btnExit.Name = "btnExit";
            this.btnExit.Size = new System.Drawing.Size(106, 44);
            this.btnExit.TabIndex = 46;
            this.btnExit.Text = "Exit";
            this.btnExit.UseVisualStyleBackColor = false;
            // 
            // date
            // 
            this.date.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.date.Format = System.Windows.Forms.DateTimePickerFormat.Short;
            this.date.Location = new System.Drawing.Point(202, 253);
            this.date.Name = "date";
            this.date.Size = new System.Drawing.Size(200, 26);
            this.date.TabIndex = 45;
            // 
            // btnClear
            // 
            this.btnClear.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btnClear.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnClear.ForeColor = System.Drawing.Color.Maroon;
            this.btnClear.Location = new System.Drawing.Point(432, 277);
            this.btnClear.Name = "btnClear";
            this.btnClear.Size = new System.Drawing.Size(99, 44);
            this.btnClear.TabIndex = 44;
            this.btnClear.Text = "Clear";
            this.btnClear.UseVisualStyleBackColor = false;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.ForeColor = System.Drawing.Color.White;
            this.label2.Location = new System.Drawing.Point(173, 27);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(187, 19);
            this.label2.TabIndex = 43;
            this.label2.Text = "Premium Payment Deatils";
            // 
            // btn_edit
            // 
            this.btn_edit.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(128)))));
            this.btn_edit.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_edit.ForeColor = System.Drawing.Color.Maroon;
            this.btn_edit.Location = new System.Drawing.Point(38, 366);
            this.btn_edit.Name = "btn_edit";
            this.btn_edit.Size = new System.Drawing.Size(113, 44);
            this.btn_edit.TabIndex = 42;
            this.btn_edit.Text = "Edit";
            this.btn_edit.UseVisualStyleBackColor = false;
            // 
            // txt_Chr
            // 
            this.txt_Chr.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_Chr.Location = new System.Drawing.Point(216, 299);
            this.txt_Chr.Name = "txt_Chr";
            this.txt_Chr.Size = new System.Drawing.Size(165, 26);
            this.txt_Chr.TabIndex = 41;
            // 
            // txt_CustId
            // 
            this.txt_CustId.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_CustId.Location = new System.Drawing.Point(216, 205);
            this.txt_CustId.Name = "txt_CustId";
            this.txt_CustId.Size = new System.Drawing.Size(165, 26);
            this.txt_CustId.TabIndex = 40;
            // 
            // txt_PaIdAmou
            // 
            this.txt_PaIdAmou.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_PaIdAmou.Location = new System.Drawing.Point(216, 158);
            this.txt_PaIdAmou.Name = "txt_PaIdAmou";
            this.txt_PaIdAmou.Size = new System.Drawing.Size(165, 26);
            this.txt_PaIdAmou.TabIndex = 39;
            // 
            // txt_PolicyN
            // 
            this.txt_PolicyN.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_PolicyN.Location = new System.Drawing.Point(216, 111);
            this.txt_PolicyN.Name = "txt_PolicyN";
            this.txt_PolicyN.Size = new System.Drawing.Size(165, 26);
            this.txt_PolicyN.TabIndex = 38;
            // 
            // txt_PreId
            // 
            this.txt_PreId.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txt_PreId.Location = new System.Drawing.Point(216, 64);
            this.txt_PreId.Name = "txt_PreId";
            this.txt_PreId.Size = new System.Drawing.Size(165, 26);
            this.txt_PreId.TabIndex = 37;
            // 
            // lbl_Char
            // 
            this.lbl_Char.AutoSize = true;
            this.lbl_Char.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_Char.ForeColor = System.Drawing.Color.White;
            this.lbl_Char.Location = new System.Drawing.Point(106, 295);
            this.lbl_Char.Name = "lbl_Char";
            this.lbl_Char.Size = new System.Drawing.Size(69, 19);
            this.lbl_Char.TabIndex = 36;
            this.lbl_Char.Text = "Charges:";
            // 
            // lbl_DOPay
            // 
            this.lbl_DOPay.AutoSize = true;
            this.lbl_DOPay.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_DOPay.ForeColor = System.Drawing.Color.White;
            this.lbl_DOPay.Location = new System.Drawing.Point(38, 250);
            this.lbl_DOPay.Name = "lbl_DOPay";
            this.lbl_DOPay.Size = new System.Drawing.Size(120, 19);
            this.lbl_DOPay.TabIndex = 35;
            this.lbl_DOPay.Text = "DateOfPayment:";
            // 
            // lbl_CustomerId
            // 
            this.lbl_CustomerId.AutoSize = true;
            this.lbl_CustomerId.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_CustomerId.ForeColor = System.Drawing.Color.White;
            this.lbl_CustomerId.Location = new System.Drawing.Point(72, 201);
            this.lbl_CustomerId.Name = "lbl_CustomerId";
            this.lbl_CustomerId.Size = new System.Drawing.Size(94, 19);
            this.lbl_CustomerId.TabIndex = 34;
            this.lbl_CustomerId.Text = "CustomerId:";
            // 
            // lbl_PaidAmo
            // 
            this.lbl_PaidAmo.AutoSize = true;
            this.lbl_PaidAmo.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_PaidAmo.ForeColor = System.Drawing.Color.White;
            this.lbl_PaidAmo.Location = new System.Drawing.Point(66, 153);
            this.lbl_PaidAmo.Name = "lbl_PaidAmo";
            this.lbl_PaidAmo.Size = new System.Drawing.Size(98, 19);
            this.lbl_PaidAmo.TabIndex = 33;
            this.lbl_PaidAmo.Text = "PaidAmount:";
            // 
            // lbl_PolicyN
            // 
            this.lbl_PolicyN.AutoSize = true;
            this.lbl_PolicyN.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_PolicyN.ForeColor = System.Drawing.Color.White;
            this.lbl_PolicyN.Location = new System.Drawing.Point(72, 105);
            this.lbl_PolicyN.Name = "lbl_PolicyN";
            this.lbl_PolicyN.Size = new System.Drawing.Size(94, 19);
            this.lbl_PolicyN.TabIndex = 32;
            this.lbl_PolicyN.Text = "PolicyName:";
            // 
            // lbl_PremiumId
            // 
            this.lbl_PremiumId.AutoSize = true;
            this.lbl_PremiumId.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbl_PremiumId.ForeColor = System.Drawing.Color.White;
            this.lbl_PremiumId.Location = new System.Drawing.Point(76, 59);
            this.lbl_PremiumId.Name = "lbl_PremiumId";
            this.lbl_PremiumId.Size = new System.Drawing.Size(90, 19);
            this.lbl_PremiumId.TabIndex = 31;
            this.lbl_PremiumId.Text = "PremiumId:";
            // 
            // primiumdtgr
            // 
            this.primiumdtgr.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.primiumdtgr.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.PremiumId,
            this.PolicyName,
            this.PaidAmount,
            this.CustomerId,
            this.DateOfPayment,
            this.Charges});
            this.primiumdtgr.Dock = System.Windows.Forms.DockStyle.Fill;
            this.primiumdtgr.Location = new System.Drawing.Point(0, 0);
            this.primiumdtgr.Name = "primiumdtgr";
            this.primiumdtgr.RowHeadersVisible = false;
            this.primiumdtgr.Size = new System.Drawing.Size(580, 437);
            this.primiumdtgr.TabIndex = 0;
            // 
            // PremiumId
            // 
            this.PremiumId.HeaderText = "PremiumId";
            this.PremiumId.Name = "PremiumId";
            // 
            // PolicyName
            // 
            this.PolicyName.HeaderText = "PolicyName";
            this.PolicyName.Name = "PolicyName";
            // 
            // PaidAmount
            // 
            this.PaidAmount.HeaderText = "PaidAmount";
            this.PaidAmount.Name = "PaidAmount";
            // 
            // CustomerId
            // 
            this.CustomerId.HeaderText = "CustomerId";
            this.CustomerId.Name = "CustomerId";
            // 
            // DateOfPayment
            // 
            this.DateOfPayment.HeaderText = "DateOfPayment";
            this.DateOfPayment.Name = "DateOfPayment";
            // 
            // Charges
            // 
            this.Charges.HeaderText = "Charges";
            this.Charges.Name = "Charges";
            // 
            // primiumeu
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.Teal;
            this.ClientSize = new System.Drawing.Size(1145, 437);
            this.Controls.Add(this.splitContainer1);
            this.Name = "primiumeu";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "primiumeu";
            this.splitContainer1.Panel1.ResumeLayout(false);
            this.splitContainer1.Panel1.PerformLayout();
            this.splitContainer1.Panel2.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.splitContainer1)).EndInit();
            this.splitContainer1.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.primiumdtgr)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.SplitContainer splitContainer1;
        private System.Windows.Forms.Button btnSave;
        private System.Windows.Forms.Button btnExit;
        private System.Windows.Forms.DateTimePicker date;
        private System.Windows.Forms.Button btnClear;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Button btn_edit;
        private System.Windows.Forms.TextBox txt_Chr;
        private System.Windows.Forms.TextBox txt_CustId;
        private System.Windows.Forms.TextBox txt_PaIdAmou;
        private System.Windows.Forms.TextBox txt_PolicyN;
        private System.Windows.Forms.TextBox txt_PreId;
        private System.Windows.Forms.Label lbl_Char;
        private System.Windows.Forms.Label lbl_DOPay;
        private System.Windows.Forms.Label lbl_CustomerId;
        private System.Windows.Forms.Label lbl_PaidAmo;
        private System.Windows.Forms.Label lbl_PolicyN;
        private System.Windows.Forms.Label lbl_PremiumId;
        private System.Windows.Forms.DataGridView primiumdtgr;
        private System.Windows.Forms.DataGridViewTextBoxColumn PremiumId;
        private System.Windows.Forms.DataGridViewTextBoxColumn PolicyName;
        private System.Windows.Forms.DataGridViewTextBoxColumn PaidAmount;
        private System.Windows.Forms.DataGridViewTextBoxColumn CustomerId;
        private System.Windows.Forms.DataGridViewTextBoxColumn DateOfPayment;
        private System.Windows.Forms.DataGridViewTextBoxColumn Charges;

    }
}