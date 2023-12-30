import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChar {
	
	public static void main(String[] args) {
		
		String str = "ABCDEFABCD";
		int count = 0;
		int i =0;
		int j =0;
		int len = str.length();
		Set<Character> set = new HashSet<Character>();
		while(i<len && j<len) {
			if(!set.contains(str.charAt(j))) {
				set.add(str.charAt(j));
				j++;
				count = Math.max(count, j-i);
				
				
			}else {
				
				set.remove(str.charAt(i));
				i++;
			}
			
		}
		System.out.println(count);
		//Approach is Sliding window.
		//using 2 pointers
	}

}
