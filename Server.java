import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
 ServerSocket serverSocket = new ServerSocket(8000);
        System.out.println("Server is running...");

        Socket socket = serverSocket.accept();
        System.out.println("Client connected...");

        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

        String inputLine;
        while ((inputLine = reader.readLine()) != null) {
            writer.println(inputLine.toUpperCase());
        }

        socket.close();
        serverSocket.close();
    }
}