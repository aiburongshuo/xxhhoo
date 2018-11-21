package Interceptfilter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Pojo.Student;
//@WebFilter("/*")
public class Filterintercept implements Filter {

	@Override
	public void doFilter(ServletRequest reg, ServletResponse resp, FilterChain f)
			
	
	
	
			throws IOException, ServletException {
		
						reg.setCharacterEncoding("utf-8");
						resp.setCharacterEncoding("utf-8");															
				HttpServletRequest request=(HttpServletRequest)reg;
				HttpServletResponse rsponse=(HttpServletResponse)resp;
				System.out.println(request.getRequestURI());
				if(request.getRequestURI().contains("images")||request.getRequestURI().contains("css")||request.getRequestURI().contains("js")){
					
					f.doFilter(request, rsponse);
					return;
				};
					
				if("/practice/login.jsp".equals(request.getRequestURI())||"/practice/Login".equals(request.getRequestURI())){
					

					f.doFilter(request, rsponse);
					return;
				}
				
				Student st=(Student)request.getSession().getAttribute("stu");
					if(st==null){
						
							rsponse.sendRedirect("login.jsp");
						
						
					}else{
						
						
						f.doFilter(request, rsponse);
						
					}
										
				
	}

	
	
}