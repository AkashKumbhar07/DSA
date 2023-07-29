package Assignment;

import Assignment.Assignment_4.Node;

public class Assignment_6 {

	Node head;

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
	// 6. Java Program To Merge A Linked List Into Another Linked List At Alternate
	// Positions.

	public static void mergeLinkedList(Node l1, Node l2) {
		Node temp = l1;
		Node temp1 = l2;

		while (temp != null) {
			Node add = temp.next;
			if (temp1 != null) {
				temp.next = temp1;
				temp1 = temp1.next;
				temp.next.next = add;
				
			} else {
				
			}
			temp = add;
		}

	}

	public static void main(String[] args) {
		Assignment_6 l1 = new Assignment_6();

		l1.head = new Node(1);
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
		l1.head.next = s1;
		s1.next = s2;
		s2.next = s3;
		s3.next = s4;
		s4.next = s5;
		s5.next = s6;
		s6.next = s7;
		s7.next = s8;
		s8.next = s9;
		s9.next = s10;
		s10.next = null;

		Assignment_6 l2 = new Assignment_6();

		l2.head = new Node(11);
		Node ll1 = new Node(22);
		Node ll2 = new Node(33);
		Node ll3 = new Node(44);
		Node ll4 = new Node(55);
		Node ll5 = new Node(66);
		l2.head.next = ll1;
		ll1.next = ll2;
		ll2.next = ll3;
		ll3.next = ll4;
		ll4.next = ll5;
		ll5.next = null;

		l1.printList();
		l2.printList();

		mergeLinkedList(l1.head, l2.head);
		l1.printList();

	}

}
