package tpDepAppRep;

import java.io.IOException;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {


	  public static void main(String[] args) {
	  try { 
	  ServerSocket ss=new ServerSocket(1234);
	  System.out.println("Je suis un serveur en attente la connexion d'un client");
	  Socket s=ss.accept();
	  InputStream is =s.getInputStream();
	  OutputStream os =s.getOutputStream();
	  System.out.println("Il attend un nombre");
	  int nb =is.read();
	  int res = nb*5;
	  System.out.println("La reponse:");
	  os.write(res);
	  s.close();
	  } 
	  catch(IOException e) {
		  e.printStackTrace();
		  
	  }
	  


	  }
	}
