//Ejercicio2 PseInt, Canteras Nivel 1
//Realizar un programa el cual solicite su nombre, apellidos, edad y estatura.

package taller1;
import java.util.Scanner;

public class Punto2 {
	String nombre;
	String apellidos;
	String edad;
	String estatura;
	public void punto2(){
		nombre = capturarDato("Ingrese su nombre:");
		apellidos = capturarDato("Ingrese sua apellidos:");
		edad = capturarDato("Ingrese su edad:");
		estatura = capturarDato("Ingrese su estatura:");

	}

	public String capturarDato(String mensaje){
		Scanner input = new Scanner(System.in);
		System.out.println(mensaje);
		String variable = input.nextLine();
		return variable;
	}
}


