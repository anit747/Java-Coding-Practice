package Test;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int num [] = {12,12,13,14};
		
		Set<Integer> set = new HashSet<Integer>();
		for(int i =0;i<num.length;i++) {
			if(set.add(num[i])==false) {
				
				
			}
			
		}System.out.println(set);
		
		
		
	}
	
}
