package Test;

public class TwoArraysEquals {
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		int b[] = {1,2,3};
		boolean status = true;
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				
				if(a[i]==b[i]) {
					status = true;
				}
			}
		}else {
			
			status = false;
		}
		if(status) {
			
			System.out.println("Equals");
		}else {
			System.out.println("Not");
		}
	}

}
