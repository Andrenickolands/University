using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Juego_PicasFijas_Algoritmos
{
    public partial class Form1 : Form
    {
        jugar metodo = new jugar();

        public Form1()
        {
            InitializeComponent();
        }

        private void button_Jugar_Click(object sender, EventArgs e)
        {
            int num;
            num = metodo.aleatorio();
            label1.Text = num.ToString();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
            
        }

        private void textBox1_TextChanged_1(object sender, EventArgs e)
        {

        }

        private void pictureBox4_Click(object sender, EventArgs e)
        {

        }

        private void Numeros_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button_Comparar_Click(object sender, EventArgs e)
        {

        }

        private void numeros_Click(object sender, EventArgs e)
        {

        }

        private void cuadro_Click(object sender, EventArgs e)
        {

        }
    }
}
