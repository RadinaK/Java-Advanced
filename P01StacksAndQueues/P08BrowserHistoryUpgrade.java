package P01StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P08BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String page = scanner.nextLine();
        ArrayDeque<String> browserHistory=new ArrayDeque<>();
        ArrayDeque<String> forwardHistory=new ArrayDeque<>();

//        String currentPage=null;

        while (!page.equals("Home")){
            if (page.equals("back")){
                if(browserHistory.size()<2){
                    System.out.println("no previous URLs");
                }else {
                    forwardHistory.addFirst(browserHistory.peek());
                    browserHistory.pop();
                    System.out.println(browserHistory.peek());
//                    currentPage=browserHistory.pop();
                }
            }else if(page.equals("forward")){
                if (forwardHistory.size()<1){
                    System.out.println("no next URLs");
                }else {
//                    currentPage=forwardHistory.peek();
                    System.out.println(forwardHistory.peek());
                    browserHistory.push(forwardHistory.pop());
                }
            }else {
                System.out.println(page);
                browserHistory.push(page);
                forwardHistory.clear();
//                if (currentPage != null) {
//                    browserHistory.push(currentPage);
//                }
//                currentPage = page;
            }

            page= scanner.nextLine();
        }
    }
}
