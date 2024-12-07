package PracticeLinkedIn;

public class RemoveDuplicatedFromString {

	public static void main(String[] args) {

		String str = "ANITI";
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			String ch = "" + str.charAt(i);

			if (res.contains(ch)) {
				continue;

			}
			res = res + ch;
		}
		System.out.println(res);

	}

}
