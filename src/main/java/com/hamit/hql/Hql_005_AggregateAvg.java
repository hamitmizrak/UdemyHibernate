package com.hamit.hql;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.hamit.hibernate.HibernateUtils;

public class Hql_005_AggregateAvg {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSessionfactory().openSession();
		String hql = "select avg(bilgisayarFiyati) from BilgisayarHql as bilgisayarHql ";

		TypedQuery<Double> typedQuery = session.createQuery(hql, Double.class);
		Double avg = (Double) typedQuery.getSingleResult();
		System.out.println(avg);

		// Query query = session.createQuery(hql);
		// Double avg = (Double) query.uniqueResult();
		// System.out.println(avg);

	}

}
