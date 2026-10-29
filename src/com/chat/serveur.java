package com.chat;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
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
       // on ajoute le flux entran (le message )
        InputStream input = sc.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
       String message= reader.readLine();
       System.out.println(" Message reçu du client : " + message);


    }catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
 }






} 