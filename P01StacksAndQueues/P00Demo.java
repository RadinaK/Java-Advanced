package P01StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P00Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int[] numbers=new int[32];
//        System.out.println(numbers.length*Integer.BYTES);


        //как да извикаме List
        List<Integer> collect = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //как да извикаме Queue
        ArrayDeque<Integer> queue = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));
        //
        ArrayDeque<Integer> queue2 = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .forEach(e -> queue2.offer(e));

        //как да извикаме Stack
        ArrayDeque<Integer> stack = new ArrayDeque<>();
                Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .forEach(e -> stack.push(e));
    }
}
