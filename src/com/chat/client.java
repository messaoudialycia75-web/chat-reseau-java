package com.chat;
import java.io.OutputStream;
import java.io.PrintWriter;
 import java.net.Socket;
  public class client{
   public static void main(String[] args){
    String serveurAdress="127.0.0.1";
    int port =1234;

    System.out.println("connection au serveur :");
    try ( Socket s = new Socket(serveurAdress, port )){
// le client vas tenter de se connecter via son adress ip et son port
  System.out.println("connecté avec succet !");
   // now on a le tuyau ( la connexion ) fautle flux ( les msg)
    OutputStream output = s.getOutputStream();
    PrintWriter writer = new PrintWriter(output,true );

    writer.print("saaaaluuuuuttt");


    }catch(Exception e){
        System.out.println("erreur :"+ e.getMessage());
    }


   }


  }