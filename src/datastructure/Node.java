package datastructure;

public class Node<O> {
	
	private Node<O> next;
	
	private O object;
	
	public Node(O object) {
		this.object = object;
	}

	public O getObject() {
		return object;
	}

	public void setObject(O object) {
		this.object = object;
	}


	public Node<O> getNext() {
		return next;
	}

	public void setNext(Node<O> next) {
		this.next = next;
	}
	
	

}
