using System;

class Program
{
    static void Main()
    {
        int n;

        Console.Write("Nhap n: ");
        n = int.Parse(Console.ReadLine());

        Console.Write("Cac uoc cua " + n + " la: ");

        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
                Console.Write(i + " ");
        }

        Console.ReadKey();
    }
}