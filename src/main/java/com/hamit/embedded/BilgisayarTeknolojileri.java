package com.hamit.embedded;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.Transient;

//@Id kullanma
//@Entity kullanma
@Embeddable
public class BilgisayarTeknolojileri implements Serializable {
	private static final long serialVersionUID = -5267811200451837758L;

	private String bilgisayarTeknolojiAdi;
	private String bilgisayarTeknolojiOzellikleri;

	// composition
	@Transient
	private BilgisayarDili bilgisayarDili;

	// parametresiz constructor
	public BilgisayarTeknolojileri() {
		// TODO Auto-generated constructor stub
	}

	// parametreli constructor
	public BilgisayarTeknolojileri(String bilgisayarTeknolojiAdi, String bilgisayarTeknolojiOzellikleri) {
		this.bilgisayarTeknolojiAdi = bilgisayarTeknolojiAdi;
		this.bilgisayarTeknolojiOzellikleri = bilgisayarTeknolojiOzellikleri;
	}

	@Override
	public String toString() {
		return "BilgisayarTeknolojileri [bilgisayarTeknolojiAdi=" + bilgisayarTeknolojiAdi
				+ ", bilgisayarTeknolojiOzellikleri=" + bilgisayarTeknolojiOzellikleri + ", bilgisayarDili="
				+ bilgisayarDili + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bilgisayarDili, bilgisayarTeknolojiAdi, bilgisayarTeknolojiOzellikleri);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BilgisayarTeknolojileri other = (BilgisayarTeknolojileri) obj;
		return Objects.equals(bilgisayarDili, other.bilgisayarDili)
				&& Objects.equals(bilgisayarTeknolojiAdi, other.bilgisayarTeknolojiAdi)
				&& Objects.equals(bilgisayarTeknolojiOzellikleri, other.bilgisayarTeknolojiOzellikleri);
	}

	// getter and setter
	public String getBilgisayarTeknolojiAdi() {
		return bilgisayarTeknolojiAdi;
	}

	public void setBilgisayarTeknolojiAdi(String bilgisayarTeknolojiAdi) {
		this.bilgisayarTeknolojiAdi = bilgisayarTeknolojiAdi;
	}

	public String getBilgisayarTeknolojiOzellikleri() {
		return bilgisayarTeknolojiOzellikleri;
	}

	public void setBilgisayarTeknolojiOzellikleri(String bilgisayarTeknolojiOzellikleri) {
		this.bilgisayarTeknolojiOzellikleri = bilgisayarTeknolojiOzellikleri;
	}

	public BilgisayarDili getBilgisayarDili() {
		return bilgisayarDili;
	}

	public void setBilgisayarDili(BilgisayarDili bilgisayarDili) {
		this.bilgisayarDili = bilgisayarDili;
	}

}
