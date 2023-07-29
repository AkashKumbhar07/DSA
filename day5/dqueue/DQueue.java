package dqueue;

public class DQueue {
	private int data[];
	private int r, f, size;

	public DQueue(int s) {
		size = s;
		data = new int[size];
		r = f = -1;
	}

	public void enqueueAtRear(int v) {
		if (isFull()) {
			System.out.println("\nQueue is Full");
			return;
		}
		if (r == -1)
			f = 0;
		data[++r] = v;

	}

	public void enqueueAtFront(int v) {
		if(isEmpty()) {
			System.out.println("\nEnqueue Not Allowed in linear queue at front when queue is empty");
		return;
		}
		if (f == 0) {
			if (isFull()) {
				System.out.println("\nQueue is Full");
				return;
			}
			System.out.println("\nNo insertion allowed at front");
			return;
		}
		data[--f] = v;
	}

	public void dequeueAtFront() {
		if (isEmpty()) {
			System.out.println("\nQueue is Empty");
			return;
		}

		System.out.println("\nDeleted Element :" + data[f++]);
		if (f == r + 1)
			r = f = -1;
	}

	public void dequeueAtRear() {
		if (isEmpty()) {
			System.out.println("\nQueue is Empty");
			return;
		}
		System.out.println("\nDeleted Element :" + data[r--]);
		if (f == r + 1)
			r = f = -1;
	}

	public void display() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			System.out.println("\nQueue is Empty");
			return;
		}
		System.out.print("\nElements of Queue :");
		for (int i = f; i <= r; i++)
			System.out.print("\t" + data[i]);
	}

	public boolean isFull() {
//		if (r == size - 1||f==0)
//			return true;
//		return false;
		return (r == size - 1);

	}

	public boolean isEmpty() {
		return (r == -1);
	}
}
