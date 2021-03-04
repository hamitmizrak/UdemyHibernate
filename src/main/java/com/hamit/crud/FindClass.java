package com.hamit.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hamit.hibernatebean.Register;
import com.hamit.hibernateutils.PersistenceUtil;

public class FindClass {

	public Register findHibernate(long id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(PersistenceUtil.persistenceUtilName);
		EntityManager entityManager = factory.createEntityManager();
		Register register = entityManager.find(Register.class, id);
		entityManager.close();

		return register;
	}

}
