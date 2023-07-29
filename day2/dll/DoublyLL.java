package dll;

import java.util.Scanner;

public class DoublyLL {
	Node head, tail;
	Scanner sc;

	public DoublyLL() {
		this.head = null;
		this.tail = null;
		sc = new Scanner(System.in);
	}

	public boolean insertAtBeg() {
		System.out.println("Enter Roll No. & name for student");
		Student s = new Student(sc.nextInt(), sc.next());

		Node nn = new Node(s);// here new node will be created with data and null value
		if (nn == null)
			return false;
		if (head == null) {
			head = tail = nn;
		} else {
			nn.setNext(head);
			head.setPrev(nn);
			head = nn;
		}
		return true;

	}

	public boolean insertAtLast() {
		System.out.println("Enter Roll No. & name for student");
		Student s = new Student(sc.nextInt(), sc.next());

		Node nn = new Node(s);// here new node will be created with data and null value
		if (nn == null)
			return false;
		if (head == null) {
			head = tail = nn;
		}
		else {
			nn.setPrev(tail);
			tail.setNext(nn);
			tail=nn;
		}
		return true;

	}

	public boolean deleteAtBeg() {

		
		return false;

	}

	public boolean deleteAtLast() {
		return false;
	}

	public void forwordDisplay() {
		Node temp = head;
		System.out.println("\nForword List Elements  -");
		while (temp != null) {
			//System.out.println(temp.getData()+"\n");
			System.out.print("\t"+temp.getData().getName());
			temp = temp.getNext();
		}

	}
	public void backwordDisplay() {
		Node temp = tail;
		System.out.print("\nBackword List Elements  -");
		while (temp != null) {
			//System.out.println(temp.getData()+"\n");
			System.out.print("\t"+temp.getData().getName());
			temp = temp.getPrev();
		}

	}

	public void search(String v) {
		// temp points to first node
				Node temp = head;
				int c = 0;
				while (temp != null) {
					// c is position every time it will increase if data not found
					c++;
					// if will run when ata found
					if (v.equals(temp.getData().getName())) {
						// print msg found with position
						System.out.println("\n Record of Student "+v+" found at position " + c);
						break;
					}
					// temp go ahead till it becomes null
					temp = temp.getNext();
				}
	}

	public boolean insertAtPos(int p) {
		if(p<=0) {
			System.out.println("\nPlease Enter positive position");
			return false;
		}
		if(p==1)
			insertAtBeg();
		
		else {
		System.out.println("\nEnter Roll No. & name for student");
		Student s = new Student(sc.nextInt(), sc.next());

		Node nn = new Node(s);// here new node will be created with data and null value
		if (nn == null)
			return false;
		int i=1;
		Node temp=head;
		while(i<p-1) {
			i++;
			temp=temp.getNext();
			if(temp==null) {
				System.out.println("\nInvalid Position");
				return false;
			}
		}
		if(temp.getNext()==null)
		{
			temp.setNext(nn);
			nn.setPrev(temp);
			tail=nn;
		}
		else {
		nn.setNext(temp.getNext());
		nn.setPrev(temp);
		temp.setNext(nn);
		nn.getNext().setPrev(nn);
		
		}	
		}
		return true;
	}

	public boolean deleteAtPos(int p) {
		return false;
	}

}
