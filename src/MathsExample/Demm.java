package MathsExample;

public class Demm {

	public static void main(String[] args) {

		String str = "SonuKumarAsDF";
		
		char []ch=str.toCharArray();
		
		int count=0;
		
		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i]>='A' && ch[i]<='Z') {
				
				
				count++;
				
			}
			
		}
		
		System.out.println("UpparCase letter : "+count);
		
		System.out.println("LowrCase letter : "+(ch.length-count));
	}
}
