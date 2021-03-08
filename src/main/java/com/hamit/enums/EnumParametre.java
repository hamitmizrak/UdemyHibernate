package com.hamit.enums;

//ice
public enum EnumParametre {

	PAZARTESI(1, "pazartesi"), SALI(2, "salı"), CARSAMBA(3, "carsamba"), PERSEMBE(4, "persembe"), CUMA(5, "cuma"),
	CUMARTESI(6, "cumartes"), PAZAR(7, "pazar");

	private final int id;
	private final String gun;

	private EnumParametre(int id, String gun) {
		this.id = id;
		this.gun = gun;
	}

	public int getId() {
		return id;
	}

	public String getGun() {
		return gun;
	}

}
