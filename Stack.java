import java.util.LinkedList;
/**
 * 
 * @author Guillermo Furlan 20713 
 * @author Wilfredo Gallegos 20399
 *
 * @param <T>, puede recibir cualquier tipo de objeto
 */
public class Stack<T> {
	private LinkedList<T> lista;

	public Stack() {
		lista= new LinkedList<T>();
	}
	/**
	 * 
	 * @param o, agrega un valor al stack
	 */
	public void agregar (T o) {
		lista.addFirst(o);
	}
/**
 * 
 * @return ultimo valor del stack
 */
	public T obtener() {
	return lista.removeFirst();

	}
/**
 * 
 * @return boolean si esta vacia
 */
	public boolean esVacia() {
		return lista.isEmpty();
	}
	/**
	 * 
	 * @return ultimo valor del stack
	 */
	public T peek() {
		// TODO Auto-generated method stub
		
		return lista.get(size()-1);
	}
	
	/**
	 * @return toString
	 */
	public String toString() {
		return lista.toString();
	}
	/**
	 * 
	 * @return tamaño del stack
	 */
	public int size() {
		// TODO Auto-generated method stub
		return lista.size();
	}
}