package Test;

public class FirstLetterCapital {
	public static void main(String[] args) {
		
		String str = "this is java";
		
		String res ="";
		
		String[] split = str.split(" ");
		
		for(int i =0;i<split.length;i++) {
			
			char c = split[i].charAt(0);
			String req = String.valueOf(c).toUpperCase();
			String sub = split[i].substring(1);
			res = res+req+sub + " ";
			
			
		}
		System.out.println(res);
		
		
		
	}

}
