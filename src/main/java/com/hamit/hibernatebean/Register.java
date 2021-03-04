package com.hamit.hibernatebean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "register")
public class Register implements Serializable {
	private static final long serialVersionUID = -2307642788212758730L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "name_surname")
	private String nameSurname;

	@Column(name = "email_address")
	private String emailAddress;

	@Column(name = "password")
	private String password;

	//
	public Register() {
		// TODO Auto-generated constructor stub
	}

	public Register(String nameSurname, String emailAddress, String password) {
		super();
		this.nameSurname = nameSurname;
		this.emailAddress = emailAddress;
		this.password = password;
	}

	// getter and setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameSurname() {
		return nameSurname;
	}

	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
