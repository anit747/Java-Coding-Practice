import java.util.HashSet;
import java.util.Set;

public class CountOfUnClosedBracket {
	public static void main(String[] args) {
		String str = "((()";       //1
		int count = 0;
		int i=0;
	Set	<Character> set = new HashSet<Character>();
	
	while(i<str.length()) {
		if(set.add(str.charAt(i))) {
			 
			System.out.println(set);
			
		}
		
	}
		 
	}

}


//(