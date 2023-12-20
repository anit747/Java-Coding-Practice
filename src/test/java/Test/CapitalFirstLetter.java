package Test;

public class CapitalFirstLetter {
	public static void main(String[] args) {
		String str = "hi i am testing";
		
		String [] words = str.split(" ");
		for(int i = 0;i<words.length;i++) {
			char c = words[i].charAt(0);
			 String sub = String.valueOf(c).toUpperCase();
			
			
		}System.out.println(c);
		
	}

}
