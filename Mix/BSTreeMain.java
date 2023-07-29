import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Scanner;

class BinarySearchTree{
	static class Node{
		private int data;
		private Node right,left;
		
		//default constructor
		public Node() {
			data=0;
			left=null;
			right=null;
		}
		//parameterized constructor
		public Node(int val){
			data=val;
			left=null;
			right=null;
		}
		public int getData() {
			return data;
		}
		
		
	}
	
	private Node root;
	
	public BinarySearchTree() {
		root=null;
	}
	//Add the Nodes
	public void add(int val) {
		Node newNode=new Node(val);
		if(root==null)
			root=newNode;
		else {
			Node trav=root;
			while(true) {
				if(val<trav.data) {
					if(trav.left != null) {
						trav=trav.left;
					}
					else {
						trav.left=newNode;
						break;
					}
				}
				else {
					if(trav.right != null) {
						trav=trav.right;
					}
					else {
						trav.right=newNode;
						break;
					}
				}
			}
		}
	}
	//PreOrder method for display
	public void PreOrder(Node trav) {
		if (trav==null) {
			return;
		}
		System.out.print(trav.data+",");
		PreOrder(trav.left);
		PreOrder(trav.right);
	}
	
	public void PreOrder() {
		System.out.println("PreOrder :");
		PreOrder(root);
		System.out.println();
	}
	
//****************************************************************************************************//	
	
	//Using Non-Recursive method preOrder
	public void PreOrderNR() {
		System.out.println("PREORDER NON-RECURSIVE :");
		Stack<Node> s= new Stack<>();
		Node trav = root;
		
		while(trav!=null || !s.empty()) {
			while(trav!=null) {
				System.out.print(trav.data+",");
				if(trav.right!=null) 
					s.push(trav.right);
					trav=trav.left;
			}
				if(!s.empty())
					trav=s.pop();
			}
			System.out.println();
		
	}
	
//*******************************************************************************************************//
	
	//INORDER METHOD FPR DISPLAY
	public void InOrder(Node trav) {
		if (trav==null) {
			return;
		}
		InOrder(trav.left);
		System.out.print(trav.data+",");
		InOrder(trav.right);
	}
	
	public void InOrder() {
		System.out.println("InOrder :");
		InOrder(root);
		System.out.println();
	}
	
//*******************************************************************************************************//	
	
	//INORDER USING NON-RECURSIVE
	public void InOrderNR() {
		System.out.println("INORDER NON-RECURSIVE :");
		Stack<Node> s= new Stack<>();
		Node trav=root;
		
		while(trav!=null || !s.empty()) {
			while(trav!=null) {
				s.push(trav);
				trav=trav.left;
			}
			trav=s.pop();
			System.out.print(trav.data+",");
			trav=trav.right;
		}
		System.out.println();
	}
	
//*********************************************************************************************************//	
	
	//POSTORDER FOR DISPLAY
	public void PostOrder(Node trav) {
		if (trav==null) {
			return;
		}
		PostOrder(trav.left);
		PostOrder(trav.right);
		System.out.print(trav.data+",");
		
	}
	
	public void PostOrder() {
		System.out.println("PostOrder :");
		PostOrder(root);
		System.out.println();
	}
	
//**********************************************************************************************************//	
	
	//Delete traversal by POSTORDER
	public void DeleteAll(Node trav) {
		if(trav==null)
			return;
		DeleteAll(trav.left);
		DeleteAll(trav.right);
		trav.left=null;
		trav.right=null;
		trav=null;
	}
	
	public void DeleteAll() {
		DeleteAll(root);
		root=null;
	}
	
//***********************************************************************************************************//	
	
	//TO FIND HIEGHT OF THE TREE
	public int Height(Node trav) {
		if(trav == null)
			return -1;
		int hl= Height(trav.left);
		int hr= Height(trav.right);
		int max= hl>hr ? hl:hr;
		return max+1;
	}
	
	public int Height() {
		return Height(root);
	}
	
//**********************************************************************************************************//
	
	//Breadth First Search
	public Node BFSmethod(int val) {
		Queue<Node> Q= new LinkedList<>();
		
		Q.offer(root);
		
		while(!Q.isEmpty()) {
			Node trav =Q.poll();
			if( val == trav.data)
				return trav;
			if(trav.left!=null)
				Q.offer(trav.left);
			if(trav.right!=null)
				Q.offer(trav.right);
		}
		return null;
	}

//*********************************************************************************************************//
	
	//Depth First Search
	public Node DFSmethod(int val1) {
		Stack<Node> s= new Stack<>();
		s.push(root);
		while(!s.empty()) {
			Node trav=s.pop();
			if(val1==trav.data)
				return trav;
			if(trav.right!=null)
				s.push(trav.right);
			if(trav.left!=null)
				s.push(trav.left);
		}
		return null;
	}
	
//**********************************************************************************************//
	
	//Binary search method
	public Node BSTmethod(int val2) {
		Node trav=root;
		while(trav!=null) {
		if(val2==trav.data)
			return trav;
		if(val2< trav.data)
			trav=trav.left;
		else
			trav=trav.right;
	  }
		return null;
	}
	
	
}

public class BSTreeMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		BinarySearchTree bst= new BinarySearchTree();
		
		bst.add(50);
		bst.add(30);
		bst.add(10);
		bst.add(90);
		bst.add(100);
		bst.add(40);
		bst.add(70);
		bst.add(80);
		bst.add(60);
		bst.add(20);
		
		System.out.println("Enter number to Add :");
		int num=sc.nextInt();
		bst.add(num);
		bst.PreOrder();
		bst.PreOrderNR();
		
		bst.PostOrder();
		
		bst.InOrder();
		bst.InOrderNR();
		
		System.out.println("Height of Tree is = "+bst.Height());
		
		System.out.println("ENTER THE NODE for BFS :");
		int val= sc.nextInt();
		BinarySearchTree.Node temp = bst.BFSmethod(val);
		if(temp==null)
			System.out.println("Not Found");
		else
			System.out.println("FOUND"+ temp.getData());
		
		//***********************************************//
		
		System.out.println("ENTER THE NODE for DFS :");
		int val1= sc.nextInt();
		BinarySearchTree.Node temp1 = bst.DFSmethod(val1);
		if(temp1==null)
			System.out.println("Not Found");
		else
			System.out.println("FOUND"+ temp.getData());
		
		//**************************************************//
		
		System.out.println("ENTER THE NODE for BST :");
		int val2= sc.nextInt();
		BinarySearchTree.Node temp2 = bst.BSTmethod(val2);
		if(temp2==null)
			System.out.println("Not Found");
		else
			System.out.println("FOUND"+ temp.getData());
		
		bst.DeleteAll();
		bst.InOrder();
		System.out.println("Height of the Tree is = "+bst.Height());
		

	}

}
