package Test;

import java.util.HashMap;
import java.util.Map;

public class FindtheDifference {
	
	public static void main(String[] args) {
		
		
		String s = "abcd";
		String t = "abcde";
		 
		char[] c  = s.toCharArray();
		char[] d = t.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char e:c ) {
			
			map.put(e, map.getOrDefault(e,0) +1);
		}
		
		for(char e:d){
			map.put(e, map.getOrDefault(e,0)-1);
			 if(map.get(e)<0) {
				 System.out.println(e);
				 
			 }
		}
		
		
	}

}
