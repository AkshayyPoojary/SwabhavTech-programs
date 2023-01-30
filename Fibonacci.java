package Practice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("To find the nth Fibonacci series");
		System.out.println("type any number:");
		Scanner ask = new Scanner(System.in);
		int n = ask.nextInt();
		int a = 0;
		int b = 1;
		int count = 1;
		while (count < n) {
			int val = b;
			a = a + b;
			b = a + val;
			count++;
		}
		System.out.println(a);
	}
}
//for (int i = 0; i< n; i++) {
//count = a + b;
//
//}

//for(int i = 0;i<=n;i++) {
//for(int j=1;j<=i;j++) {
//	int count= 0;
//	count = count+ n;
//}
//System.out.println(n);
//}