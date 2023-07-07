package com.ukg.aif.facerecsytem.controller;

import com.ukg.aif.facerecsytem.db.*;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Face face=new Face();
        face.saveFacePixelToDb();

        com.ukg.aif.facerecsytem.ui.Face face1=new com.ukg.aif.facerecsytem.ui.Face();
        face1.printFacePixel();

        Date d=new Date();

       // java.sql.Date date=new Date(d.getTime());


    }
}
