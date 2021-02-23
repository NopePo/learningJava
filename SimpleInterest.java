class SimpleInterest {
	public static void main(String[] args) {
		
		int p;
		int t;
		float r;
		float i;
		
		p = Integer.parseInt(args[0]);
		t = Integer.parseInt(args[1]);
		r = Float.parseFloat(args[2]);
		
		i = (p * r * t) / 100.0f;
		
		System.out.println("Principle: " + p);
		System.out.println("Time: " + t);
		System.out.println("Rate: " + r);
		System.out.println("Interest: " + i);
		
		
	}
}