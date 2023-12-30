package Test;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
	public static void main(String[] args) {
		
		String str = "ABCDEFABCD";
		
		int i =0;
		int j=0;
		int count=0;
		
		Set<Character> set = new HashSet<Character>();
		while(i<str.length()&& j<str.length()) {
		if(!set.contains(str.charAt(j))) {
			
		set.add(str.charAt(j));
		j++;
		count= Math.max(count, j-i);
		
		
		}else {
			
			set.remove(str.charAt(i));
			i++;
		}
		
		
				
	}System.out.println(count);}

}
