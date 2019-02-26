class X extends AbstractA implements A, B {
	public void foo() {
		System.out.println("ConcreteX: foo");
		System.out.println("A.X: " + A.VAL );
		System.out.println("B.X: " + B.VAL );
	}
} 