/*
        Bank Account Class
    Create a BankAccount class with fields for accountNumber, balance, and accountHolderName.
    Include methods for deposit, withdraw, and checking the balance.
    Make sure the withdraw method doesn’t allow withdrawal beyond the balance.
 */
package OOP;

public class bankDemo {

    public static void main(String[] args) {

        String name = "Gabriel dos Reis";
        String accountNum = "12345678";
        double balance = 500.67;

        BankAccount account = new BankAccount(accountNum, balance, name);
        System.out.println(account);

        account.deposit(256.97);
        System.out.printf("%.2f%n", account.balance);

        account.withdraw(300);
        System.out.printf("%.2f%n", account.balance);

        System.out.println(account);

    }
}
