package src.juego;

import java.util.Scanner;

import src.tablero.Tablero;

public class Juego {

    private Tablero tableroJuego = new Tablero();

    public Juego(){
        Scanner entrada = new Scanner(System.in);
        boolean noHayGanador = true;
        int posX, posY, x, y;

        tableroJuego.dibujarTablero();
        do{
            if(tableroJuego.getTurno0()){
                System.out.println("Turno de las fichas 0");
                System.out.println("Ingrese la posición de la ficha 0 que desea mover.");
            } else {
                System.out.println("Turno de las fichas X");
                System.out.println("Ingrese la posición de la ficha X que desea mover.");
            }
                
                System.out.println("Fila: ");
                posX = entrada.nextInt();
                
                System.out.println("columna: ");
                
                posY = entrada.nextInt();
                
                System.out.println("Ingrese la posición a la que desea mover la ficha");
                System.out.print("posición x: ");
                x = entrada.nextInt();
                
                System.out.print("Posición y: ");
                y = entrada.nextInt();
                
                tableroJuego.verificarLanzamiento(posX, posY, x, y);
                //verificamos si hay ganador
                tableroJuego.dibujarTablero();
                if(!tableroJuego.getTurno0()){
                    if(tableroJuego.getCantFichasX()==0){
                        noHayGanador = false;
                        System.out.println("Gano fichas 0");
                    } 
                } else {
                    if(tableroJuego.getCantFichas0()==0){
                        noHayGanador = false;
                        System.out.println("Gano fichas X");
                    }
                }
        }while(noHayGanador);

    }
}
