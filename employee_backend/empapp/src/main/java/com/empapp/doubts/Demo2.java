package com.empapp.doubts;

import java.io.FileNotFoundException;
import java.io.IOException;

//interface xyz {
//    public void abc() throws IOException;
//}
//
//interface pqr {
//    public void abc() throws FileNotFoundException;
//}
//
//class Implementation implements xyz, pqr {
//    public void abc() throws FileNotFoundException,NullPointerException
//    {
//        /* implementation */
//    }
//}

class xyz {
      void abc() throws FileNotFoundException{
    }
}

interface pqr {
    public void abc() throws FileNotFoundException;
}

class Implementation extends xyz implements  pqr {
    public void abc() throws FileNotFoundException{
    }
}
public class Demo2 {
    public static void main(String[] args) {

    }
}
