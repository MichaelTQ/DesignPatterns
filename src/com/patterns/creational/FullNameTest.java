package com.patterns.creational;

public class FullNameTest {
	public static void main(String[] args) {
		FullName name0 = new FullName
				.FullNameBuilder("Tong", "Qiang")
				.salutation("King")
				.createFullName();
		System.out.println(name0);
		
		FullName name1 = new FullName
				.FullNameBuilder("Aoi", "Sola")
				.suffix("Actress")
				.createFullName();
		System.out.println(name1);
	}
}
