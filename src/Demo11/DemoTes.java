package Demo11;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class DemoTes {

	public static void main(String[] args) {

		String str = "HelloSonuKumar7889855021";

		char ch[] = str.toCharArray();

		LinkedHashSet<Character> hset = new LinkedHashSet();

		for (Character character : ch) {

			hset.add(character);

		}

		for (char c : hset) {

			int count = 0;

			for (int i = 0; i < ch.length; i++) {

				if (c == ch[i]) {

					count++;

				}

			}
			System.out.println("count : " + count + " --> " + c);

		}

		System.out.println();
		System.out.println();

		String word = "Apple is a fruit. I love to eat  Apple. Apple is good for health.";

		String words[] = word.split(" ");

		ArrayList<String> alist = new ArrayList();

		for (int i = 0; i < words.length; i++) {

			if (words[i].contains("Apple")) {
				
				alist.add(words[i].replaceAll("Apple", "Bannana"));

			} else {

				alist.add(words[i]);
			}

		}

		for(String str1 : alist) {
			
			System.out.print(str1+" ");
			System.out.print(".,");
			
		}
		
	}

}
