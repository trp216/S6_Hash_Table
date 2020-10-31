package datastructure;

public interface HashTableInterface<T,Z> {
	
	
	boolean isEmpty();
	
	int tableLength();
	
	void tableInsert(T key, Node<Z> newItem);
	
	void tableDelete(T searchKey);
	
	Z tableRetrieve(T searchKey);

}
