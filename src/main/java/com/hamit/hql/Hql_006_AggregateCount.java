package com.hamit.hql;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.hamit.hibernate.HibernateUtils;

public class Hql_006_AggregateCount {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSessionfactory().openSession();
		String hql = "select count(bilgisayarFiyati) from BilgisayarHql as bilgisayarHql ";

		TypedQuery<Long> typedQuery = session.createQuery(hql, Long.class);
		Long count = (Long) typedQuery.getSingleResult();
		System.out.println(count);

		// Query query = session.createQuery(hql);
		// Long count = (Long) query.uniqueResult();
		// System.out.println(count);

	}

}
