package PP01CarInfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            Car car = new Car(scanner.nextLine().split("\\s+"));
            System.out.printf("The car is: %s %s - %d HP.\n", car.getBrand(), car.getModel(), car.getHorsePower());
        }






    }
}
