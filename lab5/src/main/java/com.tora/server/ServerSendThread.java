package com.tora.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerSendThread implements Runnable {

    PrintWriter printWriter;
    Socket client = null;

    public ServerSendThread(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try {
            printWriter = new PrintWriter(new OutputStreamWriter(this.client.getOutputStream()));

            while (true) {
                System.out.println("server (you):");

                String msgToClientString = null;
                BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

                msgToClientString = input.readLine();

                printWriter.println(msgToClientString);
                printWriter.flush();

                if (msgToClientString.equals("EXIT")) break;
            }
            client.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
