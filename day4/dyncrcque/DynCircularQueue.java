package dyncrcque;

public class DynCircularQueue {
	private DCQNode front, rear;

	public DynCircularQueue() {
		this.front = null;
		this.rear = null;
	}

	public DCQNode getFront() {
		return front;
	}

	public void setFront(DCQNode front) {
		this.front = front;
	}

	public DCQNode getRear() {
		return rear;
	}

	public void setRear(DCQNode rear) {
		this.rear = rear;
	}

	public boolean insertAtRear(int v) {
		
		DCQNode nn = new DCQNode(v);// here new DCQNode will be created with data and null value
		if (nn == null)
			return false;
		if (front == null) {
			front = rear = nn;
			front.setNext(front);
		}
		else
		{
			rear.setNext(nn);
			nn.setNext(front);
			rear=nn;
		}
		return true;

	}

	public DCQNode deleteAtFront() {
		if (front == null) {
			System.out.println("Queue is Empty");
			return null;
		}
		DCQNode t=front;
		front=front.getNext();
		t.setNext(null);
		rear.setNext(front);
		return t;
	}

	

	public void display() {
		DCQNode temp = front;
		System.out.println("\nList Elements  -");
		while (temp.getNext() != front) {
			System.out.print("\t" + temp.getData());
			temp = temp.getNext();
		}
		System.out.print("\t" + temp.getData()+"\n");
	}

	
}
