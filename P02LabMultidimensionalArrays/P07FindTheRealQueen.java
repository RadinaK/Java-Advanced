//package P02LabMultidimensionalArrays;
//
//import java.util.Scanner;
//
//public class P07FindTheRealQueen {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String[][] matrix=new String[8][8];
//        for (int row = 0; row < 8; row++) {
//            String[] rowData=scanner.nextLine().split("\\s+");
//            for (int col = 0; col < 8; col++) {
//                matrix[row][col]=rowData[col];
//            }
//        }
//
//        char queen='q';
//        boolean isRealQueen=false;
//        //8 checks 2 4 8 6    1 7 3 9
//        for (int row = 0; row < 8; row++) {
//            for (int col = 0; col < 8; col++) {
//                if (matrix[row][col].equals(queen)){
//                    if(row==0&&col==0){
//                        //2 6 3
//                        for (int j = 0; j < 7; j++) {
//                            if(matrix[0][j].equals(queen)){
//                                break;
//                            }
//
//                        }
//
//                    }
//                    else if (col==0){
//                        //2 8 6 9 3
//                    }
//                    else if (row==0){
//                        //2 4 6 1 3
//                    }
//                    else if(row==0&&col==7){
//                        //2 4 1
//                    }
//                    else if(row==7&&col==0){
//                        //8 6 9
//                    }
//                    else if(col==7){
//                        //2 4 8 1 7
//                    }
//                    else if(row==7){
//                        //4 8 6 7 9
//                    }
//                    else if(row==7&&col==7){
//                        //4 7 8
//                    }
//                }
//            }
//        }
//    }
//}
