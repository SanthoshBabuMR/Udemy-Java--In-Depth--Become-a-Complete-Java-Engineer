class CompareBoxPrimitive {
	
	public static void main(String[] args) {

		Integer n1 = new Integer(1);
		Integer n2 = new Integer(1);
		String s1 = new String("hello");
		String s2 = new String("hello");
		String s3 = "world";
		String s4 = "world";
		
		System.out.println("");
		System.out.println("box primitive: n1 == n2: " + (n1 == n2));
		System.out.println("");
		System.out.println("box primitive: n1.intValue() == n2.intValue(): " + (n1.intValue() == n2.intValue()));
		System.out.println("");
		System.out.println("box primitive: n1.equals(n2): " + n1.equals(n2));
		System.out.println("");
		System.out.println("String object: s1 == s2: " + (s1 == s2));
		System.out.println("");
		System.out.println("String object: s1.equals(s2): " + (s1.equals(s2)));
		System.out.println("");
		System.out.println("String primitive: s3 == s4: " + (s3 == s4));
		
		Integer n3 = new Integer(11);
		System.out.println("");
		System.out.println("box primitive: n1 < n3: " + (n1 < n3)); // does auto unboxing
		System.out.println("");
		
		Integer i;
		
		  if (i==0) 
		    System.out.println("weird!");
		
		
	}
}
