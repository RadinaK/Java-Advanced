package Z03Exam18_08_2022;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P01KAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String licencePlatesInput = scanner.nextLine();
        String carsInput = scanner.nextLine();

        ArrayDeque<Integer> licensePlates = new ArrayDeque<>();

        Arrays.stream(licencePlatesInput.split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(licensePlates::offer);
//
        ArrayDeque<Integer> cars = new ArrayDeque<>();
        Arrays.stream(carsInput.split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(cars::push);

//        Arrays.stream(licencePlatesInput.split(",\\s+"))
//                .mapToInt(Integer::parseInt)
//                .forEach(licensePlates::push);

//        ArrayDeque<Integer> cars = new ArrayDeque<>();
//        Arrays.stream(carsInput.split(",\\s+"))
//                .mapToInt(Integer::parseInt)
//                .forEach(cars::offer);

//        System.out.println(licensePlates.peek());
//        System.out.println(cars.peek());

        int countRegisteredCars = 0;
        int countDays = 0;
//        int countPlates = 0;


        while (!cars.isEmpty() && !licensePlates.isEmpty()) {
            countDays++;
//            if (cars.isEmpty() || licensePlates.isEmpty()) {
//                break;
//            }
            int plate = licensePlates.poll();
            int car = cars.pop();
//            int plate = licensePlates.pop();
//            int car = cars.poll();

            if (plate / 2 == car) {
                countRegisteredCars += car;
            } else if (plate * 2 < car) {
                int carCanLicense = plate / 2;
                countRegisteredCars += carCanLicense;

                int remainingCars = car - carCanLicense;

                cars.offer(remainingCars);
//                cars.push(remainingCars);
            } else if (car==plate) {
                int rest=car/2;
                cars.offer(rest);
                countRegisteredCars+=rest;
            }
//            else if (plate * 2 > car) {
            else if (plate * 2 > car) {
//                int platesCanLicence = plate * 2;
                int remain = car * 2;
                int remainingLicenses = plate - remain;
//                licensePlates.push(remainingLicenses);
                licensePlates.offer(remainingLicenses);

                countRegisteredCars += car;

            }

        }
        int remainingCars = 0;
        if (!cars.isEmpty()) {
            for (int car : cars) {
                remainingCars += car;
            }
        }
//        remainingCars+=remainingCars;

        int remainingPlates = 0;
        if (!licensePlates.isEmpty()) {
            for (int plate : licensePlates) {
                remainingPlates += plate;
            }
        }
//        remainingCars+=remainingPlates;

        if(!licensePlates.isEmpty()&&!cars.isEmpty()){
            if(remainingPlates/2==remainingCars){
                countRegisteredCars+=remainingCars;
            }else if(remainingCars==remainingPlates){
                int rest=remainingCars/2;
                countRegisteredCars+=rest;
            }else if(remainingPlates * 2 < remainingCars){
                int carCanLicense = remainingPlates / 2;
                countRegisteredCars+=carCanLicense;
            }else {
                countRegisteredCars+=remainingCars;
            }
        }

        System.out.printf("%d cars were registered for %d days!\n", countRegisteredCars, countDays);
        if (cars.isEmpty() && licensePlates.isEmpty()) {
            System.out.println("Good job! There is no queue in front of the KAT!");
        } else if (cars.isEmpty() && !licensePlates.isEmpty()) {
            System.out.printf("%d license plates remain!", remainingPlates);
        } else {
            System.out.printf("%d cars remain without license plates!", remainingCars);
        }

    }
}
