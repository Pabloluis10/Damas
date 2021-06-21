package src;

import java.util.Scanner;

import src.juego.Juego;
import src.juego.PiedraPapelTijera;
import src.jugadores.Jugador;
import src.jugadores.VectorJugadores;

public class Principal {
    public static void main(String[] args) {
        Principal programa = new Principal();
    }

    //variables necesarias
    private static VectorJugadores jugadores = new VectorJugadores();
    private static Scanner entrada = new Scanner(System.in);

    public Principal(){
        menu();
    }

    private static void menu(){
        int opcion;

        System.out.println("==================== BIENVENIDO ====================");
        do{
            System.out.println("\n\n==================== Menú ====================");
            System.out.println("1) Ingresar jugador");
            System.out.println("2) Jugar");
            System.out.println("3) Mostrar listado de jugadores");
            System.out.println("4) salir");
            System.out.print("Ingrese la opción que desea: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    jugadores.ingresarJugador();  
                    break;
                
                case 2:
                    Jugador a;
                    Jugador b;
                    a = jugadores.seleccionarJugador();
                    b = jugadores.seleccionarJugador();
                    PiedraPapelTijera definir = new PiedraPapelTijera(a, b);
                    Juego jugar = new Juego(definir.getJugador1(), definir.getJugador2());
                    break;
                
                case 3:
                    jugadores.mostrarInfoJugadores();
                    break;
                case 4:
                    System.out.println("========== Ha Finalizado El Programa ==========");
                    break;
            
                default:
                    System.out.println("No ha ingresado una opción valida vuela a ingresar opción");
                    break;
            }
        }while(opcion != 4);
    }
}
