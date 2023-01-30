package Practice;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 23610, rev = 0;

		while (num != 0) {
			int i = num % 10;
			rev = rev * 10 + i;
			num = num / 10;
		}
		System.out.println("the reverse of integer value is" + rev);
	}

}
