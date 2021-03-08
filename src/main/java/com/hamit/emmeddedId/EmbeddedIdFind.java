package com.hamit.emmeddedId;

import org.hibernate.Session;

import com.hamit.hibernate.HibernateUtils;

public class EmbeddedIdFind {

	public static void main(String[] args) {

		Session session = HibernateUtils.getSessionfactory().openSession();

		long kitapId = 1;
		long yazarID = 1;
		MemleketId memleketId = new MemleketId(kitapId, yazarID);
		Memleket memleket = session.find(Memleket.class, memleketId);

		System.out
				.println(memleket.getMemleketId() + " " + memleket.getMemleketi() + " " + memleket.getMemleketTarih());
	}
}
