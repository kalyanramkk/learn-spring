package org.kalyan.learnspring.scope;



import org.kalyan.learnspring.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.kalyan.learnspring.componentscan")
@ComponentScan("org.kalyan.learnspring.autowire.qualifier")
public class SpringIn5StepsComponentScanApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {
		//SpringApplication.run(SpringIn5StepsApplication.class, args);
		
		ApplicationContext appContext = SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
		ComponentDAO personDao = appContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}",personDao);
		LOGGER.info("{}",personDao.getJdbcConnection());
		
			//When we use 	@SpringBootApplication by default it uses the current package.
		//	To give a different package we need to use @ComponentScan
		
	}

}
