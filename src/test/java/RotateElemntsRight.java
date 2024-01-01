
public class RotateElemntsRight {

	public static void main(String[] args) {
		int num[] = {12,13,14,15};
		int n =2;
		
		for(int i =0;i<n;i++) {
			int last = num[num.length-1];
			for(int j = num.length-1;j>0;j--) {
				
				num[j]=num[j-1];//1,
			}
			num[0]=last;
		}
			System.out.println();
			for(int i =0;i<num.length;i++) {
				System.out.println(num[i]);
				
			}
		}
		 
		 
	}
	

