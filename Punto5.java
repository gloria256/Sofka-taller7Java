//Ejercicio5 PseInt, Canteras Nivel 1
//Realizar un programa el cual solicite el nombre de su mascota, 
//edad de la mascota, el tipo de mascota y su nombre completo. 
//Al finalizar el sistema debe e imprimir en pantalla el siguiente mensaje: 
//[Nombre de Mascota] es un(a) [Tipo de Mascota], el cual, tiene [Edad de la Mascota] a�os de edad y 
//[Nombre Completo] es actualmente su due�o(a).

package taller1;

import java.util.Scanner;

public class Punto5 {
	String propietario;
	int edadMascota;
	String tipoMascota;
	String nombreMascota;
	
	public void punto5(){
		nombreMascota = capturarDatoString("Ingrese nombre de su mascota:");
		edadMascota = capturarDatoInt("Ingrese edad de su mascota:");
		tipoMascota = capturarDatoString("Ingrese el tipo de mascota:");
		propietario = capturarDatoString("Ingrese esu nombre:");
		String[] list = {nombreMascota,tipoMascota,propietario};
		imprimirMensaje(list,edadMascota);
	}

	public static String capturarDatoString(String mensaje){
		Scanner input =  new Scanner(System.in);
		System.out.println(mensaje);
		String variable = input.nextLine();
		return variable;
	}

	public static int capturarDatoInt(String mensaje){
		Scanner input =  new Scanner(System.in);
		System.out.println(mensaje);
		int variable = input.nextInt();
		return variable;
	}

	public static void imprimirMensaje(String[] list, int var){
		String texto = String.format("%s es un(a) %s, el cual, tiene %d años de edad"+
		" y %s es actualmente su dueño(a)",list[0],list[1],var,list[2]);
		System.out.println(texto);
	}
}




