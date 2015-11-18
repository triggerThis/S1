package com.sprhib.transaction;



import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;


@Aspect
public class TeamTra {
        
    /*1xecution*/
    
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
    
  //  private static final Logger logger = LoggerFactory.getLogger("com.xxx.log"); //.make("com.xxx.log");//.getLogger("com.xxx.log");  
  
     
    @Around("within(com.sprhib.controller.*Controller)")  
    public String arountAction(ProceedingJoinPoint pjp){  
          
       
        HttpServletRequest request = (HttpServletRequest) pjp.getArgs()[0];  
        try {  
            //TODO check  
        	System.out.println("=around");
        } catch (Exception e) {  
            //TODO log & return  
        }  
  
        String result = null;  
        try {  
        	System.out.println("=around");
            result = (String) pjp.proceed();  
            //TODO log  
        } catch (Throwable e) {  
            //TODO log & return  
        }  
          
        return result;  
    } 
    
    //前置通知  
    public void beforeAdvice() {  
        System.out.println("===========before advice");  
}  
//后置最终通知  
    public void afterFinallyAdvice() {  
        System.out.println("===========after finally advice");  
    }  
    
    @Pointcut("execution (* com.sprhib.service.TeamServiceImpl(..))")
 // 声明一个切入点(第一个*后要留一个空格)
 private void anyMethod() {
 }
 @Before("anyMethod()")// 前置通知
 public void before() {
 System.out.println("前置通知");
 }
 @AfterReturning("anyMethod()")//后置通知
 public void afterReturning(){
 System.out.println("后置通知");
 }

    
}