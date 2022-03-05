import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
/**
 * La clase que lee el archivo donde se encuentra la operacion, y convierte la operacion infix a postfix
 * @author Guillermo Furlan 20713 
 * @author Wilfredo Gallegos 20399
 */
public class infixToPostfix {

	private IStack<String> Stack;
	/**
	 * 
	 * @param x ruta del archivo
	 * @return operacion 
	 */
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
	/**
	 * 
	 * @param ope, recibe dato a comprobar si es numero
	 * @return boolean con TRue si es numero
	 */
	public static boolean isNumeric(String ope) {
	    try {
	        double d = Double.parseDouble(ope);
	    } catch (NumberFormatException nfe) {
	        return false; //Error no es numerico
	    }
	    return true; //Es numerico
	}
	/**
	 * 
	 * @param T, la operacion en infix
	 * @return postfix
	 */
	public String input(String T) {
		Stack<Character> stack = new Stack<Character>();
		String postfix = "";
		char[] chars = T.toCharArray();
		for(int i=0;i<chars.length;i++) {
			char c=chars[i];
			if(c != '+' && c != '-' && c != '*' && c != '/' && c != '(' && c != ')') {
				postfix = postfix + c;
			} else if(c == '(') {
				stack.agregar(c);
			} else if(c == ')') {
				while(!stack.esVacia()) {
					char t = stack.obtener();
					if(t != '(') {
						postfix = postfix + t;
					}
					else {
						break;
					}
				}
			} else if(c == '+' || c == '-' || c == '*' || c == '/') {
				if(stack.esVacia()) {
					stack.agregar(c);
				}
				else {
					while(!stack.esVacia()) {
						char t = stack.obtener();
						if(t == '(') {
							stack.agregar(t);
							break;
						} if(t == '+' || t == '-' || t == '*' || t == '/') {
							if(prioridad(t) < prioridad(c)) {
								stack.agregar(t);
								break;
							}if	(prioridad(t) == prioridad(c))	{
								postfix = postfix + c ;
								c=t;
								break;
							}
							else {
								postfix = postfix + t;
								break;
							}
						}					
					
					}
					stack.agregar(c);
				}
				
			}
		
		}
		while(!stack.esVacia()) {
			postfix = postfix + stack.obtener();
		}
		return postfix;
		
	}
/**
 * 
 * @param c, caracter para saber jerarquia de operaciones
 * @return 1 si es jerarquia menor, 2 si es mayor
 */
	public static int prioridad(char c) {
		if(c == '+' || c == '-') {
			return 1;
		}
		else {
			return 2;
		}
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
