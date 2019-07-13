package com.corejava.constructors;

public class Main {
    public static void main(String[] args) {
      BankAccount account = new BankAccount(2342354l,234,"hemanth","hemanth@od.com",9876543210l);
        System.out.println(account.getAccountNumber());
      account.depositfunds(1000);
        account.withdrawFunds(900);
        account.withdrawFunds(100);
        account.withdrawFunds(0.1);

    }
}
