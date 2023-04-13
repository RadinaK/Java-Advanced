//package RegularExam;
//
//import java.util.ArrayDeque;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class P01FoodFinder {
//
////    public static final String PEAR ="pear";
////    public static final String FLOUR ="flour";
////    public static final String PORK ="pork";
////    public static final String OLIVE ="olive";
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String vowelsInput= scanner.nextLine();
//        String consonantsInput= scanner.nextLine();
//
//        ArrayDeque<String> vowelsQueue =new ArrayDeque<>();
//        ArrayDeque<String> consonantsStack =new ArrayDeque<>();
//
//        Arrays.stream(vowelsInput.split("\\s+")).forEach(vowelsQueue::offer);
//        Arrays.stream(vowelsInput.split("\\s+")).forEach(consonantsStack::push);
//
//        StringBuilder pear =new StringBuilder("pear");
//        StringBuilder flour =new StringBuilder("flour");
//        StringBuilder pork =new StringBuilder("pork");
//        StringBuilder olive =new StringBuilder("olive");
//
//
//        while (!consonantsStack.isEmpty()){
//            String currentVowel=vowelsQueue.poll();
//            String currentConstant=consonantsStack.pop();
//
//            if(currentVowel.equals("a")){
//                pear.deleteCharAt(2);
//            }else if(currentVowel.equals("e")){
//                pear.deleteCharAt(1);
//                olive.deleteCharAt(4);
//            }else if(currentVowel.equals("o")){
//                flour.deleteCharAt(2);
//                pork.deleteCharAt(1);
//                olive.deleteCharAt(0);
//            }
//
//            vowelsQueue.offer(currentVowel);
//
//
//        }
//    }
//}
