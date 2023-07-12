package com.day5.session1.ex3.io_examples;
//What is marker interface

import java.io.Serializable;

public class Account implements Serializable {
    int id;
    String name;
    double balance;
    static String bankName="SBI";

    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }
}
