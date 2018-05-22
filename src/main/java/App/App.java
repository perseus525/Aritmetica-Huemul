package App;

public class App {

    int tam;
    int[][] matriz;

    public App(int tam) {
        this.tam = tam;
        matriz = new int[tam][tam];

    }

    public void llenarSuma(int[][] matriz) {

        int llenado;

        int base = matriz.length;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; i++) {

                llenado = i + j;

                llenado = revisar(llenado, base);

                matriz[i][j] = llenado;
            }
        }
    }

    public int revisar(int n, int base) {
        while (n >= base) {

            n = n - base;
        }
        return n;
    }

}
