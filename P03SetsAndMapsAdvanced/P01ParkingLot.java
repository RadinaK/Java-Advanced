package P03SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> parkingLot = new LinkedHashSet<>();
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String command = input.split(", ")[0];
            String carNum = input.split(", ")[1];

            if(command.equals("IN")){
                parkingLot.add(carNum);
            } else if (command.equals("OUT")) {
                if (parkingLot.contains(carNum)){
                    parkingLot.remove(carNum);
                }
            }

            input=scanner.nextLine();
        }

        if(parkingLot.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            for (String car :parkingLot) {
                System.out.println(car);
            }
        }
    }
}
