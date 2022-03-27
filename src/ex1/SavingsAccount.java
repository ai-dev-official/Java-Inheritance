package ex1;

public class SavingsAccount extends BankAccount {
    private double interestRate; // %

    public SavingsAccount(double rate, double balance)
    {
        interestRate = rate;
    }

    public void addInterest()
    {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }
}
