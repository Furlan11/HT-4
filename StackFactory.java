import java.util.ArrayList;

public class StackFactory {
	 public static IStack construir(String tipo) {
	        switch (tipo){
	            case "ArrayList":
	                return new StackUsingArrayList();
	            case "single list":
	                return new StackUsingLinkedList();
	            case "double list":
	                return new StackUsingDoubleLinkedList();
	            
	            
	        }
			return null;
	    }
}
