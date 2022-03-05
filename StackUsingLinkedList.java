/**
 * 
 */


/**
 * @author Guillermo Furlan 20713 
 * @author Wilfredo Gallegos 20399
 */
public class StackUsingLinkedList<T> implements IStack<T> {

	private SingleLinkedList<T> listaInterna;
	
	public StackUsingLinkedList()
	{
		listaInterna = new SingleLinkedList<T>();
	}
	
	@Override
	public int count() {
		return listaInterna.Count();
	}

	@Override
	public boolean isEmpty() {
		return listaInterna.IsEmpty();
	}

	@Override
	public void push(T value) {
		listaInterna.InsertAtStart(value);
	}

	@Override
	public T pull() {
		return listaInterna.Delete(0);
	}

	@Override
	public T peek() {
		return listaInterna.Get(0);
	}

}
