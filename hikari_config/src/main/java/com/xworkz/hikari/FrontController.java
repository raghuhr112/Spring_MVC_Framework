package com.xworkz.hikari;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.hikari.configuration.SpringConfig;

public class FrontController extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("From Front Controller - Root Config Class");
		return new Class[] { SpringConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {

		System.out.println("From Dispatcher Servlet - Servlet Mapping method");
		return new String[] { "*.do" };
	}

}
