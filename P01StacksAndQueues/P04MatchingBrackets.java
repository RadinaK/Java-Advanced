package P01StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P04MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tokens = scanner.nextLine();

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < tokens.length(); i++) {
            char currentSymbol = tokens.charAt(i);
            if (currentSymbol == '(') {
                stack.push(i);
            } else if (currentSymbol == ')') {
                String substring = tokens.substring(stack.peek(), i+1);
                System.out.println(substring);
                stack.pop();

            }
        }
    }
}
