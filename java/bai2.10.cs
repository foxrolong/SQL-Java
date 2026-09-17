using System;

class Program
{
    static void Main()
    {
        int[] numbers = new int[1000];
        int count = 0;

        Console.WriteLine("Nhap cac so nguyen (nhap 0 de dung):");

        while (true)
        {
            Console.Write("Nhap so: ");
            int x = int.Parse(Console.ReadLine());

            if (x == 0)
            {
                break;
            }

            numbers[count] = x;
            count++;
        }

        int tongChan = 0;
        int tongLe = 0;

        for (int i = 0; i < count; i++)
        {
            if (numbers[i] % 2 == 0)
            {
                tongChan += numbers[i];
            }
            else
            {
                tongLe += numbers[i];
            }
        }

        Console.WriteLine($"Tong cac so chan: {tongChan}");
        Console.WriteLine($"Tong cac so le: {tongLe}");

        Console.ReadKey();
    }
}