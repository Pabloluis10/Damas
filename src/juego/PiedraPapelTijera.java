package src.juego;

import src.jugadores.Jugador;

public class PiedraPapelTijera {
   //atributos
   Jugador jugador1;
   Jugador jugador2;

   public PiedraPapelTijera(Jugador a, Jugador b){
        jugar(a, b);
   }

   private void jugar(Jugador a, Jugador b){
       System.out.println("\n\n===== ¡PIEDRA PAPEL O TIJERA 1 2 3 YA XD! =====");
       System.out.println("En este juego se prentende seleccionar al jugador que iniciara");
       System.out.println("la partidad de 'Damas' con la ficha '0'.");
       System.out.println("Para seleccionar al jugador ellos tendran que jugar un duelo de ");
       System.out.println("¡Piedra Papel o Tijera!");
       System.out.println("El ganador sera el que incie la partida de Damas");
       System.out.println("\nINICIA DUELO");
       duelo(a, b);
   }

   private void duelo(Jugador a, Jugador b){
       final int Piedra=1;
       final int papel=2;

       int random1;
       int random2;
       do{
           System.out.println("Piedra papel y tijera 1, 2, 3 ya");
           random1 = (int)(Math.random()*2+1);
           random2 = (int)(Math.random()*2+1);
           if(random1 == Piedra){
               System.out.println(a.getNombre()+": a elegido Piedra");
           } else if(random1 == papel){
               System.out.println(a.getNombre()+": a elegido Papel");
           } else {
               System.out.println(a.getNombre()+": a elegido Tijer");
           }
           if(random2 == Piedra){
               System.out.println(b.getNombre()+": a elegido Piedra");
           } else if(random2 == papel){
               System.out.println(b.getNombre()+": a elegido Papel");
           } else {
               System.out.println(b.getNombre()+": a elegido Tijera");
           }
           if(random1 > random2){
               System.out.println("El ganodor es: "+a.getNombre());
               jugador1 = a;
               jugador2 = b;
           } else if(random2 > random1){
               System.out.println("El ganador es: "+b.getNombre());
               jugador1 = b;
               jugador2 = a;
           } else{
               System.out.println("Empate.");
           }
       }while(random1 == random2);
    }

    public Jugador getJugador1(){
        return jugador1;
    }

    public Jugador getJugador2(){
        return jugador2;
    }
}
