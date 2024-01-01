package Test;

public class Fibinacci {

	
	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int num = 10;
		System.out.print(first + " " + second);
		
		for(int i =0;i<num;i++) {
			
			int next = first +second ;
			first = second;
			second = next;
			System.out.println(next);
		}
		
		
	}
}
