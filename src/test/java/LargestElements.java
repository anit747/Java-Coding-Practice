
public class LargestElements {
	public static void main(String[] args) {
		
		int [] arr = {12,55,45};
		int val = arr[0];
		
		for(int i = 0;i<arr.length;i++) {
			
			if(arr[i]>val) {
				
				val = arr[i];
				
			}
			
		}System.out.println(val);
	}
	
	
	

}
