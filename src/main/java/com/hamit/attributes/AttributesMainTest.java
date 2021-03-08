package com.hamit.attributes;

import org.hibernate.Session;

import com.hamit.hibernate.HibernateUtils;

public class AttributesMainTest {

	public static void main(String[] args) {

		Bilgisayar bilgisayar = new Bilgisayar("Gl 75", "16 gb ram i7 500GB ssd 2 slot SSD 1.5GB SSD ", 15000,
				"fake bilgi");
		bilgisayar.isBilgisayar();

		Session session = HibernateUtils.getSessionfactory().openSession();

		session.getTransaction().begin();
		session.persist(bilgisayar);
		session.getTransaction().commit();

	}

}
