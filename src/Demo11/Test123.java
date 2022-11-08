package Demo11;

import java.util.LinkedHashSet;

public class Test123 {
	public static void main(String[] args) {

		int[] ar = { 1, 2, 4, 3, 5, 6, 7, 8, 9 };

		int[] arr = new int[ar.length];

		int index = 0;
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] % 2 == 0) {

				arr[index] = ar[i];
				index++;
			}

		}
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] % 2 != 0) {

				arr[index] = ar[i];
				index++;
			}

		}

		for (int i = 0; i < ar.length; i++) {

			System.out.print(arr[i]);
			if (i < ar.length - 1) {
				System.out.print(",");
			}
		}

	}
}
