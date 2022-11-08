package Demo11;

import java.util.HashSet;

public class DemoTest {

	public static void main(String[] args) {

		String str = "sonu 123432 kumaron%$%";

		HashSet<Character> hset = new HashSet<>();

		char ch[] = str.toCharArray();

		for (char s1 : ch) {

			hset.add(s1);

		}

		for (char c : hset) {
			int count = 0;

			for (int i = 0; i < ch.length; i++) {

				if (c == ch[i]) {

					count++;

				}

			}

			System.out.println(count + " : " + c);

		}

	}

}