package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement {

	
	public static void main(String[] args) {
		
		
		int [] nums = {2,2,1,1,1,2,2};
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i =0;i<nums.length;i++) {
			
			if(map.containsKey(nums[i])) {
				
				int count = map.get(nums[i]);
				map.put(nums[i], count +1);
			}else {
				
				map.put(nums[i], 1);
			}
			
		}
		List <Integer> list =  new ArrayList<Integer>();

		System.out.println(map);
		for(int occ: map.values()) {
			
			list.add(occ);

		}
		
 		list.sort(null);
 		
 		for(Entry<Integer, Integer> it:map.entrySet()) {
 			if(it.getValue().equals(list.get(list.size()-1))) {
 				int res = it.getKey();
 				System.out.println(res);
 			}
 			
 		}
 		 
	}
}
