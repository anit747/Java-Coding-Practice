import java.util.Arrays;

public class CheckTwoArraysEqual {
	public static void main(String[] args) {
		
		int []arr1 = {12,13,14,15};
		int [] arr2 = {12,13,14,15};
		
		boolean result = Arrays.equals(arr1, arr2);
		
		if(result==true) {
			
			System.out.println("Equal");
		}else {
			
			System.out.println("Not");
		}
	}

}
