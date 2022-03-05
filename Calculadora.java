
public class Calculadora {

	private Stack<Integer> calc;
/**
 * una clase para crear un calculadora que recibe operacion en postfix
 * @author Guillermo Furlan 20713 
 * 
 *
 */
	/**
	 * verificar si un caracter se puede volver un numero
	 * @param ope eel string con el cacrater que se queire validar
	 *  @return bollean con true si e su numeo
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
	 * caldular la operacion deseada
	 * @param op eel string con el cacrater que se queire validarString con la operacione ne l fomato postfix que se desea real�izar
	 * @return String con el resultado o el mensaje de error
	 */
/**	public int decifrar(Stack a) {
		// TODO Auto-generated method stub
		//String operacion = (String) a.pop();
		//for (int i=a.size()-1; i>=0; i-- ) {
		//System.out.println(a.pop());
		while(a.esVacia()==false) {
			int valor1 = Integer.parseInt((String) a.obtener());
			int valor2 = Integer.parseInt((String) a.obtener());
			if("+".equals((String) a.peek())||"*".equals((String) a.peek())||"-".equals((String) a.peek())||"/".equals((String) a.peek())) {
				String operacion = (String) a.obtener();
				if("+".equals(operacion)) {
					int suma = valor1+valor2;
					a.agregar(String.valueOf(suma));
				}else if("-".equals(operacion)) {
					int resta = (valor1-valor2);
					a.agregar(String.valueOf(resta));
				}else if("*".equals(operacion)) {
					int multiplicacion = multiplicar(valor1,valor2);
					a.agregar(String.valueOf(multiplicacion));
				}else if("/".equals(operacion)) {
					int division = dividir(valor1,valor2);
					a.agregar(String.valueOf(division));
				}
			}else {
				int valor3 = Integer.parseInt((String) a.pop());
				String operacion = (String) a.pop();
				if("+".equals(operacion)) {
					int suma = valor3+valor2;
					a.agregar(String.valueOf(suma));
					a.agregar(String.valueOf(valor1));
				}else if("-".equals(operacion)) {
					int resta = valor3-valor2;
					a.agregar(String.valueOf(resta));
					a.agregar(String.valueOf(valor1));
				}else if("*".equals(operacion)) {
					int multiplicacion = (valor3*valor2);
					a.agregar(String.valueOf(multiplicacion));
					a.agregar(String.valueOf(valor1));
				}else if("/".equals(operacion)) {
					int division = (valor3/valor2);
					a.agregar(String.valueOf(division));
					a.agregar(String.valueOf(valor1));
				}
			}
		}
		System.out.println(a.peek());
		return 0;	
	}*/
	public static String calcular(IStack<String> stack) {
		Stack<Integer> calc = new Stack<Integer>();
		String op="";
		for(int z=0;z<stack.count()-1;z++) {
			op=op+stack.peek();
		}
		
		
		String muestra= "1 2 + 4 * 3 - /";
		char espacio= muestra.charAt(1);
		char suma= muestra.charAt(4);
		char mult= muestra.charAt(8);
		char rest= muestra.charAt(12);
		char divi= muestra.charAt(14);
		
		int cantiNum=0;
		int cantOpe=0;
//		verificar si hay suficiente snumeros y operaciones
		for (int j=0 ; j <op.length(); j++) {
			char carct= op.charAt(j);
			
		if(carct!=espacio) {
				
				boolean isNum = isNumeric(String.valueOf(carct));
				if(isNum== true) {
					
					cantiNum=cantiNum+1;
			
				}
else{
					
					if(carct==suma) {
						
						cantOpe=cantOpe+1;
						
					}
					if(carct==mult) { 
						cantOpe=cantOpe+1;
						
					}
					if(carct==rest) { 
						
						cantOpe=cantOpe+1;
					}
					if(carct==divi) { 
						
						cantOpe=cantOpe+1;
					}
}
			
		}
		}
		if(cantiNum!=cantOpe+1) {
			return("la cantidad de numeros debe ser mayor a 1 a la de operaiones revise la operacion que ingreso");
		}
		System.out.println(espacio);
		for( int i=0 ; i <op.length(); i++) {
			char ope= op.charAt(i);
			
			if(ope!=espacio) {
				
				boolean isNum = isNumeric(String.valueOf(ope));
				
			
				if(isNum== true) {
					calc.agregar(Character.getNumericValue(ope));
					
			
				}
				else{
					
					if(ope==suma) {
						
						int a = calc.obtener();
						int b = calc.obtener();
						int c=a+b;
						calc.agregar(c);
						
					}
					if(ope==mult) { 
						int fac1 = calc.obtener();
						int fac2 = calc.obtener();
						int d=fac1*fac2;
						calc.agregar(d);
						
					}
					if(ope==rest) { 
						int fac1 = calc.obtener();
						int fac2 = calc.obtener();
						int d=-fac1+fac2;
						calc.agregar(d);
						
					}
					if(ope==divi) { 
						int fac1 = calc.obtener();
						int fac2 = calc.obtener();
						if(fac1 == 0) {
							return("division por 0 no esta definida");
							
						}
						
						else {
						int d=fac2/fac1;
						calc.agregar(d);
						}
					}
					
				}
				
			}
			
			
		}
		return(calc.obtener().toString());
	}
	
