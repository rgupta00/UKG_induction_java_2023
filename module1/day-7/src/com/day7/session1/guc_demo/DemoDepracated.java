package com.day7.session1.guc_demo;

class Foo extends Thread{
}

public class DemoDepracated {
    public static void main(String[] args) {
        Foo f=new Foo();

        f.stop();
    }
}
