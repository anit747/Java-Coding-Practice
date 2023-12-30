
public class ShiftZeroRight {
	public static void main(String[] args) {
		
		int num[]= {0,12,44,0};
		int temp;
		for(int i=0;i<num.length;i++) {
			
			for(int j=i+1;j<num.length;j++) {
				
				if(num[i]<num[j]) {  //0< 12
					temp = num[i]; //temp= 0
					num[i]=num[j]; // i=12
					num[j]=temp; // j=0
					
				}
			}System.out.print(num[i]);
		}
	}

}
