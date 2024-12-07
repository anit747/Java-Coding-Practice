package Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {

		String str = "Technical";

		Set<Character> set = new LinkedHashSet<Character>();

		for (int i = 0; i < str.length(); i++) {

			if (set.add(str.charAt(i)) == false) {

			}
		}
		System.out.println(set);
		
		
        StringBuilder sb = new StringBuilder();
        for (Character ch : set) {
            sb.append(ch);
        }
        String fin = sb.toString();
        System.out.println("Converted string: " + fin);

	}
}
