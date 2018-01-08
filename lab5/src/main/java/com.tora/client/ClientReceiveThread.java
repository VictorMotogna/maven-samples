package com.tora.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientReceiveThread implements Runnable {
    Socket socket = null;
    BufferedReader receive = null;

    public ClientReceiveThread(Socket sock) {
        this.socket = sock;
    }
    //end constructor

    public void run() {
        try {

            receive = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            String msgRecieved = null;
            while ((msgRecieved = receive.readLine()) != null) {
                if (msgRecieved.equals("!bye")) {
                    break;
                }

                System.out.println("Server says: " + msgRecieved);
                System.out.println("client (you):");
            }

            System.out.println("Server is closed");
            this.socket.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
