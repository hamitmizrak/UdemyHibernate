package com.hamit.anotation;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

@Entity
@Table(name = "anotation")
public class EntityTutorials implements Serializable {
	private static final long serialVersionUID = -6125040517186480736L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "adi", length = 120, nullable = true)
	private String name;

	@Column(name = "soyadi", length = 255, unique = true, insertable = false, updatable = false)
	private String surname;

	@Column(name = "maas", precision = 10, scale = 3)
	private double salary;

	@Transient // database bu kolonu yazma
	private String dataChange;

	@Version // transaction:sadece 1 tanesi değiştirebilir
	private Long version;

	@Lob
	private String bigData;

	@Lob
	private byte[] byteDizisi;

	@Lob
	private char[] charDizisi;

	@Temporal(TemporalType.DATE)
	private java.util.Date date;

	// parametresiz constructor
	public EntityTutorials() {
		this.id = 0L;

	}

	// parametreli constructor
	public EntityTutorials(String name, String surname, double salary) {
		this.name = name;
		this.surname = surname;
		this.salary = salary;
	}

	// getter and setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getDataChange() {
		return dataChange;
	}

	public void setDataChange(String dataChange) {
		this.dataChange = dataChange;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public String getBigData() {
		return bigData;
	}

	public void setBigData(String bigData) {
		this.bigData = bigData;
	}

	public byte[] getByteDizisi() {
		return byteDizisi;
	}

	public void setByteDizisi(byte[] byteDizisi) {
		this.byteDizisi = byteDizisi;
	}

	public char[] getCharDizisi() {
		return charDizisi;
	}

	public void setCharDizisi(char[] charDizisi) {
		this.charDizisi = charDizisi;
	}

	public java.util.Date getDate() {
		return date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

}
