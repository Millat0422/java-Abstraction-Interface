
package bankaccount0;

abstract class BankAccount {
    protected double balance;

  
    public BankAccount(double balance) {
        this.balance = balance;
    }


    abstract void deposit(double amount);
    abstract void withdraw(double amount);


    public void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}


class SavingsAccount extends BankAccount {
    private double interestRate = 0.03; 

    public SavingsAccount(double balance) {
        super(balance);
    }


    void deposit(double amount) {
        balance += amount;
        balance += balance * interestRate; 
        System.out.println("Deposited " + amount + " with interest added.");
    }


    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}


class CurrentAccount extends BankAccount {
    private double overdraftLimit = 5000;

    public CurrentAccount(double balance) {
        super(balance);
    }


    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }


    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}


public class bank {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount(1000);
        savings.deposit(500);
        savings.withdraw(200);
        savings.showBalance();

        System.out.println();


        CurrentAccount current = new CurrentAccount(2000);
        current.deposit(1000);
        current.withdraw(3500);
        current.showBalance();
    }
}
