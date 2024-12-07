package Test;

public class TripletZero {
	
	public static void main(String[] args) {
		
		int [] nums = {0,-1,2,-3,1 };//0
		int total =0;
		for(int i =0;i<nums.length;i++) {
			
			total =total + nums[i];
			
			
		}
		if(total==0) {
			
			System.out.println("True");
		}else {
			
			System.out.println("False");
		}
	}

}
