package com.bookpreviewclub.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@ComponentScan(basePackages="com")
@EnableWebMvc
//@PropertySource("classpath:/com/bookpreviewclub/config/application.properties")
@PropertySource("classpath:application.properties")
public class MvcConfiguration extends WebMvcConfigurerAdapter
{
	@Autowired
	private Environment env;
	
	/**
	@Bean
	public ViewResolver getViewResolver()
	{
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	*/
	 @Bean
	 public InternalResourceViewResolver internalResourceViewResolver() 
	 {
		 InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		 resolver.setViewClass(org.springframework.web.servlet.view.JstlView.class);
		 // Putting a slash before WEB-INF allows you to use subdirectories in the Views
		 resolver.setPrefix("/WEB-INF/views/");
		 resolver.setSuffix(".jsp");
		 return resolver;
	 }
	 
	 @Bean
	public ResourceBundleMessageSource messageSource() 
	 {
		ResourceBundleMessageSource rb = new ResourceBundleMessageSource();
		rb.setBasenames(new String[] { "messages/messages", "messages/validation" });
		return rb;
	}
	 
	@Bean
	public JdbcTemplate getJdbcTemplate() throws ClassNotFoundException 
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
			
		dataSource.setDriverClassName(env.getProperty("spring.datasource.driverClassName"));
	    dataSource.setUrl(env.getProperty("spring.datasource.url"));
	    dataSource.setUsername(env.getProperty("spring.datasource.username"));
	    dataSource.setPassword(env.getProperty("spring.datasource.password"));
			
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate;
	}
				
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	
}
