package Doublyll;

public class DoublyLinkedList {
	private Node head, tail;
	

	public DoublyLinkedList() {
		super();
		this.head = null;
		this.tail = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}
	
	public boolean insertAtBeg(int v) {
		Node nn = new Node(v);
		if(head==null) {
			head=tail=nn;
			
			return true;
		}
		else {
			nn.setNext(head);
			head.setPrev(nn);
			nn.setPrev(null);
			head =nn;
		}
		return true;		
	}
	public void  display() {
		System.out.println("Doubly Linked List:");
		Node temp = head;
		while(temp != null) {
			System.out.print("\t" + temp.getData());
			temp=temp.getNext();
		}
		System.out.println("\n");
	}
	

}
