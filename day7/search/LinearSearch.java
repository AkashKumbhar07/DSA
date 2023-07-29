package search;

public class LinearSearch {
	public static void main(String[] args) {
		boolean flag=false;
		int data[]= {23,5,6,1,8,33,2,55};
		int v=88,i=0;
		for( i=0;i<data.length;i++) {
			if(data[i]==v) {
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.println("Data Found at position "+(i+1));
		else
			System.out.println("Data Not Found");
		
	}
}
