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
@Table(name = "yazarEmmeddedId")
public class Yazar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long yazarId;
	private String yazarAdi;

	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date yazarTarih;

	public Yazar() {
		// TODO Auto-generated constructor stub
	}

	public Yazar(long yazarId, String yazarAdi, Date yazarTarih) {
		this.yazarId = yazarId;
		this.yazarAdi = yazarAdi;
		this.yazarTarih = yazarTarih;
	}

	public Yazar(long yazarId, String yazarAdi) {
		this.yazarId = yazarId;
		this.yazarAdi = yazarAdi;
	}

	@Override
	public int hashCode() {
		return Objects.hash(yazarAdi, yazarId, yazarTarih);
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
				&& Objects.equals(yazarTarih, other.yazarTarih);
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

	public Date getYazarTarih() {
		return yazarTarih;
	}

	public void setYazarTarih(Date yazarTarih) {
		this.yazarTarih = yazarTarih;
	}

}
