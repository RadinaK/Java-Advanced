package P04LabStreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class P02WriteToFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path = "D:\\Software University\\Java\\Java Advanced - януари 2022" +
                "\\P04 Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources" +
                "\\input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);
//        FileOutputStream fileOutputStream=new FileOutputStream("output.txt");

        Set<Character> punctuations = Set.of(',', '.', '!', '?');

        int value = fileInputStream.read();

        while (value != -1) {
            char current = (char) value;
            if (!punctuations.contains(current)) {
                System.out.print(current);
//                fileOutputStream.write(current);
            }
            value = fileInputStream.read();
        }
//        fileOutputStream.close();

    }
}
