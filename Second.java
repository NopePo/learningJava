class Second {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int sum = 0;
		float x = 0.0f;
		
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		
		System.out.println("Hello, World\n");
		sum = a + b;
		System.out.println("Sum: " + sum);
		x = (float)a / b;
		System.out.println("Quotient: " + x);
		sum = a % b;
		System.out.println("Remainder: " + sum);
		System.out.println();
		System.out.println("Max: " + (a > b ? a : b));
	}

	
}