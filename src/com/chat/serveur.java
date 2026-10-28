package com.chat;
import java.net.ServerSocket;
import java.net.Socket;
public class serveur{
 public static void  main (String[] args ){
    int port = 1234;
    try (ServerSocket sv = new ServerSocket(port)){

        System.out.println("ce serveur est demaré et ecoute sur le port "+ port);
       
       // accepte met le program en pose jusqu'a que u clietn essai de se connecter
       
       
       Socket sc = sv.accept();// le serveur client cv 
       System.out.println("un client vient de se connect, adress:  "+ sc.getRemoteSocketAddress());


    }catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
 }






} 