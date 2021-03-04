package com.hamit.anotation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hamit.hibernateutils.PersistenceUtil;

public class MainTest {

	public static void main(String[] args) {
		EntityTutorials entityTutorials = new EntityTutorials("Hamit", "Mızrak", 512228563.96555);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory(PersistenceUtil.persistenceUtilName);
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		manager.persist(entityTutorials);
		manager.getTransaction().commit();
		manager.close();
		System.out.println("Tablo eklendi");
	}
}
