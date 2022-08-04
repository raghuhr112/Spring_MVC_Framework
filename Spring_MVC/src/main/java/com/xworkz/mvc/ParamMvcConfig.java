package com.xworkz.mvc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.mvc.configuration.SpringConfig;

public class ParamMvcConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {

		System.out.println("From Root Configuration class");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] { SpringConfig.class };
	}

	@Override
	protected String[] getServletMappings() {

		System.out.println("Running From Initializer");

		return new String[] { "/" };
	}

}
