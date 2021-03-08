package com.hamit.enums;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "enumTable", indexes = { @Index(columnList = "adi") })
public class EnumEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "adi")
	private String adi;

	@Temporal(TemporalType.DATE)
	@CreationTimestamp
	private java.util.Date tarih;

	@Enumerated(EnumType.STRING)
	private EnumParametre enumParametre;

	public EnumEntity() {
		// TODO Auto-generated constructor stub
	}

	public EnumEntity(String adi, Date tarih, EnumParametre enumParametre) {
		this.adi = adi;
		this.enumParametre = enumParametre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(adi, enumParametre, id, tarih);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EnumEntity other = (EnumEntity) obj;
		return Objects.equals(adi, other.adi) && enumParametre == other.enumParametre && id == other.id
				&& Objects.equals(tarih, other.tarih);
	}

	@Override
	public String toString() {
		return "EnumEntity [id=" + id + ", adi=" + adi + ", tarih=" + tarih + ", enumParametre=" + enumParametre + "]";
	}

	// getter and setter
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public java.util.Date getTarih() {
		return tarih;
	}

	public void setTarih(java.util.Date tarih) {
		this.tarih = tarih;
	}

	public EnumParametre getEnumParametre() {
		return enumParametre;
	}

	public void setEnumParametre(EnumParametre enumParametre) {
		this.enumParametre = enumParametre;
	}

}
