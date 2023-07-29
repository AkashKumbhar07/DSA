package day1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Hw3 {

	public static void main(String[] args) {

		/*
		 * You are given array consisting of n integers. Your task is to find the
		 * maximum length of an increasing subarray of the given array. A subarray is
		 * the sequence of consecutive elements of the array. Subarray is called
		 * increasing if each element of this subarray strictly greater than previous.
		 * i/p-5 1 7 2 11 15 o/p -3
		 */

		int arr[] = { 14, 11, 12, 10, 14, 16 };
		int sublen = 1;
		int max = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] > arr[i]) {
				sublen++;
			} else {

				sublen = 1;
			}
			if (max < sublen) {
				max = sublen;
			}
		}
		System.out.println("Length of Sub Array: " +max);

	}

}
