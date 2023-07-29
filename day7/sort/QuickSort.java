package sort;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 2, 6, 3, 34, 11, 83, 7, 1, 5 };
		System.out.println("\nArray Before Sort :");
		printData(data);

		quickSort(data, 0, data.length - 1);

		System.out.println("\nArray After Sort :");
		printData(data);
	}

	public static int partition(int[] data, int l, int h) {
		int mid = (l + h) / 2;
		int pivot = data[mid];
		int j = mid + 1;
		// for(int i=0;i<=j;i++)
		int i = 0;
		while (i < mid && j < h + 1) {
			if (data[i] > pivot) {
				if (data[j] < pivot) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
				j++;
			}
			i++;
		}
		while(data[j]<pivot&&j<=h) {
			int t=data[i+1];
			 data[i+1]=data[j];
			 data[j]=t;
			 i++;
			 j++;
		}
		j=mid-1;
		while(data[i]>pivot&&i<=j) {
			int t=data[j];
			 data[j]=data[i];
			 data[i]=t;
			 j--;
		}
				
		data[j + 1] = pivot;

		return j + 1;

	}

	public static void quickSort(int[] data, int l, int h) {
		if (l < h) {
			int p = partition(data, l, h);
			if (p != -1) {
				quickSort(data, l, p - 1);
				quickSort(data, p + 1, h);
			}
		}

	}

	private static void printData(int[] data) {
		for (int i = 0; i < data.length; i++)
			System.out.print("  " + data[i]);
	}

}
