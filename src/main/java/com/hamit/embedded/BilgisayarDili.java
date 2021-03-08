package com.hamit.embedded;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "bilgisayarDili", indexes = { @Index(columnList = "bilgisayarDilAdi,bilgisayarFirmasi") })
public class BilgisayarDili implements Serializable {
	private static final long serialVersionUID = -5267811200958837758L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bilgisayarDiliID;
	private String bilgisayarDilAdi;
	private String bilgisayarFirmasi;

	// composition
	@Embedded
	private BilgisayarTeknolojileri bilgisayarTeknolojileri;

	// parametresiz constructor
	public BilgisayarDili() {
		// TODO Auto-generated constructor stub
	}

	// parametreli constructor
	public BilgisayarDili(String bilgisayarDilAdi, String bilgisayarFirmasi) {
		this.bilgisayarDilAdi = bilgisayarDilAdi;
		this.bilgisayarFirmasi = bilgisayarFirmasi;
	}

	@Override
	public String toString() {
		return "BilgisayarDili [bilgisayarDiliID=" + bilgisayarDiliID + ", bilgisayarDilAdi=" + bilgisayarDilAdi
				+ ", bilgisayarFirmasi=" + bilgisayarFirmasi + ", bilgisayarTeknolojileri=" + bilgisayarTeknolojileri
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bilgisayarDilAdi, bilgisayarDiliID, bilgisayarFirmasi, bilgisayarTeknolojileri);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BilgisayarDili other = (BilgisayarDili) obj;
		return Objects.equals(bilgisayarDilAdi, other.bilgisayarDilAdi) && bilgisayarDiliID == other.bilgisayarDiliID
				&& Objects.equals(bilgisayarFirmasi, other.bilgisayarFirmasi)
				&& Objects.equals(bilgisayarTeknolojileri, other.bilgisayarTeknolojileri);
	}

	// getter and setter
	public long getBilgisayarDiliID() {
		return bilgisayarDiliID;
	}

	public void setBilgisayarDiliID(long bilgisayarDiliID) {
		this.bilgisayarDiliID = bilgisayarDiliID;
	}

	public String getBilgisayarDilAdi() {
		return bilgisayarDilAdi;
	}

	public void setBilgisayarDilAdi(String bilgisayarDilAdi) {
		this.bilgisayarDilAdi = bilgisayarDilAdi;
	}

	public String getBilgisayarFirmasi() {
		return bilgisayarFirmasi;
	}

	public void setBilgisayarFirmasi(String bilgisayarFirmasi) {
		this.bilgisayarFirmasi = bilgisayarFirmasi;
	}

	public BilgisayarTeknolojileri getBilgisayarTeknolojileri() {
		return bilgisayarTeknolojileri;
	}

	public void setBilgisayarTeknolojileri(BilgisayarTeknolojileri bilgisayarTeknolojileri) {
		this.bilgisayarTeknolojileri = bilgisayarTeknolojileri;
	}

}
