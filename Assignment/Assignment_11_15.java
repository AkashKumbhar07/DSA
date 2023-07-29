package Assignment;

import java.util.Scanner;

public class Assignment_11_15 {
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
	
	public static void arrangeElemAsc(int value) {
		Node newElement = new Node(value);
		if(head == null) {
			head=newElement;
		}
		else {
			Node temp=head; 
			Node nexttemp=head.next;
			while(temp!=null) {
				if(newElement.data > temp.data && nexttemp ==null) {
					temp.next = newElement;
					newElement.next = null;
				}
				else if ((newElement.data > temp.data && nexttemp != null) && newElement.data < nexttemp.data) {
					temp.next=newElement;
					newElement.next =nexttemp;
				}
				else if(newElement.data < temp.data && temp == head) {
					newElement.next =head;
					head = newElement;
				}
				else {}
				temp = temp.next;
				if(temp !=null)
					nexttemp = temp.next;
			}
		}
			
	} 
	
	public static void main(String[] args) {	
		Assignment_11_15 llist = new Assignment_11_15();
		Scanner sc = new Scanner(System.in);	

		
		System.out.println("Enter Linked List Element count:");
		int count =sc.nextInt();
		System.out.println("Enter Linked List " +count +" Elements:");
		for(int i=0;i<count;i++) {
			int ele = sc.nextInt();
			arrangeElemAsc(ele);
		}
		
		llist.printList();	
			
		
		
	}		
}
