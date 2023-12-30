package Test;

public class MergeAndSortArray {
	public static void main(String[] args) {
		
		int[]a = {2,3,5};
		int [] b = {1,4};
		
		int i=0;
		int j =0;
		int k=0;
		int len= a.length;
		int len1=b.length;
		int [] result = new int[len+len1];
		
		while(i<len&&j<len1) {
			
			if(a[i]<b[j]) {
				
				result[k++]= a[i++];
			}
			else {
				result[k++]= b[j++];
				
			}
		}
		
		while(i<len) {
			result[k++]= a[i++];
			
		}
		while(j<len1) {
			result[k++]= a[j++];
			
		}
		for(int h=0;h<result.length;h++) {
			
			System.out.println(result[h]);
		}
			
	}
	

}
