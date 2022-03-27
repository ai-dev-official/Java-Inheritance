package ex2printmethod;

public class SavingsAccount extends BankAccount {
    private double interestRate; // %

    public SavingsAccount(double rate, double balance)
    {
        super(balance);
        interestRate = rate;
    }

    public void addInterest()
    {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }
    public void print()
    {
        super.print();
        System.out.println("Interest Rate : " + interestRate);
    }
}
