package lab2Estructuras;

/**
 * una clase para crear un calculadora que recibe operacion en postfix
 * @author Guillermo Furlan 20713 
 * 
 *
 */

public class Calcladora {
	
	private Pila<Integer> calc;

	
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
	 * @param op eel string con el cacrater que se queire validarString con la operacione ne l fomato postfix que se desea realñizar
	 * @return String con el resultado o el mensaje de error
	 */
	public String calcular(String op) {
		 calc= new Pila<>();
		
		
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
	
	
}
