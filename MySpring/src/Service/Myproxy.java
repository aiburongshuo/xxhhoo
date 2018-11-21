package Service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Myproxy implements InvocationHandler{
	
	Object oo;
	public Object bind(Object o){
		oo=o;
		
		
		return Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), this);
		
	}
	
	
	
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
			System.out.println("hahh");
		   Object  obj= method.invoke(oo, null);
		
		   System.out.println("hehh");
		
		return obj;
	}
	
	

}
