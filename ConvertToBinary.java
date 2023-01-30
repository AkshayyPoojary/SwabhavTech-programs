package Practice;

import java.util.Scanner;

public class ConvertToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter thhe number:");
		Scanner sc=new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Binary number: "+ Integer.toBinaryString(number));
	}

}
