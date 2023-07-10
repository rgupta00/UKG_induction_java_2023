package com.day3.session1.ex1.relationship_bw_objects;

import java.io.StringReader;

//A trainer named raj is using marker black to teach
class Marker{
    private String color;

    public Marker(String color) {
        this.color = color;
    }
    public void write(){
        System.out.println("writing with "+ color+" color marker");
    }
}
class Trainer{
    private String name;

    public Trainer(String name) {
        this.name = name;
    }
    //Trainer while teaching use a marker
    public void teach(Marker marker){
        System.out.println("name: "+ name);
        marker.write();
    }
}
public class A_UseA {
    public static void main(String[] args) {

        Marker marker = new Marker("black");
        Trainer trainer=new Trainer("rajiv");
        trainer.teach(marker);
    }
}
