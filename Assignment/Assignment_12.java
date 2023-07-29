package Assignment;

import Assignment.ll.Node;

public class Assignment_12 {
	static int count =0;
	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			this.data = d;
			next = null;
		}
	}

	public static void printList() {
		Node n = head;
		System.out.print("LL");
		while (n != null) {
			System.out.print("-->" + n.data);
			n = n.next;
		}
		System.out.println();
	}
	
	
	public static void count() {
		Node n = head;
		while (n != null) {
			n = n.next;
			count++;
		}
		System.out.println("Length: " + count);
	}
	
	
	
	public static void reverseListFromPosi(int position) {
		Node temp =head;
		int location = count-position+1;
		int loc =1;
		Node track = head;
		while(loc!= location) {
			if(loc == location -1) {
				track = temp;
			}
			temp =temp.next;
			loc++;
		}
		Node p = temp;
		Node q = p.next;
		Node r;
		//p.next=null;
		while(q!=null) {
			r=q.next;
			q.next= p;
			p=q;
			q=r;
		}
		track.next=p;
		temp.next=null;
		
		Node n = head;
		System.out.println("Reverse from last " +position+" Linked List is:");
		System.out.print("LL");
		while (n != null) {
			System.out.print("-->" + n.data);
			n = n.next;
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		Assignment_12 llist = new Assignment_12();

		llist.head = new Node(11);
		Node s1 = new Node(22);
		Node s2 = new Node(33);
		Node s3 = new Node(44);
		Node s4 = new Node(55);
		Node s5 = new Node(66);
		Node s6 = new Node(77);
		Node s7 = new Node(88);
		Node s8 = new Node(99);
		Node s9 = new Node(110);
		Node s10 = new Node(120);

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
		s10.next = null;

		printList();
		count();
		reverseListFromPosi(3);
	}

}
