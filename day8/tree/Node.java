package tree;

public class Node {
	private int data;
	private Node lchild,rchild;
		
	public Node(int data) {
		this.data = data;
		lchild=rchild=null;
	}
	public Node getLchild() {
		return lchild;
	}
	public void setLchild(Node lchild) {
		this.lchild = lchild;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getRchild() {
		return rchild;
	}
	public void setRchild(Node rchild) {
		this.rchild = rchild;
	}
	
}
