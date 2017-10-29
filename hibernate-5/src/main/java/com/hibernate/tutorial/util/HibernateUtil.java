package com.hibernate.tutorial.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class HibernateUtil {
	
	@Autowired
	EntityManagerFactory entityManagerFactory;
	
	@Bean
	public EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
	
}
