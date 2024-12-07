package PracticeLinkedIn;

public class StringPallindrome {
	
	public static void main(String[] args) {
		
		
		String str = "YYR";
		
		String res = "";
		
		
		String pall = str;
		System.out.println(pall);
		boolean status = true;
		
		
		for(int i = str.length()-1;i>=0;i--) {
			
			
			res = res+ str.charAt(i);
		}
		System.out.println(res);
		if(pall.equals(res)) {
			
			System.out.println("Pall");
		}else {
			
			System.out.println("Not");
		}
		
	}

}
