package com.day10.doubts;

import com.empapp.exceptions.EmployeeNotFoundException;

import java.util.Optional;
import java.util.function.Supplier;

public class DemoOptional {

    public static void main(String[] args) {
        //me
        int id=333;
        Optional<Employee> eOpt=getEmployeeById(id);

//        if(eOpt.isPresent()) {
//            int id2 = eOpt.get().getId();
//        }

//        Employee employee=eOpt
//                .orElseThrow(() ->
//                        new EmployeeNotFoundException("emp of "+ id +" is not found"));
//
//        System.out.println(e);


//        Supplier<EmployeeNotFoundException> supplier=
//              () ->new EmployeeNotFoundException("emp of "+ id +" is not found");
//
//
//
//
//        //if emp is found give me or else throw ex
//        Employee employee=eOpt
//                .orElseThrow(() ->
//                        new EmployeeNotFoundException("emp of "+ id +" is not found"));

    }

    //sumit
    public static Optional<Employee> getEmployeeById(int id){
        //u are calling database
        Employee e=null;

       // return  Optional.of(e);//Optional.of(e) : non forgiable
//        return Optional.empty();
        //return Optional.ofNullable(e);
        return  Optional.ofNullable(e);
    }


//    //sumit
//    public static  Employee getEmployeeById(int id){
//        //u are calling database
//       Employee e=null;
//       return  e;
//    }
}
