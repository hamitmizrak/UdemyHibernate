package com.hamit.hql;

import java.util.ArrayList;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.hamit.hibernate.HibernateUtils;

public class Hql_013_limit {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSessionfactory().openSession();
		String hql = "select bilgisayarHql from BilgisayarHql as bilgisayarHql";
		TypedQuery<BilgisayarHql> typedQuery = session.createQuery(hql, BilgisayarHql.class);
		typedQuery.setMaxResults(1);
		ArrayList<BilgisayarHql> bilgisayarHqlList = (ArrayList<BilgisayarHql>) typedQuery.getResultList();

		for (BilgisayarHql temp : bilgisayarHqlList) {
			// projection
			System.out.println(temp.getBilgisarAdi() + " \t " + temp.getBilgisayarFiyati());
		}
	}
}
