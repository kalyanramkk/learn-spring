package org.kalyan.learnspring.scope;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {
		//SpringApplication.run(SpringIn5StepsApplication.class, args);
		
		ApplicationContext appContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		PersonDAO personDao = appContext.getBean(PersonDAO.class);
		
		PersonDAO personDao2 = appContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}",personDao);
		LOGGER.info("{}",personDao.getJdbcConnection());
		
		
		LOGGER.info("{}",personDao2);
		LOGGER.info("{}",personDao.getJdbcConnection());
		
		
	}

}
