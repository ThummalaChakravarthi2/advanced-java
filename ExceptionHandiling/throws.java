import java.io.*;

public class DuckingExample {
    
    public static void readPinFromFile() throws IOException {
        FileReader fr = new FileReader("pin.txt"); // file may not exist
        System.out.println("PIN read successfully");
    }

    public static void atmProcess() throws IOException {
        readPinFromFile(); // ducking exception upwards
    }

    public static void main(String[] args) {
        try {
            atmProcess();
        } catch (IOException e) {
            System.out.println("Bank System Error: Unable to read PIN file.");
        }
    }
}
