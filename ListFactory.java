/**
 * @author Guillermo Furlan 20713 
 * @author Wilfredo Gallegos 20399
 *Clase utilizada para generar listas
 */

/**
 * 
 * genera el tipo de lista requerrido
 *
 */
public class ListFactory {
	  public static IList construir(String tipo) {
	        switch(tipo) {
	            case "Lista simple":
	                return new SingleLinkedList();
	            case "Lista doble":
	                return new DoubleLinkedList();
	            default:
	                return null;
	        }
	    }
}