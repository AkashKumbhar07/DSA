import java.util.Arrays;

public class Quick_Sort {
	
	private static void Quick_Sort(int[] arr, int left, int right) {
		if(left>=right) {
			return;
		}
		int i=left,j=right;
		while(i<j) {
			while(i<=right && arr[i]<=arr[left]) 
				i++;
			
			while(arr[j]>arr[left]) 
				j--;
			
			if(i<j)
				Swap(arr,i,j);
		}
		Swap(arr,j,left);
		
		Quick_Sort(arr, left, j-1);
		Quick_Sort(arr, j+1, right);
	}
	
	private static void Swap(int[] arr, int left, int right) {
		int temp= arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
	}

	public static void main(String[] args) {
		int [] arr = {5, 3, 9, 1, 8, 7, 2, 6, 4};
		System.out.println(Arrays.toString(arr));
		Quick_Sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}

}
