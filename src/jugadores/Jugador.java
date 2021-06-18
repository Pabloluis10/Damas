package jugadores;

public class Jugador {
    //atributos
    private String nombre;
    private int partidasGanadas;
    private int partidasPerdidas;

    //constructor
    public Jugador(String nombre){
        this.nombre = nombre;
        partidasGanadas = 0;
        partidasPerdidas = 0;
    }

    public String mostrarInfo(){
        return "Nombre: "+nombre+" Partidas Ganadas: "+partidasGanadas+" Partidas Perdidas: "+partidasPerdidas;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void aumetarPartidasGanadas(){
        partidasGanadas++;
    }

    public void aumetarPartidasPerdidas(){
        partidasPerdidas++;
    }   
}

