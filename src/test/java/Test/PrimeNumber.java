package Test;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int n = 8;
		
		
		boolean status = true;
		
		if(n<=1) {
			
			status = false;
		}
		for(int i = 2; i<=n/2;i++) {
			
			if(n%i==0) {
				
				status = false;
			}else {
				
				status = true;
			}
		}
		
		
		if(status) {
			
			System.out.println("Prime");
		}else {
			
			System.out.println("No");
		}
	}
	

}
