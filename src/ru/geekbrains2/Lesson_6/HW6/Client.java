package ru.geekbrains2.Lesson_6.HW6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private static final String SERVER_ADDRES = "localhost";
    private static final int SERVER_PORT = 8189;

    public static void main(String[] args) {
        Socket socket = null;
        Scanner scanner = new Scanner(System.in);
        try {
            socket = new Socket(SERVER_ADDRES, SERVER_PORT);
            System.out.println("Client Connected!" + socket.getRemoteSocketAddress());
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

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
                    System.out.println("Server Disconnected!");
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
                socket.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }
}
