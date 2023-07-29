package Assignment;

import Assignment.ll.Node;

public class Assignment_9 {
	static Node head;
	static Node tail;

	static class Node {

		int data;
		Node next;
		Node prev;

		Node(int d) {
			this.data = d;
			next = null;
			prev =null;
		}
	}

	public static  void printList() {
		Node n = head;
		System.out.print("LL");
		while (n != null) {
			System.out.print("-->" + n.data);
			n = n.next;
		}
		System.out.println();
	}
	public static void revprintList() {
		Node n = tail;
		System.out.print("LL");
		while (n != null) {
			System.out.print("-->" + n.data);
			n = n.prev;
		}
		System.out.println();
	}
	
	public static void palindrome() {
		Node front = head;
		Node back =tail;
		boolean flag = true;
		while(front!=back) {
			if(front.data != back.data) {
				System.out.print("Linked List is Not Palindrome :)");
				flag=false;
				break;
			}
			front = front.next;
			back = back.prev;
		}
		if(flag)
			System.out.println("Linked List is a Palindrome :)");
		
		
	}

	public static void main(String[] args) {
		Assignment_9 llist = new Assignment_9();

		llist.head = new Node(1);
		Node s1 = new Node(2);
		Node s2 = new Node(3);
		Node s3 = new Node(4);
		Node s4 = new Node(5);
		Node s5 = new Node(4);
		Node s6 = new Node(3);
		Node s7 = new Node(2);
		llist.tail = new Node(1);

		llist.head.next = s1;
		llist.head.prev = null;
		s1.next = s2;
		s1.prev = head;
		s2.next = s3;
		s2.prev = s1;
		s3.next = s4;
		s3.prev = s2;
		s4.next = s5;
		s4.prev = s3;
		s5.next = s6;
		s5.prev = s4;
		s6.next = s7;
		s6.prev = s5;
		s7.next = tail;
		s7.prev = s6;
		tail.next = null;
		tail.prev=s7;

		printList();
		revprintList();
		palindrome();
	}

}
