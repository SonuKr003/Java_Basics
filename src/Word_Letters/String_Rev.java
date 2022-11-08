package Word_Letters;

import java.util.Scanner;

public class String_Rev {

	public static void main(String[] args) {

		String rev = "";

		System.out.println("Please enter a string value which you want to print in reverse");
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		System.out.println(str + " " + str.length());

		for (int i = 0; i < str.length(); i++) {

			rev = str.charAt(i) + rev;
		}

		System.out.println("Rev : " + rev);
	}

}
