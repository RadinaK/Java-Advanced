package PP02Constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        List<Car> carList=new ArrayList<>();
        while (number-- > 0) {
            Car car;
            String[] input = scanner.nextLine().split("\\s+");
            if (input.length == 1) {
                car = new Car(input[0]);
            } else {
                car = new Car(input[0], input[1],
                        Integer.parseInt(input[2]));
            }
            carList.add(car);
        }
        for (Car car:carList) {
            System.out.print(car.toString());
        }

    }
}
