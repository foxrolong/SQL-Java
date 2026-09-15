using System;

class Program
{
    static void Main()
    {
        int n;
        long tich = 1;

        Console.Write("Nhap n: ");
        n = int.Parse(Console.ReadLine());

        for (int i = 2; i <= n; i = i + 2)
        {
            tich = tich * i;
        }

        Console.WriteLine("Tich = " + tich);

        Console.ReadKey();
    }
}