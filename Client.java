import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8000);
        System.out.println("Connected to server...");

        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("Enter a line: ");
            String userInput = userInputReader.readLine();
            writer.println(userInput);

            String capitalizedLine = reader.readLine();
            System.out.println("Capitalized line: " + capitalizedLine);
        }
    }
}
