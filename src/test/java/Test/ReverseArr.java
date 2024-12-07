package Test;

public class ReverseArr {
	public static void main(String[] args) {
		int num[] = { 10, 20, 30 };

		int i = 0;
		int j = num.length - 1;

		while (i < j) {

			int temp = num[i];
			num[i] = num[j];
			num[j] = temp;
			i++;
			j--;
		}
		for (int h = 0; h < num.length; h++) {

			System.out.println(num[h]);
		}
	}
}
