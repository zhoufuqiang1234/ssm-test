package com.example.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.stereotype.Component;

@Component
public class MyEnvironmentPostProcessor implements EnvironmentPostProcessor{

	@Override
	public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
		try(InputStream input = new FileInputStream("D:/tmp/springboot.properties")){
			Properties properties = new Properties();
			properties.load(input);
			PropertiesPropertySource propertySource  = new PropertiesPropertySource("my",properties);
			environment.getPropertySources().addLast(propertySource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
