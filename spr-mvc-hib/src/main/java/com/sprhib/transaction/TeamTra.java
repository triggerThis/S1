package com.sprhib.transaction;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutAspect {
        
    /*1、execution*/
    
    @Before(value = "execution(public * *(..))")
    public void executionTest1(JoinPoint jp) {
        dump("execution(public * *(..)", jp);
    }

    @Before(value = "execution(* com.sprhib..IPointcutService.*())")
    public void executionTest2(JoinPoint jp) {
        dump("execution(* com.sprhib..IPointcutService.*())", jp);
    }
    
    @Before(value = "execution(* com.sprhib..*.*(..))")
    public void executionTest3(JoinPoint jp) {
        dump("execution(* com.sprhib..*.*(..))", jp);
    }
    
     private void dump(String expression, JoinPoint jp) {
        System.out.println("=============== [" + expression + "] matches [" + jp.getSignature().toLongString()+ "]");
    }
    
}