import java.util.Scanner;


class Even {
	public static void main(String[] args) {
		int number = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		number = sc.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("!Even Number!");
		} else {
			System.out.println("!Odd Number!");
		}
		
		System.out.println();
	}
}