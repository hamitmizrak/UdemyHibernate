package com.hamit.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hamit.anotation.EntityTutorials;
import com.hamit.attributes.Bilgisayar;
import com.hamit.embedded.BilgisayarDili;
import com.hamit.embedded.BilgisayarTeknolojileri;
import com.hamit.emmeddedId.Kitap;
import com.hamit.emmeddedId.Memleket;
import com.hamit.emmeddedId.Yazar;
import com.hamit.enums.EnumEntity;
import com.hamit.hibernatebean.Register;
import com.hamit.hql.BilgisayarHql;
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
			configuration.addAnnotatedClass(BilgisayarTeknolojileri.class);
			configuration.addAnnotatedClass(BilgisayarDili.class);
			configuration.addAnnotatedClass(Kitap.class);
			configuration.addAnnotatedClass(Yazar.class);
			configuration.addAnnotatedClass(Memleket.class);
			configuration.addAnnotatedClass(EnumEntity.class);
			configuration.addAnnotatedClass(Register.class);
			configuration.addAnnotatedClass(BilgisayarHql.class);

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
