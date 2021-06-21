package src.juego;

import src.jugadores.Jugador;

public class PiedraPapelTijera {
   //atributos
   Jugador jugador1;
   Jugador jugador2;

   public PiedraPapelTijera(Jugador seleccionado1, Jugador seleccionado2){
        jugar(seleccionado1, seleccionado2);
   }

   private void jugar(Jugador a, Jugador b){
       System.out.println("\n\n===== ¡PIEDRA PAPEL O TIJERA 1 2 3 YA XD! =====");
       System.out.println("En este juego se prentende seleccionar al jugador que iniciara");
       System.out.println("la partidad de 'Damas' con la ficha '0'.");
       System.out.println("Para seleccionar al jugador ellos tendran que jugar un duelo de ");
       System.out.println("¡Piedra Papel o Tijera!");
       System.out.println("El ganador sera el que incie la partida de Damas");

   }
}
