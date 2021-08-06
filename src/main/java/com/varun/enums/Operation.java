package com.varun.enums;

public enum Operation {
	PLUS,
	MINUS,
	MULTIPLY,
	DIVIDE;
	
	public double apply(double x, double y) {
		switch (this) {
			case PLUS:
				return x + y;
			case MINUS:
				return x - y;
			case MULTIPLY:
				return x * y;
			case DIVIDE:
				return x / y;
		}
		return 0;
	}
}
