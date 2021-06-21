package src.jugadores;

import java.util.Scanner;

public class VectorJugadores {
    //atributos
    private Jugador [] jugadores = new Jugador[10];
    private int posLibre;
    private Scanner entrada = new Scanner(System.in);

    public VectorJugadores() {
        posLibre=0;
    }

    public void ingresarJugador(){
        System.out.println("\n\n==================== Ingresar Jugador ====================");
        if(posLibre == 10){
            System.out.println("Limite alcanzado, ya no puede ingresar jugadores");
            return;
        }
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = entrada.nextLine();
        jugadores[posLibre] = new Jugador(nombre);
        posLibre++;
    }

    public Jugador seleccionarJugador( ) {
        System.out.println("\n\n==================== Seleccionar Jugador ====================");
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

    public void mostrarInfoJugadores(){
        System.out.println("\n\n==================== Listado de jugadores ====================");
        ordenarJugadores();
        for(int i=0; i<posLibre; i++){
            System.out.println(jugadores[i].mostrarInfo());
        }
    }  

    private void ordenarJugadores( ) {
        System.out.println("\nLos jugadore se ordenan de mayor a menor según partidas ganadas\n");
        for(int i=0; i<posLibre; i++){
            Jugador aux = jugadores[i];
            int pos=i;
            while(pos>0 && jugadores[pos-1].getPartidasGanadas() < aux.getPartidasGanadas()){
                jugadores[pos] = jugadores[pos-1];
                pos--;
            }
            jugadores[pos]=aux;
        }
    }
}
