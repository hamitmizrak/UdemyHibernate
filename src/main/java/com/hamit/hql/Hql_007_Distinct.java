package com.hamit.hql;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.hamit.hibernate.HibernateUtils;

public class Hql_007_Distinct {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSessionfactory().openSession();
		String hql = "select distinct(bilgisayarFiyati) from BilgisayarHql as bilgisayarHql ";

		TypedQuery<Integer> typedQuery = session.createQuery(hql, Integer.class);
		List<Integer> distinct = typedQuery.getResultList();
		System.out.println(distinct);

		// Query query = session.createQuery(hql);
		// List<Integer> distinct = query.getResultList();
		// System.out.println(count);

	}

}
