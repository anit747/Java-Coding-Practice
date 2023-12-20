
public class FindMissingNumbers {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,6};
		int sum=0;
		for(int i =0;i<arr.length;i++) {
			sum =sum +arr[i];
			
		}
		
		int sum1 =0;
		
		for(int j =0;j<=6;j++) {
			
			sum1 = sum1 +j;
		}
		
		int result = sum1-sum;
		System.out.println(result);
	}
	

}
