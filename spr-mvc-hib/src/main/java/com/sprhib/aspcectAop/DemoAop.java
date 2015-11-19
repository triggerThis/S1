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
    	System.out.println("anyMethod ����һ�������");
 }
	
	@Before("anyMethod()")// ǰ��֪ͨ
	 public void before() {
	 System.out.println("ǰ��֪ͨ");
	 }
	 @AfterReturning("anyMethod()")//����֪ͨ
	 public void afterReturning(){
	 System.out.println("����֪ͨ");
	 }
	 
	 @Pointcut("execution (* com.sprhib.service.TeamService.addTeam(*))")//("execution(* com.sprhib.service.TeamServiceImpl(*))")
		private void link() { //String param
	    	System.out.println("anyMethod ����һ�������");
	 }
	 
	 @Before("link()")// ǰ��֪ͨ
	 public void beforeLink() {
		//�����Ҫ�������ȡ���������д���
			//Object[] args = joinPoint.getArgs();
			System.out.println("slink before aspect executing");
	 }
	 @AfterReturning("link()")//����֪ͨ
	 public void afterLink(){
	 System.out.println("slink����֪ͨ");
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