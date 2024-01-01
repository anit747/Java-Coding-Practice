
public class FindMissingNumber {

	public static void main(String[] args) {
		
		int num[] ={1,2,4,5};
		int sum = 0;
		for(int i=0;i<num.length;i++) {
			
			sum = sum + num[i];
			
		}
		int sum1 =0;
		for(int j = 1;j<6;j++) {
			
			 sum1 = sum1 + j;
		}
	System.out.println(sum1-sum);	
	}
	
}
