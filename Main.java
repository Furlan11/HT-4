import java.util.Scanner;
/**
 * Clase principal
 * @author Guillermo Furlan 20713 
 * @author Wilfredo Gallegos 20399
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		infixToPostfix convertidor = new infixToPostfix();
		Calculadora calculadora = new Calculadora();
		System.out.println("-----Calculadora-------");
		System.out.println("Ingrese la ruta del archivo .txt a leer:");
		String ruta = teclado.nextLine();
		String operacion = convertidor.leer_archivo(ruta);
		
		System.out.println("¿Cómo desea que se maneje esta operacion?:  \n"
				+ "1. Stacks implementados con ArrayList \n"
				+ "2. Stacks implementados con Listas\n");
		String opcion =teclado.nextLine(); 
		String resultado = "";
		try {
			//Verificar que lo ingresado sea un numero
			Integer opcion1 = Integer.parseInt(opcion);
			//Evaluar cada opcion
			
				if(opcion1==1) {
					String postfix = convertidor.input(operacion);
					System.out.println(operacion);
					System.out.println(postfix);
					StackUsingArrayList arreglo = new StackUsingArrayList();
					for(int i=0; i<postfix.length();i++) {
						String valor = String.valueOf(postfix.charAt(i));
						arreglo.push(valor);
						
					}
					resultado = Calculadora.calcular1(postfix);
				}else
					if(opcion1==2){
						String postfix = convertidor.input(operacion);
						System.out.println(operacion);
						System.out.println(postfix);
						StackUsingArrayList arreglo = new StackUsingArrayList();
						for(int i=0; i<postfix.length();i++) {
							String valor = String.valueOf(postfix.charAt(i));
							arreglo.push(valor);
						}
						resultado = Calculadora.calcular1(postfix);
					}else{
					System.out.println("no dentro del rango");
					System.out.println("\n      apache enter para continuar");
					teclado.nextLine();}
			
		}catch(Exception e){
			System.out.println("----Lo ingresado no fue un numero----");
			System.out.println("\n      apache enter para continuar");
			teclado.nextLine();
			
		}
		System.out.println("El resultado es: " + resultado);
	}
}
