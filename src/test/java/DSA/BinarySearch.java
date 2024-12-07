package DSA;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		
		int num [] = {2,5,6,8,9,};
		int key = 5;
		int start = 0;
		int end = num.length-1;
		int index =-1;
		
		int mid = start+(end-start)/2;
		
		
		while(start<=end) {
			
			if(num[mid]==key) {
 				index=mid;
				break;
			}
			
			
			//Go to Right Part
			
			if(key>num[mid]) {
				
				start = mid+1;
			}else {
				
				end = mid-1;
			}
			
			mid = start+(end-start)/2;
		}
		if(index!=-1) {
			
			System.out.println("Element "+ index);
		}else {
			
			System.out.println("Element Not Found");
		}
		
	}

}
