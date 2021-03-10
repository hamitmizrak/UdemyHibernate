package com.hamit.hql;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.hamit.hibernate.HibernateUtils;

public class Hql_010_like_Standart {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSessionfactory().openSession();

		// String hql = "select bilgisayarHql from BilgisayarHql as bilgisayarHql" + "
		// where bilgisayarAdi like 'a%' ";
		// String hql = "select bilgisayarHql from BilgisayarHql as bilgisayarHql" + "
		// where bilgisayarAdi like '%a' ";
		// String hql = "select bilgisayarHql from BilgisayarHql as bilgisayarHql" + "
		// where bilgisayarAdi like '%GK%' ";
		String hql = "select bilgisayarHql from BilgisayarHql as bilgisayarHql" + " where bilgisayarAdi like 'M%T' ";
		TypedQuery<BilgisayarHql> typedQuery = session.createQuery(hql, BilgisayarHql.class);

		List<BilgisayarHql> conditional = (ArrayList<BilgisayarHql>) typedQuery.getResultList();

		System.err.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------");
		for (BilgisayarHql temp : conditional) {
			System.out.println(temp.getBilgisarAdi());
		}

	}

}
