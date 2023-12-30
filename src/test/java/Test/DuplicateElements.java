package Test;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
	
	public static void main(String[] args) {
		String [] str = {"Java", "Py","Java"};
		
		Set<String> set = new HashSet<String>();
		 for(String word:str) {
			 
			 if(set.add(word)==false) {
				 
				 System.out.println(word);  
				 
			 }
		 }
		
		
				
	}

}
