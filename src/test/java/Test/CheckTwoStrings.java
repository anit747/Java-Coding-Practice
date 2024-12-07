package Test;

public class CheckTwoStrings {
	public static void main(String[] args) {
		
		String[] word1 = {"a", "cb"};
		String[] word2 = {"ab", "c"};
		String res1 ="";
		String res2 = "";
		 for(int i =0;i<word1.length;i++) {
			 res1 = res1 + word1[i];
			 
		 }
		System.out.println(res1);
		
		for(int j =0;j<word2.length;j++) {
			
			res2 = res2 + word2[j];
		}
		System.out.println(res2);
		if(res1.equals(res2)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}

}
