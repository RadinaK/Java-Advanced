package P01StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Character>stack=new ArrayDeque<>();

        Boolean areBalanced=false;

        String inputLine= scanner.nextLine();
        for (int i = 0; i < inputLine.length(); i++) {
            char currentBracket=inputLine.charAt(i);
            if (currentBracket=='{'||currentBracket=='['||currentBracket=='('){
                stack.push(currentBracket);
            }else if (currentBracket=='}'||currentBracket==']'||currentBracket==')'){
                if (stack.isEmpty()) {
                    areBalanced=false;
                    break;
                }
                char lastOpenBracket=stack.pop();
                if (lastOpenBracket=='{'&&currentBracket=='}'){
                    areBalanced=true;
                }else if (lastOpenBracket=='['&&currentBracket==']'){
                    areBalanced=true;
                }else if (lastOpenBracket=='('&&currentBracket==')'){
                    areBalanced=true;
                }else {
                    areBalanced=false;
                    break;
                }
            }
        }
        if (areBalanced){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
