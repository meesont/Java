/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson.networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class GreetingServer extends Thread {
    private ServerSocket serverSocket;


    public GreetingServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(10000);
    }

    public void run() {
        while(true){
            try {
                System.out.println("Waiting for client on port: " + serverSocket.getLocalPort() + "...");
                Socket server = serverSocket.accept();

                System.out.println("connected too: " + server.getRemoteSocketAddress());
                DataInputStream in = new DataInputStream(server.getInputStream());

                System.out.println(in.readUTF());
                DataOutputStream out = new DataOutputStream(server.getOutputStream());

                out.writeUTF("Thanks for connecting to " + serverSocket.getLocalSocketAddress() + "\n Goodbye!");


                System.out.println(server);
                System.out.println(serverSocket);

                // Close server socket
                server.close();
            } catch (SocketTimeoutException e) {
                System.out.println("Server has timed out");
                e.printStackTrace();
                break;
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
