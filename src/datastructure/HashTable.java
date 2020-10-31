package datastructure;

import java.lang.reflect.Array;

public class HashTable<K,V> implements HashTableInterface<K,V>{

	private int length;
	private Object[] nodes;
	
	public HashTable() {
		length = 0;
		nodes = new Object[length];
	}

	@Override
	public boolean isEmpty() {
		if(nodes==null) {
			return true;
		}
		else if(nodes.length==0) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int tableLength() {
		return length;
	}

	//chaining
	@Override
	public void tableInsert(K key, Node<V> newItem) {
		if(nodes[(int) key]==null) {
			nodes[(int) key] = newItem;
		}
		else {
			@SuppressWarnings("unchecked")
			Node<V> aux = (Node<V>)nodes[(int)key];
			while(aux.getNext()!=null) {
				aux = aux.getNext();
			}
			aux.setNext(newItem);
		}
	}
	
	

	@Override
	public void tableDelete(K searchKey) {
		if(nodes[(int) searchKey]!=null) {
			@SuppressWarnings("unchecked")
			Node<V> aux = (Node<V>)nodes[(int)searchKey];
			if(aux.getNext()!=null) 
				nodes[(int)searchKey] = aux.getNext();
				
			else {
				nodes[(int) searchKey] = null;
				
			}
		}
	}

	@Override
	public V tableRetrieve(K searchKey) {
		@SuppressWarnings("unchecked")
		Node<V> aux = (Node<V>)nodes[(int) searchKey]; //convertir la llave a un int con la funcion hash
		V val = aux.getObject();
		return val;
	}

}
