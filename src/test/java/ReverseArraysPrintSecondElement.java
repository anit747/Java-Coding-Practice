
public class ReverseArraysPrintSecondElement {
	public static void main(String[] args) {
		int num [] = {10,20,30,40};
		 
			int res [] = new int[num.length];
			for(int i =num.length-1;i>=0;i--) {
				res[num.length-1-i]=num[i];
				
				
		}
		
	System.out.println(res[1]);
			
		
	}
	

}
