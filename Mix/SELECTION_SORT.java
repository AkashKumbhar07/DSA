import java.util.*;

public class SELECTION_SORT {

	public static void Selection_Sort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
			            arr[i]=arr[j];
			            arr[j]=temp;
				}
			}
		}
			
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {6,4,2,8,3,1};
		System.out.println("Selection Sorting");
		System.out.println("before :"+Arrays.toString(arr));
		Selection_Sort(arr);
		System.out.println("After :"+Arrays.toString(arr));

	}

}
