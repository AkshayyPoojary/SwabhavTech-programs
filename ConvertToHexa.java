package Practice;

import java.util.Scanner;

public class ConvertToHexa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Hexadecimal number: "+ Integer.toHexString(number));
	}

}
