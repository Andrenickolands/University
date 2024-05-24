namespace Juego_PicasFijas_Algoritmos
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            System.Windows.Forms.TextBox Titulo;
            System.Windows.Forms.TextBox Titulo_cuadro;
            System.Windows.Forms.TextBox Fijas_text;
            System.Windows.Forms.TextBox Fijas_num;
            System.Windows.Forms.TextBox Picas_text;
            System.Windows.Forms.TextBox Picas_num;
            this.button_Jugar = new System.Windows.Forms.Button();
            this.button_Comparar = new System.Windows.Forms.Button();
            this.button_Reiniciar = new System.Windows.Forms.Button();
            this.button_Pausa = new System.Windows.Forms.Button();
            this.imagenes = new System.Windows.Forms.PictureBox();
            this.cuadro = new System.Windows.Forms.PictureBox();
            this.Historial = new System.Windows.Forms.PictureBox();
            this.Fondo_titilo_cuadro = new System.Windows.Forms.PictureBox();
            this.numeros = new System.Windows.Forms.Label();
            this.linkLabel1 = new System.Windows.Forms.LinkLabel();
            Titulo = new System.Windows.Forms.TextBox();
            Titulo_cuadro = new System.Windows.Forms.TextBox();
            Fijas_text = new System.Windows.Forms.TextBox();
            Fijas_num = new System.Windows.Forms.TextBox();
            Picas_text = new System.Windows.Forms.TextBox();
            Picas_num = new System.Windows.Forms.TextBox();
            ((System.ComponentModel.ISupportInitialize)(this.imagenes)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.cuadro)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.Historial)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.Fondo_titilo_cuadro)).BeginInit();
            this.SuspendLayout();
            // 
            // Titulo
            // 
            Titulo.BackColor = System.Drawing.SystemColors.InactiveBorder;
            Titulo.BorderStyle = System.Windows.Forms.BorderStyle.None;
            Titulo.Font = new System.Drawing.Font("Microsoft YaHei UI", 24F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            Titulo.Location = new System.Drawing.Point(49, 19);
            Titulo.Name = "Titulo";
            Titulo.RightToLeft = System.Windows.Forms.RightToLeft.No;
            Titulo.Size = new System.Drawing.Size(368, 41);
            Titulo.TabIndex = 5;
            Titulo.Text = "Picas y fijas supreme";
            Titulo.TextChanged += new System.EventHandler(this.textBox1_TextChanged_1);
            // 
            // Titulo_cuadro
            // 
            Titulo_cuadro.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(217)))), ((int)(((byte)(217)))), ((int)(((byte)(217)))));
            Titulo_cuadro.BorderStyle = System.Windows.Forms.BorderStyle.None;
            Titulo_cuadro.Font = new System.Drawing.Font("Microsoft YaHei UI", 18F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            Titulo_cuadro.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(251)))), ((int)(((byte)(131)))), ((int)(((byte)(20)))));
            Titulo_cuadro.Location = new System.Drawing.Point(357, 92);
            Titulo_cuadro.Name = "Titulo_cuadro";
            Titulo_cuadro.RightToLeft = System.Windows.Forms.RightToLeft.No;
            Titulo_cuadro.Size = new System.Drawing.Size(368, 31);
            Titulo_cuadro.TabIndex = 9;
            Titulo_cuadro.Text = "¿Puedes adivinar el número?";
            // 
            // button_Jugar
            // 
            this.button_Jugar.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(254)))), ((int)(((byte)(241)))), ((int)(((byte)(171)))));
            this.button_Jugar.Font = new System.Drawing.Font("Microsoft YaHei UI", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_Jugar.Location = new System.Drawing.Point(49, 376);
            this.button_Jugar.Name = "button_Jugar";
            this.button_Jugar.Size = new System.Drawing.Size(200, 60);
            this.button_Jugar.TabIndex = 0;
            this.button_Jugar.Text = "Jugar";
            this.button_Jugar.UseVisualStyleBackColor = false;
            this.button_Jugar.Click += new System.EventHandler(this.button_Jugar_Click);
            // 
            // button_Comparar
            // 
            this.button_Comparar.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(254)))), ((int)(((byte)(241)))), ((int)(((byte)(171)))));
            this.button_Comparar.Font = new System.Drawing.Font("Microsoft YaHei UI", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_Comparar.Location = new System.Drawing.Point(314, 376);
            this.button_Comparar.Name = "button_Comparar";
            this.button_Comparar.Size = new System.Drawing.Size(200, 60);
            this.button_Comparar.TabIndex = 1;
            this.button_Comparar.Text = "Comparar";
            this.button_Comparar.UseVisualStyleBackColor = false;
            this.button_Comparar.Click += new System.EventHandler(this.button_Comparar_Click);
            // 
            // button_Reiniciar
            // 
            this.button_Reiniciar.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(254)))), ((int)(((byte)(241)))), ((int)(((byte)(171)))));
            this.button_Reiniciar.Font = new System.Drawing.Font("Microsoft YaHei UI", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_Reiniciar.Location = new System.Drawing.Point(562, 376);
            this.button_Reiniciar.Name = "button_Reiniciar";
            this.button_Reiniciar.Size = new System.Drawing.Size(200, 60);
            this.button_Reiniciar.TabIndex = 2;
            this.button_Reiniciar.Text = "Reiniciar";
            this.button_Reiniciar.UseVisualStyleBackColor = false;
            // 
            // button_Pausa
            // 
            this.button_Pausa.Location = new System.Drawing.Point(692, 25);
            this.button_Pausa.Name = "button_Pausa";
            this.button_Pausa.Size = new System.Drawing.Size(70, 40);
            this.button_Pausa.TabIndex = 3;
            this.button_Pausa.Text = "Pausa";
            this.button_Pausa.UseVisualStyleBackColor = true;
            // 
            // imagenes
            // 
            this.imagenes.BackColor = System.Drawing.Color.White;
            this.imagenes.Location = new System.Drawing.Point(49, 84);
            this.imagenes.Name = "imagenes";
            this.imagenes.Size = new System.Drawing.Size(212, 149);
            this.imagenes.TabIndex = 4;
            this.imagenes.TabStop = false;
            // 
            // cuadro
            // 
            this.cuadro.BackColor = System.Drawing.Color.White;
            this.cuadro.Location = new System.Drawing.Point(294, 92);
            this.cuadro.Margin = new System.Windows.Forms.Padding(0);
            this.cuadro.Name = "cuadro";
            this.cuadro.Size = new System.Drawing.Size(468, 265);
            this.cuadro.TabIndex = 6;
            this.cuadro.TabStop = false;
            this.cuadro.Click += new System.EventHandler(this.cuadro_Click);
            // 
            // Historial
            // 
            this.Historial.BackColor = System.Drawing.Color.White;
            this.Historial.Location = new System.Drawing.Point(49, 239);
            this.Historial.Name = "Historial";
            this.Historial.Size = new System.Drawing.Size(212, 118);
            this.Historial.TabIndex = 7;
            this.Historial.TabStop = false;
            // 
            // Fondo_titilo_cuadro
            // 
            this.Fondo_titilo_cuadro.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(217)))), ((int)(((byte)(217)))), ((int)(((byte)(217)))));
            this.Fondo_titilo_cuadro.Location = new System.Drawing.Point(294, 84);
            this.Fondo_titilo_cuadro.Name = "Fondo_titilo_cuadro";
            this.Fondo_titilo_cuadro.Size = new System.Drawing.Size(468, 49);
            this.Fondo_titilo_cuadro.TabIndex = 8;
            this.Fondo_titilo_cuadro.TabStop = false;
            this.Fondo_titilo_cuadro.Click += new System.EventHandler(this.pictureBox4_Click);
            // 
            // Fijas_text
            // 
            Fijas_text.BorderStyle = System.Windows.Forms.BorderStyle.None;
            Fijas_text.Font = new System.Drawing.Font("Microsoft YaHei UI", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            Fijas_text.Location = new System.Drawing.Point(525, 311);
            Fijas_text.Name = "Fijas_text";
            Fijas_text.RightToLeft = System.Windows.Forms.RightToLeft.No;
            Fijas_text.Size = new System.Drawing.Size(60, 27);
            Fijas_text.TabIndex = 11;
            Fijas_text.Text = "Fijas:";
            // 
            // Fijas_num
            // 
            Fijas_num.BorderStyle = System.Windows.Forms.BorderStyle.None;
            Fijas_num.Font = new System.Drawing.Font("Microsoft YaHei UI", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            Fijas_num.Location = new System.Drawing.Point(593, 312);
            Fijas_num.Name = "Fijas_num";
            Fijas_num.RightToLeft = System.Windows.Forms.RightToLeft.No;
            Fijas_num.Size = new System.Drawing.Size(15, 27);
            Fijas_num.TabIndex = 12;
            Fijas_num.Text = "0";
            Fijas_num.TextChanged += new System.EventHandler(this.textBox2_TextChanged);
            // 
            // Picas_text
            // 
            Picas_text.BorderStyle = System.Windows.Forms.BorderStyle.None;
            Picas_text.Font = new System.Drawing.Font("Microsoft YaHei UI", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            Picas_text.Location = new System.Drawing.Point(635, 311);
            Picas_text.Name = "Picas_text";
            Picas_text.RightToLeft = System.Windows.Forms.RightToLeft.No;
            Picas_text.Size = new System.Drawing.Size(65, 27);
            Picas_text.TabIndex = 13;
            Picas_text.Text = "Picas:";
            // 
            // Picas_num
            // 
            Picas_num.BorderStyle = System.Windows.Forms.BorderStyle.None;
            Picas_num.Font = new System.Drawing.Font("Microsoft YaHei UI", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            Picas_num.Location = new System.Drawing.Point(711, 312);
            Picas_num.Name = "Picas_num";
            Picas_num.RightToLeft = System.Windows.Forms.RightToLeft.No;
            Picas_num.Size = new System.Drawing.Size(15, 27);
            Picas_num.TabIndex = 14;
            Picas_num.Text = "0";
            // 
            // numeros
            // 
            this.numeros.AutoSize = true;
            this.numeros.Font = new System.Drawing.Font("Microsoft YaHei UI", 24F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.numeros.Location = new System.Drawing.Point(392, 191);
            this.numeros.Name = "numeros";
            this.numeros.Size = new System.Drawing.Size(288, 42);
            this.numeros.TabIndex = 15;
            this.numeros.Text = "0   0   0   0   0   0";
            this.numeros.Click += new System.EventHandler(this.numeros_Click);
            // 
            // linkLabel1
            // 
            this.linkLabel1.AutoSize = true;
            this.linkLabel1.Location = new System.Drawing.Point(419, 161);
            this.linkLabel1.Name = "linkLabel1";
            this.linkLabel1.Size = new System.Drawing.Size(0, 13);
            this.linkLabel1.TabIndex = 16;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(241)))), ((int)(((byte)(241)))), ((int)(((byte)(241)))));
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.linkLabel1);
            this.Controls.Add(this.numeros);
            this.Controls.Add(Picas_num);
            this.Controls.Add(Picas_text);
            this.Controls.Add(Fijas_num);
            this.Controls.Add(Fijas_text);
            this.Controls.Add(Titulo_cuadro);
            this.Controls.Add(this.Fondo_titilo_cuadro);
            this.Controls.Add(this.Historial);
            this.Controls.Add(this.cuadro);
            this.Controls.Add(Titulo);
            this.Controls.Add(this.imagenes);
            this.Controls.Add(this.button_Pausa);
            this.Controls.Add(this.button_Reiniciar);
            this.Controls.Add(this.button_Comparar);
            this.Controls.Add(this.button_Jugar);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            ((System.ComponentModel.ISupportInitialize)(this.imagenes)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.cuadro)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.Historial)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.Fondo_titilo_cuadro)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button button_Jugar;
        private System.Windows.Forms.Button button_Comparar;
        private System.Windows.Forms.Button button_Reiniciar;
        private System.Windows.Forms.Button button_Pausa;
        private System.Windows.Forms.PictureBox imagenes;
        private System.Windows.Forms.PictureBox Historial;
        private System.Windows.Forms.PictureBox Fondo_titilo_cuadro;
        public System.Windows.Forms.PictureBox cuadro;
        public System.Windows.Forms.Label numeros;
        private System.Windows.Forms.LinkLabel linkLabel1;
    }
}

