package Test;

public class IpAdress {

	public static void main(String[] args) {
		String address = "1.1.1.1";
		String rev = "";
		char [] c = address.toCharArray();
		for(int i =0;i<c.length;i++) {
			
			if(c[i]=='.') {
				
				rev = rev + "[.]";
 				
			}else {
				
				rev = rev + c[i];
				
			}
			
		}
		System.out.println(rev);
	}
	
}
