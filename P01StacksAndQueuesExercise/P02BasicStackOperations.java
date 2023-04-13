package P01StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P02BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int N = Integer.parseInt(input[0]);
        int S = Integer.parseInt(input[1]);
        int X = Integer.parseInt(input[2]);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int count = 0; count < N; count++) {
            stack.push(scanner.nextInt());
        }
        for (int count = 0; count < S; count++) {
            stack.pop();
        }
        if (stack.isEmpty()) {
            System.out.println("0");
        } else {
            if (stack.contains(X)) {
                System.out.println("true");
            } else {
                System.out.println(Collections.min(stack));
            }
        }


    }
}
