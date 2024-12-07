package Test;

public class BinarySearch {

	public static void main(String[] args) {

		int num[] = { 25, 33, 44, 55, 88, 97 };
		int key = 33;
		int index = -1;
		int start = 0;
		int end = num.length - 1;

		int mid = start + (end-start) / 2;
		while (start <= end) {

			if (num[mid] == key) {

				index = mid;
 				break;

			}

			if (key > num[mid]) {

				start = mid + 1;
			} else {
				end = mid - 1;

			}

			mid = start + (end-start) / 2;

		}
		if (index != -1) {

			System.out.println(index);

		} else {

			System.out.println("Not Found");

		}

	}

}
