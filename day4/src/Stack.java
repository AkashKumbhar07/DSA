public class Stack {
	char data[];
	int top;

	public Stack(int size) {
		data = new char[size];
		top = -1;
	}

	public void push(char v) {
		data[++top]=v;
		
	}
	public char pop() {
			return data[top--];	
	}
	

}
