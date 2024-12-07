package PracticeLinkedIn;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String str = "Technical";
		char[] c = str.toCharArray();
		String res = "";
		for (int i = 0; i < str.length(); i++) {

			String ch = "" + str.charAt(i);

			if (res.contains(ch)) {

				continue;
			}
			res = res + str.charAt(i);
		}
		
		System.out.println(res);
	}

}
