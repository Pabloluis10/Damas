package src.tablero;

public class Tablero {
    //atributos
    private String [][] tablero = new String[9][9];
    private int cantFichasBlancas;//fichas blancas son 0
    private int cantFichasNegras;//fichas negras son x

    //colores
    public static final String NORMAL = "\u001B[0m";
    public static final String FONDO_NEGRO = "\033[40m";
    public static final String FONDO_BLANCO = "\033[47m";
    public static final String LETRA_NEGRA = "\033[30m";
    public static final String LETRA_BLANCA = "\033[37m";

    public Tablero(){
        cantFichasBlancas=12;
        cantFichasNegras=12;

        int llenoFichasBlancas=0;
        int llenoFichasNegras =0;

        //llenamos el tablero
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(i==0 && j==0){
                    tablero[i][j] = "     ";
                }else if(i == 0){ //para indicar el número de cada columna
                    tablero[i][j] = "  "+(j+1)+"  ";
                } else if (j == 0 ){ //indica el número de fila
                    tablero[i][j]="  "+(j+1)+"  "; 
                } else{
                   if((i%2==0) && (j%2==0)){
                       if(llenoFichasBlancas < cantFichasBlancas){
                           tablero[i][j] = FONDO_NEGRO+LETRA_BLANCA+"| 0 |"+NORMAL;
                           llenoFichasBlancas++;
                       } else {
                           tablero[i][j] = FONDO_NEGRO+LETRA_BLANCA+"|   |"+NORMAL;
                       }
                   } else {
                       if(llenoFichasNegras < cantFichasNegras){
                           tablero[i][j] = FONDO_BLANCO+LETRA_NEGRA+"| X |"+NORMAL;
                           llenoFichasNegras++;
                       }else{
                        tablero[i][j] = FONDO_BLANCO+LETRA_NEGRA+"|   |"+NORMAL;
                       }
                   }
                } 
            }
        }
    }

    public void dibujarTablero(){

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(tablero[i][j]);
            }
            System.out.println("\n");
        }

    }
}
