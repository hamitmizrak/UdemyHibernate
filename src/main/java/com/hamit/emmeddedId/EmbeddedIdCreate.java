package com.hamit.emmeddedId;

import org.hibernate.Session;

import com.hamit.hibernate.HibernateUtils;

public class EmbeddedIdCreate {

	public static void main(String[] args) {

		Kitap kitap = new Kitap("Java Kitabı");
		Yazar yazar = new Yazar(0, "Yaz. Hamit Mızrak");

		Session session = HibernateUtils.getSessionfactory().openSession();
		session.getTransaction().begin();
		session.persist(kitap);
		session.persist(yazar);
		session.getTransaction().commit();
		System.out.println("Tablolar yazıldı -1");

		MemleketId memleketId = new MemleketId(kitap.getKitapId(), yazar.getYazarId());
		Memleket memleket = new Memleket(memleketId, "Malatya");
		session.getTransaction().begin();
		session.persist(memleket);
		session.getTransaction().commit();
		System.out.println("Tablolar yazıldı -2");
	}
}
