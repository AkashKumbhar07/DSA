import java.util.Arrays;

public class BUBBLE_SORT {
	
	
//	public static void bubbleSort(int[] arr) {
//		
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=0;j<arr.length-1-i;j++) {
//				if(arr[j]>arr[j+1]) {
//					int temp=arr[j];
//						arr[j]=arr[j+1];
//						arr[j+1]=temp;
//				}
//			}
//		}
//	}
	
	public static void ImprBubbleSort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			boolean swapFlag=false;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						swapFlag=true;
				}
			}
			if(swapFlag==false)
				break;
		}
	}
	
	
	public static void main(String[] args) {
		
//		int[] arr= {6,4,2,8,3,1};
		int[] arr= {1,2,3,4,5,6};
		System.out.println("BUBBLE SORTING");
		System.out.println("BEFORE :"+Arrays.toString(arr));
//		bubbleSort(arr);
		ImprBubbleSort(arr);
		System.out.println("AFTER :"+Arrays.toString(arr));
		

	}

}
