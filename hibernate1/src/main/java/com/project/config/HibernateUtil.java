package com.project.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static Session makeSession() {
		Configuration confi = new Configuration();
		confi = confi.configure(); // confi.configure("hibernate.cfg.xml");
		System.out.println("got configuration...." + confi);
		// singleton object
		SessionFactory sessionFactory = confi.buildSessionFactory();
		System.out.println("sessionfactory is ready " + sessionFactory);
		Session session = sessionFactory.openSession();
		return session;}
	

}
