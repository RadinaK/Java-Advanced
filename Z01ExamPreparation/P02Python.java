package Z01ExamPreparation;

import java.util.Scanner;

public class P02Python {
    static int food = 0;
    static int pRow;
    static int pCol;
    static int length = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[size][size];
        String[] commands = scanner.nextLine().split(", ");

        for (int r = 0; r < size; r++) {
            String line = scanner.nextLine().replaceAll("\\s+", "");
            matrix[r] = line.toCharArray();

            if (line.contains("s")) {
                pRow = r;
                pCol = line.indexOf('s');
            }

            for (char c : matrix[r]) {
                if (c == 'f') {
                    food++;
                }
            }
        }

        for (int i = 0; i < commands.length; i++) {
            String command = commands[i];

            if ("up".equals(command)) {
                movePython(matrix, pRow - 1, pCol);
            } else if ("down".equals(command)) {
                movePython(matrix, pRow + 1, pCol);
            } else if ("left".equals(command)) {
                movePython(matrix, pRow, pCol - 1);
            } else if ("right".equals(command)) {
                movePython(matrix, pRow, pCol + 1);
            }

            if (food == 0 || length == -1) {
                break;
            }
        }

        if (length != -1 && food > 0) {
            System.out.printf("You lose! There is still %s food to be eaten.", food);
        } else if (food == 0) {
            System.out.printf("You win! Final python length is %d", length);
        } else {
            System.out.println("You lose! Killed by an enemy!");
        }

    }

    private static void movePython(char[][] matrix, int newRow, int newCol) {
        if (isOutOfBounds(matrix, newRow, newCol)) {
            int[] indexes = turnPythonSide(pRow, pCol, matrix);
            newRow = indexes[0];
            newCol = indexes[1];
        }

        if (matrix[newRow][newCol] == 'e') {
            length = -1;
        } else if (matrix[newRow][newCol] == 'f') {
            food--;
            length++;
        }

        pRow = newRow;
        pCol = newCol;
    }

    private static int[] turnPythonSide(int r, int c, char[][] matrix) {
        int[] result = new int[2];
        if (r < 0) {
            result[0] = matrix.length - 1;
            result[1] = c;
        } else if (r >= matrix.length) {
            result[0] = 0;
            result[1] = c;
        } else if (c < 0) {
            result[0] = r;
            result[1] = matrix.length - 1;
        } else {
            result[0] = r;
            result[1] = 0;
        }

        return result;
    }

    private static boolean isOutOfBounds(char[][] matrix, int r, int c) {
        return r < 0 || r >= matrix.length || c < 0 || c >= matrix[r].length;
    }
}
