//PseInt-condicionales, Canteras Nivel 1
package taller2;
import java.util.Scanner;

public class Condicionales3 {
	String nombre;
	String apellidos;
	int edad;

	public void condicionales3(){
		nombre = capturarDatoString("Ingrese su nombre:");
		apellidos = capturarDatoString("Ingrese sus apellidos:");
		edad = capturarDatoInt("Ingrese su edad:");
		String m1 = "%s %s, usted es mayor de edad, por lo tanto puede entrar a la fiesta";
		String m2 = "%s %s, usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa";

		String[] list = {nombre,apellidos,m1,m2};
		imprimirMensaje(list,edad>=18);
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

	public static void imprimirMensaje(String[] list,Boolean cond){
		if (cond) {
			String texto = String.format(list[2],list[0],list[1]);
			System.out.println(texto);
		}else{
			String texto = String.format(list[3],list[0],list[1]);
			System.out.println(texto);
		}
	}
}




