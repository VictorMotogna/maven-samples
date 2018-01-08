package com.tora.client;

import java.net.Socket;

public class PeerTwo {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 9090);

            ClientSendThread sendThread = new ClientSendThread(socket);
            Thread thread = new Thread(sendThread);
            thread.start();

            ClientReceiveThread receiveThread = new ClientReceiveThread(socket);
            Thread thread2 = new Thread(receiveThread);
            thread2.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
