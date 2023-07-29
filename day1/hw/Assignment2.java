////2. You will be given an array and you need to find the third largest 
package List;
import java.util.*;
public class Assignment2
{
	public static void main(String[] args) 
	{

		Integer arr[]= {11,22,43,43,35,45,50,50,3,3};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int count =0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1] == arr[i]) {
				arr[i] =Integer.MIN_VALUE;
				count++;
			}
		}
		System.out.println(Arrays.toString(arr));
		int arr1[] = new int[arr.length -count];
		int ind = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == Integer.MIN_VALUE) {
				continue;
			}
			else {
				arr1[ind] =arr[i];
				ind++;
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println("Third Largest " + arr1[arr1.length-3]);
		
	
		
	
	
	}

	}

 







