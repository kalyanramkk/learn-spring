package org.kalyan.leanrspring.lifecyle;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("componentscan")
public class SpringIn5StepsComponentApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentApplication.class);

	public static void main(String[] args) {
		//SpringApplication.run(SpringIn5StepsApplication.class, args);
		
		ApplicationContext appContext = SpringApplication.run(SpringIn5StepsComponentApplication.class, args);
		ComponentDAO compDao = appContext.getBean(ComponentDAO.class);
		
		
		LOGGER.info("{}",compDao);
		
		
	}

}
