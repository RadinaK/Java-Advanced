package P01StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class P02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();

//        Collections.addAll(stack, tokens);
        for (int i = tokens.length-1; i >=0 ; i--) {
            stack.push(tokens[i]);
        }

        while (stack.size()>1){
            int first=Integer.parseInt(stack.pop());
            String operand=stack.pop();
            int second=Integer.parseInt(stack.pop());

            switch (operand){
                case "+": stack.push(String.valueOf(first+second));
                    break;
                case "-":stack.push(String.valueOf(first-second));
                    break;
            }
        }
        System.out.println(stack.pop());


//        for (int i = 0; i < tokens.length; i++) {
//            String token = tokens[i];
//            if (Character.isDigit(token.charAt(0))) {
//                calculator.push(Integer.valueOf(token));
//            } else {
//                int leftOperand = calculator.peek();
//                int rightOperand = Integer.parseInt(tokens[++i]);
//                calculator.push(rightOperand);
//
//                int result = token.equals("+")
//                        ? leftOperand + rightOperand
//                        : leftOperand - rightOperand;
//
//                calculator.push(result);
//            }
//        }
//        System.out.println(calculator.peek());
    }
}
