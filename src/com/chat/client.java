package com.chat;
import java.io.PrintWriter;
import java.net.Socket;
 import java.util.Scanner;
  public class client{
   public static void main(String[] args){
    String serveurAdress="127.0.0.1";
    int port =1234;

    System.out.println("connection au serveur :");
    try ( Socket s = new Socket(serveurAdress, port );
  PrintWriter writer = new PrintWriter(s.getOutputStream(), true);
Scanner scanner = new Scanner(System.in)){
// le client vas tenter de se connecter via son adress ip et son port
  System.out.println("connecté avec succet !");
   // now on a le tuyau ( la connexion ) fautle flux ( les msg)
    
     
     while (true) { 
           System.out.println("moi: ");
           String message= scanner.nextLine();
          writer.println(message);
          if (message.equalsIgnoreCase("exit")){
            System.out.println("deconnection");
            break;
     }}
    


    }catch(Exception e){
        System.out.println("erreur :"+ e.getMessage());
    }


   }


  }