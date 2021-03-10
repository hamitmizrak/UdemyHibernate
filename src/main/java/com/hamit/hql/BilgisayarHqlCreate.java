package com.hamit.hql;

import org.hibernate.Session;

import com.hamit.hibernate.HibernateUtils;

public class BilgisayarHqlCreate {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			Session session = HibernateUtils.getSessionfactory().openSession();
			BilgisayarHql bilgisayarHql = new BilgisayarHql("Msi Gl75", 12000 * ((i + 1) * 10),
					"Gl7asX".concat(i - 5 + ""), "i7");
			session.getTransaction().begin();
			session.persist(bilgisayarHql);
			session.getTransaction().commit();
		}

		System.out.println("Veriler eklendi");

	}

}
