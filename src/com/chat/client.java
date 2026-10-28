package com.chat;
 import java.net.Socket;
  public class client{
   public static void main(String[] args){
    String serveurAdress="127.0.0.1";
    int port =1234;
    
    System.out.println("connection au serveur :");
    try ( Socket s = new Socket(serveurAdress, port )){
// le client vas tenter de se connecter via son adress ip et son port
  System.out.println("connecté avec succet !");

    }catch(Exception e){
        System.out.println("erreur :"+ e.getMessage());
    }

   }


  }