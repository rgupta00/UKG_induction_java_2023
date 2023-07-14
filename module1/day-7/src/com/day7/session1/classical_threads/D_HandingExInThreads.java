package com.day7.session1.classical_threads;

import java.io.BufferedReader;
import java.io.FileReader;

class JobWithEx implements  Runnable{
    @Override
    public void run(){
        try(BufferedReader reader = new BufferedReader(new FileReader("foo.txt"))){
            ///
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}

public class D_HandingExInThreads {

    public static void main(String[] args) {


    }
}
