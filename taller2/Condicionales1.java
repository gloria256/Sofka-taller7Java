//PseInt-condicionales, Canteras Nivel 1
//Gloria Stephany G�mez G�mez
package taller2;
import java.util.Scanner;

public class Condicionales1{
	int edad;

	public void condicionales1(){
		edad = capturarDato("Ingrese su edad:");
		if (edad >= 18 ) {
			System.out.println("Usted es mayor de edad");
		}
	}

	public int capturarDato(String mensaje){
		Scanner input = new Scanner(System.in);
		System.out.println(mensaje);
		int variable = input.nextInt();
		return variable;
	}
}


