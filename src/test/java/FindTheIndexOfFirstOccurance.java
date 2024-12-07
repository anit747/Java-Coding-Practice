
public class FindTheIndexOfFirstOccurance {

	public static void main(String[] args) {
		
		String haystack = "sadbusted";
		String needle = "sad";
		
		
		//Index 0
		
	int index  = haystack.indexOf(needle);
	
	
	if(index!=-1) {
		
		System.out.println("Occurance"+index);
		
		
	}else {
		
		
		System.out.println("not found");
	}
		
		
	}
	
	
	
}
