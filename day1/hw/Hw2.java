package day1;

import java.util.Arrays;

public class Hw2 {

	public static void main(String[] args) {
		int arr[] = { 55, 84, 98, 67, 72, 30, 02 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Thied element in last " + (arr[arr.length - 3]));

	}

}
