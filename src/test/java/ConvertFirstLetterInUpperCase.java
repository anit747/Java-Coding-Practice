
public class ConvertFirstLetterInUpperCase {
	public static void main(String[] args) {
		String input = "anit rai";
		String req="";
		String [] words = input.split(" ");
		
		for(int i = 0;i<words.length;i++) {
			 char c  = words[i].charAt(0);
			String c1 = String.valueOf(c).toUpperCase();
			String sub  = words[i].substring(1);
			req =  req + c1+sub+" "; 

		}	
		 System.out.print(req.trim());		
	}

}
