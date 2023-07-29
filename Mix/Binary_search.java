import java.util.*;
public class Binary_search {

	public static int binarSearch(int[]arr, int key) {
		int r=arr.length,l=0,m;
		while(l<=r) {
			m=(l+r)/2;
			if(key==arr[m])
				return m;
			if(key<arr[m])
				r=m-1;
			else
				l=m+1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[]arr= {11,22,33,44,55,66,77,88,99};
		System.out.println("Enter the number to search :");
		int key=sc.nextInt();
		int index= binarSearch(arr,key);
		if(index != -1)
			System.out.println("Searched Element is on Index - "+index);
		else
			System.out.println("Element not found");

	}

}
