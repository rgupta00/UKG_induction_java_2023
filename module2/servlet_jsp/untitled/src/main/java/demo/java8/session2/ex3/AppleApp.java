package demo.java8.session2.ex3;

import java.util.*;
import java.util.function.Predicate;

public class AppleApp {

    //OCP
    //all green application
    //behaviorual paramterized design pattern => strategy desing pattern
    public static  List<Apple> getAllApplesOnPredicate(List<Apple> apples,
                                                 Predicate<Apple> predicate){
        List<Apple> resultList=new ArrayList<>();
        for(Apple temp: apples){
            if(predicate.test(temp)){
                resultList.add(temp);
            }
        }
        return resultList;
    }

}
