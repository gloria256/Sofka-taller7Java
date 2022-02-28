//Ejercicio3 PseInt, Canteras Nivel 1
//Realizar un programa el cual solicite su nombre y apellidos, 
//tambi�n debe capturar nombre y apellidos de su padre y madre. 
//Al finalizar debe imprimir en pantalla el siguiente mensaje 
//"Yo [Nombre Completo], soy hijo de [Nombre de la Madre] y [Nombre del Padre].

package taller1;

import java.util.Scanner;

public class Punto3 {
	String nombre;
	String apellidos;
	String nombrePadre;
	String apellidosPadre;
	String nombreMadre;
	String apellidosMadre;

	public void punto3(){
		nombre = capturarDato("Ingrese su nombre:");
		apellidos = capturarDato("Ingrese sus apellidos:");
		nombrePadre = capturarDato("Ingrese nombre de su padre:");
		apellidosPadre = capturarDato("Ingrese apellidos de su padre:");
		nombreMadre = capturarDato("Ingrese nombre de su madre:");
		apellidosMadre = capturarDato("Ingrese apellidos de su madre:");
		String [] list = {nombre, apellidos, nombrePadre, nombreMadre};
		imprimirMensaje(list);
	}

	public String capturarDato(String mensaje){
		Scanner input = new Scanner(System.in);
		System.out.println(mensaje);
		String variable = input.nextLine();
		return variable;
	}

	public static void imprimirMensaje(String[] list){
		String texto = String.format("Yo %s %s, soy hijo de: %s y %s",list[0],list[1],list[2],list[3]);
		System.out.println(texto);
	}
}



