package com.hamit.hql;

import java.util.ArrayList;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.hamit.hibernate.HibernateUtils;

public class Hql_014_groupBy {

	/*
	 * select bilgisayarIslemci,min(bilgisayarFiyati),max(bilgisayarFiyati),avg(
	 * bilgisayarFiyati),sum(bilgisayarFiyati),count(bilgisayarFiyati) from
	 * bilgisayarhql group by bilgisayarIslemci
	 */
	public static void main(String[] args) {
		Session session = HibernateUtils.getSessionfactory().openSession();
		String hql = "select bil  from BilgisayarHql as bil group by bil.id , bil.bilgisayarIslemci ";
		TypedQuery<BilgisayarHql> typedQuery = session.createQuery(hql, BilgisayarHql.class);
		ArrayList<BilgisayarHql> bilgisayarHqlList = (ArrayList<BilgisayarHql>) typedQuery.getResultList();
		System.err.println(
				"----------------------------------------------------------------------------------------------------------");
		for (BilgisayarHql temp : bilgisayarHqlList) {
			// projection
			System.out.println(temp.getId() + " \t " + temp.getBilgisarAdi().substring(0, 5) + " \t\t "
					+ temp.getBilgisayarFiyati() + "\t");
		}
	}
}
