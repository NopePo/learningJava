import java.util.Scanner;

class NumberTwo {
	public static void main(String[] args) {
		
		int number = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		number = sc.nextInt();
		
		if(number > 0) {
			System.out.println("! (+) Positive !");
		} else if(number == 0) {
			System.out.println("! Zero !");
		} else {
			System.out.println("! (-) Negative !");
		}
		
		System.out.println();

		
	}
}