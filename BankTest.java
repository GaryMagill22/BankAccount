
public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts

        // creating new instance of BankAccount 
        BankAccount personalAccount = new BankAccount(300.50, 400.50);

        BankAccount businessAccount = new BankAccount(0.00, 450.00);

        BankAccount jointAccount = new BankAccount(200.00, 0.00);

        // Deposit Test

        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        System.out.println("-------Developer Test-------");
        personalAccount.deposit(100.00, "savingsBalance");
        personalAccount.deposit(50.00, "checkingBalance");

        businessAccount.deposit(100.00, "savingsBalance");

        jointAccount.deposit(500.00, "checkingBalance");

        

        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        personalAccount.withdraw(50, "savingsBalance");
        businessAccount.withdraw(600.00, "savingsBalance");
        jointAccount.withdraw(100.50, "checkingBalance");





        // Static Test (print the number of bank accounts and the totalMoney)
    System.out.println(personalAccount.accounts)
    System.out.println(personalAccount.totalMoney)


    System.out.println(businessAccount.accounts)
    System.out.println(businessAccount.totalMoney)


    System.out.println(jointAccount.accounts)
    System.out.println(jointAccount.totalMoney)







    }
}
