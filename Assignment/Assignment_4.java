package Assignment;

public class Assignment_4 {
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

	// 4. How are duplicate nodes removed in an unsorted linked list?
	public void duplicateremove(Node head) {
		Node i = head;
		while (i.next != null) {
			Node temp = i;
			Node j = i.next;
			while (j != null) {
				if (i.data == j.data) {
					Node del = j;
					temp.next = j.next;
					j.next = null;
				}
				temp = temp.next;
				j = j.next;
			}
			i=i.next;
		}
	}

	public static void main(String[] args) {
		Assignment_4 llist = new Assignment_4();

		llist.head = new Node(1);
		Node s1 = new Node(2);
		Node s2 = new Node(3);
		Node s3 = new Node(2);
		Node s4 = new Node(5);
		Node s5 = new Node(5);
		Node s6 = new Node(6);
		Node s7 = new Node(6);
		Node s8 = new Node(7);
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
		s10.next = null;
		llist.printList();
		llist.duplicateremove(llist.head);
		llist.printList();

	}
}
