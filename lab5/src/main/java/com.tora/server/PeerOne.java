package com.tora.server;

/*
 * the first peer is playing the server role and the second peer playing as client role
 */

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class PeerOne {
    public static void main(String[] args) throws IOException {
        final int port = 9090;

        System.out.println("Server is waiting for Client");
        ServerSocket server = new ServerSocket(port);

        while (true) {
            Socket client = server.accept();
            System.out.println("Client is now connected. You can start a conversation. Use !bye to end the connection.");

            ServerReceiveThread receive = new ServerReceiveThread(client);
            Thread receiveThread = new Thread(receive);
            receiveThread.start();

            ServerSendThread send = new ServerSendThread(client);
            Thread sendThread = new Thread(send);
            sendThread.start();
        }
    }
}
