//List of int

package dyncrcque;

public class DCQNode {
	//data members
	private int data;
	private DCQNode next;
	//constructor
	public DCQNode(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	
	//getter setters
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DCQNode getNext() {
		return next;
	}
	public void setNext(DCQNode next) {
		this.next = next;
	}
}
