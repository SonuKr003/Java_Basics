package MathsExample;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Array_Sort {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 6, 7, 4, 9, 11, 7, 8, 12, 9 };
		int temp = 0;

		LinkedHashSet<Integer> lHset = new LinkedHashSet();

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

			lHset.add(arr[i]);

		}

		System.out.println(lHset);

		ArrayList<Integer> aList = new ArrayList<>(lHset);

		System.out.println("4th highest num : " + aList.get(3));

		Array_Sort a1 = new Array_Sort();

		System.out.println(a1);

	}

}
