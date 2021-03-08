package com.hamit.enums;

public class EnumMainTest {

	public static void main(String[] args) {
		EnumOrnegi gun = EnumOrnegi.CUMA;
		System.out.println(gun);

		for (EnumOrnegi temp : EnumOrnegi.values()) {
			System.out.println(temp);
		}

		System.out.println(EnumParametre.CUMA);

	}

}
