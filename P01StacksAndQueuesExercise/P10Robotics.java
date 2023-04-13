package P01StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class P10Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ROB-15;SS2-10;NX8000-3
        String inputRobots = scanner.nextLine();
        //["ROB-15", "SS2-10", "NX8000-3"]
        String[] dataRobots = inputRobots.split(";");

        //име -> за колко време приключва даден продукт
        LinkedHashMap<String, Integer> robots = getRobotsMap(dataRobots);

        String startTime = scanner.nextLine();
        int startTimeInSeconds = getStartTimeInSeconds(startTime);

        String inputLine = scanner.nextLine();
        ArrayDeque<String> productsQueue = getProductsQueue(scanner, inputLine);

        // име -> колко време работи върху даден продукт
        LinkedHashMap<String, Integer> robotsWorkingTime = getRobotsWorkingTime(dataRobots);

//        String workingTime = getWorkingTime(startTime);
        while(!productsQueue.isEmpty()){
            String currentProduct=productsQueue.poll();

        }


    }

//    private static String getWorkingTime(String startTime) {
//    }

    private static LinkedHashMap<String, Integer> getRobotsWorkingTime(String[] dataRobots) {
        LinkedHashMap<String, Integer> robotsWorkingTime = new LinkedHashMap<>();
        for (int i = 0; i < dataRobots.length; i++) {
            String robotData = dataRobots[i];
            String robotName = robotData.split("-")[0];
//            int processingTime = Integer.parseInt(robotData.split("-")[1]);

//        for (String robotData:dataRobots) {
//            String robotName=robotData.split("-")[0];
//        }
            robotsWorkingTime.put(robotName, 0);
        }
        return robotsWorkingTime;
    }

    private static int getStartTimeInSeconds(String startTime) {
        int hours = Integer.parseInt(startTime.split(":")[0]);
        int minutes = Integer.parseInt(startTime.split(":")[1]);
        int seconds = Integer.parseInt(startTime.split(":")[2]);
        int startTimeInSeconds = hours * 3600 + minutes * 60 + seconds;

        return startTimeInSeconds;
    }

    private static ArrayDeque<String> getProductsQueue(Scanner scanner, String inputLine) {
        ArrayDeque<String> productsQueue=new ArrayDeque<>();
        while (!inputLine.equals("End")) {
            productsQueue.offer(inputLine);

            inputLine = scanner.nextLine();
        }
        return productsQueue;
    }

    private static LinkedHashMap<String, Integer> getRobotsMap(String[] dataRobots) {
        LinkedHashMap<String, Integer> robots = new LinkedHashMap<>();
        for (int i = 0; i < dataRobots.length; i++) {
            String robotData = dataRobots[i];
            String robotName = robotData.split("-")[0];
            int processingTime = Integer.parseInt(robotData.split("-")[1]);

//        for (String robotData:dataRobots) {
//            String robotName=robotData.split("-")[0];
//        }
            robots.put(robotName, processingTime);
        }
        return robots;
    }
}
