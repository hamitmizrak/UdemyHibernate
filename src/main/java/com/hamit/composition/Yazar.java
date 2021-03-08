package com.hamit.composition;

import java.util.List;
import java.util.Objects;

//1
public class Yazar {

	private long yazarId;
	private String yazarAdi;
	private String yazarSoyadi;

	// composition
	private List<Book> bookList;// = new ArrayList<Book>();

	public Yazar() {
		this.yazarId = 0;

	}

	public Yazar(long yazarId, String yazarAdi, String yazarSoyadi) {
		this.yazarId = yazarId;
		this.yazarAdi = yazarAdi;
		this.yazarSoyadi = yazarSoyadi;
	}

	@Override
	public String toString() {
		return "Yazar [yazarId=" + yazarId + ", yazarAdi=" + yazarAdi + ", yazarSoyadi=" + yazarSoyadi + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(yazarAdi, yazarId, yazarSoyadi);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Yazar other = (Yazar) obj;
		return Objects.equals(yazarAdi, other.yazarAdi) && yazarId == other.yazarId
				&& Objects.equals(yazarSoyadi, other.yazarSoyadi);
	}

	// getter and setter
	public long getYazarId() {
		return yazarId;
	}

	public void setYazarId(long yazarId) {
		this.yazarId = yazarId;
	}

	public String getYazarAdi() {
		return yazarAdi;
	}

	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}

	public String getYazarSoyadi() {
		return yazarSoyadi;
	}

	public void setYazarSoyadi(String yazarSoyadi) {
		this.yazarSoyadi = yazarSoyadi;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

}
