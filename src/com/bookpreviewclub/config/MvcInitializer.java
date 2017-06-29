package com.bookpreviewclub.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
	 
public class MvcInitializer implements WebApplicationInitializer 
{
	private static AnnotationConfigWebApplicationContext ctx;
	
	    public void onStartup(ServletContext container) throws ServletException 
	    {
	    	ctx = new AnnotationConfigWebApplicationContext();
	        ctx.register(MvcConfiguration.class);
	        ctx.setServletContext(container);
	        ctx.scan(MvcConfiguration.class.getPackage().getName());
	 
	        ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new DispatcherServlet(ctx));
	        
	 
	        servlet.setLoadOnStartup(1);
	        servlet.addMapping("/");
	    }
	    public static AnnotationConfigWebApplicationContext getContext() 
	    {
	        
	        return (ctx);
	    }
}
	    
	
	
	

