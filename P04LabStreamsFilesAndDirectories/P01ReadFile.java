package P04LabStreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class P01ReadFile {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(System.in);
        String path = "D:\\Software University\\Java\\Java Advanced - януари 2022" +
                "\\P04 Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources" +
                "\\input.txt";

        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            int oneByte= fileInputStream.read();
            while (oneByte!=-1){
                System.out.printf("%s ", Integer.toBinaryString(oneByte));
                oneByte= fileInputStream.read();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
