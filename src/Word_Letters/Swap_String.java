package Word_Letters;

public class Swap_String {

	public static void main(String[] args) {

		String s1 = "Demon";

		String s2 = "Salvatore";

		s1 = s1.concat(s2);

		s2 = s1.substring(0, (s1.length() - s2.length()));
		
		s1=s1.substring(s2.length());
		
		System.out.println(s1 +" : "+s2);

	}

}
