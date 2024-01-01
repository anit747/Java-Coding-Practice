package Test;

public class FindLargestElementinArray {
	
	public static void main(String[] args) {
		int num [] = {12,13,14,25,24,23};
		int val = num[0];
		
		for(int i =0;i<num.length;i++) {
			
			if(num[i]>val) {
				
				val = num[i];
			
				
			}
			
		}	System.out.println(val);
		
		
	}

}
