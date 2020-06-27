package com.kalyan.database.learndb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kalyan.database.learndb.jdbc.PersonJdbcDAO;

@SpringBootApplication
public class LearnDbApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(LearnDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("All users -> {} ",dao.findAll());
	}

}
