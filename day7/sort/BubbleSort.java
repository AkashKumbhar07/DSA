package sort;

public class BubbleSort {
	public static void main(String[] args) {
		int [] data= {2,6,67,34,11,3,1,9,25,4};
		System.out.println("\nArray Befor Sort :");
		printData(data);
		bubbleSort(data);
		System.out.println("\nArray After Sort :");
		printData(data);
		
	}

	private static void printData(int[] data) {
		for(int i=0;i<data.length;i++)
			System.out.print("  "+data[i]);
	}

	private static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
	}
		//printData(arr);
	}
}
