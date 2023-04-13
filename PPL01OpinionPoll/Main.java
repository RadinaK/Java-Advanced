package PPL01OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Person person;
        List<Person> peopleList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            person = new Person(name, age);
            peopleList.add(person);
        }
        //филтрирай списъка -> само хората над 30
        peopleList = peopleList.stream().filter(p -> p.getAge() > 30).collect(Collectors.toList());

        //сортирам списъка по име на хората
        peopleList.sort(Comparator.comparing(p->p.getName()));

        for (Person p:peopleList) {
            System.out.println(p);
        }
    }
}
