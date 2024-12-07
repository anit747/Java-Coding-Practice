package Test;

public class CountPairsLess {
	public static void main(String[] args) {
		
		int [] nums1 = {1,2,2,1};
		int [] nums2 = {2,2};
		
		
		int i = nums1[0];
		int j = nums2[nums2.length-1];
		
		int res[] = new int[nums1.length];
		while(i<j) {
			
			if(nums1[i]==nums2[j]) {
				res[0] = nums1[i];
				j--;
				i++;
				
				break;
			}
			
		}System.out.println(res);
		
	}

}
