package com.hamit.hql;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.hamit.hibernate.HibernateUtils;

public class Hql_003_AggregateMin {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSessionfactory().openSession();
		String hql = "select min(bilgisayarFiyati) from BilgisayarHql as bilgisayarHql ";

		TypedQuery<Integer> typedQuery = session.createQuery(hql, Integer.class);
		Integer min = (Integer) typedQuery.getSingleResult();
		System.out.println(min);

		// Query query = session.createQuery(hql);
		// Integer min = (Integer) query.uniqueResult();
		// System.out.println(min);

	}

}
