package P01StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();
        String[] inputLine=scanner.nextLine().split("\\s+");
        for (int i = 0; i < inputLine.length; i++) {
            stack.push(inputLine[i]);
        }
        for (String element:inputLine) {
            System.out.print(stack.poll()+" ");
        }
    }
}
