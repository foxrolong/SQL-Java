using System;

class Program
{
    static void Main()
    {
        int nam;

        string[] can = {
            "Canh", "Tan", "Nham", "Quy", "Giap",
            "At", "Binh", "Dinh", "Mau", "Ky"
        };

        string[] chi = {
            "Than", "Dau", "Tuat", "Hoi", "Ty", "Suu",
            "Dan", "Mao", "Thin", "Ty", "Ngo", "Mui"
        };

        Console.Write("Nhap nam duong lich: ");
        nam = int.Parse(Console.ReadLine());

        Console.WriteLine("Nam am lich: " +
            can[nam % 10] + " " + chi[nam % 12]);

        Console.ReadKey();
    }
}