package com.varun.enums;

public enum PayrollDay {
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY(Paytype.WEEKEND),SUNDAY(Paytype.WEEKEND);
	
	private final Paytype paytype;
	
	PayrollDay() {
		this(Paytype.WEEKDAY);
	}
	
	PayrollDay(Paytype paytype) {
		this.paytype = paytype;
	}
	
	public int pay(int minsWorked, int payRate) {
		return paytype.pay(minsWorked, payRate);
	}
	
	private enum Paytype{
		WEEKDAY{
			public int overtimePay(int minsWorked, int payRate) {
				return minsWorked <= MINS_PER_SHIFT ? 0 :
					(minsWorked - MINS_PER_SHIFT) * payRate / 2;
			}
		}, WEEKEND{
			public int overtimePay(int minsWorked, int payRate) {
				return minsWorked * payRate / 2;
			}
		};
		
		abstract int overtimePay(int minsWorked, int payRate);
		
		private static final int MINS_PER_SHIFT = 8 * 60;
		
		public int pay(int minsWorked, int payRate) {
			int basePay = minsWorked * payRate;
			return basePay + overtimePay(minsWorked, payRate);
		}
	}
}
