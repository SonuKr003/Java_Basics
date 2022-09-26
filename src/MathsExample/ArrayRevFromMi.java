package MathsExample;

import java.util.Iterator;

public class ArrayRevFromMi {
	public static void main(String[] args) {

		int ch[] = { 1, 2, 3, 4, 5, 6, 7 };

		int spaceCount = 2;

		int count = 0;

		int print = 2;

		int num1 = ch.length;
		int num2 = 0;
		int i = 0;
		int num=0;
		i=num;
		int threeDigit = 0;
		

		while (5 > num2) {
			for ( i = 2; i >= 0; i--) {

				System.out.println(ch[i]);
				count++;
				num--;
				num2++;

			}
			i=count+num;
			
		}

	}
}