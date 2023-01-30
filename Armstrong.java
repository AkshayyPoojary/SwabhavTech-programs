package Practice;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter numbers");
		int a = in.nextInt();
		int check = a;
		int rem;
		int sum=0;
//		for (int i = a; i < b; i++) {
//			int check = i;
//			int rem, sum = 0;
			while (a>0) {
				rem = a % 10;
				a = a / 10;
				sum = sum + (rem * rem * rem * rem);

			}
			if (check==sum) {
				System.out.println( sum + " is an Armstrong number");
			}
			else {
				System.out.println("its not an armstrong number!");
			}
		}
	}

