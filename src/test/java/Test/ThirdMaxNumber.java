package Test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ThirdMaxNumber {
	public static void main(String[] args) {

		int nums[] = {1,2147483647,-2147483648};

		// The third distinct maximum is 1.

		Set<Integer> set = new TreeSet<Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (set.add(nums[i])) {

			}

		} 
			
			
			 System.out.println(set);
		 
		Integer res[] = set.toArray(new Integer[set.size()]);

		for (int h = 0; h < res.length; h++) {
                if(res.length<=2) {
                	
                	System.out.println(res[res.length-1]);
                	break;
                }
//                	else if(res){
//                	
//                	
//                }
                else {
                	System.out.print(res[res.length-3]);
                	break;
                	
                }
		}
		
	}

}
