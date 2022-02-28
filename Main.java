
import taller1.Punto1;
import taller1.Punto2;
import taller1.Punto3;
import taller1.Punto4;
import taller1.Punto5;
import taller2.Condicionales1;
import taller2.Condicionales2;
import taller2.Condicionales3;
import taller2.Condicionales4;
import taller2.Condicionales5;
import taller2.Condicionales6;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        boolean tag = true;
        int opcion;
        do {
            mostrarMenuPrincipal();
            opcion = capturarDato();
            switch (opcion) {
                case 1:
                    repetirSubMenu(5,1);
                    break;
                case 2:
                    repetirSubMenu(10,2);
                    break;
            
                default:
                    break;
            }

        } while (tag == true);
    }

    private static void mostrarMenuPrincipal(){
        System.out.println("Elija el tipo de taller: ");
        System.out.println("1. Taller1: Variables e impresiones");
        System.out.println("2. Taller2: Condicionales");
        System.out.println("3. Taller3: Ciclos");
        System.out.println("4. Taller4: Arreglos");
        System.out.println("5. Taller5: Funciones");
        System.out.println("6. EXIT");
    }

    private static void repetirSubMenu(int valor,int op){
        crearSubMenu(valor);
        int subopcion = capturarDato();
        ejecutarAccion(subopcion,op);
    }

    private static void crearSubMenu(int valor){
        System.out.println(" ");
        System.out.println("Elija el ejercicio a ejecutar: ");
        for (int i = 1; i <= valor; i++){
            System.out.println(String.format("%d. Punto%d",i,i));
        }
        System.out.println(String.format("%d. Volver menú principal",valor+1));
    }

    private static int capturarDato(){
        Scanner input = new Scanner(System.in);
        int variable = input.nextInt();
        return variable;
    }

    private static void ejecutarAccion(int valor, int op){
        switch (valor){
            case 1:
                if (op ==1){
                    Punto1 punt1 = new Punto1();
                    punt1.punto1();
                    repetirSubMenu(5,1);
                }else if (op ==2){
                    Condicionales1 punt1 = new Condicionales1();
                    punt1.condicionales1();
                    repetirSubMenu(10,2);
                }
                
            case 2:
                if (op ==1){
                    Punto2 punt2 = new Punto2();
                    punt2.punto2();
                    repetirSubMenu(5,1);
                }else if (op ==2){
                    Condicionales2 punt2 = new Condicionales2();
                    punt2.condicionales2();
                    repetirSubMenu(10,2);
                }
            case 3:
                if (op ==1){
                    Punto3 punt3 = new Punto3();
                    punt3.punto3();
                    repetirSubMenu(5,1);
                }else if (op ==2){
                    Condicionales3 punt3 = new Condicionales3();
                    punt3.condicionales3();
                    repetirSubMenu(10,2);
                }
            case 4:
                if (op ==1){
                    Punto4 punt4 = new Punto4();
                    punt4.punto4();
                    repetirSubMenu(5,1);
                }else if (op ==2){
                    Condicionales4 punt4 = new Condicionales4();
                    punt4.condicionales4();
                    repetirSubMenu(10,2);
                }
            case 5:
                if (op ==1){
                    Punto5 punt5 = new Punto5();
                    punt5.punto5();
                    repetirSubMenu(5,1);
                }else if (op ==2){
                    Condicionales5 punt5 = new Condicionales5();
                    punt5.condicionales5();
                    repetirSubMenu(10,2);
                }
            case 6:
                if (op ==1){
                }else if (op ==2){
                    Condicionales6 punt6 = new Condicionales6();
                    punt6.condicionales6();
                    repetirSubMenu(10,2);
                }
            case 7:
                break;
            default:
                break;
        }
    }
    
}