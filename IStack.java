/**
 * 
 */


/**
 * @author Guillermo Furlan 20713 
 * @author Wilfredo Gallegos 20399
 */
public interface IStack<T> {

	int count();
	
	boolean isEmpty();
	
	void push(T value);
	
	T pull();
	
	T peek();
}
