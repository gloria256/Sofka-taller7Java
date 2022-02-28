//PseInt-condicionales, Canteras Nivel 1
//Gloria Stephany G�mez G�mez

package taller2;
import java.util.Scanner;

public class Condicionales5 {
	String usuario;
	String producto;
	int opcion;
	String[][] productosDisponibles = productosBase();
	String[] productosSeleccionado;


	public void condicionales5(){
		usuario = capturarDatoString("Ingrese nombre usuario:");
		boolean tag = true;
        do {
			mostrarMenu();
			opcion = capturarDato();
			switch (opcion) {
				case 1:
					productosSeleccionado=comprarProducto(productosDisponibles);
					break;
				case 2:
					consultarPrecio(productosDisponibles);
					break;
				case 3:
					devolverProducto();
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
		imprimirMensaje("-----------------------------------------");
		imprimirMensaje("Ingrese opción de compra producto:");
		imprimirMensaje("1. compra de producto");
		imprimirMensaje("2. consulta de precios por producto");
		imprimirMensaje("3. devoluciones");
		imprimirMensaje("4. volver menú ejercicios condicionales");
    }

	public static String capturarDatoString(String mensaje){
		Scanner input =  new Scanner(System.in);
		System.out.println(mensaje);
		return input.nextLine();
	}

	public static int capturarDatoInt(String mensaje){
		System.out.println(mensaje);
		int variable = capturarDato();
		return variable;
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

	public static String[] comprarProducto(String[][] productosDisponibles){
		imprimirMensaje("-------seleccione producto----------");
		for (int i=0;i< productosDisponibles.length;i++) {
			System.out.println(i+". "+productosDisponibles[i][0]+" "+productosDisponibles[i][1]);
		}
		int cantidad= capturarDato();
		imprimirMensaje("Gracias por tu compra");
		return productosDisponibles[cantidad];
	}

	public static void consultarPrecio(String[][] productosDisponibles){
		String nombre = capturarDatoString("Ingrese nombre Producto: ");
		for (String[] item : productosDisponibles) {
			if (item[0].getClass().getSimpleName()== nombre.getClass().getSimpleName()){
				imprimirMensaje(String.format("Precio: %s",item[1]));
			}
		}
	}
	

	public static void devolverProducto(){
		String nombre= capturarDatoString("Ingrese producto a devolver");
		imprimirMensaje(String.format("el %s ha sido devuelto exitosamente",nombre));
	}



}




