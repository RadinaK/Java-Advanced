package P02ExerciseMultidimensionalArrays;

import java.util.Scanner;

public class P05MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] size = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(size[0]);
        int cols = Integer.parseInt(size[1]);

        String[][] matrix = new String[rows][cols];

        fillMatrix(matrix, scanner, rows, cols);
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            if (validateCommand(input, rows, cols)) {
                String[] coordinates = input.split("\\s+");
                int row1 = Integer.parseInt(coordinates[1]);
                int col1 = Integer.parseInt(coordinates[2]);
                int row2 = Integer.parseInt(coordinates[3]);
                int col2 = Integer.parseInt(coordinates[4]);

                String firstNum=matrix[row1][col1];
                String secondNum=matrix[row2][col2];


                matrix[row1][col1] = secondNum;
                matrix[row2][col2] = firstNum;

                printMatrix(matrix, rows, cols);
            } else System.out.println("Invalid input!");
            input = scanner.nextLine();
        }
    }

    private static void printMatrix(String[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }


    private static void fillMatrix(String[][] matrix, Scanner scanner, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            String[] rowData=scanner.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row] = rowData;
            }
        }
    }

    private static boolean validateCommand(String input, int rows, int cols) {
        String[] command = input.split("\\s+");
        if (command.length != 5) {
            return false;
        }
        if (!command[0].equals("swap")) {
            return false;
        }
        int row1 = Integer.parseInt(command[1]);
        int col1 = Integer.parseInt(command[2]);
        int row2 = Integer.parseInt(command[3]);
        int col2 = Integer.parseInt(command[4]);
        if (row1 < 0 || row1 >= rows || col1 < 0 || col1 >= cols || row2 < 0 || row2 >= rows || col2 < 0 || col2 >= cols) {
            return false;
        }

        return true;

    }
}
