package com.hamit.emmeddedId;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "memleketEmmeddedId")

public class Memleket implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MemleketId memleketId;
	private String memleketi;

	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private final Date memleketTarih = null;

	public Memleket() {
		// TODO Auto-generated constructor stub
	}

	public Memleket(MemleketId memleketId, String memleketi) {
		this.memleketId = memleketId;
		this.memleketi = memleketi;
	}

	@Override
	public String toString() {
		return "Memleket [memleketId=" + memleketId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(memleketId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Memleket other = (Memleket) obj;
		return Objects.equals(memleketId, other.memleketId);
	}

	// getter and setter
	public MemleketId getMemleketId() {
		return memleketId;
	}

	public void setMemleketId(MemleketId memleketId) {
		this.memleketId = memleketId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getMemleketi() {
		return memleketi;
	}

	public void setMemleketi(String memleketi) {
		this.memleketi = memleketi;
	}

	public Date getMemleketTarih() {
		return memleketTarih;
	}

}
