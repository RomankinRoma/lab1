import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            Singleton singleton = Singleton.getInstance("GO");
            Singleton singleton2 = Singleton.getInstance("Bu");
            Singleton singleton3 = Singleton.getInstance("WOW");
            FileWriter writer = new FileWriter("output.txt");
            writer.write(singleton.value+"\n");
            writer.write(singleton2.value+"\n");
            writer.write(singleton3.value+"\n");
            writer.close();
            System.out.println("Done.\nThis is output:");
            File file = new File("output.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
