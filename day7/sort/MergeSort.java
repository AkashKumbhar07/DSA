package sort;

public class MergeSort {

	public static void main(String[] args) {
		int[] data = { 2, 6, 3, 34, 11, 83, 7,1,5};
		System.out.println("\nArray Before Sort :");
		printData(data);
		
		mergeSort(data,0,data.length-1);
		
		System.out.println("\nArray After Sort :");
		printData(data);
	}
	private static void mergeSort(int[] arr, int l, int h) {
		if(l<h) {
			int mid=(l+h)/2;
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,h);
			merge(arr,l,mid,h);
		}
	}
	private static void merge(int[] arr, int l, int m, int h) {
		int n1,n2;
		n1=m-l+1;
		n2=h-m;
		int a1[]=new int[n1];
		int a2[]=new int[n2];
		for(int i=0;i<n1;i++)
			a1[i]=arr[l+i];
		for(int i=0;i<n2;i++)
			a2[i]=arr[m+1+i];
		
		int i=0,j=0,k=l;
		
		while(i<n1&&j<n2) {
			if(a1[i]<a2[j])
				arr[k++]=a1[i++];
			else
				arr[k++]=a2[j++];
		}
		while(i<n1)
		{
			arr[k++]=a1[i++];
		}
		while(j<n2)
		{
			arr[k++]=a2[j++];
		}
	}
	private static void printData(int[] data) {
		for (int i = 0; i < data.length; i++)
			System.out.print("  " + data[i]);
	}

}
