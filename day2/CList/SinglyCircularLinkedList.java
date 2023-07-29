package CList;

public class SinglyCircularLinkedList {

	private SCNode head, tail;

	public SinglyCircularLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public SCNode getHead() {
		return head;
	}

	public void setHead(SCNode head) {
		this.head = head;
	}

	public SCNode getTail() {
		return tail;
	}

	public void setTail(SCNode tail) {
		this.tail = tail;
	}
	
	public boolean insertAtBeg(int v) {
		SCNode nn = new SCNode(v);
		if(head == null) {
			head =tail= nn;
			tail.setNext(head);
			return true;
		}
		else {
			nn.setNext(head);
			head =nn;
			tail.setNext(head);
		}
		return true;
	}
	
	public void display() {
		SCNode temp = head;
		System.out.println("Circular Linked List:");
		while(temp.getNext()!=head) {
			System.out.print("\t" + temp.getData());
			temp=temp.getNext();
		}
		System.out.print("\t"+tail.getData()+"\n");
	}

}
