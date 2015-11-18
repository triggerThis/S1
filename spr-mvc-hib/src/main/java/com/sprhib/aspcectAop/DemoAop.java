package com.sprhib.aspcectAop;



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
public class DemoAop {
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