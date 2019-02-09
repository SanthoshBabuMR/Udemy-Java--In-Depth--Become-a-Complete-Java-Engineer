package com.semanticsquare.StaticVariables;

public class StaticVariablesAccessibility {
	int instanceVar;
	static int staticVar;
	
	public void instanceMethod () { // can access both static and instance members
		System.out.println("Within instanceMethod:");
		System.out.println("instanceVar: " + instanceVar);
		System.out.println("staticVar: " + staticVar);
		System.out.println("");
	}
	
	public static void staticMethod () { // can access only static members
		System.out.println("Within staticMethod:");
//		System.out.println("instanceVar: " + instanceVar); // Compiler error: accessing non-static member from static member
		System.out.println("staticVar: " + staticVar);
		
		
		System.out.println("");
	}
	public static void main (String[] args) {
		StaticVariablesAccessibility sva = new StaticVariablesAccessibility();
		sva.instanceMethod();
		sva.staticMethod(); // implict conversion from reference variable to classname
	}
}