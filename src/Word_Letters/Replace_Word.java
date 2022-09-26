package Word_Letters;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Replace_Word {

	public static void main(String[] args) {

		String str = "I love to eat an Apple. Eating an Apple is good for Health. Apple contaion many vitimins";

		String arrStr[] = str.split(" ");

		ArrayList<String> aList = new ArrayList<>();

		for (String string : arrStr) {

			if (string.contains("Apple")) {

				aList.add(string.replaceAll("Apple", "Egg"));

			}

			else {
				aList.add(string);
			}
		}

		for (String string : aList) {

			System.out.print(string + " ");
		}

	}

}
