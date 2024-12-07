 package Test;

public class TwoSum {
	
	public static void main(String[] args) {
		
		
		int nums [] = {-3,2,3,3,6,8,15};
		int target = 6;
		int start =0;
		int end = nums.length-1;
		int res[] = new int [2];
		while(start<end) {
			
			int sum = nums[start]  + nums[end];
			
			if(sum==target) {
				
				res [0]= start +1;
				res[1] = end +1 ;
				break;
			}else if(sum<target) {
				
				start++;
				
			}else {
				
				end--;
			}
			
		}
		for(int h=0;h<res.length;h++) {
			
			System.out.println(res[h]);
		}
		
		
	}

}
