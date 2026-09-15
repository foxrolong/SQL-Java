using System;

class Program
{
    static void Main()
    {
        int a, b;
        char pheptoan;

        Console.Write("Nhap a: ");
        a = int.Parse(Console.ReadLine());

        Console.Write("Nhap b: ");
        b = int.Parse(Console.ReadLine());

        Console.Write("Nhap phep toan (+ - * /): ");
        pheptoan = char.Parse(Console.ReadLine());

        switch (pheptoan)
        {
            case '+':
                Console.WriteLine("Ket qua = " + (a + b));
                break;

            case '-':
                Console.WriteLine("Ket qua = " + (a - b));
                break;

            case '*':
                Console.WriteLine("Ket qua = " + (a * b));
                break;

            case '/':
                if (b == 0)
                    Console.WriteLine("Khong the chia cho 0");
                else
                    Console.WriteLine("Ket qua = " + ((double)a / b));
                break;

            default:
                Console.WriteLine("Phep toan khong hop le");
                break;
        }

        Console.ReadKey();
    }
}