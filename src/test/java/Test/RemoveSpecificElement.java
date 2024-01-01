package Test;

import java.util.Arrays;

public class RemoveSpecificElement {
	
	public static void main(String[] args) {
		int num [] = {12,13,14,15};
		int key = 2;
		int res [] = new int [num.length-1];
		int h=0;
		for(int i =0;i<num.length;i++) {
			if(i!= key) {
				res[h]=num[i]; 
				h++;
			}
			
		} 
		System.out.println(Arrays.toString(res));
	}

}
