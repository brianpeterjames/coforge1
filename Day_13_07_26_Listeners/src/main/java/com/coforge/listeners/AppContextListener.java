package com.coforge.listeners;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class AppContextListener
 *
 */
@WebListener
public class AppContextListener implements ServletContextListener {
 /**
     * Default constructor. 
     */
    public AppContextListener() {
        
    }
    @Override
    public void contextInitialized(ServletContextEvent sce)
    {
    	ServletContextListener.super.contextInitialized(sce);
    	ServletContext context = sce.getServletContext();
    	
    	context.setAttribute("count", 0);
    	context.log("Application Started");
    	System.out.println("Application Started");
    	
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent sce)
    {
    	ServletContextListener.super.contextDestroyed(sce);
    	
    	ServletContext context = sce.getServletContext();
    	Object count = context.getAttribute("count");
    	context.log("Number of hits"+count);
    	context.log("Application Stopped");
    	System.out.println("Application Stopped and number of hits are "+count);
    	
    }
    
	
}
