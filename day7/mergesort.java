package Mergesort;

import java.util.Arrays;

public class mergesort {

	public static void divide(int arr[], int sindex, int eindex) {
		if (sindex >= eindex) {
			return;
		}
		int mid = sindex + (eindex - sindex) / 2;
		divide(arr, sindex, mid);
		divide(arr, mid + 1, eindex);
		conqure(arr, sindex, mid, eindex);
	}

	public static void conqure(int arr[], int sindex, int mid, int eindex) {
		int merged[] = new int[eindex - sindex + 1];
 		int idx1 = sindex;
		int idx2 = mid + 1;
		int x = 0;

		while (idx1 <= mid && idx2 <= eindex) {
			if (arr[idx1] <= arr[idx2]) {
				merged[x++] = arr[idx1++];
				System.out.println(Arrays.toString(merged));
			} else {
				merged[x++] = arr[idx2++];
				System.out.println(Arrays.toString(merged));
			}
		}
		while(idx1 <= mid) {
			merged[x++] = arr[idx1++];
			System.out.println(Arrays.toString(merged));
		}
		while(idx2 <= eindex) {
			merged[x++] = arr[idx2++];
			System.out.println(Arrays.toString(merged));
		}
		
		for(int i = 0, j=sindex;i<merged.length;i++,j++) {
			arr[j] = merged[i];
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(merged));
		}
	}

	public static void main(String[] args) {
		int arr[]= {3,1,2,5,2,8};
		int n = arr.length;
		divide(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
	}

}
