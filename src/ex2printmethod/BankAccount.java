package ex2printmethod;

public class BankAccount {
    protected double balance;      //  inherited

    // default constructor
    public BankAccount() {
        balance = 0;
    }
    // constructor
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }
    // methods
    public void deposit(double amount) {
        balance = balance + amount;
    }
    public void withdraw(double amount) {
        balance = balance - amount;
    }
    // get method
    public double getBalance() {
        return balance;
    }
    public void print()
    {
        System.out.println("Balance : " + balance);
    }
}
