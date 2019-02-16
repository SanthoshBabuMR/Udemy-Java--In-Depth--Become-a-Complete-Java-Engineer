 class Defaults {
	
	static int staticVarInt;
	static double staticVarDouble;
	static char staticVarChar;
	static String staticVarString;
	static Defaults staticVarDefaultsObject;
	
	int instanceVarInt;
	double instanceVarDouble;
	char instanceVarChar;
	String instanceVarString;
	Defaults instanceVarDefaultsObject;
	
	void print() {
		int localVarInt;
		double localVarDouble;
		char localVarChar;
		String localVarString;
		Defaults localVarHelloDefaults;
		
		System.out.println("");
		System.out.println(">> Default values are not applicable for Local Variables");
		System.out.println("   >> Access/Print of uninitialized local variables throws compile time errors");
		
//		System.out.println("localVarInt: " + localVarInt);
//		System.out.println("localVarDouble: " + localVarDouble);
//		System.out.println("localVarChar: " + localVarChar);
//		System.out.println("localVarString: " + localVarString);
//		System.out.println("localVarHelloWorldObject: " + localVarHelloWorldObject); 
		
	}
	 
	public static void main(String[] args) {
		Defaults defaults = new Defaults();
		
		System.out.println("");
		System.out.println("Default values: Instance Variables");
		System.out.println("instanceVarInt: " + defaults.instanceVarInt);
		System.out.println("instanceVarDouble: " + defaults.instanceVarDouble);
		System.out.println("instanceVarChar: " + defaults.instanceVarChar);
		System.out.println("instanceVarString: " + defaults.instanceVarString);
		System.out.println("instanceVarDefaultsObject: " + defaults.instanceVarDefaultsObject);
		
		System.out.println("");
		System.out.println("Default values: Static Variables");
		System.out.println("staticVarInt: " + staticVarInt);
		System.out.println("staticVarDouble: " + staticVarDouble);
		System.out.println("staticVarChar: " + staticVarChar);
		System.out.println("staticVarString: " + staticVarString);
		System.out.println("staticVarDefaultsObject: " + staticVarDefaultsObject);
		
		defaults.print();
		System.out.println("");
			
	}
	

}
