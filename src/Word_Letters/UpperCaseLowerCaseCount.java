package Word_Letters;

import java.util.Iterator;

public class UpperCaseLowerCaseCount {

	public static void main(String[] args) {

		String str = "Hello Hey Java";

		int ucount=0, lcount = 0;

		String str1[] = str.split(" ");

		for (int i = 0; i < str1.length; i++) {

			char[] ch = str1[i].toCharArray();

			for (int j = 0; j < ch.length; j++) {
				
				if (ch[j] >= 'A' && ch[j] <= 'Z') {
					
					ucount++;

				}
				
				else {
					
					lcount++;
				}

			}

		}

		System.out.println("Upper Case count :" + ucount + " Lower case Count : " + lcount );
		
		
		String name="DemonsKUmarDD";
		
		int Ucout=0;
		int lowCount=0;
		
		for (int i = 0; i < name.length(); i++) {
			
			char c=name.charAt(i);
			
			if(c>='A' && c<='Z') {
				
				Ucout++;
			}
			else {
				
				lowCount++;
			}
			
			
		}
		
		System.out.println(lowCount+" : "+Ucout);
		
		
	}

}
