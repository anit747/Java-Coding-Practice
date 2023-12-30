package Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateWords {
	
	public static void main(String[] args) {
		
		String str = "This is JAVA JAVA";
		
		String [] split = str.split(" ");
		Map<String, Integer> map =new HashMap<String, Integer>();
		
		for(String word:split) {
			if(map.containsKey(word)) {
				int count  =map.get(word);
				map.put(word,count+1);
			}else {
				
				map.put(word, 1);
			}
			
			
		}
		
		Set<String> set = map.keySet();
		
		for(String words:set) {
			
			if(map.get(words)>1) {
				
				System.out.println(map.get(words) );
			}
		}
		
		
		

		
	}

}
