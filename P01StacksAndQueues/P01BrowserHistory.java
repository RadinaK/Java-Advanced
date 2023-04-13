package P01StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String page = scanner.nextLine();
        ArrayDeque<String> browser = new ArrayDeque<>();

        String currentPage = null;

        while (!page.equals("Home")) {
            if (page.equals("back")) {
                if (browser.isEmpty()) {
                    System.out.println("no previous URLs");
                    page = scanner.nextLine();
                    continue;
                } else {
                    currentPage = browser.pop();
                }
            } else {
                if (currentPage != null) {
                    browser.push(currentPage);
                }
                    currentPage = page;
            }
            System.out.println(currentPage);
            page = scanner.nextLine();
        }
    }
}
