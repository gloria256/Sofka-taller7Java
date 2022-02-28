//Ejercicio4 PseInt, Canteras Nivel 1
//Realizar un programa el cual solicite el nombre de una ciudad capital 
//y el pa�s. Al finalizar debe imprimir en pantalla el siguiente mensaje 
//"La ciudad [Nombre de la Ciudad], es la capital del pa�s [Nombre del Pa�s]

package taller1;

import java.util.Scanner;

public class Punto4 {
	String ciudadCapital;
	String pais;

	public void punto4(){
		ciudadCapital = capturarDato("Ingrese la ciudad capital:");
		pais = capturarDato("Ingrese el país:");
		String[] list = {ciudadCapital,pais};
		imprimirMensaje(list);
	}

	public static String capturarDato(String mensaje){
		Scanner input =  new Scanner(System.in);
		System.out.println(mensaje);
		String variable = input.nextLine();
		return variable;
	}

	public static void imprimirMensaje(String[] list){
		String texto = String.format("la ciudad: %s es capital del país: %s",list[0],list[1]);
		System.out.println(texto);
	}
}



