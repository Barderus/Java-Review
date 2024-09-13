/*
        Bank Account Class
    Create a BankAccount class with fields for accountNumber, balance, and accountHolderName.
    Include methods for deposit, withdraw, and checking the balance.
    Make sure the withdraw method doesn’t allow withdrawal beyond the balance.
 */
package OOP;

public class BankAccount {
    String accountNumber;
    double balance;
    String accountHolderName;

    public BankAccount(String accountNumber, double balance, String accountHolderName){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public void deposit(double money){
        this.balance += money;

    }

    public void withdraw(double money){
        this.balance -= money;
    }

    public double checkBalance(){
        return this.balance;

    }

    @Override
    public String toString(){
        return "\nAccount number: " + accountNumber +
                "\nAccount owner: " + accountHolderName +
                "\nBalance: $" + balance + "\n";
    }

}
