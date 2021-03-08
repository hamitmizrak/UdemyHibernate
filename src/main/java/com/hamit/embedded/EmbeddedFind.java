package com.hamit.embedded;

import org.hibernate.Session;

import com.hamit.hibernate.HibernateUtils;

public class EmbeddedFind {

	public static void main(String[] args) {

		Session session = HibernateUtils.getSessionfactory().openSession();

		BilgisayarDili bilgisayarDili = session.find(BilgisayarDili.class, 2L);
		System.out.println(bilgisayarDili);
		System.out.println("Veriler eklendi");
	}
}
