package Test;

public class RemoveSpaceFormString {
	
	public static void main(String[] args) {
		
		String str = "ANIT RAI";
		
		String [] words = str.split(" ");
		
		for(int i=0;i<words.length;i++) {
			
			System.out.print(words[i]);
		}
	}

}
