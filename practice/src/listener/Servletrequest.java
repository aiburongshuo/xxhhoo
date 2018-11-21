package listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class Servletrequest implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		String aa=sre.getServletRequest().getRemoteHost();
		System.out.println(aa);
	}
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
	
		
	}
	
}
