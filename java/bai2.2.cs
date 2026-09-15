using System;

class Program
{
    static void Main()
    {
        double a, b, c, p, n, s;

        Console.Write("Nhap a: ");
        a = double.Parse(Console.ReadLine());

        Console.Write("Nhap b: ");
        b = double.Parse(Console.ReadLine());

        Console.Write("Nhap c: ");
        c = double.Parse(Console.ReadLine());

        if (a > 0 && b > 0 && c > 0 &&
            a + b > c && a + c > b && b + c > a)
        {
            p = a + b + c;
            n = p / 2;
            s = Math.Sqrt(n * (n - a) * (n - b) * (n - c));

            Console.WriteLine("Chu vi = " + p);
            Console.WriteLine("Dien tich = " + Math.Round(s, 2));
        }
        else
        {
            Console.WriteLine("Khong lap thanh tam giac");
        }

        Console.ReadKey();
    }
}