package Assignment;

import Assignment.Assignment_17.Node;

public class ll {
	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			this.data = d;
			next = null;
		}
	}

	public void printList() {
		Node n = head;
		System.out.print("LL");
		while (n != null) {
			System.out.print("-->" + n.data);
			n = n.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ll llist = new ll();

		llist.head = new Node(1);
		Node s1 = new Node(2);
		Node s2 = new Node(3);
		Node s3 = new Node(4);
		Node s4 = new Node(5);
		Node s5 = new Node(6);
		Node s6 = new Node(7);
		Node s7 = new Node(8);
		Node s8 = new Node(9);
		Node s9 = new Node(12);
		Node s10 = new Node(14);

		llist.head.next = s1;
		s1.next = s2;
		s2.next = s3;
		s3.next = s4;
		s4.next = s5;
		s5.next = s6;
		s6.next = s7;
		s7.next = s8;
		s8.next = s9;
		s9.next = s10;
		s10.next = s5;

		llist.printList();
	}
}
