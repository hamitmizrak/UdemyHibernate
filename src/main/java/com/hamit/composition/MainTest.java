package com.hamit.composition;

import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {

		// kim olmazsa olmaz.
		Yazar yazar = new Yazar(1, "Hamit", "Mızrak");
		yazar.setBookList(new ArrayList<Book>());

		Book book = new Book(1, "Java SE", "2021");
		book.setYazar(yazar);
		book.getYazar().getBookList().add(book);

		Book book2 = new Book(1, "Java EE", "2021");
		book2.setYazar(yazar);
		book2.getYazar().getBookList().add(book2);

		Book book3 = new Book(1, "Hibernate", "2021");
		book3.setYazar(yazar);

		book3.getYazar().getBookList().add(book3);

		System.out.println(yazar);
		for (Book bookTemp : book3.getYazar().getBookList()) {
			System.out.println(bookTemp.getBookId() + "\t" + bookTemp.getBookAdi() + "\t" + bookTemp.getBookyayimTarih()
					+ "\t" + bookTemp.getYazar().getYazarId() + "\t" + bookTemp.getYazar().getYazarAdi() + "\t"
					+ bookTemp.getYazar().getYazarSoyadi());
		}

	}

}
