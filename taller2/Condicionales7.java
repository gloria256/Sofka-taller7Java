//PseInt-condicionales, Canteras Nivel 1
//Gloria Stephany G�mez G�mez

package taller2;
import java.util.Scanner;

public class Condicionales7 {
	float peso;
	float estatura;
	float imc;


	public void condicionales7(){
		peso = capturarDatoFloat("ingrese peso en Kg:");
		estatura = capturarDatoFloat("ingrese estatura en mts:");
		imc = calcularIMC(peso,estatura);
		imprimirMensaje(String.format("Su IMC (indice de masa corporal) es: %f", imc));
		imprimirMensaje("Usted se encuentra:");
		condicional(imc<18.5,"bajo peso");
		condicional(imc>=18.5 && imc<=24.9,"normal");
		condicional(imc>=25.0 && imc<=29.9,"sobrepeso");
		condicional(imc>=30.0,"obesidad");

	}

	public static float capturarDatoFloat(String mensaje){
		Scanner input =  new Scanner(System.in);
		System.out.println(mensaje);
		return input.nextFloat();
	}

	public static void imprimirMensaje(String texto){
		System.out.println(texto);
	}


	public static float calcularIMC(float peso, float estatura) {
		double imc = peso/Math.pow(estatura,2);
		return (float)imc;		
	}

	public static void condicional(boolean cond, String texto) {
		if (cond){
			imprimirMensaje(texto);
		}		
	}


}



