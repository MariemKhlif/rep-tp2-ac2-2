package ac2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur implements Serializable {
	public static void main(String[] args) {
		try {
			
			
			ServerSocket serverSocket = new ServerSocket(8888);
			
			
			System.out.println("Client connecté");
			
			Socket s = serverSocket.accept();
			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader bfr = new BufferedReader(isr);
			
			int op1 = Integer.parseInt(bfr.readLine());
			int op2 = Integer.parseInt(bfr.readLine());
			
			String operation = bfr.readLine();
			
			int resultat = op1;
			switch(operation) {
			case "+":
				resultat += op2;
				break;
			case "-":
				resultat -= op2;
				break;
			case "*":
				resultat *= op2;
				break;
			case "/":
				resultat /= op2;
				break;
			}
			
			OutputStream os = s.getOutputStream();
			PrintWriter pw = new PrintWriter(os, true);
			
			pw.println(resultat);
			
			serverSocket.close();
			s.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
