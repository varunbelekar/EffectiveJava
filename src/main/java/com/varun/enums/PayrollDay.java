package com.varun.enums;

public enum PayrollDay {
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
	
	private static final int MINS_PER_SHIFT = 60 * 8;
	
	public int pay(int minutesWorked, int payRate) {
		int basePay = minutesWorked * payRate;
		
		int overtimePay;
		switch (this) {
			case SATURDAY: case  SUNDAY://Weekend
				overtimePay = basePay * 2;
				break;
	
			default://Weekday
				overtimePay = (minutesWorked <= MINS_PER_SHIFT) ? 0 : payRate / 2;
				break;
		}
		return overtimePay + basePay;
	}
}
