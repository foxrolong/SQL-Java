import java.io.*;
public class Shutdown {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
				Runtime run = Runtime.getRuntime();
				Process proc = runtime.exec("shutdown -s -t 0");
	}
}