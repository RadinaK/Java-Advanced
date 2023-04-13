package Z03Exam18_08_2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P02TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] size = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(size[0]);
        int cols = Integer.parseInt(size[1]);
        char[][] map = new char[rows][cols];

//        String[] line = scanner.nextLine().split("\\s+");

        for (int r = 0; r < rows; r++) {
            map[r] = scanner.nextLine().replaceAll(" ", "").toCharArray();
        }

        int currentRow = -1;
        int currentCol = -1;
        int trRow = -1;
        int trCol = -1;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (map[r][c] == 'Y') {
                    currentRow = r;
                    currentCol = c;
                }
                if (map[r][c] == 'X') {
                    trRow = r;
                    trCol = c;
                }
            }
        }
        String command = scanner.nextLine();
        List<String> rightPath = new ArrayList<>();

        while (!command.equals("Finish")) {
            int oldRow = currentRow;
            int oldCol = currentCol;

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

            if (currentRow > rows - 1 || currentCol > cols - 1 || currentRow < 0 || currentCol < 0) {
                currentRow = oldRow;
                currentCol = oldCol;
            } else if (map[currentRow][currentCol] == 'T') {
                currentRow = oldRow;
                currentCol = oldCol;
            } else if (map[currentRow][currentCol] == '-') {
                map[oldRow][oldCol] = '-';
                map[currentRow][currentCol] = 'Y';
                rightPath.add(command);
            } else if (currentRow == trRow && currentCol == trCol) {
                System.out.println("I've found the treasure!");
                rightPath.add(command);
                break;
            }

            command = scanner.nextLine();
//            if(command.equals("Finish")){
//                break;
//            }
        }

        if (map[currentRow][currentCol] == 'X') {
            System.out.print("The right path is ");
            for (int i = 0; i < rightPath.size() - 1; i++) {
                System.out.print(rightPath.get(i) + ", ");
            }
            System.out.print(rightPath.get(rightPath.size() - 1));
        } else {
            System.out.println("The map is fake!");
        }
    }
}
