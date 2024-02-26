package com.ecommerce.cofiguration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { com.ecommerce.cofiguration.MainConfig.class };
	}

	@Override
	protected String[] getServletMappings() {

		return new String[] { "/" };
	}

}
