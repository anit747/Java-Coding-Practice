import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
	
	public static void main(String[] args) {
		int input[] = {1,5,2,6,8,6,7,5,2,8};
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i =0;i<input.length;i++) {
			if(set.add(input[i])==false) {
				
				
			}
			
		}
		System.out.println(set);
 	}

}
