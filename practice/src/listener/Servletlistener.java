package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

public class Servletlistener  implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		String basePath=sce.getServletContext().getInitParameter("basePath");
	
		sce.getServletContext().setAttribute("basePath",basePath);
		ServletContextListener.super.contextInitialized(sce);
	}
}

