package com.hamit.embedded;

import org.hibernate.Session;

import com.hamit.hibernate.HibernateUtils;

public class EmbeddedPersistCreate {

	public static void main(String[] args) {

		BilgisayarDili bilgisayarDili = new BilgisayarDili("Java", "Oracle");

		BilgisayarTeknolojileri bilgisayarTeknolojileri = new BilgisayarTeknolojileri("Servlet", "Web");
		bilgisayarDili.setBilgisayarTeknolojileri(bilgisayarTeknolojileri);

		BilgisayarDili bilgisayarDili2 = new BilgisayarDili("Java", "Oracle");
		BilgisayarTeknolojileri bilgisayarTeknolojileri2 = new BilgisayarTeknolojileri("JSP", "Web");
		bilgisayarDili2.setBilgisayarTeknolojileri(bilgisayarTeknolojileri2);

		BilgisayarDili bilgisayarDili3 = new BilgisayarDili("Java", "Oracle");
		BilgisayarTeknolojileri bilgisayarTeknolojileri3 = new BilgisayarTeknolojileri("JSF", "Web");
		bilgisayarDili3.setBilgisayarTeknolojileri(bilgisayarTeknolojileri3);

		BilgisayarTeknolojileri bilgisayarTeknolojileri4 = new BilgisayarTeknolojileri("Spring boot", "Web");
		bilgisayarDili.setBilgisayarTeknolojileri(bilgisayarTeknolojileri4);

		Session session = HibernateUtils.getSessionfactory().openSession();
		session.getTransaction().begin();
		session.persist(bilgisayarDili);
		session.persist(bilgisayarDili2);
		session.persist(bilgisayarDili3);
		session.getTransaction().commit();
		System.out.println("Veriler eklendi");
	}
}
