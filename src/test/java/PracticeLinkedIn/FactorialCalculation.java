package PracticeLinkedIn;

public class FactorialCalculation {
	public static void main(String[] args) {

		int num = 5;

		int fact = 5;
		for (int i = 1; i < num; i++) {

			fact = fact * i;
		}
		System.out.println(fact);
	}

}
