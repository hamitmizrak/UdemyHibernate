package com.hamit.hql;

import java.util.ArrayList;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.hamit.hibernate.HibernateUtils;

public class Hql_001_Select {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSessionfactory().openSession();
		String hql = "select bilgisayarHql from BilgisayarHql as bilgisayarHql ";
		TypedQuery<BilgisayarHql> typedQuery = session.createQuery(hql, BilgisayarHql.class);
		ArrayList<BilgisayarHql> bilgisayarHqlList = (ArrayList<BilgisayarHql>) typedQuery.getResultList();
		// BilgisayarHql bilgisayarHqlList = typedQuery.getFirstResult();

		for (BilgisayarHql temp : bilgisayarHqlList) {
			System.out.println(temp);
		}
	}

}
