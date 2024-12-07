package Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {
	public static void main(String[] args) {
	
		
		int [] nums = {1,2,3,1};
		

//        Map <Integer, Integer> map = new HashMap<Integer, Integer> ();
        Set<Integer> set = new HashSet<Integer>();
        for(int i =0;i<nums.length;i++) {
		if(set.add(nums[i])==false) {
			
			System.out.println("True");
			break;
		}else {
			
			System.out.println("False");
			break;
		}
	}
	
		
	}
	

}
