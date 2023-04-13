package P01StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();

        ArrayDeque<String> queue=new ArrayDeque<>();

        while (!file.equals("print")) {
            if(file.equals("cancel")){
                String fileName=queue.poll();
                if (fileName!=null){
                    System.out.println("Canceled "+fileName);
                }else {
                    System.out.println("Printer is on standby");
                }
            }else {
                queue.offer(file);
            }

            file = scanner.nextLine();
        }
        for (String element:queue) {
            System.out.println(element);
        }
    }
}
