package src.tablero;



public class Tablero {
    //atributos
    private String [][] tablero = new String[9][9];
    private int cantFichasBlancas;//fichas blancas son 0
    private int cantFichasNegras;//fichas negras son x

    private final String cuadroBlanco = "\033[47m"+"\033[30m"+"|   |"+"\u001B[0m";
    private final String cuadroNegro = "\033[40m"+"\033[37m"+"|   |"+"\u001B[0m";

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
                    tablero[i][j] = "  "+(j)+"  ";
                } else if (j == 0 ){ //indica el número de fila
                    tablero[i][j]="  "+(i)+"  "; 
                } else {
                    //pintar celdas 
                    if(i%2 != 0){//fila impar
                        if(j%2 != 0){//columna impar
                            if(llenoFichasBlancas<12){
                                tablero[i][j] ="\033[40m"+"\033[37m"+"| X |"+"\u001B[0m";
                                llenoFichasBlancas++;
                            } else {
                                 tablero[i][j] = cuadroNegro;
                            }
                        } else {
                            if(i>=6){
                                if(llenoFichasNegras<12){
                                    tablero[i][j] ="\033[47m"+"\033[30m"+"| 0 |"+"\u001B[0m";
                                    llenoFichasNegras++;
                                } 
                            } else {
                                tablero[i][j] = cuadroBlanco;
                           }
                        }     
                    } else {//fila par
                        if(j%2 == 0){
                            if(llenoFichasBlancas<12){
                                tablero[i][j] ="\033[40m"+"\033[37m"+"| X |"+"\u001B[0m";
                                llenoFichasBlancas++;
                            } else {
                                 tablero[i][j] = cuadroNegro;
                            }
                        } else {
                            if(i>=6){
                                if(llenoFichasNegras<12){
                                    tablero[i][j] ="\033[47m"+"\033[30m"+"| 0 |"+"\u001B[0m";
                                    llenoFichasNegras++;
                                }
                            } else {
                                tablero[i][j] = cuadroBlanco;
                           }
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
