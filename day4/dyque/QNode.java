package dyque;

public class QNode {
	private int data;
	private QNode next;
	
	public QNode(int d){
		setData(d);
		setNext(null);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public QNode getNext() {
		return next;
	}

	public void setNext(QNode next) {
		this.next = next;
	}
	
}
