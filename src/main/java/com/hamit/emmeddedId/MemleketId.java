package com.hamit.emmeddedId;

import java.io.Serializable;
import java.util.Objects;

public class MemleketId implements Serializable {
	private static final long serialVersionUID = 1L;

	private long kitapId;
	private long yazarId;

	public MemleketId() {
		// TODO Auto-generated constructor stub
	}

	public MemleketId(long kitapId, long yazarId) {
		this.kitapId = kitapId;
		this.yazarId = yazarId;
	}

	@Override
	public String toString() {
		return "MemleketId [kitapId=" + kitapId + ", yazarId=" + yazarId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(kitapId, yazarId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemleketId other = (MemleketId) obj;
		return kitapId == other.kitapId && yazarId == other.yazarId;
	}

	// getter and setter
	public long getKitapId() {
		return kitapId;
	}

	public void setKitapId(long kitapId) {
		this.kitapId = kitapId;
	}

	public long getYazarId() {
		return yazarId;
	}

	public void setYazarId(long yazarId) {
		this.yazarId = yazarId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
