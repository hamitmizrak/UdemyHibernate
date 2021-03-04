package com.hamit.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hamit.anotation.EntityTutorials;

//singleton design pattern
public class HibernateUtils {

	private static final SessionFactory sessionFactory = sessionFactoryHibernate();

	private static SessionFactory sessionFactoryHibernate() {
		try {
			Configuration configuration = new Configuration();
			configuration.addAnnotatedClass(EntityTutorials.class);
			configuration.addAnnotatedClass(StudentEntity.class);

			SessionFactory sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
			return sessionFactory;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}

}
