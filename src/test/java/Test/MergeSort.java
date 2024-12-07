package Test;

public class MergeSort {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int b[] = {6,7,8,9};
		
		int c[] = new int [a.length+b.length];
		
		for(int i =0;i<a.length;i++) {
			
			c[i]=a[i];
		}
		for(int j=0;j<b.length;j++) {
			
			c[a.length+j] = b[j];
		}for(int h =0;h<c.length;h++) {
			
			System.out.println(c[h]);
		}

	}
}
