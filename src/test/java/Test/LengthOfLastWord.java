package Test;

public class LengthOfLastWord {
	
	public static void main(String[] args) {
		
		String s = "Hello World";
		String len="";
		 int length =0;
		String split [] = s.split(" ");
		
		for(int i =split.length-1;i>=0;i--) {
			
			length	= split[split.length-1].length();
			
			 
			
		}
		System.out.println(length);
		
	}
	

}
