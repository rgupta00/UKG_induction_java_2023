package com.day5.session1.ex3.io_examples;

import java.io.*;

public class C_DemoSerilzation {
    public static void main(String[] args) throws Exception{
        //Ser

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("demo.txt"));
        Account account=new Account(1,"raj",30000);
        account.id=5555;
        //ser is only for instance variable .. dont work for static variable
        account.bankName="pnb";

        oos.writeObject(account);
        //System.out.println(account);
    }
}
