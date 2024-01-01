package Test;

import java.util.Arrays;

public class RemoveSpecificElements {
	public static void main(String[] args) {
		
		int arr[] = {20,40,60,80,100};
		
		int h =0;
		int result[] = new int [arr.length-1];
		int key=1;
		for(int i=0;i<arr.length;i++) {
			if(i!=key) {
				result[h]=arr[i];
				h++;
			}
			
		}System.out.println(Arrays.toString(result));
		
	}

}
