package P02ExerciseMultidimensionalArrays;

import java.util.Scanner;

public class P04MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] size = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(size[0]);
        int cols = Integer.parseInt(size[1]);

        int[][] matrix = new int[rows][cols];

        fillMatrix(matrix, scanner, rows, cols);

        int sum = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;
        int startRow=0;
        int startCol=0;

        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {

                sum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2]
                        + matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];

                if (sum > maxSum) {
                    maxSum = sum;
                    startRow=row;
                    startCol=col;
                }
            }
        }

        System.out.println("Sum = " + maxSum);

        for (int row = startRow; row <= startRow+2; row++) {
            for (int col = startCol; col <= startCol+2; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }



    private static void fillMatrix(int[][] matrix, Scanner scanner, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
    }
}
