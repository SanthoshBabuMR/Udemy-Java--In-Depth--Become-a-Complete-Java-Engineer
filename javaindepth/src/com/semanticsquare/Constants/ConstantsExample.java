package com.semanticsquare.Constants;



class ConstantsExample {
	
	static final byte month3 = 3;
	
//	static {
//		month3 = 3; // This is a static initializer block, initializing a final variable. This is not treated as a constant, since, constants are compile time values; This iniitalizer block executed during run time 
//	}
	
	static void switchExample() {
		System.out.println("\nInside switchExample");
		final byte month2 = 2;
		byte month = 3;
		switch(month) {
			case 1: System.out.println("Jan");
					break;
			case month2: System.out.println("Feb"); // Without final keyword for month2 variable, switch stmt would throw error: constant expression required
					break;
			case month3: System.out.println("Mar");
					break;
			default: System.out.println("Apr");
		}
	}
	
	public static void main(String[] args) {
		switchExample();
	}
}