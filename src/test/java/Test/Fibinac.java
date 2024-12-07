package Test;

public class Fibinac {
	public static void main(String[] args) {

		int n = 10;

		int first = 0;
		int second = 1;

		System.out.println(first + " " + second);
		for (int i = 0; i < n; i++) {

			int next = first + second;

			first = second;
			second = next;
			System.out.print(next);

		}

	}

}
