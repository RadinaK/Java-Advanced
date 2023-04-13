package P02ExerciseMultidimensionalArrays;

import java.util.Scanner;

public class P03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size=Integer.parseInt(scanner.nextLine());

        int [][] matrix=new int[size][size];
        fillMatrix(matrix, scanner);

        int sumPrimaryD=sumPrimaryDiagonal(matrix);
        int sumSecondaryD=sumSecondaryDiagonal(matrix);

        System.out.println(Math.abs(sumPrimaryD-sumSecondaryD));


    }

    private static int sumSecondaryDiagonal(int[][] matrix) {
        int sum=0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if(col==matrix.length-row-1){
                    sum+=matrix[row][col];
                }
            }
        }
        return sum;
    }

    private static int sumPrimaryDiagonal(int[][] matrix) {
        int sum=0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if(row==col){
                    sum+=matrix[row][col];
                }
            }
        }
        return sum;
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                matrix[row][col]=scanner.nextInt();
            }
        }
    }
}
