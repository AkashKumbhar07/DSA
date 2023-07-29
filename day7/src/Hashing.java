
public class Hashing {
	public int myHashFun(int v) {
		int base = 13;
		int n = v;
		int s = 0;
		int c = 0;
		while (n > 0) { // 123 ==>198
			int r = n % 10; // 3 2 1
			c++; // 1 2 3
			int ct = c; // 3
			int b = 1;
			while (ct > 1) { // 3>1 2>1
				b *= base;
				ct--; // 2 1
			}
			s += r * b; // 3*1=3
			n = n / 10;

		}
		//System.out.println("s=" + s);

		return s % 10;
	}
}
