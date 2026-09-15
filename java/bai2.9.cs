using System;

class Program
{
    static void Main()
    {
        int a, b;

        Console.Write("Nhap a: ");
        a = int.Parse(Console.ReadLine());

        Console.Write("Nhap b: ");
        b = int.Parse(Console.ReadLine());

        while (b != 0)
        {
            int r = a % b;
            a = b;
            b = r;
        }

        Console.WriteLine("UCLN = " + a);

        Console.ReadKey();
    }
}