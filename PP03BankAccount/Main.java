package PP03BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        BankAccount account;
        Map<Integer, BankAccount> bankAccounts = new HashMap<>();
        while (!command.equals("END")) {
            String[] tokens = command.split("\\s+");
            switch (tokens[0]) {
                case "Create":
                    account = new BankAccount();
                    bankAccounts.put(account.getId(), account);
                    System.out.println("Account ID" + account.getId() + " created");
                    break;
                case "Deposit":
                    int id = Integer.parseInt(tokens[1]);
                    int amount = Integer.parseInt(tokens[2]);
                    if (!bankAccounts.containsKey(id)) {
                        System.out.println("Account does not exist");
                    } else {
                        bankAccounts.get(id).deposit(amount);
                        System.out.printf("Deposited %d to ID%d\n", amount, id);
                    }
                    break;
                case "SetInterest":
                    double interest = Double.parseDouble(tokens[1]);
                    BankAccount.setInterestRate(interest);
                    break;
                case "GetInterest":
                    int id1 = Integer.parseInt(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);
                    if (!bankAccounts.containsKey(id1)) {
                        System.out.println("Account does not exist");
                    } else {
                        double getInterest = bankAccounts.get(id1).getInterest(years);
                        System.out.printf("%.2f\n", getInterest);
                    }
                    break;
            }
            command=scanner.nextLine();
        }
    }
}
