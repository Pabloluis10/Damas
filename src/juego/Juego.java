package src.juego;

import java.util.Scanner;

import src.jugadores.Jugador;
import src.tablero.Tablero;

public class Juego {
    //atributos
    private Tablero tableroJuego;
    private Jugador jugador1;
    private Jugador jugador2;
    private boolean noHayGanador;

    Scanner entrada = new Scanner(System.in);

    public Juego(Jugador jugador1, Jugador jugador2){
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.tableroJuego = new Tablero();
        this.noHayGanador = true;
        iniciarPartida();
    }

    public void iniciarPartida(){
        System.out.println("\n\n==================== ¡DAMAS! ====================");
        System.out.println("Reglas:");
        System.out.println("El jugador puede avanzar 1 posición y si tiene la posibilidad de eliminar");
        System.out.println("algúna ficha lo puede hacer, solo se podra eliminar una ficha por turno");
        System.out.println("si el jugador intenta avanzar 2 posiciones o intenta eliminar una ficha");
        System.out.println("que no esta en posición para eliminar el movimiento se le marcara como");
        System.out.println("invalido y perdera su turno.");
        System.out.println("Para mover una ficha debe de ingresar la posición de la ficha, esto ingresando");
        System.out.println("la fila y la columna donde se ubica luego ingresar la posición a la que");
        System.out.println("desea mover ingresando la fila y columna de la celda deseada");
        System.out.println("El jugador 1 inicia con las fichas 0");
        System.out.println("Si ya leio las normas escriba s(Si)");
        String leido = entrada.nextLine();
        if(leido.equalsIgnoreCase("s") == false){
            return;
        }
        do{
            System.out.println("\n\n");
            tableroJuego.dibujarTablero();
            solicitarLanzamiento();
        }while(noHayGanador);
    }

    public void solicitarLanzamiento(){
        int fila, columna, filaDesea, columnaDesea;
        if(tableroJuego.getTurno0()){
            System.out.println("\nTurno del jugador "+jugador1.getNombre()+" con las fichas 0");
        } else {
            System.out.println("\nTurno del jugador "+jugador2.getNombre()+" con las fichas X");
        }
        System.out.println("Ingrese la posición de la ficha que desea mover");
        do{
            System.out.print("Fila: ");
            fila = entrada.nextInt();
            System.out.print("Columna: ");
            columna = entrada.nextInt();
            if((fila<1 || fila>8) || (columna<1 || columna>8)){
                System.out.println("¡Error ingreso un dato incorrecto!");
                System.out.println("Vuelva a ingresar los datos");
            }
        }while((fila<1 || fila>8) || (columna<1 || columna>8));//si el usuario no ingresa valores enre 1 y 8 ambos números incluidos

        System.out.println("Ingrese la posición de la celda a la que desea mover la ficha");
        do{
            System.out.print("Fila: ");
            filaDesea = entrada.nextInt();
            System.out.print("Columna: ");
            columnaDesea = entrada.nextInt();
            if((filaDesea<1 || filaDesea>8) || (columnaDesea<1 || columnaDesea>8)){
                System.out.println("¡Error ingreso un dato incorrecto!");
                System.out.println("Vuelva a ingresar los datos");
            }
        }while((filaDesea<1 || filaDesea>8) || (columnaDesea<1 || columnaDesea>8));//si el usuario no ingresa valores enre 1 y 8 ambos números incluidos

    }

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
               
/*Aqui me quede*/  tableroJuego.verificarLanzamiento(posX, posY, x, y);
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
