//package P02LabMultidimensionalArrays;
//
//import java.util.Scanner;
//
//public class P08WrongMeasurements {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int rows = Integer.parseInt(scanner.nextLine());
//        int cols = rows;
//        int[][] matrix = new int[rows][cols];
//        for (int row = 0; row < rows; row++) {
//            String[] rowData = scanner.nextLine().split("\\s+");
//            for (int col = 0; col < cols; col++) {
//                matrix[row][col] = Integer.parseInt(rowData[col]);
//            }
//        }
//        String[] location = scanner.nextLine().split("\\s+");
//        int wrongRow = Integer.parseInt(location[0]);
//        int wrongCol = Integer.parseInt(location[1]);
//
//        int num=matrix[wrongRow][wrongCol];
//        for (int row = 0; row < rows; row++) {
//
//        }
//    }
//}
