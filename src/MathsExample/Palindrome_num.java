package MathsExample;

import java.util.Scanner;

public class Palindrome_num {

	public static void main(String[] args) {

		int sum = 0, temp = 0, r = 0;

		System.out.println("enter a num to check  whether it is a Palindrom");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		temp = num;

		while (num > 0) {

			r = num % 10;
			sum = sum * 10 + r;
			num = num / 10;

		}
		if (sum == temp) {
			System.out.println("given num is a palindrome num : " + sum);
		} else {
			System.out.println("entered num is not a palindrome num : " + sum);

		}

		System.out.println(sum);

	}
}
