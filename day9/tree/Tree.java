package tree;

import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Tree {
	private Node root;

	public Tree() {
		root = null;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public boolean insert(int v) {
		Node nn = new Node(v);
		if (nn == null)
			return false;
		if (root == null) {
			root = nn;
			return true;
		}
		Node t = root;
		Node par;
		while (t != null) {
			par = t;
			if (v > t.getData()) {
				t = t.getRchild();
			} else {
				t = t.getLchild();
			}
			if (t == null) {
				if (v > par.getData())
					par.setRchild(nn);
				else
					par.setLchild(nn);
			}
		}
		return true;
	}

	public void inorder(Node t) {
		if (t == null)
			return;
		inorder(t.getLchild());
		System.out.print("  " + t.getData());
		inorder(t.getRchild());
	}
	public void preorder(Node t) {
		if (t == null)
			return;
		System.out.print("  " + t.getData());
		preorder(t.getLchild());		
		preorder(t.getRchild());
	}
	
	
	public void preorder() {
		Node stk[]=new Node[50];
		int top=-1;
		Node t=root;
		//stk[++top]=root;
		while(t!=null||top!=-1) {
			while(t!=null) {
				System.out.print(t.getData()+"  ");
				stk[++top]=t;
				t=t.getLchild();				
			}
			t=stk[top--];
			t=t.getRchild();
		}
	}
	
	public void inorder() {
		Node stk[]=new Node[50];
		int top=-1;
		Node t=root;
		//stk[++top]=root;
		while(t!=null||top!=-1) {
			while(t!=null) {
				stk[++top]=t;
				t=t.getLchild();				
			}
			t=stk[top--];
			System.out.print(t.getData()+"  ");
			t=t.getRchild();
		}
	}
	
	public void inorder1() {
	//	Node stk[]=new Node[50];
		Stack<Node> stk=new Stack<>();
		
		Node t=root;
		//stk[++top]=root;
		while(t!=null||!stk.isEmpty()) {
			while(t!=null) {
				stk.push(t);
				t=t.getLchild();				
			}
			t=stk.pop();
			System.out.print(t.getData()+"  ");
			t=t.getRchild();
		}
	}
	public void postorder(Node t) {
		if (t == null)
			return;
		postorder(t.getLchild());		
		postorder(t.getRchild());
		System.out.print("  " + t.getData());
	}
	public void postorder() {
		Stack<Node> s1=new Stack<Node>();
		Stack<Node> s2=new Stack<Node>();
		s1.push(root);
		while(!s1.isEmpty()) {
			Node t=s1.pop();
			s2.push(t);
			if(t.getLchild()!=null)
				s1.push(t.getLchild());
			if(t.getRchild()!=null)
				s1.push(t.getRchild());
		}
		
		while(!s2.isEmpty()) {		
			Node t=s2.pop();
			System.out.print("  " + t.getData());
		}
	}
	
	public void bfs() {
		Queue<Node> q=new ConcurrentLinkedQueue<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node t=q.remove();
			System.out.print("  " + t.getData());
			if(t.getLchild()!=null)
				q.add(t.getLchild());
			if(t.getRchild()!=null)
				q.add(t.getRchild());
		}
	}
	
	public boolean delete(int v) {
		if (root == null) {
			System.out.println("Null Tree");
			return false;
		}

		Node t = root, par = t;
		while (true) {
			while (t.getData() != v) {
				par = t;
				if (t.getData() > v)
					t = t.getLchild();
				else
					t = t.getRchild();
			}
			// case 1- deleting terminal node
			if (t.getLchild() == null && t.getRchild() == null) {
				if (par.getLchild() == t)
					par.setLchild(null);
				else
					par.setRchild(null);
				return true;
			}
			if (t.getLchild() != null) {
				Node max = t.getLchild();
				par = max;
				while (max.getRchild() != null) {
					par = max;
					max = max.getRchild();
				}
				int t1 = t.getData();
				t.setData(max.getData());
				max.setData(t1);
				t = max;
			} else {
				Node min = t.getRchild();
				par = min;
				while (min.getLchild() != null) {
					par = min;
					min = min.getLchild();
				}
				int t1 = t.getData();
				t.setData(min.getData());
				min.setData(t1);
				t = min;

			}
		}
	}

	public void heapSort() {
		
		
	}
}
