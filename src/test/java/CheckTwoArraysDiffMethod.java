
public class CheckTwoArraysDiffMethod {
	
	public static void main(String[] args) {
		int a [] = {12,13,14,15};
		int b[] = {12,13,14,16};
		boolean result = true;
		if(a.length==b.length) {
			for(int i = 0;i<a.length;i++) {
				
				if(a[i]!=b[i]) {
					
					result = false;
				}
			}
			
		}else {
			
			result = false;
		}
		
		if(result==true) {
			
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		
	}
	

}
