package P02LabMultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P01CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstMatrixSize = scanner.nextLine().split("\\s+");
        int firstMatrixRows = Integer.parseInt(firstMatrixSize[0]);
        int firstMatrixCols = Integer.parseInt(firstMatrixSize[1]);

        int[][] firstMatrix = new int[firstMatrixRows][firstMatrixCols];


        //read 1st matrix
        for (int row = 0; row < firstMatrixRows; row++) {
    /*        int[] rowData = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            firstMatrix[row] = rowData;

     */
            String[] rowData = scanner.nextLine().split("\\s+");
            for (int col = 0; col < firstMatrixCols; col++) {
                firstMatrix[row][col] = Integer.parseInt(rowData[col]);
            }
        }

        //read 2nd matrix
        String[] secondMatrixSize = scanner.nextLine().split("\\s+");
        int secondMatrixRows = Integer.parseInt(secondMatrixSize[0]);
        int secondMatrixCols = Integer.parseInt(secondMatrixSize[1]);

        int[][] secondMatrix = new int[secondMatrixRows][secondMatrixCols];

        if (firstMatrixRows != secondMatrixRows || firstMatrixCols != secondMatrixCols) {
            System.out.println("not equal");
            return;
        }

        for (int row = 0; row < firstMatrixRows; row++) {
    /*        int[] rowData = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            firstMatrix[row] = rowData;

     */
            int[] rowData = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            secondMatrix[row] = rowData;
        }


        for (int row = 0; row < firstMatrixRows; row++) {
            for (int col = 0; col < firstMatrixCols; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]) {

                    System.out.println("not equal");
                    return;
                }
            }
        }
        System.out.println("equal");
    }
}
