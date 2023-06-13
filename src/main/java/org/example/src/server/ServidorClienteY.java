package org.example.src.server;

import org.example.src.thread.ThreadAtendimento;

import java.net.ServerSocket;
import java.net.Socket;

public class ServidorClienteY {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(9001);

        while (true) {
            System.out.println("Esperando conexão na porta 9001...");
            Socket no = serverSocket.accept(); //BLOCKING
            System.out.println("Conexão aceita na porta 9001");

            ThreadAtendimento thread = new ThreadAtendimento(no);
            thread.start();
        }
    }
}