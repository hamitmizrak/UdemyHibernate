package com.hamit.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "denemeClass")
@SessionScoped
public class A3ManagedBeanClass implements Serializable {
	private static final long serialVersionUID = -2960430523768740600L;

	// nesne değişkenleri
	private long id;
	private String name;
	private String surname;

	// parametresiz constructor
	public A3ManagedBeanClass() {
		this.id = 0;
		this.name = "adi alani girilmedi";
		this.surname = "soyadi alani girilmedi";
	}

	// parametreli constructor
	public A3ManagedBeanClass(long id, String name, String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
	}

	// getter setter
	public long getId() {
		return id;
	}

	public void setId(long id) {
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

}
