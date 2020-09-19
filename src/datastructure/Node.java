package datastructure;

public class Node<L,O> {
	
	private Node<L,O> next;
	
	private O object;
	
	private L key;
	
	public Node(L key, O object) {
		this.object = object;
		this.key = key;
	}

	public O getObject() {
		return object;
	}

	public void setObject(O object) {
		this.object = object;
	}


	public Node<L,O> getNext() {
		return next;
	}

	public void setNext(Node<L,O> next) {
		this.next = next;
	}

	public L getKey() {
		return key;
	}

	public void setKey(L key) {
		this.key = key;
	}
	
	

}
