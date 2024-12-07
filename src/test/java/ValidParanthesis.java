import java.util.Stack;

public class ValidParanthesis {
	public static void main(String[] args) {

		boolean status = true;
		String s = "({)}";
		char [] c = s.toCharArray();
		Stack <Character> stk = new Stack<Character>();
		
		for(int i =0;i<c.length;i++) {
			
			if(c[i]=='(') {
				
				stk.push(')');
				
			}else if(c[i]=='{'){
				
				stk.push('}');
				
				
				
			}else if(c[i]=='[') {
				
				stk.push(']');
			}else if (stk.isEmpty()|| stk.pop()!=  	c[i]) {
				
System.out.println("Not Valid");				
			}
			stk.isEmpty();
			System.out.println("Not valid");
		}
		
		 
		
	}
}
