package Test;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		int [] nums = {0,0,1,1,1,2,2,3,3,4};
		int re[] = new int[nums.length];
		Set<Integer> set = new HashSet<Integer>();
		for(int i =0;i<nums.length;i++) {
			
			if(set.add(nums[i])==false) {
				
				
			}
		}
		System.out.println(set);
Object[] res = set.toArray();		
		int k = set.size();
		System.out.println(k);
	}

}
