package Practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ask= new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = ask.nextInt();
		int fact = 1;
		for(int i = 1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("the factorial of "+n+" is "+fact);
	}

}
