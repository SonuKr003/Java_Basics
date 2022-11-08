package Demo11;

public class Test23 {

	
	public static void main(String[] args) {
		
		String s="Hello";
		String d="world";
		
		s.concat("world");
		System.out.println(s);
		System.out.println(s.concat(d));
		StringBuffer sb=new StringBuffer("Hello");
		StringBuffer sb1=new StringBuffer("Hello");
		sb.append("world");
		System.out.println(sb);
		System.out.println(sb==sb1);
		
	}
}
