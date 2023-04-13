package P02LabMultidimensionalArrays;

import java.util.Scanner;

public class P05MaximumSumOf2X2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] size = scanner.nextLine().split(",\\s+");
        int rows = Integer.parseInt(size[0]);
        int cols = Integer.parseInt(size[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] rowData = scanner.nextLine().split(",\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(rowData[col]);
            }
        }
        //sum
//        int max = Integer.MIN_VALUE;
        int sum = Integer.MIN_VALUE;
        int numRow1=0;
        int numRow2=0;
        int numCol1=0;
        int numCol2=0;

        int temp=Integer.MIN_VALUE;

        for (int row = 0; row < rows-1; row++) {
            for (int col = 0; col < cols-1; col++) {

                temp=matrix[row][col]+matrix[row][col+1]+matrix[row+1][col]+matrix[row+1][col+1];

                if(temp>sum){
                    sum=temp;
                    numCol1=matrix[row][col+1];
                    numCol2=matrix[row+1][col+1];

                    numRow1=matrix[row][col];
                    numRow2=matrix[row+1][col];
                }
            }
        }
        System.out.print(numRow1+" ");
        System.out.println(numCol1);
        System.out.print(numRow2+" ");
        System.out.println(numCol2);
        System.out.println(sum);
    }
}
