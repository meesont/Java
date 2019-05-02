/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson.networking;

import java.io.*;
import java.net.Socket;

public class GreetingClient {

    /**
     *
     * @param serverName The name the of the server, in most cases, localhost
     * @param port The port associated with the socketServer
     * @throws IOException Exception thrown when trying to create new socket
     */
    public static void newClient(String serverName, int port) throws IOException {
        System.out.println("Connecting too server: " + serverName + " on port: " + port);

//      Create new server client connection
        Socket client = new Socket(serverName, port);

        System.out.println("Successfully connected too: " + client.getRemoteSocketAddress());

        OutputStream os = client.getOutputStream();
        DataOutputStream out = new DataOutputStream(os);

        out.writeUTF("Hello from " + client.getRemoteSocketAddress());
        InputStream is = client.getInputStream();
        DataInputStream in = new DataInputStream(is);

        System.out.println("Server response: " + in.readUTF());
        client.close();

    }
}
