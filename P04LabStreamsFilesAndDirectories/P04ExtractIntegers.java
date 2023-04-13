package P04LabStreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class P04ExtractIntegers {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Software University\\Java\\Java Advanced - януари 2022" +
                "\\P04 Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources" +
                "\\input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);
        FileOutputStream fileOutputStream = new FileOutputStream("output1.txt");

        Scanner scanner = new Scanner(fileInputStream);

        PrintStream out=new PrintStream(fileOutputStream);

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
//                System.out.println(number);
                out.println(number);
            }
            scanner.next();
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
