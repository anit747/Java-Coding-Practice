package Test;

import java.util.Stack;

public class ReverseArrayUsingStack {
	public static void main(String[] args) {
		String str = "Anit";
String rev = "";
//	char [] c  = str.toCharArray();

		Stack<Character> stack = new Stack<Character>();

		for (int i = str.length() - 1; i >= 0; i--) {
			stack.push(str.charAt(i));

		}
		
		String st= stack.toString();
		System.out.println(rev =rev+ st);
	}

}
