package Test;

public class RotateElementAsPerKey {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50,60};
		int n =2;
		
		for(int i =0;i<n;i++) {
			int last = arr[arr.length-1];
			for(int j =arr.length-1;j>0;j--) {
				arr[j]=arr[j-1];
				
			}
			arr[0] = last;
		}
		
		
		for(int h =0;h<arr.length;h++) {
			
			System.out.println(arr[h]);
		}
	}
	
	
}
