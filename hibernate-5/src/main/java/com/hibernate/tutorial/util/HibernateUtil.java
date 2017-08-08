package com.hibernate.tutorial.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//@org.springframework.context.annotation.Configuration
//@ComponentScan(basePackages= {"com.hibernate.*"})
//public class HibernateUtil {
//	
//	@Autowired
//	SessionFactory sessionFactory;
//
//	@Bean
//	public SessionFactory getHibernateSessionFactory() {
//		SessionFactory sessionFactory;
//		sessionFactory = new Configuration().configure().buildSessionFactory(); // configures settings from hibernate.cfg.xml
//		return sessionFactory;
//	}
//	
//	@Bean("Session")
//	public Session getHibernateSession() {
//		return sessionFactory.openSession();
//	}	
//}
