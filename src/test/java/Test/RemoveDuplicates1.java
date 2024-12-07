package Test;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates1 {
	public static void main(String[] args) {
		String str = "Anitaa";
String res = "";
		Set<Character> set = new HashSet<Character>();
		for(int i =0;i<str.length();i++) {
			
			if(!set.contains(str.charAt(i))) {
				set.add(str.charAt(i));
				res = res+str.charAt(i) ;

			} 			
		}
System.out.println(res);
	}
}
