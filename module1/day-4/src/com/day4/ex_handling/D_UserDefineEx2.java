package com.day4.ex_handling;
//1000
//Checked vs Unchecked
//user define ex

//Checked           vs      Unchecked

import sun.plugin2.liveconnect.ArgumentHelper;

//Exception                 RuntimeException
//class AccountCreationException extends Exception{
//}
class NotSufficientFundException extends Exception{
    public NotSufficientFundException(String message){
        super(message);
    }
}
class OverFundException extends Exception{
    public OverFundException(String message){
        super(message);
    }
}
class AccountCreationException extends Exception{
    public AccountCreationException(String message){
        super(message);
    }
}
class Account{
    private int id;
    private String name;
    private double balance;
    public Account(int id, String name, double balance)throws AccountCreationException{
        this.id = id;
        this.name = name;
        this.balance = balance;
        if(balance<1000) {
                  throw new AccountCreationException("account can not be create with balance "+ balance);
        }

    }
    public void withdraw(double amount)throws NotSufficientFundException{
        double temp=balance-amount;
        if(temp<1000)
            throw new NotSufficientFundException("not sufficient fund ex...");
    }

    public void deposit(double amount)throws OverFundException{
        double temp=balance+amount;
        if(temp>=2000_00_0){
            throw new OverFundException("pls open current account");
        }
    }

    public String toString(){
        return "id : "+ id+" namne :"+ name
                +" balance: "+balance;
    }
}
public class D_UserDefineEx2 {
    public static void main(String[] args){

       try{
           Account  a=new Account(1,"raj",1800);
           System.out.println(a);
           a.deposit(2000_00_0);
           System.out.println("--------------------");
       }catch (AccountCreationException e){
           System.out.println(e.getMessage());
       }catch (OverFundException e){
           System.out.println(e.getMessage());
       }
        System.out.println("end");

    }
}
