package com.hamit.emmeddedId;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "kitapEmmeddedId")
public class Kitap implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long kitapId;
	private String kitapAdi;

	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date kitapTarih;

	public Kitap() {
		// TODO Auto-generated constructor stub
	}

	public Kitap(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	public Kitap(long kitapId, String kitapAdi, Date kitapTarih) {
		this.kitapId = kitapId;
		this.kitapAdi = kitapAdi;
		this.kitapTarih = kitapTarih;
	}

	@Override
	public String toString() {
		return "Kitap [kitapId=" + kitapId + ", kitapAdi=" + kitapAdi + ", kitapTarih=" + kitapTarih + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(kitapAdi, kitapId, kitapTarih);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kitap other = (Kitap) obj;
		return Objects.equals(kitapAdi, other.kitapAdi) && kitapId == other.kitapId
				&& Objects.equals(kitapTarih, other.kitapTarih);
	}

	// getter and setter
	public long getKitapId() {
		return kitapId;
	}

	public void setKitapId(long kitapId) {
		this.kitapId = kitapId;
	}

	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	public Date getKitapTarih() {
		return kitapTarih;
	}

	public void setKitapTarih(Date kitapTarih) {
		this.kitapTarih = kitapTarih;
	}

}
