package com.tora.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerReceiveThread implements Runnable {

    Socket clientSocket = null;
    BufferedReader reader = null;

    public ServerReceiveThread(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
            reader = new BufferedReader(new InputStreamReader(this.clientSocket.getInputStream()));

            String messageString;
            while (true) {
                while ((messageString = reader.readLine()) != null) {
                    if (messageString.equals("!bye")) {
                        break;
                    }
                    System.out.println("Client says: " + messageString);
                    System.out.println("server (you):");
                }

                System.out.println("Client is Disconnect");
                this.clientSocket.close();
                // System.exit(0);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
