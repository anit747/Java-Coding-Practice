package Test;

public class ReverseOnlyLetters {
	
	public static void main(String[] args) {
		String s = "ab-cd";
		String rev = "";
		String[] split  = s.split("-");
		 
		String str = new StringBuilder(split[0]).reverse().toString();
		String str1 = new StringBuilder(split[1]).reverse().toString();

		 
		
		
		 System.out.println(str + "-"+ str1);
	}

}
