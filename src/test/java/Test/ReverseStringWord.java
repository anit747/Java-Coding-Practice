package Test;

public class ReverseStringWord {
	
	public static void main(String[] args) {
		String str = "This is Jav";
		String[] split = str.split(" ");
		String rev = "";
		
		for(int i = split.length-1;i>=0;i--) {
			String word = split[i];
			
			rev = rev + split[i]+ " ";
		}
		
		
		System.out.println(rev);
		
		
		
	}
	

}
