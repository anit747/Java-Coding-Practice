
public class SwapString {
	
	public static void main(String[] args) {
		String a= "Java";
		String b = "Test";
		
		String s = a+b;
		
		a =  s.substring(b.length());
		b= s.substring(0,a.length());
		System.out.println(a);
		System.out.println(b);
		
		
	}
	

}
