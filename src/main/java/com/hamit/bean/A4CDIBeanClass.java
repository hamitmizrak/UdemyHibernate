package com.hamit.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "cdiBeanClass")
@SessionScoped
public class A4CDIBeanClass implements Serializable {
	private static final long serialVersionUID = -2960430523768740600L;

	// nesne değişkenleri
	private long id;
	private String name;
	private String surname;

	// parametresiz constructor
	public A4CDIBeanClass() {
		this.id = 0;
		this.name = "adi alani girilmedi";
		this.surname = "soyadi alani girilmedi";
	}

	// parametreli constructor
	public A4CDIBeanClass(long id, String name, String surname) {
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
