package P03SetsAndMapsAdvanced;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P05AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<Double>> students=new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input=scanner.nextLine().split("\\s+");
            String name=input[0];
            double grade=Double.parseDouble(input[1]);

            students.putIfAbsent(name, new ArrayList<>());
            students.get(name).add(grade);
        }

        students.entrySet()
                .stream()
                .forEach(s->{
                    double sum=0;
                    for (int i = 0; i < s.getValue().size(); i++) {
                        sum+=s.getValue().get(i);
                    }
                    double average=sum/s.getValue().size();

                    System.out.print(s.getKey()+" -> ");
                    s.getValue().forEach(entry-> System.out.printf("%.2f ", entry));
                    System.out.printf("(avg: %.2f)", average);
                    System.out.println();
                });
    }
}
