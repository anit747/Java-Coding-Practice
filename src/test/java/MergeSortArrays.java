
public class MergeSortArrays {
public static void main(String[] args) {
	int a[] = {2,4,6};
	int b[] = {1,7,9,10};
	
	 int len1 = a.length;
	 int len2 = b.length;
	 int [] result  = new int [len1+len2];
	 
	 int i=0;
	 
	 int j=0;
	 int k=0;
	 
	 
	 while( i<len1 && j<len2) {
		 if(a[i]<b[j]) {
			 result[k++] = a[i++];
			 
		 }else {
			result[k++]= b[j++]; 
			 
		 }	
		 
	 }
	 
	 while(i<len1) {
		 result[k++]= a[i++];
	 }
	 
	 while(j<len2) {
		 result[k++]= b[j++];
		 
	 }
	
	for(int h =0;h<result.length;h++) {
		System.out.print(result[h]+ " ");
	}
}

}
