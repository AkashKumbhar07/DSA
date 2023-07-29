
public class HeapSort {

	
	public static void main(String[] args) {
		int []arr= {40,30,75,20,38,54,95};
		printData(arr);
		heapSort(arr);	
		System.out.println("\n sort - ");
		printData(arr);
	}
	private static void printData(int[] data) {
		for (int i = 0; i < data.length; i++)
			System.out.print("  " + data[i]);
	}
	public static void heapify(int []arr,int n,int i) {
		if(i>n/2-1)
			return;
		int largest=i;
		int lc=2*i+1; //5
		int rc=2*i+2;//6
		
		if(largest<n-1 && arr[largest]<arr[lc])
			largest=lc;
		if(largest<n-1 && arr[largest]<arr[rc])
			largest=rc;
		
		//swap largest element with ith internal node /value
		int t=arr[largest];
		arr[largest]=arr[i];
		arr[i]=t;
		
		heapify(arr,n,largest);
		
	}
	private static void heapSort(int[] arr) {
		int n=arr.length;
			for(int i=n/2-1;i>=0;i--)
			{
				heapify(arr,n,i);
			}
			int t=arr[0];
			arr[0]=arr[n-1];
			arr[n-1]=t;
			for(int i=n-1;i>0;i--) {
				heapify(arr,i,0);	
				t=arr[0];
				arr[0]=arr[i-1];
				arr[i-1]=t;
			}
	}
}
