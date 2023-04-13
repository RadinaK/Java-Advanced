import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P02SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> vipGuests=new TreeSet<>();
        Set<String> regularGuests=new TreeSet<>();

        String input=scanner.nextLine();
        while (!input.equals("END")){
            if(!input.equals("PARTY")) {


                String guest = input;
                if (vipGuests.contains(guest)) {
                    vipGuests.remove(guest);
                } else if (regularGuests.contains(guest)) {
                    regularGuests.remove(guest);
                } else {
                    if (guest.charAt(0) == 0 || guest.charAt(0) == 1 || guest.charAt(0) == 2 ||
                            guest.charAt(0) == 3 || guest.charAt(0) == 4 || guest.charAt(0) == 5 ||
                            guest.charAt(0) == 6 || guest.charAt(0) == 7 || guest.charAt(0) == 8 || guest.charAt(0) == 9) {
                        vipGuests.add(guest);
                    } else regularGuests.add(guest);
                }
            }
            input = scanner.nextLine();

        }
        System.out.println(vipGuests.size()+regularGuests.size());
        for (String vips:vipGuests) {
            System.out.println(vips);
        }
        for (String regulars:regularGuests) {
            System.out.println(regulars);
        }
    }
}
