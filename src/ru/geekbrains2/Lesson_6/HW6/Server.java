package ru.geekbrains2.Lesson_6.HW6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Socket clientSocket = null;
        Scanner scanner = new Scanner(System.in);

        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            System.out.println("Server Started!");
            clientSocket = serverSocket.accept();
            System.out.println("Client Connected!" + clientSocket.getRemoteSocketAddress());
            DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());

            Thread threadRead = new Thread(() -> {
                try {
                    outputStream.writeUTF(scanner.nextLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            });
            threadRead.setDaemon(true);
            threadRead.start();

            while (true) {
                String str = inputStream.readUTF();
                if (str.equals("/close")) {
                    System.out.println("Client Disconnected!");
                    outputStream.writeUTF("/close");
                    break;
                } else {
                    System.out.println("Client:" + str);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                clientSocket.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }

    }
}
