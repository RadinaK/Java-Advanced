package P03SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers= Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();
        Map<Double, Integer> occurrences=new LinkedHashMap<>();

        for (double num:numbers) {
            if (occurrences.containsKey(num)){
                int currentOccurrences= occurrences.get(num);
                currentOccurrences++;
                occurrences.put(num, currentOccurrences);
            }else {
                occurrences.put(num, 1);
            }
        }
        for (Double keys: occurrences.keySet()) {
            System.out.printf("%.1f -> %d%n", keys, occurrences.get(keys));
        }
    }
}
