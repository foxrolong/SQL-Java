using System;

class Program
{
    static void Fibonacci(int n)
    {
        int a = 1, b = 1, c;

        for (int i = 1; i <= n; i++)
        {
            Console.Write(a + " ");

            c = a + b;
            a = b;
            b = c;
        }
    }

    static void Main()
    {
        int n;

        Console.Write("Nhap n: ");
        n = int.Parse(Console.ReadLine());

        Fibonacci(n);

        Console.ReadKey();
    }
}