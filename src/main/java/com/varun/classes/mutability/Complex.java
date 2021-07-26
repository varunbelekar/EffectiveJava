package com.varun.classes.mutability;

public final class Complex {
	private final double real;
	private final double imaginary;

	private Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public static Complex valueOf(double real, double imaginary) {
		return new Complex(real, imaginary);
	}

	public double getReal() {
		return real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public Complex plus(Complex c) {
		return new Complex(real + c.real, imaginary + c.imaginary);
	}

	public Complex minus(Complex c) {
		return new Complex(real - c.real, imaginary - c.imaginary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Complex)) {
			return false;
		}
		Complex c = (Complex) obj;
		return Double.compare(real, c.real) == 0 && Double.compare(imaginary, c.imaginary) == 0;
	}

	@Override
	public int hashCode() {
		return 31 * Double.hashCode(real) + Double.hashCode(imaginary);
	}

	@Override
	public String toString() {
		return "Complex [real=" + real + ", imaginary=" + imaginary + "]";
	}

}
