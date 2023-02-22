public class atividade {
    public static void main(String[] args) {
        int linhaA = 2;
        int coluNaA = 3;
        int linhaC = 2;
        int[][] matrizA = { {3, 1, 3}, {6, 5, 5} };
        int[][] matrizB = { {100, 50}, {50, 100}, {50, 50} };

        int[][] matrizC = new int[linhaA][linhaC];
        for(int i = 0; i < linhaA; i++) {
            for (int j = 0; j < linhaC; j++) {
                for (int k = 0; k < coluNaA; k++) {
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        System.out.println("Total de botões usados:");
        for(int[] linha : matrizC) {
            for (int coluna : linha) {
                System.out.print(coluna + "   ");
            }
            System.out.println();
        }


    }
}
