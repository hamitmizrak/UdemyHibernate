package com.hamit.hql;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.hamit.hibernate.HibernateUtils;

public class Hql_009_between {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSessionfactory().openSession();
		int minValue = 12000, maxValue = 60000;
		String hql = "select bilgisayarHql from BilgisayarHql as bilgisayarHql"
				+ " where bilgisayarFiyati between :minKey and :maxKey  ";
		TypedQuery<BilgisayarHql> typedQuery = session.createQuery(hql, BilgisayarHql.class);
		typedQuery.setParameter("minKey", minValue);
		typedQuery.setParameter("maxKey", maxValue);
		List<BilgisayarHql> conditional = (ArrayList<BilgisayarHql>) typedQuery.getResultList();

		for (BilgisayarHql temp : conditional) {
			System.out.println(temp);
		}

	}

}
