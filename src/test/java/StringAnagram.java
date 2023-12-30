import java.util.Arrays;

public class StringAnagram {
	
	public static void main(String[] args) {
		String first = "Peek";
		String second = "Keep";
		
		char [] c1 = first.toLowerCase().toCharArray();
		char[] c2 = second.toLowerCase().toCharArray();
		
		
		Arrays.sort(c1);	
		Arrays.sort(c2);
		 
		boolean status = Arrays.equals(c1, c2);

		if(status) {
			System.out.println("Anagram");
			
		}else {
			
			System.out.println("Not Anagram");
		}
		
		
		
	}

}
