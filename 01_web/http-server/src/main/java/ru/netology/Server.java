package ru.netology;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server implements Runnable {

    private static ServerSocket serverSocket;

    public static final int port = 9999;// Номер порта для прослушивания


    public static Runnable start() throws IOException {
        serverSocket = new ServerSocket(port);
        System.out.println("Server started...\n");
        return new Server();
    }

    public static Runnable work() throws IOException {
        Socket client = serverSocket.accept();
        return new HandlerThread(client);
    }

    @Override
    public void run() {

    }


}
