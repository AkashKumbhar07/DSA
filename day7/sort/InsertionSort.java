package sort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] data = { 2, 6, 3, 34, 11, 83, 7,1,5};
		System.out.println("\nArray Before Sort :");
		printData(data);
		insertionSort(data);
		System.out.println("\nArray After Sort :");
		printData(data);
	}

	private static void insertionSort(int[] data) {
		//4  6 1  34  12  8 3
		for (int i = 1; i < data.length; i++) { 
			int j = i - 1; 
			int v = data[i]; 
			while (j >= 0 && v < data[j]) 
			{
				//data[i--] = data[j--]; 
				data[j+1]=data[j--];
			}	
			data[++j] = v;
		}

	}

	private static void printData(int[] data) {
		for (int i = 0; i < data.length; i++)
			System.out.print("  " + data[i]);
	}
}
