package PracticeLinkedIn;

public class FindLargestElement {
	public static void main(String[] args) {

		int num[] = { 10, 20, 77, 14, 25 };

		for (int i = 0; i < num.length; i++) {

			for (int j = i+1; j < num.length; j++) {

				if (num[i] > num[j]) {

					int temp = num[i];

					num[i] = num[j];
					num[j] = temp;

				}
 
			}
			

		}
		System.out.println(num[num.length-1]);
	}
}
