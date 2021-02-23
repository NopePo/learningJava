class Check {
	
	public static void main(String[] args) {
		int maths = 0;
		int science = 0;
		int computer = 0;
		int total = 0;
		float per = 0.0f;
		
		maths = Integer.parseInt(args[0]);
		science = Integer.parseInt(args[1]);
		computer = Integer.parseInt(args[2]);
		
		total = maths + science + computer;
		per = (total / 300.0f) * 100.0f;
		
		System.out.println("Marks: " + total);
		System.out.println("Total Marks: 300");
		System.out.println("Percentage: " + per);
		System.out.println();
		
		
		if(per > 50) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
	}
}