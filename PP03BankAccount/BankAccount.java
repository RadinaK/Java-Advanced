package PP03BankAccount;

public class BankAccount {
    private static double interestRate = 0.02;
    private static int nextId = 1;
    private int id;
    private double balance;

    public BankAccount() {
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return this.id;
    }

    public static void setInterestRate(double interest) {
        interestRate = interest;
    }

    public double getInterest(int years) {
        return interestRate * years * balance;

    }

    public double deposit(double amount) {
        return this.balance += amount;
    }


}
