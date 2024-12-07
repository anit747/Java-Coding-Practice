package Test;

public class Rotate {
	
	public static void main(String[] args) {
		int [] num = {10,20,30,40,50};
		int rotate =3;
		
		for(int i=0;i<rotate;i++) {
			int last = num[num.length-1];
			for(int j =num.length-1;j>0;j--) {
					
					num[j]=num[j-1];
			}
			num[0]=last;
			
		}for(int h = 0;h<num.length;h++) {
			
			System.out.println(num[h]);
		}
		
		
	}

}
