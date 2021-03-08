package com.hamit.composition;

import java.util.Objects;

//N
public class Book {

	private long bookId;
	private String bookAdi;
	private String bookyayimTarih;

	// composition
	private Yazar yazar;

	public Book() {
		this.bookId = 0;
	}

	public Book(long bookId, String bookAdi, String bookyayimTarih) {
		this.bookId = bookId;
		this.bookAdi = bookAdi;
		this.bookyayimTarih = bookyayimTarih;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookAdi=" + bookAdi + ", bookyayimTarih=" + bookyayimTarih + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookAdi, bookId, bookyayimTarih);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(bookAdi, other.bookAdi) && bookId == other.bookId
				&& Objects.equals(bookyayimTarih, other.bookyayimTarih);
	}

	// getter and setter
	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getBookAdi() {
		return bookAdi;
	}

	public void setBookAdi(String bookAdi) {
		this.bookAdi = bookAdi;
	}

	public String getBookyayimTarih() {
		return bookyayimTarih;
	}

	public void setBookyayimTarih(String bookyayimTarih) {
		this.bookyayimTarih = bookyayimTarih;
	}

	public Yazar getYazar() {
		return yazar;
	}

	public void setYazar(Yazar yazar) {
		this.yazar = yazar;
	}

}
