package P01StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P06HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] circle = scanner.nextLine().split("\\s+");
        int childIndex = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> queue =new ArrayDeque<>();

        for (String child:circle) {
            queue.offer(child);
        }

        while (queue.size()>1) {
            for (int i = 1; i < childIndex; i ++) {
                queue.offer(queue.poll());
            }
            System.out.println("Removed " + queue.poll());
        }
        System.out.println("Last is "+queue.poll());
    }
}
