
public class MERGE_SORT {
	
	
	public static void Conquer(int[] arr, int left, int mid, int right) {
		int[] merge= new int[right-left+1];
		
		int p1=left;
		int p2= mid+1;
		int x=0;
		
		while(p1<=mid && p2<=right) {
			if(arr[p1]<arr[p2]) {
				merge[x++]=arr[p1++];
			}
			else
				merge[x++]=arr[p2++];
		}
		
		while(p1<=mid) {
			merge[x++]=arr[p1++];
		}
		
		while(p2<=right) {
			merge[x++]=arr[p2++];
		}
		
		for(int i=0,j=left;i<merge.length;i++,j++) {
			arr[j]=merge[i];
		}
	}
	
	public static void Divide(int[] arr, int left, int right){
		if(left>=right) {
			return;
		}
		
		int mid= (left+right)/2; //left+(right-left)/2
		Divide(arr,left,mid);
		Divide(arr,mid+1,right);
		Conquer(arr,left,mid,right);
		
	}
	
	public static void main(String[] args) {
		
		int [] arr= {6,2,4,9,1,5};
		int n= arr.length;
		
		Divide(arr,0,n-1);
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
			
		}
		System.out.println();
		
		

	}

}
