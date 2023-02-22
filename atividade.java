public class atividade {
    public static void main(String[] args) {https://github.com/FelipeBertoli/Multiplica-Matrizes/blob/main/atividade.java
        int linhaA = 2;
        int colunaA = 3;
        int linhaB = 2;
        int[][] matrizA = { {3, 1, 3}, {6, 5, 5} };
        int[][] matrizB = { {100, 50}, {50, 100}, {50, 50} };

        int[][] matrizC = new int[linhaA][linhaB];
        for(int i = 0; i < linhaA; i++) {
            for (int j = 0; j < linhaB; j++) {
                for (int k = 0; k < colunaA; k++) {
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
