package day1;

import java.util.Arrays;

public class Hw4 {

	public static void main(String[] args) {
		int arr[] = {5,25,12,84,13,87,10,48};
		
		for(int i=1,j=arr.length-2;i<arr.length/2;i++,j--) {
			int temp = arr[j];
			arr[j]= arr[i];
			arr[i] = temp;
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));

	}

}
