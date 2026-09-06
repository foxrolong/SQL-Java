import java.io.*;
public class Tinhtong {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int a,b;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("nhap cac he so: ");
		System.out.print("a= ");
		a = Integer.parseInt(input.readLine());
		
		
		System.out.print("b= ");
		b = Integer.parseInt(input.readLine());
		
		
		System.out.println("Tong 2 so: " + (a+b));
		System.out.println("Hieu 2 so: " + (a-b));
	}

}
