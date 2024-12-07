package Test;

public class CountNumberOfWords {
	public static void main(String[] args) {

		String str = "Anit Kumar";
		String[] split = str.split(" ");
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i)!= ' ') {
				
				count++;	
			}
			
			
			

		}
		System.out.println(count);
	}
}
