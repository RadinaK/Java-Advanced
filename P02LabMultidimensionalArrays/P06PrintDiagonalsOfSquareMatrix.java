package P02LabMultidimensionalArrays;

import java.util.Scanner;

public class P06PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = rows;

        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] rowData = scanner.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(rowData[col]);
            }
        }
        //first diagonal
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (row == col) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
        System.out.println();
        //second diagonal
        int maxCol = 0;
        int minRow = rows - 1;
        for (int row = rows-1; row >= 0; row--) {
            for (int col = 0; col < cols; col++) {
                if (col == maxCol && row == minRow) {
                    System.out.print(matrix[row][col] + " ");
                    maxCol++;
                    minRow--;
                }
            }
        }
    }
}

