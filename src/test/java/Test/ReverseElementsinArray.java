package Test;

public class ReverseElementsinArray {
	
	public static void main(String[] args) {
		
		int num [] = {12,13,14,15};
		int n= num.length;
		int start=0;
		int end = n-1;
		
		while(start<end) {
			
			int temp = num[start];
			num[start]= num[end];
			num[end]= temp;
			start++;
			end--;
			
		}for(int i = 0;i<num.length;i++) {
			
			System.out.println(num[i]);
		}
		
	}

}
