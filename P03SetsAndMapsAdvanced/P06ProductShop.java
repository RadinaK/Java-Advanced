package P03SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P06ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //lidl, peach, 1.20
        String input=scanner.nextLine();

        Map<String, Map<String, Double>> marketWithThings=new TreeMap<>();

        while (!input.equals("Revision")){
            String market=input.split(",\\s+")[0];
            String product=input.split(",\\s+")[1];
            double price=Double.parseDouble(input.split(",\\s+")[2]);

            if (!marketWithThings.containsKey(market)) {
                marketWithThings.put(market, new LinkedHashMap<>());
            }
            Map<String, Double> productsWithPrices=marketWithThings.get(market);
            productsWithPrices.put(product, price);

            input=scanner.nextLine();
        }
        for (String market:marketWithThings.keySet()) {
            System.out.println(market+"->");
            for (var entry:marketWithThings.get(market).entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", entry.getKey(), entry.getValue());
            }
        }
    }
}
