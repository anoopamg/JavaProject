package test;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 3;
		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			int res = num % i;
			if (res == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println("This is a prime number");
		} else {
			System.out.println("This is NOT a prime number");
		}

	}

}
