package com.hamit.hql;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "BilgisayarHql")
public class BilgisayarHql implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String bilgisayarAdi;
	private int bilgisayarFiyati;
	private String bilgisayarSurumu;
	private String bilgisayarIslemci;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date tarih;

	public BilgisayarHql() {
		// TODO Auto-generated constructor stub
	}

	public BilgisayarHql(String bilgisayarAdi, int bilgisayarFiyati, String bilgisayarSurumu,
			String bilgisayarIslemci) {
		this.bilgisayarAdi = bilgisayarAdi;
		this.bilgisayarFiyati = bilgisayarFiyati;
		this.bilgisayarSurumu = bilgisayarSurumu;
		this.bilgisayarIslemci = bilgisayarIslemci;
	}

	@Override
	public String toString() {
		return "BilgisayarHql [id=" + id + ", bilgisayarAdi=" + bilgisayarAdi + ", bilgisayarFiyati=" + bilgisayarFiyati
				+ ", bilgisayarSurumu=" + bilgisayarSurumu + ", bilgisayarIslemci=" + bilgisayarIslemci + ", tarih="
				+ tarih + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bilgisayarAdi, bilgisayarFiyati, bilgisayarIslemci, bilgisayarSurumu, id, tarih);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BilgisayarHql other = (BilgisayarHql) obj;
		return Objects.equals(bilgisayarAdi, other.bilgisayarAdi)
				&& Objects.equals(bilgisayarFiyati, other.bilgisayarFiyati)
				&& Objects.equals(bilgisayarIslemci, other.bilgisayarIslemci)
				&& Objects.equals(bilgisayarSurumu, other.bilgisayarSurumu) && id == other.id
				&& Objects.equals(tarih, other.tarih);
	}

	// getter and setter
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBilgisarAdi() {
		return bilgisayarAdi;
	}

	public void setBilgisarAdi(String bilgisarAdi) {
		this.bilgisayarAdi = bilgisarAdi;
	}

	public int getBilgisayarFiyati() {
		return bilgisayarFiyati;
	}

	public void setBilgisayarFiyati(int bilgisayarFiyati) {
		this.bilgisayarFiyati = bilgisayarFiyati;
	}

	public String getBilgisayarSurumu() {
		return bilgisayarSurumu;
	}

	public void setBilgisayarSurumu(String bilgisayarSurumu) {
		this.bilgisayarSurumu = bilgisayarSurumu;
	}

	public String getBilgisayarIslemci() {
		return bilgisayarIslemci;
	}

	public void setBilgisayarIslemci(String bilgisayarIslemci) {
		this.bilgisayarIslemci = bilgisayarIslemci;
	}

	public java.util.Date getTarih() {
		return tarih;
	}

	public void setTarih(java.util.Date tarih) {
		this.tarih = tarih;
	}

}
