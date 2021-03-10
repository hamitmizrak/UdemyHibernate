package com.hamit.hql;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;

import com.hamit.hibernate.HibernateUtils;

public class Hql_011_like_MatchMode {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSessionfactory().openSession();

		// String hql = "select bilgisayarHql from BilgisayarHql as bilgisayarHql" + "
		// where bilgisayarAdi like 'a%' ";
		// String hql = "select bilgisayarHql from BilgisayarHql as bilgisayarHql" + "
		// where bilgisayarAdi like '%a' ";
		// String hql = "select bilgisayarHql from BilgisayarHql as bilgisayarHql" + "
		// where bilgisayarAdi like '%GK%' ";
		String hql = "select bilgisayarHql from BilgisayarHql as bilgisayarHql"
				+ " where bilgisayarAdi like :keyMatchMode ";
		TypedQuery<BilgisayarHql> typedQuery = session.createQuery(hql, BilgisayarHql.class);

		String matchValue = "GL";

		// MatchMode % göre isim alır
		// MatchMode matchMode = MatchMode.END;
		// MatchMode matchMode = MatchMode.START;
		MatchMode matchMode = MatchMode.ANYWHERE;
		switch (matchMode) {
			case EXACT:
				typedQuery.setParameter("keyMatchMode", matchValue);
				break;

			case ANYWHERE:
				typedQuery.setParameter("keyMatchMode", "%" + matchValue + "%");
				break;

			case START:
				typedQuery.setParameter("keyMatchMode", matchValue + "%");
				break;

			case END:
				typedQuery.setParameter("keyMatchMode", "%" + matchValue);
				break;

			default:
				System.out.println("Lütfen MatchMode düzügün giriniz");
				break;
		}

		List<BilgisayarHql> conditional = (ArrayList<BilgisayarHql>) typedQuery.getResultList();

		System.err.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------");
		for (BilgisayarHql temp : conditional) {
			System.out.println(temp.getBilgisarAdi());
		}

	}

}
