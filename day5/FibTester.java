
public class FibTester {
	public static void main(String[] args) {
		System.out.print("Fibonacci Series :");
		for(int i=0;i<5;i++)
			System.out.print("\t"+fib(i));
}

	public static int fib(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fib(n-1)+fib(n-2);
	}
}
