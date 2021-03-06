package com.hamit.relation.onetoone;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//1
@Entity
@Table(name = "book")
public class BookClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookId;

	private String bookName;
	private String bookYear;

	// composition
	@OneToOne(fetch = FetchType.LAZY)
	private WriterClass writer;

	public BookClass() {
		// TODO Auto-generated constructor stub
	}

	public BookClass(String bookName, String bookYear) {
		this.bookName = bookName;
		this.bookYear = bookYear;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookYear() {
		return bookYear;
	}

	public void setBookYear(String bookYear) {
		this.bookYear = bookYear;
	}

	public WriterClass getWriter() {
		return writer;
	}

	public void setWriter(WriterClass writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookYear=" + bookYear + ", writer=" + writer
				+ "]";
	}

}
