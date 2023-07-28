package com.empapp.service.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

//whenever somebody want to calculate time taken to ex the method control should come here
@Service    //spring
@Aspect //ASPECT j  this bean is resp by both of the framework
public class LoggingAspect {
    private Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    //ProceedingJoinPoint is a class that give u power to call the target method
//    @Pointcut("execution( * com.empapp.service.*.*(..))")
//    public void myPointCut(){}
//
//    @Around("myPointCut()")

    @Around("execution( * com.empapp.service.*.*(..))")
    public Object logging(ProceedingJoinPoint joinPoint)throws Throwable{
        long start = System.currentTimeMillis();

        Object result = joinPoint.proceed();

        System.out.println("################################");
        System.out.println(result);
        System.out.println("################################");


        long end = System.currentTimeMillis();

        //this will get  joinPoint.getSignature().getName() ; it will give inforation about target method

        logger.info("time taken to execute the method is :"+ (end-start)+" ms"+ "method name is :"+
                joinPoint.getSignature().getName());
       return result;
    }






    //aspect = adivice + pointcut
    //every method of service layer
    //modifer_pattern?   retrun_type     decleation_type_pattern?   name_pattern(param_pattern) throws patterns
    //execution( * com.empapp.service.*.*(..))
//    @Pointcut("execution( * com.empapp.service.*.*(..)")
//    public  void foo(){}
//
//    @Before("foo()")
//    public void logging(){
//        //adivce
//        System.out.println("it is logging");
//    }
}
