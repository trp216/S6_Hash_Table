package datastructure;


public class HashTable<K,V> implements HashTableInterface<K,V>{

	private final static int LENGTH = 10000;
	private Object[] nodes;
	
	public HashTable() {
		nodes = new Object[LENGTH];
	}
	
	private int hash(K key) {
		int h = key.hashCode() % LENGTH;
		if(h<0)
			h = h * (-1);
		return h;
	}

	@Override
	public boolean isEmpty() {
		if(nodes==null) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int tableLength() {
		return LENGTH;
	}

	//chaining
	@Override
	public void tableInsert(Node<K,V> newItem) {
		if(nodes[hash(newItem.getKey())]==null) {
			nodes[hash(newItem.getKey())] = newItem;
		}
		else {
			@SuppressWarnings("unchecked")
			Node<K,V> aux = (Node<K,V>)nodes[hash(newItem.getKey())];
			newItem.setNext(aux);
			nodes[hash(newItem.getKey())] = newItem;
		}
	}
	

	@Override
	public void tableDelete(K searchKey) {
		int sk = hash(searchKey);
		if(nodes[sk]!=null) {
			@SuppressWarnings("unchecked")
			Node<K,V> aux = (Node<K,V>)nodes[sk];
			if(aux.getNext()!=null && aux.getNext().getKey()!=searchKey) 
				nodes[sk] = aux.getNext();
				
			else {
				nodes[sk] = null;
				
			}
		}
	}

	@Override
	public Node<K,V> tableRetrieve(K searchKey) {
		@SuppressWarnings("unchecked")
		Node<K,V> aux = (Node<K,V>)nodes[hash(searchKey)]; //convertir la llave a un int con la funcion hash
		if(aux!=null && aux.getKey()!=searchKey) {
			if(aux.getNext()!=null) {
				while(aux!=null && aux.getKey()!=searchKey) {
					aux = aux.getNext();
				}
				if(aux==null || aux.getKey()!=searchKey) {
					aux = null;
				}
			}
			else {
				return null;
			}
		}
		return aux;
	}

}
