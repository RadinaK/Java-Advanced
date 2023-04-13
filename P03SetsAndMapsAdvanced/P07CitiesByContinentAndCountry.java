package P03SetsAndMapsAdvanced;

import java.util.*;

public class P07CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, ArrayList<String>>> continentsMap=new TreeMap<>();

        for (int i = 0; i < n; i++) {
            //Europe Bulgaria Sofia
            String[] input=scanner.nextLine().split("\\s+");
            String continent=input[0];
            String country=input[1];
            String city=input[2];

            continentsMap.putIfAbsent(continent, new LinkedHashMap<>());
            Map<String, ArrayList<String>> countryMap=continentsMap.get(continent);
            countryMap.putIfAbsent(country, new ArrayList<>());
//            countryMap.get(country).add(city);
            List<String> citiesList=countryMap.get(country);
            citiesList.add(city);
        }
//        Europe:
//        Bulgaria -> Sofia, Plovdiv
//        Poland -> Warsaw, Poznan
//        Germany -> Berlin

        continentsMap.forEach((continent, countryMap)->{
            System.out.println(continent+":");

            countryMap.forEach((country, citiesList)->{
                System.out.println(country+" -> "+String.join(", "+citiesList));
            });
        });

//        for (String continent:continentsMap.keySet()) {
//            System.out.println(continent+":");
//            for (var country:continentsMap.keySet()) {
//                System.out.printf("%s -> ", country);
//                for (var city:cou
//                     ) {
//
//                }
//            }
//        }
    }
}
