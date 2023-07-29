import java.util.Arrays;

public class INSERTION_SORT {

	public static void InsertionSort(int[] arr) {
	
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i],j;
			for( j=i-1;j>=0 && arr[j]>temp;j--) {
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
		}
	}
	
	
	public static void main(String[] args) {
	
		int[] arr= {6,4,2,8,3,1};
		System.out.println("INSERTION SORT ");
		System.out.println("BEFORE : "+Arrays.toString(arr));
		InsertionSort(arr);
		System.out.println("AFTER :"+Arrays.toString(arr));
	}

}
