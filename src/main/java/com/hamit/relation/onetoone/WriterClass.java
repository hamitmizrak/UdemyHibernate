package com.hamit.relation.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//1  (Olmazsa olma yapı budur
@Entity
@Table(name = "writer")
public class WriterClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long writerId;

	private String nameSurname;
	private String description;

	// composition
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "writer", optional = false

	)
	private BookClass book;

	public WriterClass() {
		// TODO Auto-generated constructor stub
	}

	public WriterClass(String nameSurname, String description) {
		this.nameSurname = nameSurname;
		this.description = description;

	}

	public long getWriterId() {
		return writerId;
	}

	public void setWriterId(long writerId) {
		this.writerId = writerId;
	}

	public String getNameSurname() {
		return nameSurname;
	}

	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BookClass getBook() {
		return book;
	}

	public void setBook(BookClass book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Writer [writerId=" + writerId + ", nameSurname=" + nameSurname + ", description=" + description
				+ ", book=" + book + "]";
	}

}
