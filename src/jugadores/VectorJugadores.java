package src.jugadores;

import java.util.Scanner;

public class VectorJugadores {
    //atributos
    private Jugador [] jugadores = new Jugador[5];
    private int posLibre;
    private Scanner entrada = new Scanner(System.in);

    public VectorJugadores() {
        posLibre=0;
    }

    public void ingresarJugador(){
        System.out.println("\n\n==================== Ingresar Jugador ====================");
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = entrada.nextLine();
        jugadores[posLibre] = new Jugador(nombre);
    }

    public Jugador seleccionarJugador1( ) {
        System.out.println("\n\n==================== Seleccionar Jugador 1 ====================");
        mostraJugadores(); 
        System.out.print("Que jugador va a seliccionar (num): ");
        int num = entrada.nextInt();
        entrada.nextLine();
        num--; //indice del jugador
        return jugadores[num];
    }

    public Jugador seleccionarJugador2( ) {
        System.out.println("\n==================== Seleccionar Jugador 2 ====================");
        mostraJugadores();
        System.out.print("Que jugador va a seliccionar (num): ");
        int num = entrada.nextInt();
        entrada.nextLine();
        num--; //indice del jugador
        return jugadores[num];
    }

    public void mostraJugadores(){
        for (int i=0; i<posLibre; i++) {
            System.out.println((i+1)+") "+jugadores[i].getNombre());
        }
    }
    
}
