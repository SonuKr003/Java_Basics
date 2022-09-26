package MathsExample;

import java.util.Scanner;

public class Prime_Num {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num wherete to check its is a prime or not");

		int num = sc.nextInt();

		boolean flag = true;

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {

				flag = false;
				break;

			}
		}

		if (flag == false) {
			System.out.println("not a prime num");
		}

		else {
			System.out.println("prime num");
		}

	}
}
