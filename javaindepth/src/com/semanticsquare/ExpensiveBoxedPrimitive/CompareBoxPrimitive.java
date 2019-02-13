class CompareBoxPrimitive {
	
	public static void main(String[] args) {

		Integer n1 = new Integer(1);
		Integer n2 = new Integer(1);
		
		System.out.println("");
		System.out.println("box primitive: n1 == n2: " + (n1 == n2));
		System.out.println("");
		System.out.println("box primitive: n1.intValue() == n2.intValue(): " + (n1.intValue() == n2.intValue()));
		System.out.println("");
		System.out.println("box primitive: n1.equals(n2): " + n1.equals(n2));
		System.out.println("");
		
		Integer n3 = new Integer(11);
		System.out.println("box primitive: n1 < n3: " + (n1 < n3)); // does auto unboxing
		System.out.println("");
		
	}
}