	public static String calcular1(String op) {
		 Stack calc= new Stack();
		
		
		String muestra= "1 2 + 4 * 3 - /";
		char espacio= muestra.charAt(1);
		char suma= muestra.charAt(4);
		char mult= muestra.charAt(8);
		char rest= muestra.charAt(12);
		char divi= muestra.charAt(14);
		
		int cantiNum=0;
		int cantOpe=0;
//		verificar si hay suficiente snumeros y operaciones
		for (int j=0 ; j <op.length(); j++) {
			char carct= op.charAt(j);
			
		if(carct!=espacio) {
				
				boolean isNum = isNumeric(String.valueOf(carct));
				if(isNum== true) {
					
					cantiNum=cantiNum+1;
			
				}
else{
					
					if(carct==suma) {
						
						cantOpe=cantOpe+1;
						
					}
					if(carct==mult) { 
						cantOpe=cantOpe+1;
						
					}
					if(carct==rest) { 
						
						cantOpe=cantOpe+1;
					}
					if(carct==divi) { 
						
						cantOpe=cantOpe+1;
					}
}
			
		}
		}
		if(cantiNum!=cantOpe+1) {
			return("la cantidad de numeros debe ser mayor a 1 a la de operaiones revise la operacion que ingreso");
		}
		System.out.println(espacio);
		for( int i=0 ; i <op.length(); i++) {
			char ope= op.charAt(i);
			
			if(ope!=espacio) {
				
				boolean isNum = isNumeric(String.valueOf(ope));
				
			
				if(isNum== true) {
					calc.agregar(Character.getNumericValue(ope));
					
			
				}
				else{
					
					if(ope==suma) {
						
						int a = (int) calc.obtener();
						int b = (int) calc.obtener();
						int c=a+b;
						calc.agregar(c);
						
					}
					if(ope==mult) { 
						int fac1 = (int) calc.obtener();
						int fac2 = (int) calc.obtener();
						int d=fac1*fac2;
						calc.agregar(d);
						
					}
					if(ope==rest) { 
						int fac1 = (int) calc.obtener();
						int fac2 = (int) calc.obtener();
						int d=-fac1+fac2;
						calc.agregar(d);
						
					}
					if(ope==divi) { 
						int fac1 = (int) calc.obtener();
						int fac2 = (int) calc.obtener();
						if(fac1 == 0) {
							return("division por 0 no esta definida");
							
						}
						
						else {
						int d=fac2/fac1;
						calc.agregar(d);
						}
					}
					
				}
				
			}
			
			
		}
		
		return(calc.obtener().toString());
	}

	
	
	
}
