package com.hamit.index;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

//(indexes = { @Index(columnList = "urunAdi,urunFiyati,urunMiktari", name = "urunAdiIndex") })
@Entity
@Table(indexes = { @Index(name = "eticaretIndex", unique = true, columnList = "urunAdi,urunFiyati,urunMiktari") })
public class Eticaret implements Serializable {
	private static final long serialVersionUID = 2889182375072656629L;

	// nesne değişkenleri
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long eTicaretId;

	@Column(name = "urunAdi")
	private String urunAdi; // index
	private String urunFiyati;// index
	private String urunMiktari;// index
	private String urunStokMiktari;
	private String urunKullanimSuresi;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date tarih;

	// parametresiz constructor
	public Eticaret() {
		this.eTicaretId = 0;
		this.urunAdi = "urun adi girilmedi";
	}

	// parametreli constructor
	public Eticaret(String urunAdi, String urunFiyati, String urunMiktari, String urunStokMiktari,
			String urunKullanimSuresi, Date tarih) {
		this.urunAdi = urunAdi;
		this.urunFiyati = urunFiyati;
		this.urunMiktari = urunMiktari;
		this.urunStokMiktari = urunStokMiktari;
		this.urunKullanimSuresi = urunKullanimSuresi;
		this.tarih = tarih;
	}

	// hashcode and equals
	@Override
	public int hashCode() {
		return Objects.hash(eTicaretId, tarih, urunAdi, urunFiyati, urunKullanimSuresi, urunMiktari, urunStokMiktari);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Eticaret other = (Eticaret) obj;
		return eTicaretId == other.eTicaretId && Objects.equals(tarih, other.tarih)
				&& Objects.equals(urunAdi, other.urunAdi) && Objects.equals(urunFiyati, other.urunFiyati)
				&& Objects.equals(urunKullanimSuresi, other.urunKullanimSuresi)
				&& Objects.equals(urunMiktari, other.urunMiktari)
				&& Objects.equals(urunStokMiktari, other.urunStokMiktari);
	}

	// toString
	@Override
	public String toString() {
		return "Eticaret [eTicaretId=" + eTicaretId + ", urunAdi=" + urunAdi + ", urunFiyati=" + urunFiyati
				+ ", urunMiktari=" + urunMiktari + ", urunStokMiktari=" + urunStokMiktari + ", urunKullanimSuresi="
				+ urunKullanimSuresi + ", tarih=" + tarih + "]";
	}

	// getter and setter
	public long geteTicaretId() {
		return eTicaretId;
	}

	public void seteTicaretId(long eTicaretId) {
		this.eTicaretId = eTicaretId;
	}

	public String getUrunAdi() {
		return urunAdi;
	}

	public void setUrunAdi(String urunAdi) {
		this.urunAdi = urunAdi;
	}

	public String getUrunFiyati() {
		return urunFiyati;
	}

	public void setUrunFiyati(String urunFiyati) {
		this.urunFiyati = urunFiyati;
	}

	public String getUrunMiktari() {
		return urunMiktari;
	}

	public void setUrunMiktari(String urunMiktari) {
		this.urunMiktari = urunMiktari;
	}

	public String getUrunStokMiktari() {
		return urunStokMiktari;
	}

	public void setUrunStokMiktari(String urunStokMiktari) {
		this.urunStokMiktari = urunStokMiktari;
	}

	public String getUrunKullanimSuresi() {
		return urunKullanimSuresi;
	}

	public void setUrunKullanimSuresi(String urunKullanimSuresi) {
		this.urunKullanimSuresi = urunKullanimSuresi;
	}

	public Date getTarih() {
		return tarih;
	}

	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}

}
