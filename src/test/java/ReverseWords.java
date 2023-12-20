
public class ReverseWords {

	public static void main(String[] args) {
		
		String str = "This is Java";
		
		String [] words = str.split(" ");
		 for(int i = words.length-1;i>=0;i--) {
			 String result = words[i]+" ";
			 System.out.print(result);
		 }
		
	}
}
