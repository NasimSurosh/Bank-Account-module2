package com.clientmodule;
import  com.bankAcount.BankAccount;
public class Client {
  String name;
  BankAccount bankAccount;

  public Client(String name) {
    this.name = name;
    this.bankAccount = new BankAccount();
  }
  public void linkAccount(BankAccount account) {
    this.bankAccount = account;
    System.out.println("Owner of account is : "+name);
  }
  public void performingTransaction(double amount) {
    if(amount != 0) {
      bankAccount.deposite(amount);
    }else {
      
      bankAccount.withdraw(amount);
    }
  }
  public void account() {
    bankAccount.checkAccountBalance();
  }
}
