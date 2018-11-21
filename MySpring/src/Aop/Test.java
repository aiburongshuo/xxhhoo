package Aop;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Service.Studentser;

public class Test {
	public static void main(String[] args) {
		
		BeanFactory bean=new ClassPathXmlApplicationContext("beans.xml");
		
		 Studentser st=(Studentser) bean.getBean("studentser");
		 st.add();
		
		
		
	}
}
