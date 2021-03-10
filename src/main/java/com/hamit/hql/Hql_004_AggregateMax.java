package com.hamit.hql;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.hamit.hibernate.HibernateUtils;

public class Hql_004_AggregateMax {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSessionfactory().openSession();
		String hql = "select max(bilgisayarFiyati) from BilgisayarHql as bilgisayarHql ";

		TypedQuery<Integer> typedQuery = session.createQuery(hql, Integer.class);
		Integer max = (Integer) typedQuery.getSingleResult();
		System.out.println(max);

		// Query query = session.createQuery(hql);
		// Integer max = (Integer) query.uniqueResult();
		// System.out.println(max);

	}

}
