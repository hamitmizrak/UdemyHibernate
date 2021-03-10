package com.hamit.hql;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.hamit.hibernate.HibernateUtils;

public class Hql_008_where {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSessionfactory().openSession();
		int fiyat = 12000;
		String hql = "select bilgisayarHql from BilgisayarHql as bilgisayarHql where bilgisayarFiyati=:key ";
		TypedQuery<BilgisayarHql> typedQuery = session.createQuery(hql, BilgisayarHql.class);
		typedQuery.setParameter("key", fiyat);
		List<BilgisayarHql> conditional = (ArrayList<BilgisayarHql>) typedQuery.getResultList();

		for (BilgisayarHql temp : conditional) {
			System.out.println(temp);
		}

	}

}
