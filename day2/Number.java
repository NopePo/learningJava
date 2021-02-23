import java.util.Scanner;

class Number {
	
	public static void main(String[] args) {
		
		int number = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		number = sc.nextInt();
		
		if(number > 0) {
			if(number % 2 == 0) {
				System.out.println("(+) Even!");
			} else {
				System.out.println("(+) Odd!");
			}
		} else {
			if(number % 2 == 0) {
				System.out.println("(-) Even!");
			} else {
				System.out.println("(-) Odd!");
			}
		}
	}
	
}