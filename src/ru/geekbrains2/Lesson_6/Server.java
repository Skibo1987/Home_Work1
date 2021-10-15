package ru.geekbrains2.Lesson_6;

import javax.sound.sampled.Port;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    static ServerSocket server;
    static Socket socket;
    private static final int PORT = 8189;


    public static void main(String[] args) {

        try {
            server = new ServerSocket(PORT);
            System.out.println("Server started!");

            socket = server.accept();
            System.out.println("Client Connected");

            Scanner sc = new Scanner(socket.getInputStream());

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);


            while (true) {
                String str = sc.nextLine();

                if (str.equals("/end")) {
                    System.out.println("Client Disconnected");
                    break;
                }
                out.println("ECHO:  " + str);
                System.out.println("Clien:  " + str);

            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }

}
