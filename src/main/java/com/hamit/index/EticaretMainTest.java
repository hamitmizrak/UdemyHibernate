package com.hamit.index;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.hamit.hibernate.HibernateUtils;

public class EticaretMainTest {

	public static void main(String[] args) {
		Session session = HibernateUtils.getSessionfactory().openSession();
		//// CreatePersist
		// for (int i = 0; i < 10000; i++) {
		//
		// session.getTransaction().begin();
		//
		// Eticaret eticaret = new Eticaret();
		// eticaret.setUrunAdi("java " + i);
		// eticaret.setUrunFiyati(i * 20 + " TL ");
		// eticaret.setUrunKullanimSuresi((i + 2000) + " ürün kullanım süresi");
		// eticaret.setUrunMiktari((i + 100) + " ürün miktarı");
		// eticaret.setUrunStokMiktari((i + 2) + " tane ürün stok");
		//
		// session.persist(eticaret);
		// session.getTransaction().commit();
		// }
		// System.out.println("Veriler eklendi");

		// Session session = HibernateUtils.getSessionfactory().openSession();
		String sql = " sele t eticaret from Eticaret as eticaret order by urunAdi ";
		TypedQuery<Eticaret> typedQuery = session.createQuery(sql, Eticaret.class);
		List<Eticaret> eticaretList = typedQuery.getResultList();

		for (Eticaret eticaretFor : eticaretList) {
			System.out.println(eticaretFor.getUrunAdi() + " " + eticaretFor.getUrunKullanimSuresi() + " "
					+ eticaretFor.getUrunKullanimSuresi() + " " + eticaretFor.getTarih());
		}

	}

}
