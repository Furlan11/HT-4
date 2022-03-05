import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class infixToPostfix {

	private IStack<String> Stack;
	
	public String leer_archivo(String x) {
		File archivo = new File(x);
		BufferedReader obj=null;
		try {
			obj = new BufferedReader(new FileReader(archivo));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			System.out.println("La ruta no se puede leer");;
		}
		String operaciones = "";
		try {
			operaciones= obj.readLine();
		} catch (Exception e) {
		      System.out.println("No tiene datos el archivo");
	    } 
		return operaciones;
		
	}

	public static boolean isNumeric(String ope) {
	    try {
	        double d = Double.parseDouble(ope);
	    } catch (NumberFormatException nfe) {
	        return false; //Error no es numerico
	    }
	    return true; //Es numerico
	}
	
	public String input(String opcion,String T) {
		String operacion = T;
		if(opcion=="lista") {
			StackUsingLinkedList<String> lista = new StackUsingLinkedList<String>();
			String valor = "";
			
			
		}else {
			if(opcion=="double") {
				StackUsingDoubleLinkedList<String> doublelist = new StackUsingDoubleLinkedList<String>();
			}
		}
		
		
		return T;
	}
}
/*
 * 			for(int i = 0; i< operacion.length(); i++) {
				if(String.valueOf(operacion.charAt(i))=="(") {
					
				}	
				
				
				
				
				boolean llave= false;
				int contador2=i;
				if(i<operacion.length()-1) {
				llave= true;}
				while (llave==true) {
					contador2= contador2+1;
					if(isNumeric(String.valueOf(operacion.charAt(contador2)))!=true) {
						 valor=valor+String.valueOf(operacion.charAt(contador2));		 
					}
					else {llave=false;}
					i=contador2;
				}
				
				
			}*/
