package Aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Proxys {
	@Before("execution(* Service.*.*(..))")
	public void before(){
		
		System.out.println("接下来有请明星出场");
		
		
	}
	
}
