import java.util.Scanner;

public class TesterHash {

	public static void main(String[] args) {
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		Hashing h = new Hashing();
		System.out.println("Enter 10 numbers");
		for (int i = 0; i < arr.length; i++) {
			int n = sc.nextInt();
			int ind=h.myHashFun(n);
			if(arr[ind] ==0)
			{
				System.out.println("index -->"+ind+"-->"+n);
				arr[ind]=n;
			}
			else
				
				System.out.println("Colision for value -->"+n+"  index -->"+ind);
		}
		System.out.println("Array Elements - ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("  " + arr[i]);
		}

	}
}
