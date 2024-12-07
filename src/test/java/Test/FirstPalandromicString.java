package Test;

public class FirstPalandromicString {
	public static void main(String[] args) {
		String [] words = {"abc","car","ada","racecar","cool"};
		String rev = "";
		
		for(int i=0;i<words.length;i++) {
			
			for(int j = words[i].length()-1;j>0;j--) {
				rev = rev + words[j];
				
				System.out.println(words[j]);
			}
			
			
			
		}
		
		
	}

}
