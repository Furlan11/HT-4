
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
