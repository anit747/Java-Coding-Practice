
public class IPLeetCode {
	
	public static void main(String[] args) {
		
		String input = "1.1.1.1.1.1";
		//1[.]1[.]1[.]
		
		String res = "";
		
		char[] c  = input.toCharArray();
		
		for(int i =0;i<c.length;i++) {
			
			if(c[i]=='.') {
				
				res = res + "[.]";
				
			}else {
				
				res = res + c[i];
				
			}
			
		}System.out.println(res);
		
		
		
	}

}
