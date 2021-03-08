package com.hamit.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hamit.anotation.EntityTutorials;
import com.hamit.attributes.Bilgisayar;
import com.hamit.index.Eticaret;
import com.hamit.relation.manytoone.Student;
import com.hamit.relation.manytoone.Teacher;
import com.hamit.relation.onetoone.BookClass;
import com.hamit.relation.onetoone.WriterClass;

//singleton design pattern
public class HibernateUtils {

	private static final SessionFactory sessionFactory = sessionFactoryHibernate();

	private static SessionFactory sessionFactoryHibernate() {
		try {
			Configuration configuration = new Configuration();
			configuration.addAnnotatedClass(EntityTutorials.class);
			configuration.addAnnotatedClass(StudentEntity.class);
			configuration.addAnnotatedClass(Student.class);
			configuration.addAnnotatedClass(Teacher.class);
			configuration.addAnnotatedClass(BookClass.class);
			configuration.addAnnotatedClass(WriterClass.class);
			configuration.addAnnotatedClass(Bilgisayar.class);
			configuration.addAnnotatedClass(Eticaret.class);

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
