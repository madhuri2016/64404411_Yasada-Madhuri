import java.io.*;
import java.net.*;
public class ChatServer {
    public static void main(String[] args) {
        int port = 5000;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started. Waiting for client connection...");
            try (Socket socket = serverSocket.accept()) {
                System.out.println("Client connected.");
                BufferedReader serverInput = new BufferedReader(new InputStreamReader(System.in));
                BufferedReader clientInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter clientOutput = new PrintWriter(socket.getOutputStream(), true);
                String clientMsg, serverMsg;
                while (true) {
                    if ((clientMsg = clientInput.readLine()) != null) {
                        System.out.println("Client: " + clientMsg);
                        if ("bye".equalsIgnoreCase(clientMsg)) {
                            System.out.println("Client exited. Closing connection.");
                            break;
                        }
                    }
                    System.out.print("Server: ");
                    serverMsg = serverInput.readLine();
                    clientOutput.println(serverMsg);
                    if ("bye".equalsIgnoreCase(serverMsg)) {
                        System.out.println("Server exited. Closing connection.");
                        break;
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}