package Test;

import java.util.HashSet;
import java.util.Set;

public class StringPangram {
	public static void main(String[] args) {
		String sentence = "leetcode";
		String alp= "thequickbrownfoxjumpsoverthelazydog";
		 
		char [] word = sentence.toCharArray();
		 Set<Character> set = new HashSet<Character>();
		 for(int i =0;i<word.length;i++) {
		if(set.add(word[i])==false) {
			
			
		}
		
		}System.out.println(set);
		int size = set.size();
		if(size ==26) {
			System.out.println("True");
			
		}else {
			
			System.out.println("False");
		}
	}

}
