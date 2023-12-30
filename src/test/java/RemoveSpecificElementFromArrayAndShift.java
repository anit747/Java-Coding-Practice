import java.util.Arrays;

public class RemoveSpecificElementFromArrayAndShift {
	public static void main(String[] args) {
		int arr [] = {12,13,14,15};
		int key= 2;
		if(key>=0 && key<arr.length) {
		for(int i=key;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
			
		}
		arr=Arrays.copyOf(arr, arr.length-1);
		
		System.out.println(Arrays.toString(arr));
		}else {
			
			System.out.println("OOB");
		}
		
	}
		
		
		
		
	
	
	

}
