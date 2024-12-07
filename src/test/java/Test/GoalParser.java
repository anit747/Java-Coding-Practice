package Test;

public class GoalParser {
	
	public static void main(String[] args) {
		
		String command = "G()(al)";
		char [] c  =command.toCharArray();
		//"Goal"
		 
		String rev = "";
		for(int i =0;i<c.length;i++) {
			
			if(c[i]=='(' && c[i+1]==')') {
		rev = rev + 'o'; 		 
		
			}else if (c[i]==')') {
				
				rev = rev+"";
			}else if (c[i]=='('){
				
				rev = rev +"";
			}else {
				
				rev = rev + c[i];
			}
			
		}System.out.println(rev);
	}

}
