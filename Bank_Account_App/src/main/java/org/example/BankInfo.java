package org.example;

public class BankInfo extends BankAccount{
    public double balance;
    private double depositedAmount;
    private double withdrawalAmount;

// static BankAccount bankAccount=new BankAccount(3321,"deedar",20000,"credit card",777777878);
//
    public BankInfo(int accountNumber, String name, int balance, String cardName, int creditnumber) {
        super(accountNumber, name, balance, cardName, creditnumber);
    }

    public void depositedAmount( int amount)
    {

        balance =balance+ amount;
        System.out.println("balance after deposited:"+balance);

    }

    public void withdrawAmount( int amount) {

        balance = balance - amount;


        System.out.println("balance after withdrawn:" + balance);

    }


}
