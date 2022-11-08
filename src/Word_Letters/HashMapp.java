package Word_Letters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;

public class HashMapp {

	public static void main(String[] args) {

		HashMap<Integer, String> hMap = new HashMap<>();

		hMap.put(1, "Demon");
		hMap.put(1, "Demon");// duplicate won't allow
		hMap.put(2, "Demon");
		hMap.put(3, "Demon");
		hMap.put(4, "Demon");

		System.out.println(hMap); // direclt we can printing

		for (Map.Entry m : hMap.entrySet()) {

			System.out.println(m.getKey() + " : " + m.getValue());

		}

		ArrayList<Integer> aInteger = new ArrayList<>();

		aInteger.add(1);
		aInteger.add(2);
		aInteger.add(3);
		ArrayList<String> aString = new ArrayList<>();

		aString.add("Sonu");
		aString.add("Kumar");
		aString.add("demons");

		Map<Integer, String> hMap1 = new TreeMap<>();

		hMap1.put(1, null);
		hMap1.put(11, "text");
	//	hMap1.put(null, null);
		//`1qhMap1.put(null, "hello");
		System.out.println(hMap1.size());

	}

}
