package Test;

public class FirstLetterCaptial {
	public static void main(String[] args) {
		String str = "anit rai";
		String res = "";
		String ss[] = str.split(" ");
		
		for(int i =0;i<ss.length;i++) {
			char ch = ss[i].charAt(0);
			String cap = String.valueOf(ch).toUpperCase();
			String fin = ss[i].substring(1).toLowerCase();
			res = res + cap + fin + " ";

		}
		System.out.println(res);
	}

}
