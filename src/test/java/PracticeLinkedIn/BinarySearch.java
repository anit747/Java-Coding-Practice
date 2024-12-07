package PracticeLinkedIn;

public class BinarySearch {

	public static void binarySearch(int key, int num[], int index) {
		
		int start = 0;
		int end = num.length-1;
		
		int mid = start+(end-start)/2;
		
		while(start<=end) {
			
			if(num[mid]== index) {
				index= mid;
				break;
				
			}
			if(key>num[mid]) {
				
			start =mid+1;
			}else {
				
				end= mid-1;
			}
			mid=start+(end-start)/2;
		}
		if(index!=-1) {
			
			System.out.println(index);
		}else {
			
			System.out.println("Not Fpund"); 
		}
		
	}
	public static void main(String[] args) {
		
		
		int num [] = {5,2,3};
		BinarySearch.binarySearch(5, num, -1);
		
	} 
	
}
