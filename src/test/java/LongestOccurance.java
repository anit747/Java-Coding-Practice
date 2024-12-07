
public class LongestOccurance {
	
	public static void main(String[] args) {
		
		int [] arr = {10,11,12,20,40,50,65};
		int count = 0;
		int max = 0;
		for(int i =0;i<arr.length-1;i++) {
			 if(arr[i]+1==arr[i+1]) {
				 count ++;
				 
			 }
//			 else {
//				 
//				 count = 0;
//			 }
//			 max = Math.max(max, count+1);
		}
		System.out.println( count+1);
		
		
		
	}

}
