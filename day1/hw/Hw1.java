
public class Hw1{
	
	public static void indexlogic(int arr[], int element){
		boolean flag =false;
		for(int i=0;i<arr.length;i++){
			if(arr[i] == element)
				System.out.println("Element index = " + i);
				flag = true;
		}
		if(flag == false)
			System.out.println("Element is not present :)");
	}
	
	public static void main(String [] args){
		int arr[] = {1,2,5,9,7,6,8,4,3,5};
		int element =8;
		indexlogic(arr,element);
	}

}