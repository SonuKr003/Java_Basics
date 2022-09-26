package Word_Letters;

public class Rev_Word {

	public static void main(String[] args) {

		String str = "I love to eat an Apple";
		String rev = "";

		String reveachLetter = "";

		String str1[] = str.split(" ");

		for (int i = 0; i < str.length(); i++) {

			reveachLetter = str.charAt(i) + reveachLetter;
		}

		for (int i = 0; i < str1.length; i++) {

			rev = str1[i] + rev;

			if (i < str1.length - 1) {

				rev = " " + rev;
			}

		}

		System.out.println("Rev order: " + rev);
		
		System.out.println("RevEachLetter : "+reveachLetter);

	}
}
