package com.hamit.relation.onetoone;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.hamit.hibernate.HibernateUtils;

public class RelationOneToOneTestMain {

	public static void main(String[] args) {
		WriterClass writer = new WriterClass("Hamit Mızrak", "Java");

		BookClass book = new BookClass("Spring Boot", "2021");
		book.setWriter(writer);
		writer.setBook(book);

		Session session = HibernateUtils.getSessionfactory().openSession();
		session.getTransaction().begin();
		session.persist(writer);
		session.persist(book);
		session.getTransaction().commit();
		System.err.println("başarılı eklendi");

		System.out.println("-------------------");
		// find
		long id = 1;
		WriterClass writerClass = session.find(WriterClass.class, id);
		System.out.println(writer.getNameSurname() + writer.getDescription());
		System.out.println(writer.getBook().getBookName());

		// find (Join)
		System.out.println("++++++++++++++++++++++++");
		Session session2 = HibernateUtils.getSessionfactory().openSession();
		long id2 = 5;
		String sql = "select book from BookClass as book where book.writer.writerId=:key";
		TypedQuery<BookClass> typedQuery = session2.createQuery(sql, BookClass.class);
		typedQuery.setParameter("key", id2);

		BookClass bookClass2 = typedQuery.getSingleResult();
		System.out.println(bookClass2.getBookId() + "\t" + bookClass2.getBookName() + "\t" + bookClass2.getBookYear()
				+ "\t" + bookClass2.getWriter().getNameSurname() + "\t" + bookClass2.getWriter().getDescription()

		);

	}
}
