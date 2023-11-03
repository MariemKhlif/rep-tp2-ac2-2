package ac2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client  implements Serializable {
	public static void main(String[] args) {
		try {
		
			Socket sc = new Socket("localhost", 8888);
			
			OutputStream os = sc.getOutputStream();
			PrintWriter pw = new PrintWriter(os, true); 
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Donner le premier nombre : ");
			int op1 = scanner.nextInt();
			
			
			System.out.print("\nDonner l'operation : ");
			String operation;
			
	
			do {
				operation = scanner.nextLine();
			}while(!(operation.equals("*")) && !(operation.equals("+")) && !(operation.equals("-")) && !(operation.equals("/")));
			
			System.out.print("\nDonner le deuxieme nombre : ");
			int op2 = scanner.nextInt();
			
			scanner.close();
			
			
			
			pw.println(op1);
			pw.println(op2);
			pw.println(operation);
			
			InputStream is = sc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader bfr = new BufferedReader(isr);
			
			System.out.println("\n" + op1 + " " + operation + " " + op2 + " = " + bfr.readLine());
			
			
			sc.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
