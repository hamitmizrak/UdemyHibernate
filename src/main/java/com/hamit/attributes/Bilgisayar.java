package com.hamit.attributes;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "bilgisayar")
public class Bilgisayar implements Serializable {
	private static final long serialVersionUID = 4745486170984226627L;

	// nesne değişkenleri
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "bilgisayarId")
	private long bilgisayarId;

	@Column(name = "bilgisayarAdi", nullable = false, length = 5000000, unique = true)
	private String bilgisayarAdi;

	@Column(name = "bilgisayarOzellikleri", length = 300)
	private String bilgisayarOzellikleri;

	@Column(name = "bilgisayarFiyati", scale = 8, precision = 4)
	private double bilgisayarFiyati;

	@Column(updatable = false)
	private String fakeOzellikler;

	@Transient
	private boolean isBilgisayar;

	@Column(name = "tarih", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date tarih;

	@CreationTimestamp
	@Column(name = "simdikiTarih")
	@Temporal(TemporalType.TIMESTAMP)
	private Date simdikiTarih;

	@Version
	private int version;

	// parametresiz constructor
	public Bilgisayar() {
		this.bilgisayarId = 0;
	}

	// parametreli constructor
	public Bilgisayar(long bilgisayarId, String bilgisayarAdi, String bilgisayarOzellikleri, double bilgisayarFiyati,
			Date tarih) {
		this.bilgisayarId = bilgisayarId;
		this.bilgisayarAdi = bilgisayarAdi;
		this.bilgisayarOzellikleri = bilgisayarOzellikleri;
		this.bilgisayarFiyati = bilgisayarFiyati;
		this.tarih = tarih;
	}

	public Bilgisayar(String bilgisayarAdi, String bilgisayarOzellikleri, double bilgisayarFiyati, Date tarih) {
		this.bilgisayarAdi = bilgisayarAdi;
		this.bilgisayarOzellikleri = bilgisayarOzellikleri;
		this.bilgisayarFiyati = bilgisayarFiyati;
		this.tarih = tarih;
	}

	public Bilgisayar(String bilgisayarAdi, String bilgisayarOzellikleri, double bilgisayarFiyati) {
		this.bilgisayarAdi = bilgisayarAdi;
		this.bilgisayarOzellikleri = bilgisayarOzellikleri;
		this.bilgisayarFiyati = bilgisayarFiyati;
	}

	public Bilgisayar(String bilgisayarAdi, String bilgisayarOzellikleri, double bilgisayarFiyati,
			String fakeOzellikler, Date tarih, int version) {
		this.bilgisayarAdi = bilgisayarAdi;
		this.bilgisayarOzellikleri = bilgisayarOzellikleri;
		this.bilgisayarFiyati = bilgisayarFiyati;
		this.fakeOzellikler = fakeOzellikler;
		this.tarih = tarih;
		this.version = version;
	}

	public Bilgisayar(String bilgisayarAdi, String bilgisayarOzellikleri, double bilgisayarFiyati,
			String fakeOzellikler) {
		this.bilgisayarAdi = bilgisayarAdi;
		this.bilgisayarOzellikleri = bilgisayarOzellikleri;
		this.bilgisayarFiyati = bilgisayarFiyati;
		this.fakeOzellikler = fakeOzellikler;
	}

	// hashCode and equals
	@Override
	public int hashCode() {
		return Objects.hash(bilgisayarAdi, bilgisayarFiyati, bilgisayarId, bilgisayarOzellikleri, fakeOzellikler,
				isBilgisayar, tarih, version);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bilgisayar other = (Bilgisayar) obj;
		return Objects.equals(bilgisayarAdi, other.bilgisayarAdi)
				&& Double.doubleToLongBits(bilgisayarFiyati) == Double.doubleToLongBits(other.bilgisayarFiyati)
				&& bilgisayarId == other.bilgisayarId
				&& Objects.equals(bilgisayarOzellikleri, other.bilgisayarOzellikleri)
				&& Objects.equals(fakeOzellikler, other.fakeOzellikler) && isBilgisayar == other.isBilgisayar
				&& Objects.equals(tarih, other.tarih) && version == other.version;
	}

	// toString
	@Override
	public String toString() {
		return "Bilgisayar [bilgisayarId=" + bilgisayarId + ", bilgisayarAdi=" + bilgisayarAdi
				+ ", bilgisayarOzellikleri=" + bilgisayarOzellikleri + ", bilgisayarFiyati=" + bilgisayarFiyati
				+ ", fakeOzellikler=" + fakeOzellikler + ", isBilgisayar=" + isBilgisayar + ", tarih=" + tarih
				+ ", version=" + version + "]";
	}

	// getter and setter
	public long getBilgisayarId() {
		return bilgisayarId;
	}

	public void setBilgisayarId(long bilgisayarId) {
		this.bilgisayarId = bilgisayarId;
	}

	public String getBilgisayarAdi() {
		return bilgisayarAdi;
	}

	public void setBilgisayarAdi(String bilgisayarAdi) {
		this.bilgisayarAdi = bilgisayarAdi;
	}

	public String getBilgisayarOzellikleri() {
		return bilgisayarOzellikleri;
	}

	public void setBilgisayarOzellikleri(String bilgisayarOzellikleri) {
		this.bilgisayarOzellikleri = bilgisayarOzellikleri;
	}

	public double getBilgisayarFiyati() {
		return bilgisayarFiyati;
	}

	public void setBilgisayarFiyati(double bilgisayarFiyati) {
		this.bilgisayarFiyati = bilgisayarFiyati;
	}

	public Date getTarih() {
		return tarih;
	}

	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}

	public String getFakeOzellikler() {
		return fakeOzellikler;
	}

	public void setFakeOzellikler(String fakeOzellikler) {
		this.fakeOzellikler = fakeOzellikler;
	}

	public boolean isBilgisayar() {
		return isBilgisayar;
	}

	public void setBilgisayar(boolean isBilgisayar) {
		this.isBilgisayar = isBilgisayar;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Date getSimdikiTarih() {
		return simdikiTarih;
	}

	public void setSimdikiTarih(Date simdikiTarih) {
		this.simdikiTarih = simdikiTarih;
	}

}
