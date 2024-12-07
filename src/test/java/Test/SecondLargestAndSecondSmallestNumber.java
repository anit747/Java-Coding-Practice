package Test;

public class SecondLargestAndSecondSmallestNumber {
public static void main(String[] args) {
	
	
	int num [] = {20,10,30,50,40,70,60};
	int len = num.length;
	for(int i =0;i<num.length;i++) {
		for(int j =i+1;j<num.length;j++) {
			
			if(num[i]<num[j]) {
				
				int temp = num[i];
				num[i] = num[j];
				num[j] =  temp;
				
			}
			
		}
		
	}
	
	for(int h =0;h<num.length;h++) {
		
		 System.out.println(num[len-len+1]);
		System.out.println(num[num.length-2]);
		break;
		
		
	}
}
}
