package Test;

import java.util.HashMap;
import java.util.Map;

public class SecondOccuranceOfDuplicateWords {
public static void main(String[] args) {
	
	
	int arr[]  = {12,12,12,12,12,13,13,13,13,14};
	
	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	for(int i=0;i<arr.length;i++) {
		
		if(map.containsKey(arr[i])) {
			
			int count = map.get(arr[i]);
			map.put(arr[i],count+1);
		}else {
			map.put(arr[i], 1);
		}
	}
	
	  int largest = Integer.MIN_VALUE;
	  
	  int second = Integer.MIN_VALUE;
	  
	  for(int occ:map.values()) {
		  if(occ>largest) {
			  
			  second = largest;
			  largest=occ;
			  
		  }else if(occ>second && occ!=largest) {
			  second=occ;
			  
		  }
		  
	  }System.out.println(second);
	
}
}
