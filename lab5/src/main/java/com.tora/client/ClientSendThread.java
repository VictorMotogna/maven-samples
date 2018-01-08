package com.tora.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSendThread implements Runnable {
    Socket sock = null;
    PrintWriter print = null;
    BufferedReader input = null;

    public ClientSendThread(Socket sock) {
        this.sock = sock;
    }

    public void run() {
        try {
            if (sock.isConnected()) {
                System.out.println("Connected to server successfully. Let's start chat OR type !bye to disconnect");
                this.print = new PrintWriter(sock.getOutputStream(), true);

                while (true) {
                    System.out.println("client (you):");

                    input = new BufferedReader(new InputStreamReader(System.in));
                    String msgToServerString = null;
                    msgToServerString = input.readLine();
                    this.print.println(msgToServerString);
                    this.print.flush();

                    if (msgToServerString.equals("!bye"))
                        break;
                }
                sock.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
