
public class PallindromeNumber {

	
	
	public static boolean pallindrome(int num) {
		
		 
		int rev =0;
		int pall= num;
		boolean status =true;
		while(num>0) {
			
			int digit = num %10;
			rev = rev *10+ digit;
			num = num /10;
			
			
			
		}if(rev==pall) {
			
			status= true;
		}else {
			
			status =false; 
			
		}
		
		
		return status;
		
	}
	public static void main(String[] args) {
		
		System.out.println(pallindrome(121));
		
	}
}
