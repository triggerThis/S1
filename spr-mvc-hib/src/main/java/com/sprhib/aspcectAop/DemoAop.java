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
 // ����һ�������(��һ��*��Ҫ��һ���ո�)
 private void anyMethod() {
 }
 @Before("anyMethod()")// ǰ��֪ͨ
 public void before() {
 System.out.println("ǰ��֪ͨ");
 }
 @AfterReturning("anyMethod()")//����֪ͨ
 public void afterReturning(){
 System.out.println("����֪ͨ");
 }
    
}