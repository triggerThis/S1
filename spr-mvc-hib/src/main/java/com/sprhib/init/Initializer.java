package com.sprhib.init;//

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@EnableAspectJAutoProxy 
public class Initializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext)
			throws ServletException {
		System.out.println("=============== [Initializer/");
		
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(WebAppConfig.class);
		
		//ctx.register("");
		servletContext.addListener(new ContextLoaderListener(ctx));

		ctx.setServletContext(servletContext);

		DispatcherServlet dst = new DispatcherServlet(ctx);
		//dst.
		Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
		System.out.println("=============== [Initializer/end start");
		
		//http://developer.51cto.com/art/201103/246592_1.htm
		//both annotation and xml
	}
	//

}
