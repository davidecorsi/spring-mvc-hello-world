package it.partec.helloworld;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import it.partec.helloworld.config.Config;

public class Inizializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { Config.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
}
