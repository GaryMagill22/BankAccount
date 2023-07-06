import java.util.*;

    class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances
    

    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        totalMoney += checkingBalance + savingsBalance;
        accounts++;
    }


    // GETTERS & SETTERS
    // for checking, savings, accounts, and totalMoney

// CheckingBalance Setter
public void setCheckingBalance(int balance) {
    this.checkingBalance = balance;
}
    // CheckingBalance Getter
    public double getCheckingBalance() {
        return this.checkingBalance;
    }


// savingsBalance Setter
public void setSavingsBalance(int balance) {
    this.savingsBalance = balance;
}

// savingsBalance Getter
public double getSavingsBalance() {
    return this.savingsBalance;
}

// accounts Setter
public void setAccounts(int number) {
    this.accounts = number;
}

// accounts Getter
public int getAccounts() {
    return this.accounts;
}

// TotalMoney Setter
public void setTotalMoney(int money) {
this.totalMoney = money;
}

// TotalMoney Getter
public double getTotalMoney() {
    return this.totalMoney;
}




    // METHODS ==============================================


    // deposit
    // - Deposit Method -  into their checking or savings  
    // - all deposits and withdrawals should affect totalMoney
    // getBalance
    // - display total balance for checking and savings of a particular bank account
public void deposit(double amount, String accountType ){
    if (accountType.equalsIgnoreCase("checkingBalance")) {
    checkingBalance += amount;
    
    } else if(accountType.equalsIgnoreCase("savingsBalance")) {
        savingsBalance += amount;
    }
    totalMoney += amount;
    System.out.printf("Successfully deposited $%.2f into %s account.\n", amount, accountType);

    }
// ==================================================================================

    // withdraw Method - users should be able to withdraw money from their checking or savings account 
    // - do not allow them to withdraw money if there are insufficient funds
public void withdraw(double amount, String accountType) {
    if (accountType.equalsIgnoreCase("checkingBalance")) {
        if (checkingBalance >= amount) {
            checkingBalance -= amount;
            totalMoney -= amount;
            System.out.printf("Successfully withdrew $%.2f from checking account. Your remaining balance is %.2f", amount, checkingBalance);
        } else {
            System.out.println("Insufficient funds in checking account!");
        }
    } else if (accountType.equalsIgnoreCase("savingsBalance")) {
        if (savingsBalance >= amount) {
            savingsBalance -= amount;
            totalMoney -= amount;
            System.out.printf("Successfully withdrew $%.2f from savings account. Your remaining balance is %.2f", amount, savingsBalance);
        } else {
            System.out.println("Insufficient funds in savings account!");
        }
    }
}
}

