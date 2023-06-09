package P03SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<Integer> firstPlayer = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        LinkedHashSet<Integer> secondPlayer = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        for (int round = 0; round < 50; round++) {
            if (firstPlayer.isEmpty()) {
                System.out.println("Second player win!");
                break;
            } else if (secondPlayer.isEmpty()) {
                System.out.println("First player win!");
                break;
            }
            int firstPlayerCard = firstPlayer.iterator().next();
            int secondPlayerCard = secondPlayer.iterator().next();

            firstPlayer.remove(firstPlayerCard);
            secondPlayer.remove(secondPlayerCard);

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayer.add(firstPlayerCard);
                firstPlayer.add(secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                secondPlayer.add(firstPlayerCard);
                secondPlayer.add(secondPlayerCard);
            }
        }
        int firstPlayerSize= firstPlayer.size();
        int secondPlayerSize= secondPlayer.size();

        if(firstPlayerSize>secondPlayerSize){
            System.out.println("First player win!");
        }else System.out.println("Second player win!");
    }
}
