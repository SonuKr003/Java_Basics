package MathsExample;

import java.util.Scanner;

public class SwitchToMaths {

	public static void main(String[] args) {

		String str = "Sonu Kumar Hello";

		String revOrder = "";

		String revLetter = "";

		for (int i = 0; i < str.length(); i++) {

			revOrder = str.charAt(i) + revOrder;
		}

		System.out.println(revOrder);

		String revorder1[] = revOrder.split(" ");

		String revv = "";

		for (int i = 0; i < revorder1.length; i++) {

			revv = revorder1[i] + revv;

			if (i < revorder1.length - 1) {

				revv = " " + revv;
			}
		}
		System.out.println(revv);

	
		System.out.println("chosse operator ex:- +,-,*,%");
		Scanner sc = new Scanner(System.in);

		char ch = sc.next().charAt(0);

		int a = 5;
		int b = 10;

		int sum = 0;

		switch(ch) {
		case '+':
			sum = a + b;
			System.out.println("Additon : " + sum);

			break;

		case '-':

			sum = b - a;
			System.out.println("subtractions : " + sum);

			break;

		case '*':
			sum = a * b;
			System.out.println("multi : " + sum);

			break;

		case '%':
			sum = b % a;

			System.out.println("Remider : " + sum);

			break;

		default:
			break;
		}

	}

}
