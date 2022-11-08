package Word_Letters;

public class StringExamples {

	public static void main(String[] args)  {
		
		
		String s="sonu";
		String s1="sonu";
		
		String str=new String(s1);
		String str1=new String(s1);
		
		
		System.out.println(s==s1);/// TRUE--> because of constant pool area that's why address is same
		System.out.println(str==str1);// False because of non constant pool area
		
		
		StringBuilder sb=new StringBuilder("Demon");
		StringBuilder sb1=new StringBuilder(sb);
		StringBuilder sb2=new StringBuilder("Demon");
		
		System.out.println((sb==sb1)+"  "+(sb==sb2));// fales
		
		String[] str11= {"SOnu", "Kumar"};
		
		
		try {

			System.out.println("hello");
			
		}
		
		/*
		 * catch (Exception e) {
		 * 
		 * 
		 * System.out.println("hey"); }
		 */
			
		
		
		finally {
			
		}
		
	}

}
