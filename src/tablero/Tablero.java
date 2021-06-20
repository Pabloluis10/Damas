package src.tablero;



public class Tablero {
    //atributos
    private String [][] tablero = new String[9][9];
    private boolean turno0;
    private int cantFichasX;//fichas blancas son 0
    private int cantFichas0;//fichas negras son x

    private final String cuadroNegroConX = "\033[40m"+"\033[37m"+" X "+"\u001B[0m";
    private final String cuadroNegroCon0 = "\033[40m"+"\033[37m"+" 0 "+"\u001B[0m";
    private final String cuadroBlanco = "\033[47m"+"\033[30m"+"   "+"\u001B[0m";
    private final String cuadroNegro = "\033[40m"+"\033[37m"+"   "+"\u001B[0m";

    public Tablero(){
        cantFichasX = 12;
        cantFichas0 = 12;
        iniciarTablero();
    }

    public void dibujarTablero(){

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(tablero[i][j]);
            }
            System.out.println("");
        }

    }

    public void verificarLanzamiento(int posX, int posY, int x, int y){
        if(turno0){ // turno de las fichas 0
            if(tablero[posX][posY] == cuadroNegroCon0){// verifica que sea una ficha negra;
                realizarLanzamiento(posX, posY, x, y);
            } else {
                System.out.println("!ERROR¡ movimiento invalido\n");
            }
            turno0 = false;
        } else { //turno de las fichas X

        }
    }

    public void realizarLanzamiento(int posX, int posY, int x, int y) {
        int cantAvanzado = cantidadCasillasAvanzadas(posX, posY, x, y);
        if(cantAvanzado == 1){

        }
    }

    public void moverFicha1Pos(int posX, int posY, int x, int y){
        String aux;
        //realizamos el movimiento
        if(tablero[x][y] == cuadroNegro){
            aux = tablero[posX][posY];
            
        }
    }

    //verificamos cuantas posiciones avanzara el jugador
    public int cantidadCasillasAvanzadas(int posX, int posY, int x, int y){
        int diferenciaX = posX - x;
        int diferenciaY = posY - y;
        if((diferenciaX == 1 || diferenciaX == -1) && (diferenciaY == 1 || diferenciaY == -1)){
            return 1;
        } else if ((diferenciaX == 2 || diferenciaX == -2) && (diferenciaY == 2 || diferenciaY == -2)){
            return 2;
        } else {
            return 0;
        }
    }

    private void iniciarTablero() {

        turno0 = true;
        
        int fichasX=1;
        int fichas0 =1;

        //llenamos el tablero por primera vez
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){

                if(i==0 && j==0){ // celda vacia
                    tablero[i][j] = "   ";
                }else if(i == 0){ //para indicar el número de cada columna
                    tablero[i][j] = " "+j+" ";
                } else if (j == 0 ){ //indica el número de fila
                    tablero[i][j]=" "+(i)+" "; 
                } else {
                    //pintar celdas 
                    if(i%2 != 0){ //fila impar
                        if(j%2 != 0){ //columna impar
                            if(fichasX<=12){
                                tablero[i][j] = cuadroNegroConX;
                                fichasX++;
                            } else if(i>=6 && fichas0<=12){
                                tablero[i][j] = cuadroNegroCon0;
                                fichas0++;
                            } else{ 
                                 tablero[i][j] = cuadroNegro;
                            }
                        } else { //columna par
                            
                                tablero[i][j] = cuadroBlanco;
                        }     
                    } else { //fila par
                        if(j%2 == 0){ //columna par
                            if(fichasX<=12){
                                tablero[i][j] = cuadroNegroConX;
                                fichasX++;
                            } else if (i>=6 && fichas0<=12){
                                tablero[i][j] =cuadroNegroCon0;
                                fichas0++;
                            } else {
                                 tablero[i][j] = cuadroNegro;
                            }
                        } else { //columna impar
                                tablero[i][j] = cuadroBlanco;
                        }
                    }
                }
            }
        }
    }
}
