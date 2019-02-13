class BoxPrimitivePerformance {
	static void veryExpensive() {
		System.out.println("very expensive");
		Long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum = sum + i;
		}
	}

	static void nonExpensive() {
		System.out.println("non expensive");
		long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum = sum + i;
		}
	}

	public static void main(String[] args) {

		long expensiveStart = System.currentTimeMillis();
		veryExpensive();
		System.out.println("Elapsed time: " + ((System.currentTimeMillis() - expensiveStart)) + " mseconds");
		
		System.out.println("");
		
		long nonExpensiveStart = System.currentTimeMillis();
		nonExpensive();
		System.out.println("Elapsed time: " + ((System.currentTimeMillis() - nonExpensiveStart)) + " mseconds");
	}
}
