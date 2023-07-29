package CList;

public class SCNode {
	// data members
	private int data;
	private SCNode next;

	// constructor
	public SCNode(int data) {
		super();
		this.data = data;
		this.next = null;
	}

	// getter setters
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public SCNode getNext() {
		return next;
	}

	public void setNext(SCNode next) {
		this.next = next;
	}
}
