package Z01ExamPreparation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01MagicBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> queue = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(stack::push);

        int totalSum = 0;

        while (queue.size() > 0 && stack.size() > 0) {
            int firstNum = queue.peek();
            int secondNum = stack.pop();
            int sum = firstNum + secondNum;

            if (sum % 2 == 0) {
                totalSum += sum;
                queue.poll();
            } else {
                queue.offer(secondNum);
            }
        }

        if (queue.isEmpty()) {
            System.out.println("First magic box is empty.");
        } else {
            System.out.println("Second magic box is empty.");
        }

        if (totalSum >= 90) {
            System.out.printf("Wow, your prey was epic! Value: %d%n", totalSum);
        } else {
            System.out.printf("Poor prey... Value: %d", totalSum);
        }

    }
}
