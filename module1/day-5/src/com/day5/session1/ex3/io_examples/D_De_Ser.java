package com.day5.session1.ex3.io_examples;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class D_De_Ser {
    public static void main(String[] args)throws Exception{
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("demo.txt"));
        Account account= (Account) ois.readObject();
        System.out.println(account);
        System.out.println(account.bankName);


    }
}
