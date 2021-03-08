package com.hamit.enums;

import org.hibernate.Session;

import com.hamit.hibernate.HibernateUtils;

public class CreateEnum {

	public static void main(String[] args) {

		EnumEntity enumEntity = new EnumEntity();
		enumEntity.setAdi("Hamit Mızrak");
		enumEntity.setEnumParametre(EnumParametre.PAZARTESI);

		Session session = HibernateUtils.getSessionfactory().openSession();
		session.getTransaction().begin();
		session.persist(enumEntity);
		session.getTransaction().commit();
		System.out.println("enum eklendi");
	}
}
