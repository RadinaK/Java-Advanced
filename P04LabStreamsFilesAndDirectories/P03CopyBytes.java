package P04LabStreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class P03CopyBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream=new FileInputStream("D:\\Software University\\Java\\Java Advanced - януари 2022" +
                "\\P04 Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources" +
                "\\input.txt");

        int value=inputStream.read();

        while (value!=-1){
            if(value!=10&& value!=32){
                System.out.print(value);
            }else System.out.print((char) value);
            value= inputStream.read();
        }

    }
}
