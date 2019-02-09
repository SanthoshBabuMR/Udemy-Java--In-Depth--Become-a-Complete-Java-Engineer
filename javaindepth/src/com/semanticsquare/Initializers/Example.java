package com.semanticsquare.Initializers;

class Example {
	
	Example () {
		System.out.println("Inside No-arg constructor");
	}
	Example (int id) {
		System.out.println("Inside constructor with a parameter");
	}
	
	{
		System.out.println("Inside instance initializer");
	}
	
	public static void main(String[] args) {
		Example e = new Example();
		System.out.println("");
		Example e2 = new Example(12);
	}
}