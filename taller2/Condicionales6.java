//PseInt-condicionales, Canteras Nivel 1
//Gloria Stephany G�mez G�mez

package taller2;
import java.util.Scanner;

public class Condicionales6 {
	int opcion;
	int observaciones;
	String novedad;
	String[][]registroIMotocicletas={{"1"},{"",""},{"",""},{"",""},{"",""},{"",""}};
	String[][] registroSMotocicletas={{"1"},{"",""},{"",""},{"",""},{"",""},{"",""}};

	public void condicionales6(){
		boolean tag = true;
        do {
			mostrarMenu();
			opcion = capturarDato();
			switch (opcion) {
				case 1:
				registroIMotocicletas=registrarIngreso(registroIMotocicletas, Integer.parseInt(registroIMotocicletas[0][0]));
					break;
				case 2:
				registroSMotocicletas=registrarSalida(registroIMotocicletas,registroSMotocicletas,Integer.parseInt(registroSMotocicletas[0][0]));
					break;
				case 3:
					generarReporte(registroIMotocicletas,registroSMotocicletas);
						break;
				case 4:
				 	tag = false;
				default:
					break;
			}
		}while (tag == true);
	}


	private static void mostrarMenu(){
		imprimirMensaje("");
		imprimirMensaje("----------------------------------------------------");
		imprimirMensaje("****Bienvenido al taller de motos: El Maquinista****");
		imprimirMensaje("Máximo 5 motocicletas, ¿Qué desea realizar?:");
		imprimirMensaje("1. Registrar ingreso de motocicleta");
		imprimirMensaje("2. Registrar salidad de motocicleta");
		imprimirMensaje("3. Generar Reporte");
		imprimirMensaje("4. Volver menú ejercicios condicionales");
	}

	public static String capturarDatoString(String mensaje){
		Scanner input =  new Scanner(System.in);
		System.out.println(mensaje);
		return input.nextLine();
	}

	public static int capturarDato(){
		Scanner input =  new Scanner(System.in);
		int variable = input.nextInt();
		return variable;
	}

	public static void imprimirMensaje(String texto){
		System.out.println(texto);
	}


	public static String[][] productosBase(){
		String[][] productosBase = {{"Producto1","2000"},
								  {"Producto2","5000"},
								  {"Producto3","7000"}};
		return productosBase;
	}

	public static String[][] registrarIngreso(String[][] registroMotocicletas, int i) {
		String cedula = capturarDatoString("Ingrese cedula: ");
		String placaM = capturarDatoString("Ingrese placa de su motocicleta: ");
		registroMotocicletas[i][0]=cedula;
		registroMotocicletas[i][1]=placaM;
		registroMotocicletas[0][0]=String.format("%d",i+1);
		imprimirMensaje("Ingreso exitosso");
		return registroMotocicletas;
	}

	public static String[][] registrarSalida(String[][] input, String[][] output,int num){
		String cedula = capturarDatoString("Ingrese cedula: ");
		for (int i=0;i<=input.length;i++) {
			if (input[i][0].equals(cedula.toString())){
				output[num]=input[i];
				output[0][0]=String.format("%d",num+1);
				imprimirMensaje("Salida exitossa");
				return output;
			}
		}
		return output;
	}

	public static void generarReporte(String[][] input, String[][] output){
		imprimirMensaje("");
		imprimirMensaje("----- REPORTE GENERAL -----");
		imprimirMensaje(">>Ingreso Motocicletas:");
		imprimirMatriz(input);

		imprimirMensaje("");
		imprimirMensaje(">>Salida de Motocicletas:");
		imprimirMatriz(output);
	}
	
	public static void imprimirMatriz(String[][] matriz){
		String item = "";
		for (int i=1;i<matriz.length;i++) {
			if (!matriz[i][0].equals("")){
				for (int j=0;j<=1;j++) {
					item += matriz[i][j]+" ";
				}
				System.out.println(item);
				item = "";
			}
		}
	}
}


