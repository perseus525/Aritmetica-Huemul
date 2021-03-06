
package App;

public class App {

    static int tam;
    static int[][] matriz;

    public App(int tam) {
        this.tam = tam;
        matriz = new int[tam][tam];

    }

    public static int[][] llenarSuma() {

        int llenado;

        int base = matriz.length;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                llenado = i + j;

                llenado = revisar(llenado, base);

                matriz[i][j] = llenado;
            }
        }
        return matriz;
    }

    public static int[][] llenarMult() {
        int llenado;

        int base = matriz.length;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                llenado = i * j;

                llenado = revisar(llenado, base);

                matriz[i][j] = llenado;
            }
        }
        return matriz;
    }

    public static int revisar(int n, int base) {
        while (n >= base) {

            n = n - base;
        }
        return n;
    }
    public static void mostrar(){
        for(int i=0; i < matriz.length; i++){
            for(int j=0; j < matriz[i].length;j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }

}

