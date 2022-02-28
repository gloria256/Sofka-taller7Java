//PseInt-condicionales, Canteras Nivel 1
//Gloria Stephany G�mez G�mez

package taller2;
import java.util.HashMap;
import java.util.Scanner;

public class Condicionales4 {
	String usuario;
	String anotacion;
	String nombrePelicula;
	int opcion;
	HashMap<String, Boolean> peliculasDisponibles= peliculasBase();


	public void condicionales4(){
		usuario = capturarDatoString("Ingrese nombre usuario:");
		boolean tag = true;
        do {
			mostrarMenu();
			opcion = capturarDato();
			switch (opcion) {
				case 1:
					peliculasDisponibles=alquilarPelicula(peliculasDisponibles,nombrePelicula);
					break;
				case 2:
					imprimirMensaje("las peliculas disponibles son: ");
					imprimirPeliculas(peliculasDisponibles);
					break;
				case 3:
					peliculasDisponibles=devolverPelicula(peliculasDisponibles,nombrePelicula);
					break;
				case 4:
					anotacion= capturarDatoString("ingrese anotaciones sobre la película:");
					break;
				 case 5:
				 	tag = false;
				default:
					break;
			}
		}while (tag == true);
	}

	private static void mostrarMenu(){
		imprimirMensaje("");
		imprimirMensaje("-----------------------------------------");
		imprimirMensaje("Ingrese opción de alquiler:");
		imprimirMensaje("1. alquilar película");
		imprimirMensaje("2. consultar películas disponibles");
		imprimirMensaje("3. recibir película en la video tienda");
		imprimirMensaje("4. anotaciones sobre película");
		imprimirMensaje("5. volver menú ejercicios condicionales");
    }

	public static String capturarDatoString(String mensaje){
		Scanner input =  new Scanner(System.in);
		System.out.println(mensaje);
		String variable = input.nextLine();
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

	public static void imprimirPeliculas(HashMap<String, Boolean> peliculasDisponibles){
		for (HashMap.Entry<String, Boolean> entry : peliculasDisponibles.entrySet()) {
			String texto =  String.format("%s	Disponible: %b", entry.getKey(), entry.getValue());
			System.out.println(texto);
		}
	}

	public static HashMap<String, Boolean> peliculasBase(){
		HashMap<String, Boolean> peliculasBase = new HashMap<String, Boolean>();
		peliculasBase.put("Pelicula1", true);
		peliculasBase.put("Pelicula2", true);
		peliculasBase.put("Pelicula3", true);
		return peliculasBase;
	}

	public static HashMap<String, Boolean> alquilarPelicula(HashMap<String, Boolean> peliculasDisponibles,String nombre){
		nombre= capturarDatoString("Ingrese nombre de la película");
		if (peliculasDisponibles.containsKey(nombre)){
			if (peliculasDisponibles.get(nombre)==true){
				imprimirMensaje("!pelicula alquilada!");
				peliculasDisponibles.remove(nombre);
				peliculasDisponibles.put(nombre,false);
				return peliculasDisponibles;
			}else{
				imprimirMensaje("no se puede alquilar, vuelva de nuevo");
				return peliculasDisponibles;
			}
		}else{
			imprimirMensaje("!no existe la película!");
			return peliculasDisponibles;
		}
	}

	public static HashMap<String, Boolean> devolverPelicula(HashMap<String, Boolean> peliculasDisponibles,String nombre){
		nombre= capturarDatoString("Ingrese nombre de la película");
		if (peliculasDisponibles.containsKey(nombre)){
			imprimirMensaje("!pelicula devuelta exitosamente!");
			peliculasDisponibles.remove(nombre);
			peliculasDisponibles.put(nombre,true);
			return peliculasDisponibles;
		}else{
			imprimirMensaje("!no existe la película!");
			return peliculasDisponibles;
		}
	}



}



