package Test;

public class MergeSortArray {

	public static void main(String[] args) {
		int a [] = {1,2,3};
		int b [] = {4,5,6};
		int res [] = new int[a.length+b.length] ;
		int i = 0,j= 0,k=0;
		
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				res[k++] = a[i++];
				
			}else {
				
				res[k++] = b[j++];
			}
			
		}
		while(i<a.length) {
			
			res[k++] = a[i++];
		}while(j<b.length) {
			
			res[k++] = b[j++];
		}
		
		
		for(int h =0 ;h<res.length;h++) {
			
			System.out.println(res[h]);
		}
	}
	
}
