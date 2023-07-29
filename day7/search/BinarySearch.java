package search;

public class BinarySearch {

	public static void main(String[] args) {
		
		int data[]= {2,5,8,11,23,39,47,58,69};
		int v=11;
		binarySearch(data,0,data.length-1,v);
		
	}
	 public static void binarySearch(int [] arr,int l, int h, int v) {
		if(l<=h) {
		 int mid=(l+h)/2;
		 if(arr[mid]==v) {
			 System.out.println("Data Found at position "+(mid+1));
			 return ;
		 }
		 else if(arr[mid]>v)
			 binarySearch(arr, l, mid-1, v);
		 else
			 binarySearch(arr, mid+1,h, v);
		 
		}
		else
			 System.out.println("Data Not Found ");
	 }
}
