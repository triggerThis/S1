package com.sprhib.aspcectAop;



import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
//@Autowired
//@Service
//@Configurable
@Aspect
//@EnableAspectJAutoProxy 
public class DemoAop {
	
	public DemoAop(){
		System.out.println("create DemoAop");
		//com.sprhib.dao.TeamDao ad= new 
	}
	
	@Pointcut("execution (* com.sprhib.dao.TeamDAO.*(*))")//("execution(* com.sprhib.service.TeamServiceImpl(*))")
	private void anyMethod() { //String param
    	System.out.println("anyMethod 声明一个切入点");
 }
	
	@Before("anyMethod()")// 前置通知
	 public void before() {
	 System.out.println("前置通知");
	 }
	 @AfterReturning("anyMethod()")//后置通知
	 public void afterReturning(){
	 System.out.println("后置通知");
	 }
	 
	 @Pointcut("execution (* com.sprhib.service.TeamService.addTeam(*))")//("execution(* com.sprhib.service.TeamServiceImpl(*))")
		private void link() { //String param
	    	System.out.println("anyMethod 声明一个切入点");
	 }
	 
	 @Before("link()")// 前置通知
	 public void beforeLink() {
		//如果需要这里可以取出参数进行处理
			//Object[] args = joinPoint.getArgs();
			System.out.println("slink before aspect executing");
	 }
	 @AfterReturning("link()")//后置通知
	 public void afterLink(){
	 System.out.println("slink后置通知");
	 }
	 @Around("link()")
		public void around(ProceedingJoinPoint pjp) throws Throwable {
			System.out.println("slink around start..");
			try {
				pjp.proceed();
			} catch (Throwable ex) {
				System.out.println("slink error in around");
				throw ex;
			}
			System.out.println("slink around end");
		}
    
}