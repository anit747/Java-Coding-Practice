package PracticeLinkedIn;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	
	public static void main(String[] args) {
		
		String [] str = {"Java", "Python","Java","Python","Node"};
		
		
		Set<String> set = new HashSet<String>();
		
		for(int i=0;i<str.length;i++) {
			
			if(set.add(str[i]) ==false) {
				System.out.println(str[i]);

			}

		}
		
	} 
	
}
