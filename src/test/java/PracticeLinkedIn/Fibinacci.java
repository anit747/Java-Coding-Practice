package PracticeLinkedIn;

public class Fibinacci {

	public static void main(String[] args) {

		int n = 5;

		int first = 0;
		int second = 1;
		System.out.print(first + "" + second);
		for (int i = 0; i<= n; i++) {
			
			int next = first + second;
			
			first = second;
			second = next;

			System.out.print(next);

		}

	}

}
