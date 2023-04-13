package P01StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P07SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder stringBuilder = new StringBuilder();
        ArrayDeque<String> stackText = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String command = input[0];
            switch (command) {
                case "1":
                    stackText.push(stringBuilder.toString());
                    String stringToAppend = input[1];
                    stringBuilder.append(stringToAppend);
                    break;

                case "2":
                    stackText.push(stringBuilder.toString());
                    int count = Integer.parseInt(input[1]);
                    int startIndexForDelete = stringBuilder.length() - count;
                    stringBuilder.delete(startIndexForDelete, stringBuilder.length());
                    break;

                case "3":
                    int position = Integer.parseInt(input[1]);
                    System.out.println(stringBuilder.charAt(position-1));
                    break;

                case "4":
                    if (!stackText.isEmpty()) {
                        stringBuilder = new StringBuilder(stackText.pop());
                    }
                    break;
            }

        }
    }
}
