package tpDepAppRep;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
public class Client {
	public static void main(String[] args) {
try 
{Socket sc=new Socket ("localhost",1234);
      System.out.println("Je suis un client connecté");

      InputStream is =sc.getInputStream();

      OutputStream os =sc.getOutputStream();
  	Scanner scanner=new Scanner(System.in);
    System.out.println("Donner un nombre");
   int nb=scanner.nextInt();
	os.write(nb);
    int rep = is.read();
    System.out.println("Reponse="+rep);
      sc.close();
         }

    catch(IOException e)
{
    e.printStackTrace();	}}}
