package datastructure;

public interface HashTableInterface<T,Z> {
	
	
	boolean isEmpty();
	
	int tableLength();
	
	void tableInsert(Node<T,Z> newItem);
	
	void tableDelete(T searchKey);
	
	Node<T,Z>  tableRetrieve(T searchKey);

}
