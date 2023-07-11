package org.example;

public class BankAccount {
    private int accountNumber;
    private String name ;
    private int balance;

    private String  cardName ;
    private int creditnumber;


    public BankAccount(int accountNumber, String name, int balance, String cardName, int creditnumber) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.cardName = cardName;
        this.creditnumber = creditnumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getCreditnumber() {
        return creditnumber;
    }

    public void setCreditnumber(int creditnumber) {
        this.creditnumber = creditnumber;
    }

}
