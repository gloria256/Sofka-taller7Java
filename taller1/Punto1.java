//Ejercicio1 PseInt, Canteras Nivel 1
//Realizar un programa el cual solicite su nombre y apellidos.
package taller1;
import java.util.Scanner;

public class Punto1 {
	public String nombre;
	public String apellidos;

	public void punto1(){
		nombre = capturarDato("Escribe tu nombre: ");
		apellidos = capturarDato("Escribe tus Apellidos: ");
	}
	
	public String capturarDato(String mensaje){
		Scanner input = new Scanner(System.in);
		System.out.println(mensaje);
		String variable = input.nextLine();
		return variable;
	}
	
}


