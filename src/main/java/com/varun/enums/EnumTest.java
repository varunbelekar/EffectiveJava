package com.varun.enums;

public class EnumTest {
	public static void main(String[] args) {
		double earthWeight = 63.5;
		double mass = earthWeight / Planet.EARTH.getSurfaceGravity();
		
		for (Planet planet : Planet.values()) {
			System.out.printf("Weight on planet %s is %f%n", planet, planet.surfaceWeight(mass));
		}
	}
}
