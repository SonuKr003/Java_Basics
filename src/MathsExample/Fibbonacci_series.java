package MathsExample;

import java.util.Scanner;

public class Fibbonacci_series {

	public static void main(String[] args) {

		int a = 0, b = 1, c, sum = 0;

		System.out.println("enter a num upto you want fibbonacci series");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		System.out.print(a + "," + b+",");

		for (int i = 2; i < num; i++) {

			c = a + b;
			
			System.out.print(c);
			
			if (i < num - 1) {
				System.out.print(",");
			}
			
			a=b;
			b=c;
			

		}
	}
}
