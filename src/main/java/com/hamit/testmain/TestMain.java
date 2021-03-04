package com.hamit.testmain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hamit.hibernatebean.Register;
import com.hamit.hibernateutils.PersistenceUtil;

public class TestMain {

	public static void main(String[] args) {

		Register register = new Register("Hamit Mızrak", "hamitmizrak@gmail.com", "123");

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PersistenceUtil.persistenceUtilName);
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		entityManager.persist(register);
		entityManager.getTransaction().commit();
		entityManager.close();
		System.out.println("Başarılı");

	}

}
