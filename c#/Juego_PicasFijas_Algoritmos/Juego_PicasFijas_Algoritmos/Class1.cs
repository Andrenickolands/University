using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Juego_PicasFijas_Algoritmos
{
    internal class jugar
    {
        public static int num, x, n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0, sw = 0;
        public int aleatorio()
        {
            Random random = new Random();

            sw = 0;
            while (sw == 0)
            {
                num = random.Next(100000, 999999);
                x = num;
                for (int i = 1; i <= 6; i++)
                {
                    if (i == 1)
                    {
                        n1 = x % 10;
                    }
                    if (i == 2)
                    {
                        n2 = x % 10;
                    }
                    if (i == 3)
                    {
                        n3 = x % 10;
                    }
                    if (i == 4)
                    {
                        n4 = x % 10;
                    }
                    if (i == 5)
                    {
                        n5 = x % 10;
                    }
                    if (i == 6)
                    {
                        n6 = x % 10;
                    }
                    x = x / 10;
                }
            }
            return num;
        }
        public int comparar()
        {
            int ret = 0;
            if (n1 != n2 && n1 != n3 && n1 != n4 && n1 != n5 && n1 != n6)
            {
                if (n2 != n3 && n2 != n4 && n2 != n5 && n2 != n6)
                {
                    if (n3 != n4 && n3 != n5 && n3 != n6)
                    {
                        if (n4 != n5 && n4 != n6 && n5 != n6)
                        {
                            ret = 1;
                        }
                    }
                }
            }
            return ret;
        }
    }
}
