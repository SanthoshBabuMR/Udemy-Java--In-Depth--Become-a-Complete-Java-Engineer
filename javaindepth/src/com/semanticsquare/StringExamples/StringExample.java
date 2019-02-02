package com.semanticsquare.StringExamples;

public class StringExample {
	public static void main (String... args) {
		System.out.println("\nInside StringExamples ...");
		String s = "hello world!";
		System.out.println("s: " + s);

		System.out.println("\ns.length(): " + s.length());
		System.out.println("\ns.isEmpty(): " + s.isEmpty());

		// Comparison
		System.out.println("\nComparison op:");
		System.out.println("-------------");
		System.out.println("\ns.equals(\"HELLO WORLD!\"): " + s.equals("HELLO WORLD!"));
		System.out.println("\ns.equalsIgnoreCase(\"HELLO WORLD!\"): " + s.equalsIgnoreCase("HELLO WORLD!"));
		System.out.println("\ns.compareTo(\"HELLO WORLD!\"): " + s.compareTo("HELLO WORLD!"));

		// Searching
		System.out.println("\nSearching op:");
		System.out.println("-------------");
		System.out.println("\ns.contains(\"HELLO WORLD!\"): " + s.contains("HELLO WORLD!"));
		System.out.println("\ns.contains(\"world!\"): " + s.contains("world!"));
		System.out.println("\ns.startsWith(\"HELLO WORLD!\"): " + s.startsWith("HELLO WORLD!"));
		System.out.println("\ns.startsWith(\"hello world!\"): " + s.startsWith("hello world!"));
		System.out.println("\ns.endsWith(\"!\"): " + s.contains("!"));
		System.out.println("\ns.indexOf(\"lo\"): " + s.indexOf("lo"));
		System.out.println("\ns.indexOf(\"o\"): " + s.indexOf("o"));
		System.out.println("\ns.lastIndexOf(\"o\"): " + s.lastIndexOf("o"));
		System.out.println("\ns.lastIndexOf(\"z\"): " + s.lastIndexOf("z"));

		// Examining Individual Characters
		System.out.println("\nExamining Individual Characters:");
		System.out.println("-------------");
		System.out.println("\ns.charAt(4): " + s.charAt(4));
		try {
			System.out.println("\ns.charAt(40): " + s.charAt(40));	
		} catch(Exception e) {
			System.out.println("\ns.charAt(40): " + e);	
		}
		
		// Extracting substrings
		System.out.println("\nExtracting substrings:");
		System.out.println("-------------");
		System.out.println("\ns.substring(4): " + s.substring(4));
    	System.out.println("\ns.substring(4,9): " + s.substring(4,9));
    	try {
    		System.out.println("\ns.substring(9,4): " + s.substring(9,4));	
    	} catch(Exception e) {
    		System.out.println("\ns.substring(9,4): " + e);
    	}

    	// Case Translation
		System.out.println("\nCase Translation:");
		System.out.println("-------------");
		System.out.println("\ns.toUpperCase(): " + s.toUpperCase());
    	System.out.println("\ns.toLowerCase(): " + s.toLowerCase());
		System.out.println("\ns.trim(): " + s.trim());

		// Replace
		System.out.println("\nReplace:");
		System.out.println("-------------");
		System.out.println("\ns.replaceAll(\"o\", \"r\"): " + s.replaceAll("o", "r"));


		// Split
		System.out.println("\nSplit:");
		System.out.println("-------------");
	    String[] sa = s.split("o");
	    for (String temp: sa) {
	      	System.out.println(temp);
	    }

	    // Static Methods
		System.out.println("\nStatic Methods:");
		System.out.println("-------------");
    	System.out.println("\nString.valueOf(1.3): " + String.valueOf(1.3));
	}
}