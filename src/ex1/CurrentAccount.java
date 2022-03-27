package ex1;

public class CurrentAccount extends BankAccount {
    private int transactionCount;

    public CurrentAccount(double initbal) {
        super(initbal);
        transactionCount = 0;
        System.out.println("\t\tIn currentAccount constructor");
    }

    public void deposit(double amount) {
        //need to call super class's deposit method,
        //to distinguish from this class's deposit() prefix with super.
        super.deposit(amount);
        transactionCount++;
    }
}
