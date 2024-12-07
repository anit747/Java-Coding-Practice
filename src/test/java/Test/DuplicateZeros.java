package Test;

public class DuplicateZeros {
	public static void main(String[] args) {

		int[] nums = { 1, 0, 2, 3, 0, 4, 5, 0 };
		// [1,0,0,2,3,0,0,4]

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 0) {
				nums[i + 1] = 0;
				nums[i+3]=nums[i+2];
				break;
			}

		}
		for (int h = 0; h < nums.length; h++) {

			System.out.print(nums[h]);
		}

	}
}
