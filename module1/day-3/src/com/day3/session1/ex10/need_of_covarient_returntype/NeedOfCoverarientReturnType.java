package com.day3.session1.ex10.need_of_covarient_returntype;
//normal milk and pasteurized milk
// Covarient return type ? Java 1.5         Java 5
class Milk{}
class PasteurizedMilk extends Milk{}

class KrishnaDairy{
    public Milk sellMilk(){
        return new Milk();
    }
}
//return type of drived class is a specilized type of base class => coverient return type
class ImprovedKrishnaDairy extends KrishnaDairy{
    @Override
    public PasteurizedMilk sellMilk(){
        return new PasteurizedMilk();
    }
}

public class NeedOfCoverarientReturnType {
    public static void main(String[] args) {

    }
}
