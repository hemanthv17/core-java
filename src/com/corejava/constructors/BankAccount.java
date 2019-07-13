package com.corejava.constructors;

public class BankAccount {
    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public BankAccount(long accountNumber, double balance, String customerName, String email, long phoneNumber){
      this.accountNumber = accountNumber;
      this.balance = balance;
      this.customerName=customerName;
      this.email=email;
      this.phoneNumber=phoneNumber;
    }
    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setBalance(double balance){
         this.balance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public long getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getEmail(){
        return this.email;
    }
    public long getPhoneNumber(){
        return this.phoneNumber;
    }
    public void depositfunds(double depositFunds){
        setBalance(balance+depositFunds);
        System.out.println("Funds deposited, available funds = "+this.balance);

    }
    public void withdrawFunds(double withdrawFunds){
        if(withdrawFunds<=balance){
            setBalance(balance-withdrawFunds);
            System.out.println("Funds withdrawn = "+ withdrawFunds+", Available balance = "+ this.balance);
        }else{
            System.out.println("Insufficient funds, available "+this.balance+", withdrawal not processed ");

        }
    }
}
