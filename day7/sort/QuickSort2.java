package sort;

public class QuickSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 2, 6, 3, 34, 11, 83, 7,1,5};
		System.out.println("\nArray Before Sort :");
		printData(data);
		
		QuickSort11(data,0,data.length-1);
		
		System.out.println("\nArray After Sort :");
		printData(data);
	}

	public static int partition(int []data,int l,int h){
		
		int pivot=data[h];
		int j=h-1;
		//for(int i=0;i<=j;i++)
		int i=0;
		while(i<=j)
		{
			if(data[i]>pivot)
			{
				int temp=data[i];
				data[i]=data[j];
				data[j]=temp;
				j--;
			}
			else {
				i++;
			}
			
		}
		data[h]=data[j+1];
		data[j+1]=pivot;
	
		return j+1;
	
	}
	public static void QuickSort11(int[] data, int l, int h) {
		if(l<h) {
		int p= partition(data,l,h);
		if(p!=-1) {
		QuickSort11(data,l,p-1);
		QuickSort11(data, p+1, h);
		}
		}
		
	}

	private static void printData(int[] data) {
		for (int i = 0; i < data.length; i++)
			System.out.print("  " + data[i]);
	}

}


