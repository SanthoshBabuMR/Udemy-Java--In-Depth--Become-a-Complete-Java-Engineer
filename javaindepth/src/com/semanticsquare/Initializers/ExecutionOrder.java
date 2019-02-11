package com.semanticsquare.Initializers;

class ExecutionOrder {
	
	//instance initializer
	{
	    System.out.println("instance initializer-1 called");
	}

		
	//constructor
	ExecutionOrder() {
	    System.out.println("constructor called");
	}

	//static initializer
	static {
	    System.out.println("static initializer called - Called only once"); // Try commenting out code within main method
	    System.out.println("");
	}

	//instance initializer
	{
	    System.out.println("instance initializer-2 called");
	}

	public static void main(String[] args) {
		System.out.println(">> Instantiate");
	    new ExecutionOrder();
	    System.out.println("");
	    System.out.println(">> Instantiate");
	    new ExecutionOrder();
	    System.out.println("");
	}
}

