package Test;

public class SecondLargestElement {
public static void main(String[] args) {
	
	int num [] = {12,15,18,17};
	
	
	for(int i =0;i<num.length;i++) {
		for(int j =i+1;j<num.length;j++) {
			
			if(num[i]<num[j]) {
				int temp = num[i];
				num[i] = num[j];
				num[j] = temp;
				
				
			}
			
		}
		
	}System.out.print(num[num.length-3]);
	
}
}
