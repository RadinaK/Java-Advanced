package Z02ExamPreparationDEsi;

import java.util.Scanner;

public class CookingJourney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[n][n];

        for (int r = 0; r < n; r++) {
            String inputLine = scanner.nextLine();
            for (int c = 0; c < n; c++) {
                matrix[r][c] = inputLine.charAt(c);
            }
        }

        int currentRow = -1;
        int currentCol = -1;

        int firstPillRow = -1;
        int firstPillCol = -1;

        int secondPillRow = -1;
        int secondPillCol = -1;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (matrix[r][c] == 'S') {
                    currentRow = r;
                    currentCol = c;
                } else if (matrix[r][c] == 'P' && firstPillRow == -1 && firstPillCol == -1) {
                    firstPillRow = r;
                    firstPillCol = c;
                } else if (matrix[r][c] == 'P' && firstPillRow != -1 && firstPillCol != -1) {
                    secondPillRow = r;
                    secondPillCol = c;
                }
            }
        }

        int money = 0;

        while (money <= 50) {
            int oldRow = currentRow;
            int oldCol = currentCol;
            String command = scanner.nextLine();
            switch (command) {
                case "up":
                    currentRow--;
                    break;
                case "down":
                    currentRow++;
                    break;
                case "left":
                    currentCol--;
                    break;
                case "right":
                    currentCol++;
                    break;
            }
            if (currentRow > n - 1 || currentCol > n - 1 || currentRow < 0 || currentCol < 0) {
                matrix[oldRow][oldCol] = '-';
                break;
            }

            if (currentRow == firstPillRow && currentCol == firstPillCol) {
                matrix[oldRow][oldCol] = '-';
                matrix[currentRow][currentCol] = '-';
                matrix[secondPillRow][secondPillCol] = 'S';
                currentRow = secondPillRow;
                currentCol = secondPillCol;
            } else if (currentRow == secondPillRow && currentCol == secondPillCol) {
                matrix[oldRow][oldCol] = '-';
                matrix[currentRow][currentCol] = '-';
                matrix[firstPillRow][firstPillCol] = 'S';
                currentRow = firstPillRow;
                currentCol = firstPillCol;
            } else if (matrix[currentRow][currentCol] == '-') {
                matrix[oldRow][oldCol] = '-';
                matrix[currentRow][currentCol] = 'S';
            } else {
                money += Integer.parseInt(String.valueOf(matrix[currentRow][currentCol]));
                matrix[oldRow][oldCol] = '-';
                matrix[currentRow][currentCol] = 'S';
            }
        }

        if (money < 50) {
            System.out.println("Bad news! You are out of the pastry shop.");
        } else {
            System.out.println("Good news! You succeeded in collecting enough money!");
        }

        System.out.printf("Money: %d%n", money);

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }
    }
}
