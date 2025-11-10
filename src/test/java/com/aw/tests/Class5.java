package com.aw.tests;

/* BankAccount class

* Fields: 'accountNumber', 'balance'.
   * Methods: 'deposit()', 'withdraw()'.
   * Demonstrate deposit and withdraw with an object.*/

public class Class5 
{

    int account_number;
    double balance;

    public void deposit(double amount)
    {
      if (amount>100)
      {
        balance=balance+amount;
        System.out.println(" Deposit Done : "+amount);
      } 
      else
      {

        System.out.println("Invalid amount");
      }

    }
    public void withdraw(double amount)
    {

        if (amount>100 && amount<=balance)
      {
        balance=balance-amount;
        System.out.println(" Withdraw Done : "+amount);
      } 
      else
      {

        System.out.println("Insufficient Balance");
      }
    }

    public void showInfo()
    {
        System.out.println(" Account Number : "+ account_number + " Balance : "+balance);
    }
    public static void main(String[] args) 
    {
    
        Class5 c5=new Class5();
        c5.account_number=12345;
        c5.balance=20000;

        c5.showInfo();
        
        c5.deposit(10000);
        c5.showInfo();

        c5.withdraw(9000);
        c5.showInfo();

        c5.withdraw(22000);
        c5.showInfo();
        
    }
}
