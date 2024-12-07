package Test;

import java.util.HashMap;
import java.util.Map;

public class WordOccurances {
	public static void main(String[] args) {

		String str ="I am Java developer I am proud of it";
		// Output: Java: 1, proud: 1, of: 1, I: 2, developer: 1, it: 1, am: 2

		
		String split [] = str.split(" ");
		Map<String , Integer> map = new HashMap<String, Integer>();
		
		for(int i =0;i<split.length;i++) {
			
			if(map.containsKey(split[i])) {
				
				
				int count = map.get(split[i]);
			
				map.put(split[i],count+1);
			 
				
				
			}else {
				
				map.put(split[i], 1);
			}
		}
			System.out.println(map);
		
	}
}
