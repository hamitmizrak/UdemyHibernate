package com.hamit.embedded;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.hamit.hibernate.HibernateUtils;

public class EmbeddedQuery {

	public static void main(String[] args) {

		Session session = HibernateUtils.getSessionfactory().openSession();

		// String sql = "select dil from BilgisayarDili as dil where
		// bilgisayarDilAdi='c#'";
		// String sql = "select dil from BilgisayarDili as dil where
		// dil.bilgisayarTeknolojileri.bilgisayarTeknolojiOzellikleri='Web'";
		String web = "Web";
		String sql = "select dil from BilgisayarDili as dil where dil.bilgisayarTeknolojileri.bilgisayarTeknolojiOzellikleri=:key";
		TypedQuery<BilgisayarDili> typedQuery = session.createQuery(sql, BilgisayarDili.class);
		typedQuery.setParameter("key", web);
		List<BilgisayarDili> liste = typedQuery.getResultList();

		for (BilgisayarDili temp : liste) {
			System.out.println(temp.getBilgisayarDiliID() + " " + temp.getBilgisayarDilAdi() + " "
					+ temp.getBilgisayarFirmasi() + " " + temp.getBilgisayarTeknolojileri().getBilgisayarTeknolojiAdi()
					+ " " + temp.getBilgisayarTeknolojileri().getBilgisayarTeknolojiOzellikleri());
		}

	}
}
