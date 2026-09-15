using System;

class Program
{
    static void Main()
    {
        int n, tong = 0;

        Console.Write("Nhap n: ");
        n = int.Parse(Console.ReadLine());

        for (int i = 1; i <= n; i++)
        {
            tong = tong + i;
        }

        Console.WriteLine("Tong = " + tong);

        Console.ReadKey();
    }
}