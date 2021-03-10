package com.hamit.hql;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.hamit.hibernate.HibernateUtils;

public class Hql_002_AggregateSum {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSessionfactory().openSession();
		String hql = "select sum(bilgisayarFiyati) from BilgisayarHql as bilgisayarHql ";

		TypedQuery<Long> typedQuery = session.createQuery(hql, Long.class);
		Long sum = (Long) typedQuery.getSingleResult();
		System.out.println(sum);

		// Query query = session.createQuery(hql);
		// Long sum = (Long) query.uniqueResult();
		// System.out.println(sum);

	}

}
