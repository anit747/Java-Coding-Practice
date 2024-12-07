package PracticeLinkedIn;

public class FindLargestElementDiffMethod {
	
	public static void main(String[] args) {
		
		int num [] = {11,4,55,787,02};
		
		
		int val = num[0];
		
		for(int i=0;i<num.length;i++) {
			
			if(num[i]>val) {
				
				val = num[i];
			}
		}
		System.out.println(val);
	}

}
