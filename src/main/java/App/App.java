package App;

public class App {
    
    static int tam;
    static int[][] matriz;

    public App(int tam) {
        this.tam = tam;
        matriz = new int[tam][tam];

    }


  public static int revisar(int n, int base){
      while( n >= base){
          
          n=n-base;
      }
      return n;
  }

    public static void llenarSuma() {

        int llenado;

        int base = matriz.length;

        for (int i = 0; i < matriz.length ; i++) {

            for (int j = 0; j < matriz[i].length ; j++) {

                llenado = i + j;

                llenado = revisar(llenado, base);

                matriz[i][j] = llenado;
            }
        }
    }

    public void llenarMult() {
        int llenado;

        int base = matriz.length;

        for (int i = 0; i < matriz.length ; i++) {

            for (int j = 0; j < matriz[i].length ; j++) {

                llenado = i * j;

                llenado = revisar(llenado, base);

                matriz[i][j] = llenado;
            }
        }
    }

}
